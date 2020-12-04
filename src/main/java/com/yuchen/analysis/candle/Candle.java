package com.yuchen.analysis.candle;

public class Candle {
    private final Double open;
    private final Double close;
    private final Double high;
    private final Double low;

    public Candle(Double open, Double close, Double high, Double low) {
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
    }

    public Double getOpen() {
        return open;
    }

    public Double getClose() {
        return close;
    }

    public Double getHigh() {
        return high;
    }

    public Double getLow() {
        return low;
    }
}
