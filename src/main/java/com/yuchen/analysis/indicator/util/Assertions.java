package com.yuchen.analysis.indicator.util;

import com.yuchen.analysis.candle.Candles;

public class Assertions {
    public static final String NOT_ENOUGH_CANDLES = "There are not enough given candles for a full period to calculate " +
            "value with. Provide more candles or use a smaller period";

    public static void enoughCandlesAfterIndex(int index, int period, Candles candles) {
        if (index + period > candles.size()) {
            throw new IllegalArgumentException(NOT_ENOUGH_CANDLES);
        }
    }
}
