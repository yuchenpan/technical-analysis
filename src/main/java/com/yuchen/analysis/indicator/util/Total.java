package com.yuchen.analysis.indicator.util;

import java.util.List;

public class Total {
    public static Double get(List<Double> numbers) {
        Double total = 0d;

        for (Double d : numbers) {
            total += d;
        }

        return total;
    }
}
