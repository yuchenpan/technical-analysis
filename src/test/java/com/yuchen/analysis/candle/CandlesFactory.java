package com.yuchen.analysis.candle;

import java.util.Arrays;
import java.util.List;

/**
 * A factory class to be used in tests. Produces candles that are regularly used.
 */
public class CandlesFactory {
    public static Candles simpleCloseCandles() {
        return new Candles(candles(
                closeOnly(1d),
                closeOnly(2d),
                closeOnly(3d),
                closeOnly(4d),
                closeOnly(5d),
                closeOnly(6d),
                closeOnly(7d),
                closeOnly(8d),
                closeOnly(9d),
                closeOnly(10d)
        ));
    }

    public static Candles eurusdMonthly17to20() {
        return Candles.of(eurusdMonthly2019(), eurusdMonthly2018(), eurusdMonthly2017());
    }

    public static Candles eurusdMonthly2017() {
        return new Candles(candles(
                new Candle(1.19041, 1.20039, 1.20256, 1.17177),
                new Candle(1.16457, 1.19041, 1.19621, 1.15539),
                new Candle(1.18150, 1.16457, 1.18800, 1.15741),
                new Candle(1.19091, 1.18150, 1.20928, 1.17170),
                new Candle(1.18425, 1.19091, 1.20705, 1.16622),
                new Candle(1.14252, 1.18425, 1.18460, 1.13126),
                new Candle(1.12433, 1.14252, 1.14454, 1.11191),
                new Candle(1.08962, 1.12433, 1.12684, 1.08393),
                new Candle(1.06548, 1.08962, 1.09508, 1.05698),
                new Candle(1.05764, 1.06548, 1.09060, 1.04950),
                new Candle(1.07975, 1.05764, 1.08290, 1.04938),
                new Candle(1.05198, 1.07975, 1.08124, 1.03406)
        ));
    }

    public static Candles eurusdMonthly2018() {
        return new Candles(candles(
                new Candle(1.13159, 1.14649, 1.14856, 1.12701),
                new Candle(1.13117, 1.13159, 1.15004, 1.12155),
                new Candle(1.16027, 1.13117, 1.16253, 1.13020),
                new Candle(1.16019, 1.16027, 1.18151, 1.15260),
                new Candle(1.16908, 1.16019, 1.17337, 1.13010),
                new Candle(1.16847, 1.16908, 1.17908, 1.15748),
                new Candle(1.16941, 1.16847, 1.18518, 1.15080),
                new Candle(1.20791, 1.16941, 1.20842, 1.15100),
                new Candle(1.23241, 1.20791, 1.24140, 1.20556),
                new Candle(1.21946, 1.23241, 1.24767, 1.21542),
                new Candle(1.24137, 1.21946, 1.25560, 1.21874),
                new Candle(1.20039, 1.24137, 1.25374, 1.19159)
        ));
    }

    public static Candles eurusdMonthly2019() {
        return new Candles(candles(
                new Candle(1.10191, 1.12120, 1.12392, 1.10031),
                new Candle(1.11514, 1.10191, 1.11756, 1.09812),
                new Candle(1.08987, 1.11514, 1.11794, 1.08792),
                new Candle(1.09905, 1.08987, 1.11096, 1.08847),
                new Candle(1.10766, 1.09905, 1.12496, 1.09632),
                new Candle(1.13721, 1.10766, 1.13721, 1.10604),
                new Candle(1.11688, 1.13721, 1.14122, 1.11603),
                new Candle(1.12151, 1.11688, 1.12649, 1.11072),
                new Candle(1.12178, 1.12151, 1.13239, 1.11115),
                new Candle(1.13706, 1.12178, 1.14482, 1.11764),
                new Candle(1.14474, 1.13706, 1.14884, 1.12343),
                new Candle(1.14649, 1.14474, 1.15702, 1.12894)
        ));
    }

    public static List<Candle> candles(Candle... candles) {
        return Arrays.asList(candles);
    }

    public static Candle closeOnly(Double close) {
        return new Candle(0d, close, 0d, 0d);
    }
}
