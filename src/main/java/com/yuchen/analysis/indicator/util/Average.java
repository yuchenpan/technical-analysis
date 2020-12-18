package com.yuchen.analysis.indicator.util;

import com.yuchen.analysis.candle.Candles;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class Average {
    private static final MathContext DECIMAL_PLACES = new MathContext(5, RoundingMode.HALF_UP);

    public static BigDecimal get(List<BigDecimal> numbers) {
        BigDecimal size = new BigDecimal(numbers.size());
        return Total.get(numbers).divide(size, DECIMAL_PLACES);
    }

    public static BigDecimal closes(Candles candles) {
        return get(candles.closes());
    }
}
