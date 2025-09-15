package com.practics;

public class PrimeNumberTotal {

    public static void main(String[] args) {

        int length = Integer.parseInt(args[0]);

        System.out.println("Prime numbers from 1 to " + length + " are: ");

        for (int i = 2; i <= length; i++) {
            boolean isPrime = true;

            // check divisibility up to sqrt(i)
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println("End of the Application");
    }
}
