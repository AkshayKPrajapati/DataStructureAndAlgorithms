package com.practics;

public class Factorial {

    public static void main(String[] args) {

        int num=5,factorial=1;
        System.out.println("Factorial Series : ");
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
            System.out.println(" "+ factorial);
        }

        System.out.println("Factorial Last : "+ factorial);
    }
}
