package com.yuchen.analysis.candle;

import java.math.BigDecimal;

public class Candle {
    private final BigDecimal open;
    private final BigDecimal close;
    private final BigDecimal high;
    private final BigDecimal low;

    public Candle(double open, double close, double high, double low) {
        this(BigDecimal.valueOf(open), BigDecimal.valueOf(close), BigDecimal.valueOf(high), BigDecimal.valueOf(low));
    }

    public Candle(BigDecimal open, BigDecimal close, BigDecimal high, BigDecimal low) {
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public BigDecimal getClose() {
        return close;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getLow() {
        return low;
    }
}
