package com.practics;

public class CountVowelConsonantCount

{
    public static void main(String[] args) {

        String s = args[0];
        System.out.println(s);

        int vowelCount=0;
        int consonantCount=0;

        for (char c: s.toCharArray()){

            if ("aeiouAEIOU".indexOf(c)!=-1){
                vowelCount=vowelCount+1;
            }
            else {
                consonantCount=consonantCount+1;
            }
        }
        System.out.println("Total Count of the vowel is : "+vowelCount + "and  Consonant Count is : "+ consonantCount);
    }
}
