package com.practics;

public class SecondLargestNumber {
        
        public static void main(String[] args) {
            int [] array={45,89,99,54,78,85,75,25};
            int secondLargest=findSecondLargestNumber(array);
        System.out.println(secondLargest);
        }

        private static int findSecondLargestNumber(int[] array) {

            int length=array.length;
            for(int i=0;i<length-1;i++){
                for(int j=i+1;j<length;j++){
                    if(array[i]>array[j]){
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }

                }

            }
            return array[length-1];
        };
}
