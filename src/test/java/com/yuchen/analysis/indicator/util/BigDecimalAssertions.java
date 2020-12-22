package com.yuchen.analysis.indicator.util;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class BigDecimalAssertions {
    public static void assertEquals(double expected, BigDecimal actual) {
        Assertions.assertEquals(BigDecimal.valueOf(expected), actual);
    }
}
