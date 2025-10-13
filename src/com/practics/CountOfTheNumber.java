package com.practics;

import java.util.Scanner;

public class CountOfTheNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;

        count= String.valueOf(n).length();
        System.out.println(count);
    }
}
