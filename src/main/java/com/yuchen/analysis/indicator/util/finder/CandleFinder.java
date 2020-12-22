package com.yuchen.analysis.indicator.util.finder;

import java.math.BigDecimal;

/**
 * Finds a candle in a given set of candles.
 */
public interface CandleFinder {
    /**
     * @param start The candle index to start the search at, inclusive.
     * @param end   The candle index to end the search at, exclusive.
     * @return the value that was found
     */
    BigDecimal find(int start, int end);
}
