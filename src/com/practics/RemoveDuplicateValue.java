package com.practics;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateValue {

    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,5,6,7,8};

        HashSet<Integer>  set=new HashSet<>();

        for (int j : arr) {
            set.add(j);

        }
        System.out.println(set);

    }
}
