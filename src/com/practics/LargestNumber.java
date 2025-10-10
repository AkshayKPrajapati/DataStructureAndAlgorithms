package com.practics;

public class LargestNumber {
        
        public static void main(String[] args) {

                int [] array= {12,34,56,34,78,9,34,45,99};

                int largest=array[0];
                for(int i=1;i<array.length;i++) {
                        if(array[i]>largest) {
                                largest=array[i];
                        }
                }
                System.out.println("The largest number in the array is: "+largest);
        }
}
