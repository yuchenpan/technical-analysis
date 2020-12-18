package com.yuchen.analysis.indicator.util;

import java.math.BigDecimal;
import java.util.List;

public class Total {
    public static BigDecimal get(List<BigDecimal> numbers) {
        BigDecimal total = new BigDecimal(0);

        for (BigDecimal d : numbers) {
            total = total.add(d);
        }

        return total;
    }
}
