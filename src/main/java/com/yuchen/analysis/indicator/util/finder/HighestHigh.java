package com.yuchen.analysis.indicator.util.finder;

import com.yuchen.analysis.candle.Candles;

import java.math.BigDecimal;

/**
 * Finds the highest high in a set of candles.
 */
public class HighestHigh implements CandleFinder {
    private final Candles candles;

    public HighestHigh(Candles candles) {
        this.candles = candles;
    }

    @Override
    public BigDecimal find(int start, int end) {
        Candles toSearch = candles.sublist(start, end);

        BigDecimal highestValue = new BigDecimal(0);
        for (int i = 0; i < toSearch.size(); i++) {
            BigDecimal value = toSearch.get(i).getHigh();
            if (value.compareTo(highestValue) > 0) {
                highestValue = value;
            }
        }

        return highestValue;
    }
}
