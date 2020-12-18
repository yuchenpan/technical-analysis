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
                closeOnly(bigDecimal("1")),
                closeOnly(bigDecimal("2")),
                closeOnly(bigDecimal("3")),
                closeOnly(bigDecimal("4")),
                closeOnly(bigDecimal("5")),
                closeOnly(bigDecimal("6")),
                closeOnly(bigDecimal("7")),
                closeOnly(bigDecimal("8")),
                closeOnly(bigDecimal("9")),
                closeOnly(bigDecimal("1"))
        ));
    }

    public static Candles eurusdMonthly17to20() {
        return Candles.of(eurusdMonthly2019(), eurusdMonthly2018(), eurusdMonthly2017());
    }

    public static Candles eurusdMonthly2017() {
        return new Candles(candles(
                new Candle(bigDecimal("1.19041"), bigDecimal("1.20039"), bigDecimal("1.20256"), bigDecimal("1.17177")),
                new Candle(bigDecimal("1.16457"), bigDecimal("1.19041"), bigDecimal("1.19621"), bigDecimal("1.15539")),
                new Candle(bigDecimal("1.18150"), bigDecimal("1.16457"), bigDecimal("1.18800"), bigDecimal("1.15741")),
                new Candle(bigDecimal("1.19091"), bigDecimal("1.18150"), bigDecimal("1.20928"), bigDecimal("1.17170")),
                new Candle(bigDecimal("1.18425"), bigDecimal("1.19091"), bigDecimal("1.20705"), bigDecimal("1.16622")),
                new Candle(bigDecimal("1.14252"), bigDecimal("1.18425"), bigDecimal("1.18460"), bigDecimal("1.13126")),
                new Candle(bigDecimal("1.12433"), bigDecimal("1.14252"), bigDecimal("1.14454"), bigDecimal("1.11191")),
                new Candle(bigDecimal("1.08962"), bigDecimal("1.12433"), bigDecimal("1.12684"), bigDecimal("1.08393")),
                new Candle(bigDecimal("1.06548"), bigDecimal("1.08962"), bigDecimal("1.09508"), bigDecimal("1.05698")),
                new Candle(bigDecimal("1.05764"), bigDecimal("1.06548"), bigDecimal("1.09060"), bigDecimal("1.04950")),
                new Candle(bigDecimal("1.07975"), bigDecimal("1.05764"), bigDecimal("1.08290"), bigDecimal("1.04938")),
                new Candle(bigDecimal("1.05198"), bigDecimal("1.07975"), bigDecimal("1.08124"), bigDecimal("1.03406"))
        ));
    }

    public static Candles eurusdMonthly2018() {
        return new Candles(candles(
                new Candle(bigDecimal("1.13159"), bigDecimal("1.14649"), bigDecimal("1.14856"), bigDecimal("1.12701")),
                new Candle(bigDecimal("1.13117"), bigDecimal("1.13159"), bigDecimal("1.15004"), bigDecimal("1.12155")),
                new Candle(bigDecimal("1.16027"), bigDecimal("1.13117"), bigDecimal("1.16253"), bigDecimal("1.13020")),
                new Candle(bigDecimal("1.16019"), bigDecimal("1.16027"), bigDecimal("1.18151"), bigDecimal("1.15260")),
                new Candle(bigDecimal("1.16908"), bigDecimal("1.16019"), bigDecimal("1.17337"), bigDecimal("1.13010")),
                new Candle(bigDecimal("1.16847"), bigDecimal("1.16908"), bigDecimal("1.17908"), bigDecimal("1.15748")),
                new Candle(bigDecimal("1.16941"), bigDecimal("1.16847"), bigDecimal("1.18518"), bigDecimal("1.15080")),
                new Candle(bigDecimal("1.20791"), bigDecimal("1.16941"), bigDecimal("1.20842"), bigDecimal("1.15100")),
                new Candle(bigDecimal("1.23241"), bigDecimal("1.20791"), bigDecimal("1.24140"), bigDecimal("1.20556")),
                new Candle(bigDecimal("1.21946"), bigDecimal("1.23241"), bigDecimal("1.24767"), bigDecimal("1.21542")),
                new Candle(bigDecimal("1.24137"), bigDecimal("1.21946"), bigDecimal("1.25560"), bigDecimal("1.21874")),
                new Candle(bigDecimal("1.20039"), bigDecimal("1.24137"), bigDecimal("1.25374"), bigDecimal("1.19159"))
        ));
    }

    public static Candles eurusdMonthly2019() {
        return new Candles(candles(
                new Candle(bigDecimal("1.10191"), bigDecimal("1.12120"), bigDecimal("1.12392"), bigDecimal("1.10031")),
                new Candle(bigDecimal("1.11514"), bigDecimal("1.10191"), bigDecimal("1.11756"), bigDecimal("1.09812")),
                new Candle(bigDecimal("1.08987"), bigDecimal("1.11514"), bigDecimal("1.11794"), bigDecimal("1.08792")),
                new Candle(bigDecimal("1.09905"), bigDecimal("1.08987"), bigDecimal("1.11096"), bigDecimal("1.08847")),
                new Candle(bigDecimal("1.10766"), bigDecimal("1.09905"), bigDecimal("1.12496"), bigDecimal("1.09632")),
                new Candle(bigDecimal("1.13721"), bigDecimal("1.10766"), bigDecimal("1.13721"), bigDecimal("1.10604")),
                new Candle(bigDecimal("1.11688"), bigDecimal("1.13721"), bigDecimal("1.14122"), bigDecimal("1.11603")),
                new Candle(bigDecimal("1.12151"), bigDecimal("1.11688"), bigDecimal("1.12649"), bigDecimal("1.11072")),
                new Candle(bigDecimal("1.12178"), bigDecimal("1.12151"), bigDecimal("1.13239"), bigDecimal("1.11115")),
                new Candle(bigDecimal("1.13706"), bigDecimal("1.12178"), bigDecimal("1.14482"), bigDecimal("1.11764")),
                new Candle(bigDecimal("1.14474"), bigDecimal("1.13706"), bigDecimal("1.14884"), bigDecimal("1.12343")),
                new Candle(bigDecimal("1.14649"), bigDecimal("1.14474"), bigDecimal("1.15702"), bigDecimal("1.12894"))
        ));
    }

    public static List<Candle> candles(Candle... candles) {
        return Arrays.asList(candles);
    }

    public static Candle closeOnly(BigDecimal close) {
        return new Candle(bigDecimal("0"), close, bigDecimal("0"), bigDecimal("0"));
    }

    private static BigDecimal bigDecimal(String value) {
        return new BigDecimal(value);
    }
}
