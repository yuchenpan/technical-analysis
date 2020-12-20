package com.yuchen.analysis.indicator.util;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TotalTest {
    @Test
    void get_integers_correctTotal() {
        List<BigDecimal> bigDecimals = Arrays.asList(new BigDecimal(1), new BigDecimal(2), new BigDecimal(3),
                new BigDecimal(4), new BigDecimal(500));
        assertEquals(new BigDecimal(510), Total.get(bigDecimals));
    }

    @Test
    void get_notIntegers_correctTotal() {
        List<BigDecimal> bigDecimals = Arrays.asList(new BigDecimal(1), new BigDecimal(2), new BigDecimal("3.4"),
                new BigDecimal("5.5"), new BigDecimal("1000"));
        assertEquals(new BigDecimal("1011.9"), Total.get(bigDecimals));
    }

    @Test
    void get_negatives_correctTotal() {
        List<BigDecimal> bigDecimals = Arrays.asList(new BigDecimal("-1"), new BigDecimal("-2"),
                new BigDecimal("-3.4"), new BigDecimal("-5.5"), new BigDecimal("-1000"));
        assertEquals(new BigDecimal("-1011.9"), Total.get(bigDecimals));
    }
}