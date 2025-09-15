package com.practics;

public class Fibonacci {

    // method to return nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // method to print series up to n
    public static void printFibonacciSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        printFibonacciSeries(10);
    }
}
