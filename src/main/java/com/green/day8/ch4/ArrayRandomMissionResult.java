package com.green.day8.ch4;

import java.util.Arrays;

public class ArrayRandomMissionResult {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int)((Math.random()*10)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }
        System.out.println(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));

    }
}
