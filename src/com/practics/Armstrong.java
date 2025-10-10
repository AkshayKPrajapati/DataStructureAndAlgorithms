package com.practics;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int temp = number % 10;
            sum += (int) Math.pow(temp, digits);
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}
