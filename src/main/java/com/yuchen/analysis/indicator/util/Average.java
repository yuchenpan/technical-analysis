package com.yuchen.analysis.indicator.util;

import com.yuchen.analysis.candle.Candles;

import java.util.List;

public class Average {
    public static Double get(List<Double> numbers) {
        Double total = 0d;

        for (Double d : numbers) {
            total += d;
        }

        return total / numbers.size();
    }

    public static Double closes(Candles candles) {
        return get(candles.closes());
    }
}
