package com.example.forecast;

public class ForecastTest {

    public static void main(String[] args) {

        double principal  = 10000.0;  // ₹10,000 starting investment
        double growthRate = 0.10;      // 10% annual growth rate
        int    years      = 5;

        System.out.println("----- Financial Forecasting Tool -----");
        System.out.printf("Principal:   Rs.%.2f%n", principal);
        System.out.printf("Growth rate: %.0f%%%n", growthRate * 100);
        System.out.printf("Years:       %d%n%n", years);

        // Plain recursion
        long t1 = System.nanoTime();
        double rv = FinancialForecaster.futureValueRecursive(principal, growthRate, years);
        long t1end = System.nanoTime();
        System.out.printf("Recursive result:  Rs.%.2f  (%.3f ms)%n",
                rv, (t1end - t1) / 1e6);

        // Memoized recursion
        FinancialForecaster.clearMemo();
        long t2 = System.nanoTime();
        double mv = FinancialForecaster.futureValueMemo(principal, growthRate, years);
        long t2end = System.nanoTime();
        System.out.printf("Memoized result:   Rs.%.2f  (%.3f ms)%n",
                mv, (t2end - t2) / 1e6);

        // Iterative
        long t3 = System.nanoTime();
        double iv = FinancialForecaster.futureValueIterative(principal, growthRate, years);
        long t3end = System.nanoTime();
        System.out.printf("Iterative result:  Rs.%.2f  (%.3f ms)%n%n",
                iv, (t3end - t3) / 1e6);

        // year-by-year breakdown
        System.out.println("----- Year-by-year forecast -----");
        for (int y = 0; y <= years; y++) {
            double val = FinancialForecaster.futureValueRecursive(principal, growthRate, y);
            System.out.printf("Year %d: Rs.%.2f%n", y, val);
        }
    }
}