package com.example.recursionexample.fibonacciExample;

public class FibonacciExample {

    private static long[] fibonacciCache;

    public static long[] getFibonacciCache() {
        return fibonacciCache;
    }

    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
