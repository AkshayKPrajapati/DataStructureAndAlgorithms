package com.practics;

public class FactorialSeries {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void factorialSeries(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static void main(String[] args) {
        factorialSeries(10); // prints factorials from 1! to 10!
    }
}
