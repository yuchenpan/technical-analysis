package com.yuchen.analysis.candle;

import java.math.BigDecimal;
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
                new Candle(1.19041d, 1.20039d, 1.20256d, 1.17177d),
                new Candle(1.16457d, 1.19041d, 1.19621d, 1.15539d),
                new Candle(1.18150d, 1.16457d, 1.18800d, 1.15741d),
                new Candle(1.19091d, 1.18150d, 1.20928d, 1.17170d),
                new Candle(1.18425d, 1.19091d, 1.20705d, 1.16622d),
                new Candle(1.14252d, 1.18425d, 1.18460d, 1.13126d),
                new Candle(1.12433d, 1.14252d, 1.14454d, 1.11191d),
                new Candle(1.08962d, 1.12433d, 1.12684d, 1.08393d),
                new Candle(1.06548d, 1.08962d, 1.09508d, 1.05698d),
                new Candle(1.05764d, 1.06548d, 1.09060d, 1.04950d),
                new Candle(1.07975d, 1.05764d, 1.08290d, 1.04938d),
                new Candle(1.05198d, 1.07975d, 1.08124d, 1.03406d)
        ));
    }

    public static Candles eurusdMonthly2018() {
        return new Candles(candles(
                new Candle(1.13159d, 1.14649d, 1.14856d, 1.12701d),
                new Candle(1.13117d, 1.13159d, 1.15004d, 1.12155d),
                new Candle(1.16027d, 1.13117d, 1.16253d, 1.13020d),
                new Candle(1.16019d, 1.16027d, 1.18151d, 1.15260d),
                new Candle(1.16908d, 1.16019d, 1.17337d, 1.13010d),
                new Candle(1.16847d, 1.16908d, 1.17908d, 1.15748d),
                new Candle(1.16941d, 1.16847d, 1.18518d, 1.15080d),
                new Candle(1.20791d, 1.16941d, 1.20842d, 1.15100d),
                new Candle(1.23241d, 1.20791d, 1.24140d, 1.20556d),
                new Candle(1.21946d, 1.23241d, 1.24767d, 1.21542d),
                new Candle(1.24137d, 1.21946d, 1.25560d, 1.21874d),
                new Candle(1.20039d, 1.24137d, 1.25374d, 1.19159d)
        ));
    }

    public static Candles eurusdMonthly2019() {
        return new Candles(candles(
                new Candle(1.10191d, 1.12120d, 1.12392d, 1.10031d),
                new Candle(1.11514d, 1.10191d, 1.11756d, 1.09812d),
                new Candle(1.08987d, 1.11514d, 1.11794d, 1.08792d),
                new Candle(1.09905d, 1.08987d, 1.11096d, 1.08847d),
                new Candle(1.10766d, 1.09905d, 1.12496d, 1.09632d),
                new Candle(1.13721d, 1.10766d, 1.13721d, 1.10604d),
                new Candle(1.11688d, 1.13721d, 1.14122d, 1.11603d),
                new Candle(1.12151d, 1.11688d, 1.12649d, 1.11072d),
                new Candle(1.12178d, 1.12151d, 1.13239d, 1.11115d),
                new Candle(1.13706d, 1.12178d, 1.14482d, 1.11764d),
                new Candle(1.14474d, 1.13706d, 1.14884d, 1.12343d),
                new Candle(1.14649d, 1.14474d, 1.15702d, 1.12894d)
        ));
    }

    public static List<Candle> candles(Candle... candles) {
        return Arrays.asList(candles);
    }

    public static Candle closeOnly(double close) {
        return new Candle(0, close, 0, 0);
    }
}
