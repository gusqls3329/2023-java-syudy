package com.green.Day9.ch5;

import java.util.Arrays;

/*
numArr 각방에 0~9사이의 랜덤값을 대입한다 (중복허용)
numArr 각방의 값도 출력
cntArr의 0번 방은 0의 개수 1번 방은 1의 개수  count 값을 넣는다
0~9의 개수를 출력
[4,4,4,6,5,7,9,7,5,3]일때
0,1,2의갯수는 0, 3의갯수는 1, 4의갯수는3, 5의갯수는2, 6의갯수는 1, 7의갯수는2, 8의갯수는 0, 9의갯수는1
 */
public class ArrayEx11 {
    public static void main(String[] args) {
        final int Len = 10;
        int[] numArr = new int[Len];
        int[] cntArr = new int[Len];


        for (int i = 0; i < Len; i++) {
            int rval = (int) (Math.random() * Len);
            numArr[i] = rval;
            int val = numArr[i];
            cntArr[val]= cntArr[val]+1;
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(cntArr));


        for (int i =0; i<Len; i++){

        }
        System.out.println(Arrays.toString(cntArr));
    }
}


class ArrayEx11_m {
    public static void main(String[] args) {
        final int Len = 10;
        int[] numArr = new int[Len];
        int[] cntArr = new int[Len];


        for (int i = 0; i < Len; i++) {
            int rval = (int) (Math.random() * Len);
            numArr[i] = rval;
            int val = numArr[i];
            cntArr[val]= cntArr[val]+1;
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(cntArr));

        /*for (int i = 0; i < Len; i++) {
            int val = numArr[i];
            cntArr[val]++;}*/

        for (int a :numArr ){
            cntArr[a]++;
        }

        System.out.println(Arrays.toString(cntArr));
    }
}


