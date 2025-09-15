package com.practics;

public class Palindrome {

    public static void main(String[] args) {

        String string= "madam";
        String reverse= new StringBuilder(string).reverse().toString();
        System.out.println(reverse);
    }
}
