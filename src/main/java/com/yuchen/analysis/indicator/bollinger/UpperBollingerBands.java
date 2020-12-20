package com.yuchen.analysis.indicator.bollinger;

import com.yuchen.analysis.candle.Candles;
import com.yuchen.analysis.indicator.Indicator;
import com.yuchen.analysis.indicator.util.Assertions;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static com.yuchen.analysis.indicator.bollinger.BollingerUtils.deviationValue;

public class UpperBollingerBands extends Indicator {
    private static final MathContext DECIMAL_PLACES = new MathContext(5, RoundingMode.HALF_UP);

    private final int period;
    private final int standardDeviations;

    public UpperBollingerBands(int period, int standardDeviations, Candles candles) {
        super(candles);
        this.period = period;
        this.standardDeviations = standardDeviations;
    }

    @Override
    public BigDecimal calculate(int index) {
        Assertions.enoughCandlesAfterIndex(index, period, candles);

        BigDecimal middleBand = new MiddleBollingerBands(period, candles).calculate(index);
        BigDecimal deviationValue = deviationValue(candles.sublist(index, index + period).closes(), middleBand);

        return middleBand.add(deviationValue.multiply(new BigDecimal(standardDeviations)), DECIMAL_PLACES);
    }
}
