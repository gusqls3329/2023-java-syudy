package com.green.Day9.ch5;

public class MultiArray {
    public static void main(String[] args) {
        int [][] arr = { //2차원 배열
                {100, 200},
                {300, 400},
                {500, 600}
        };
        /* int [] intArr1 = arr[0]; // {100, 200} = int []
        int [] newIntArr = {1,2,3,4};
        arr[0] = newIntArr;*/

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println("------------------------------------------");

        int [] intArr = arr[2];
        System.out.println(intArr[1]); //System.out.println(arr[2][1]); 와 같은 식
        System.out.println("------------------------------------------");

        int [] newIntArr = {1,2,3,4};
        arr[0] = newIntArr; //방 숫자를 바꾸는 방법  int [] newIntArr = {1,2,3,4};와 함께 사용해야함
        int [] intArr2 = arr[0];
        System.out.println(intArr2[1]);
        System.out.println("------------------------------------------");
        System.out.println("arr.lengh: "+ arr.length);
        System.out.println("arr[0].lengh: "+ arr[0].length);


    }
}
