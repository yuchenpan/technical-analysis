package com.yuchen.analysis.indicator.util;

import com.yuchen.analysis.candle.Candles;

public class Assertions {
    public static void enoughCandlesAfterIndex(int index, int period, Candles candles) {
        if (index + period > candles.size()) {
            throw new IllegalArgumentException("There are not enough given candles for a full period to calculate this " +
                    "value with. Provide more candles or use a smaller period");
        }
    }
}
