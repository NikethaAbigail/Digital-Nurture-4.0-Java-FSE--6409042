package com.financial;

public class ForecastManager {
   
    public double calculateFutureValue(double initialValue, double[] growthRates, int year) {
        // Base case: 
        if (year == 0) {
            return initialValue;
        }
        // Recursive case
        return calculateFutureValue(initialValue, growthRates, year - 1) * (1 + growthRates[year - 1]);
    }
}