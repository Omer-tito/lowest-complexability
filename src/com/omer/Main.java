package com.omer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayToSort = {50, 99, 1, 13, 13, 1, 13, 99, 16, 14, 32, 23};
        lowestComplexability(arrayToSort);
    }

    public static void lowestComplexability(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
