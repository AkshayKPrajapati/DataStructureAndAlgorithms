package com.practics;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int reverseNumber= 0;
        int n = sc.nextInt();
        while(n!=0)
        {
            reverseNumber=reverseNumber*10+n%10;
            n=n/10;
        }
        System.out.println(reverseNumber);
    }
}
