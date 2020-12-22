package com.yuchen.analysis.indicator.util.finder;

import com.yuchen.analysis.candle.Candles;

import java.math.BigDecimal;

/**
 * Finds the lowest low in a set of candles.
 */
public class LowestLow implements CandleFinder {
    private final Candles candles;

    public LowestLow(Candles candles) {
        this.candles = candles;
    }

    @Override
    public BigDecimal find(int start, int end) {
        Candles toSearch = candles.sublist(start, end);

        BigDecimal lowestValue = new BigDecimal(Integer.MAX_VALUE);
        for (int i = 0; i < toSearch.size(); i++) {
            BigDecimal value = toSearch.get(i).getLow();
            if (value.compareTo(lowestValue) < 0) {
                lowestValue = value;
            }
        }

        return lowestValue;
    }
}
