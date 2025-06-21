package com.financial;

public class Main {
    public static void main(String[] args) {
        
        double initialValue = 1000.0; 
        double[] growthRates = {0.05, 0.03, 0.07}; 

        
        ForecastManager manager = new ForecastManager();

        
        for (int year = 1; year <= growthRates.length; year++) {
            double futureValue = manager.calculateFutureValue(initialValue, growthRates, year);
            System.out.println("Year " + year + " Future Value: $" + String.format("%.2f", futureValue));
        }
    }
}