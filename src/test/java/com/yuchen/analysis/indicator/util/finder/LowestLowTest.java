package com.yuchen.analysis.indicator.util.finder;

import com.yuchen.analysis.candle.Candles;
import com.yuchen.analysis.candle.CandlesFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static com.yuchen.analysis.indicator.util.BigDecimalAssertions.assertEquals;

class LowestLowTest {
    private Candles candles;
    private BigDecimal result;

    @ParameterizedTest
    @MethodSource("exampleCandles")
    void find_lowestFound(Candles candles, double expected) {
        givenCandles(candles);
        whenFinding(0, candles.size());
        assertEquals(expected, result);
    }

    private static Stream<Arguments> exampleCandles() {
        return Stream.of(
                Arguments.of(CandlesFactory.eurusdMonthly17to20(), 1.03406d),
                Arguments.of(CandlesFactory.eurusdMonthly2017(), 1.03406d),
                Arguments.of(CandlesFactory.eurusdMonthly2018(), 1.12155d),
                Arguments.of(CandlesFactory.eurusdMonthly2019(), 1.08792d)
        );
    }

    private void givenCandles(Candles candles) {
        this.candles = candles;
    }

    private void whenFinding(int start, int end) {
        result = new LowestLow(candles).find(start, end);
    }
}