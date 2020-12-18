package com.yuchen.analysis.indicator;

import com.yuchen.analysis.candle.Candles;

import java.math.BigDecimal;

/**
 * An indicator which performs calculations to return a number at a specific candle.
 */
public abstract class Indicator {
    protected final Candles candles;

    protected Indicator(Candles candles) {
        this.candles = candles;
    }

    public abstract BigDecimal calculate(int index);

    /**
     * @return the number that the indicator returns on the most recent candle.
     */
    public BigDecimal calculate() {
        return calculate(0);
    }
}
