package com.yuchen.indicators.bollinger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BollingerBandCalculatorTest {
    private static final DecimalFormat df = new DecimalFormat(".0000");

    private Integer stdDev;
    private List<Double> prices;

    private BollingerBandCalculator testSubject;

    @BeforeEach
    void setUp() {
        this.prices = new ArrayList<>();
    }

    @Test
    void test() {
        givenStdDeviation(2);
        givenPrices(1.19846d, 1.19721d, 1.19740d, 1.19635d, 1.19567d);
        whenCalculating();
        thenUpperBandIs(1.1989d);
        thenMiddleBandIs(1.1970d);
        thenLowerBandIs(1.1951d);
    }

    private void givenStdDeviation(Integer stdDev) {
        this.stdDev = stdDev;
    }

    private void givenPrices(Double... prices) {
        this.prices.addAll(Arrays.asList(prices));
    }

    private void whenCalculating() {
        this.testSubject = new BollingerBandCalculator(stdDev, prices);
    }

    private void thenUpperBandIs(Double expected) {
        assertEquals(expected, Double.parseDouble(df.format(testSubject.getUpperBand())));
    }

    private void thenMiddleBandIs(Double expected) {
        assertEquals(expected, Double.parseDouble(df.format(testSubject.getMiddleBand())));
    }

    private void thenLowerBandIs(Double expected) {
        assertEquals(expected, Double.parseDouble(df.format(testSubject.getLowerBand())));
    }
}