package com.green.day7.ch5;
/*
for문과 arr을 사용해 배열의 모든 방의 값을 출력하시오
arr자리가 더하거나 빼도 적용되도록
 */
public class ArrayMission {
    public static void main(String[] args) {
        int [] arr = {100,200,300,400,500};

        for (int i =0; i<arr.length; i++){

            System.out.printf("arr[%d]: %d\n", i ,arr[i]);
        }

    }
}
