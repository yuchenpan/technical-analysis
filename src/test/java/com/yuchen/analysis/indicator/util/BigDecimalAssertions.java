package com.yuchen.analysis.indicator.util;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class BigDecimalAssertions {
    public static void assertEquals(double expected, BigDecimal actual) {
        Assertions.assertEquals(BigDecimal.valueOf(expected), actual);
    }

    public static void assertEquals(int expected, BigDecimal actual) {
        Assertions.assertEquals(new BigDecimal(expected), actual);
    }

    public static void assertEquals(String expected, BigDecimal actual) {
        Assertions.assertEquals(new BigDecimal(expected), actual);
    }
}
