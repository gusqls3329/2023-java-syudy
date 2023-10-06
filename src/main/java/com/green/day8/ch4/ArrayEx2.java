package com.green.day8.ch4;

/*
5개의 방을 갖고있는 정수형 배열을 만드시고
각 방의 1~10의 랜덤한 값을 넣어주세요
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int)((Math.random()*10)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }

    }
}



