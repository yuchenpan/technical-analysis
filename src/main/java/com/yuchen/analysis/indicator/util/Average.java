package com.yuchen.analysis.indicator.util;

import com.yuchen.analysis.candle.Candles;

import java.util.List;

public class Average {
    public static Double get(List<Double> numbers) {
        return Total.get(numbers) / numbers.size();
    }

    public static Double closes(Candles candles) {
        return get(candles.closes());
    }
}
