package com.green.Day9.ch5;

import java.util.Arrays;

//arr각 방에 code에 있는 값만 랜덤하게 넣어주세요
public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i <arr.length; i++){
            int ridx = (int) (Math.random()*code.length);
            arr[i] = code[ridx];

        }
        System.out.println(Arrays.toString(arr));
    }
}
