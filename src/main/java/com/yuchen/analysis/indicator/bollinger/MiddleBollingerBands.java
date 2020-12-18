package com.yuchen.analysis.indicator.bollinger;

import com.yuchen.analysis.candle.Candles;
import com.yuchen.analysis.indicator.Indicator;
import com.yuchen.analysis.indicator.util.Assertions;
import com.yuchen.analysis.indicator.util.Average;

import java.math.BigDecimal;

public class MiddleBollingerBands extends Indicator {
    private final int period;

    public MiddleBollingerBands(int period, Candles candles) {
        super(candles);
        this.period = period;
    }

    @Override
    public BigDecimal calculate(int index) {
        Assertions.enoughCandlesAfterIndex(index, period, candles);

        return Average.closes(candles.sublist(index, index + period));
    }
}
