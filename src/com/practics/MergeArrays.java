package com.practics;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr = {5, 8, 9};
        int[] arr2 = {1, 7, 6};

        int[] merged = new int[arr.length + arr2.length];

        // Copy first array
        System.arraycopy(arr, 0, merged, 0, arr.length);

        // Copy second array starting after arr's elements
        System.arraycopy(arr2, 0, merged, arr.length, arr2.length);

        System.out.println(Arrays.toString(merged));
    }
}
