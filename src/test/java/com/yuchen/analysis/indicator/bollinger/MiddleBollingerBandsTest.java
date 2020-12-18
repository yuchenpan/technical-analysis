package com.yuchen.analysis.indicator.bollinger;

import com.yuchen.analysis.candle.Candles;
import com.yuchen.analysis.indicator.util.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.yuchen.analysis.candle.CandlesFactory.eurusdMonthly17to20;
import static com.yuchen.analysis.candle.CandlesFactory.simpleCloseCandles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MiddleBollingerBandsTest {
    private int period;
    private Candles candles;
    private MiddleBollingerBands testSubject;

    private BigDecimal result;

    @Test
    void calculate_notEnoughCandles_IAThrown() {
        givenPeriod(5);
        givenCandles(simpleCloseCandles());

        assertThrows(IllegalArgumentException.class, () -> whenCalculating(6), Assertions.NOT_ENOUGH_CANDLES);
    }

    @Test
    void calculate_simpleCandles() {
        givenPeriod(5);
        givenCandles(simpleCloseCandles());
        whenCalculating(0);

        assertEquals(new BigDecimal(3), result);
    }

    @Test
    void calculate_simpleClosesMiddleIndex() {
        givenPeriod(5);
        givenCandles(simpleCloseCandles());
        whenCalculating(3);

        assertEquals(new BigDecimal(6), result);
    }

    @Test
    void calculate_realData() {
        givenPeriod(20);
        givenCandles(eurusdMonthly17to20());
        whenCalculating(0);

        assertEquals(new BigDecimal("1.1325"), result);
    }

    @Test
    void calculate_realDataWithNonZeroIndex() {
        givenPeriod(20);
        givenCandles(eurusdMonthly17to20());
        whenCalculating(2);

        assertEquals(new BigDecimal("1.1434"), result);
    }

    private void givenPeriod(int period) {
        this.period = period;
    }

    private void givenCandles(Candles candles) {
        this.candles = candles;
    }

    private void whenCalculating(int index) {
        this.testSubject = new MiddleBollingerBands(period, candles);
        this.result = testSubject.calculate(index);
    }
}