package com.green.day8.ch4;

import java.util.Arrays;

/*
1. 정수 10개를 저장할 수 있는 배열을 만든다
0~9값을 순차 적으로 대입한다.
셔플 : 각 자리 값이 다 바뀌어야함.
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; //arr[i]=방위치, i=값
            }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {

            int a = (int) ((Math.random() * arr.length));//배열의 처음부터 마지막 방 까지 나오게 하는것.
            if (i==a){continue;} //

            int tmp =  arr[i];
            arr[i] = arr[a];
            arr[a] = tmp;
        }
        System.out.println(Arrays.toString(arr));

    }
}