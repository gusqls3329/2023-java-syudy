package com.green.day8.ch4;

import java.util.Arrays;

/*
5개의 방을 갖고있는 정수형 배열을 만드시고
각 방의 1~10의 랜덤한 값을 넣어주세요
각방의 값이 모두 같으면 안된다. (중복허용)
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        final int len = 5;
        int[] arr = new int[len];  // == int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * len) + 1);
            for (int z = 0; z < i; z++) {
                if (arr[i] == arr[z]) { //중복 값을 찾는 것.
                    i--; //중복 값을 변경하는 것. 맨위의 for문에서 같은 자리에 간후 랜덤값을 받음.
                    break;
                }
            }
        }
        for (int i = 0; i< arr.length; i++){
            System.out.printf("arr[%d]:%d\t",i, arr[i]);
        }System.out.println("");
        System.out.println(arr); //주소값
        System.out.println(arr.toString()); //주소값을 문자열로 바꾸어 표현
        System.out.println(Arrays.toString(arr)); //배열에 있는 값사용


    }
    //System.out.println(arr);
    //System.out.println(arr.toString());
    //System.out.println(Arrays.toString(arr));

}




