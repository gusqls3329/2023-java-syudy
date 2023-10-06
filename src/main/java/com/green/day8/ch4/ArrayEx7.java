package com.green.day8.ch4;

import java.util.Arrays;

/*
1. 정수 10개를 저장할 수 있는 배열을 만든다
0~9값을 순차 적으로 대입한다.

 */
public class ArrayEx7 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {

            int a = (int) ((Math.random() * arr.length));
            if (i==a){continue;}
            int tmp =  arr[i];
            arr[i] = arr[a];
            arr[a] = tmp;
        }
        System.out.println(Arrays.toString(arr));

    }
}