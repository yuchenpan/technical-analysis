package com.yuchen.analysis.indicator.bollinger;

import com.yuchen.analysis.candle.Candles;
import com.yuchen.analysis.indicator.util.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.yuchen.analysis.candle.CandlesFactory.eurusdMonthly17to20;
import static com.yuchen.analysis.candle.CandlesFactory.simpleCloseCandles;
import static org.junit.jupiter.api.Assertions.*;

class LowerBollingerBandsTest {
    private int period;
    private int standardDeviations;
    private Candles candles;

    private BigDecimal result;

    @Test
    void calculate_notEnoughCandles_IAThrown() {
        givenPeriod(5);
        givenStandardDeviations(2);
        givenCandles(simpleCloseCandles());

        assertThrows(IllegalArgumentException.class, () -> whenCalculating(6), Assertions.NOT_ENOUGH_CANDLES);
    }

    @Test
    void calculate_realData() {
        givenPeriod(20);
        givenStandardDeviations(2);
        givenCandles(eurusdMonthly17to20());
        whenCalculating(0);

        assertEquals(new BigDecimal("1.0849"), result);
    }

    @Test
    void calculate_realDataWithNonZeroIndex() {
        givenPeriod(20);
        givenStandardDeviations(2);
        givenCandles(eurusdMonthly17to20());
        whenCalculating(2);

        assertEquals(new BigDecimal("1.0748"), result);
    }

    private void givenPeriod(int period) {
        this.period = period;
    }

    private void givenStandardDeviations(int standardDeviations) {
        this.standardDeviations = standardDeviations;
    }

    private void givenCandles(Candles candles) {
        this.candles = candles;
    }

    private void whenCalculating(int index) {
        this.result = new LowerBollingerBands(period, standardDeviations, candles).calculate(index);
    }
}