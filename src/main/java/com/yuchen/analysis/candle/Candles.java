package com.yuchen.analysis.candle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Wrapper around a list to represent of a group of candles on a chart. The list is in reverse order when compared to
 * a chart so the most recent candle is the first candle in the list (ie index 0).
 */
public class Candles implements Iterable<Candle> {
    private final List<Candle> candles;

    public Candles(List<Candle> candles) {
        this.candles = new ArrayList<>(candles);
    }

    public int size() {
        return candles.size();
    }

    public Candle get(int index) {
        return candles.get(index);
    }

    public Candles sublist(int startIndex, int endIndex) {
        return new Candles(candles.subList(startIndex, endIndex));
    }

    public Candles sublist(int endIndex) {
        return sublist(0, endIndex);
    }

    public List<Double> closes(int period) {
        return sublist(period).stream()
                .map(Candle::getClose)
                .collect(Collectors.toList());
    }

    public List<Double> closes() {
        return closes(candles.size());
    }

    public Stream<Candle> stream() {
        return candles.stream();
    }

    @Override
    public Iterator<Candle> iterator() {
        return candles.listIterator();
    }
}
