package com.practics;

public class FibonacciSeries {

    public static void main(String[] args) {

        int num=10;
        int number1=0;
        int number2=1;

        for(
                int i =2;i<num;i++
        ){
            int number3= number1+number2;
            System.out.println(number3);
            number2=number1;
            number1=number3;
        }
    }
}



