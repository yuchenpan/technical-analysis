package com.yuchen.analysis.indicator.bollinger;

import com.yuchen.analysis.indicator.util.Total;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

class BollingerUtils {
    private static final MathContext DECIMAL_PLACES = new MathContext(5, RoundingMode.HALF_UP);

    static BigDecimal deviationValue(List<BigDecimal> prices, BigDecimal middleBand) {
        List<BigDecimal> squared = prices.stream()
                .map(price -> price.subtract(middleBand).pow(2))
                .collect(Collectors.toList());

        BigDecimal total = Total.get(squared);

        BigDecimal size = new BigDecimal(prices.size());
        return total.divide(size, DECIMAL_PLACES).sqrt(DECIMAL_PLACES);
    }
}
