package com.green.day12.ch6;

import java.util.Arrays;

public class RaferanceParamEx3 {
    public static void main(String[] args) {
        int  [] arr = {3, 2, 1, 6, 5, 4};
        printArr(arr); // {3, 2, 1, 6, 5, 4};
        System.out.println(Arrays.toString(arr));
        sortArr(arr); // 주소값. 이없으면 같은 공간에 동급이라는 뜻

        printArr(arr); //123456
        System.out.println("b"+Arrays.toString(arr));

        System.out.println("sum= "+ sumArr(arr));
    }

    public static void sortArr(int [] arr1){ //오름차순 오른쪽이 가장 큰값

        for (int i = arr1.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                int nIdx = j +1;
                if (arr1[j] < arr1[nIdx]){
                    int tmp = arr1[j];
                    arr1[j]= arr1[nIdx];
                    arr1[nIdx] = tmp;
                }
            }
        }

    }

    public static void printArr (int[] arr){
        System.out.printf("[%d",arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            sum = sum + a;
        }
        return sum;
    }
}
