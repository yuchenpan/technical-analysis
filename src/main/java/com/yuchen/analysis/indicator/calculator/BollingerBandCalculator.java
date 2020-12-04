package com.yuchen.analysis.indicator.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BollingerBandCalculator {
    private final Integer length;
    private final Integer stdDev;
    private final List<Double> prices;

    private final Double upperBand;
    private final Double middleBand;
    private final Double lowerBand;
    private final Double deviationValue;

    public BollingerBandCalculator(Integer stdDev, List<Double> prices) {
        this.stdDev = stdDev;
        this.length = prices.size();
        this.prices = new ArrayList<>(prices);
        this.middleBand = calculateMiddleBand();
        this.deviationValue = calculateDeviationValue();
        this.upperBand = calculateUpperBand();
        this.lowerBand = calculateLowerBand();
    }

    public Double getUpperBand() {
        return upperBand;
    }

    public Double getMiddleBand() {
        return middleBand;
    }

    public Double getLowerBand() {
        return lowerBand;
    }

    private Double calculateDeviationValue() {
        List<Double> squared = prices.stream()
                .map(price -> Math.pow(price - middleBand, 2))
                .collect(Collectors.toList());

        Double total = 0d;
        for (Double sq : squared) {
            total += sq;
        }

        return Math.sqrt(total / length);
    }

    private Double calculateUpperBand() {
        return middleBand + (stdDev * deviationValue);
    }

    private Double calculateMiddleBand() {
        Double total = 0d;

        for (Double d : prices) {
            total += d;
        }

        return total / length;
    }

    private Double calculateLowerBand() {
        return middleBand - (stdDev * deviationValue);
    }
}
