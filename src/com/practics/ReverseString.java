package com.practics;

public class ReverseString {

    public static void main(String[] args) {

        String string="Automation";
        StringBuilder builder=new StringBuilder(string).reverse();
        System.out.println(builder);

    }
}
