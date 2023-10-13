package com.green.day12.ch6;

import java.util.Arrays;

public class MethdExam4 {
     int [] plusMap(int[]arr, int val){
        int [] temp = new int [arr.length];
         for (int i = 0; i < arr.length; i++) {
             temp[i] = arr[i];
             temp[i] = temp[i]+ val;
         } return temp;
        }

    void plusOrigin(int[]arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += val;
        }
    }
    int [] randomValFromTo(int len, int min, int max){
        int [] k = new int [len];

        for (int i = 0; i < len; i++) {
            int a = (int)(Math.random()*(max-min+1))+min;
            k[i] = a;
        }return k;
        }



    public static void main(String[] args) {
        MethdExam4 me4 = new MethdExam4();

        int [] arr = {10,20,30};
        int [] rArr1 = me4.plusMap(arr,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));// = 비파괴 원본을 건드리지 않음

        me4.plusOrigin(arr,4);
        System.out.println(Arrays.toString(arr));
        //배열크기, 랜덤 min, 랜덤 max
        int[] rArr2 = me4.randomValFromTo(10,5,20);
        System.out.println(Arrays.toString(rArr2));
    }
}
