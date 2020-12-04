package com.yuchen.analysis.indicator.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TotalTest {
    @Test
    void get_integers_correctTotal() {
        List<Double> doubles = Arrays.asList(1d, 2d, 3d, 4d, 500d);
        assertEquals(510, Total.get(doubles));
    }

    @Test
    void get_notIntegers_correctTotal() {
        List<Double> doubles = Arrays.asList(1d, 2d, 3.4d, 5.5d, 1000d);
        assertEquals(1011.9, Total.get(doubles));
    }

    @Test
    void get_negatives_correctTotal() {
        List<Double> doubles = Arrays.asList(-1d, -2d, -3.4d, -5.5d, -1000d);
        assertEquals(-1011.9, Total.get(doubles));
    }
}