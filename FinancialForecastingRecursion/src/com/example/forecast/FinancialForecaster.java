package com.example.forecast;
import java.util.HashMap;
import java.util.Map;

public class FinancialForecaster {
    // Plain recursion  O(n) time, O(n) stack space
    public static double futureValueRecursive(double principal,
                                              double growthRate,
                                              int years) {
        // Base case — stop recursing
        if (years == 0) {
            return principal;
        }

        // Recursive case — solve for one fewer year, then grow it
        return futureValueRecursive(principal, growthRate, years - 1)
                * (1 + growthRate);
    }

    // Memoized recursion  O(n) time, avoids recomputation
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double futureValueMemo(double principal,
                                         double growthRate,
                                         int years) {
        if (years == 0) return principal;

        // Return cached result if already computed
        if (memo.containsKey(years)) {
            System.out.println("  [cache hit] year " + years);
            return memo.get(years);
        }

        double result = futureValueMemo(principal, growthRate, years - 1)
                * (1 + growthRate);

        memo.put(years, result);  // store before returning
        return result;
    }

    public static void clearMemo() {
        memo.clear();
    }

    // Iterative  O(n) time, O(1) space — best for production
    public static double futureValueIterative(double principal,
                                              double growthRate,
                                              int years) {
        double value = principal;
        for (int i = 1; i <= years; i++) {
            value = value * (1 + growthRate);
        }
        return value;
    }
}