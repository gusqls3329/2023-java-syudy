package com.green.Day9.ch5;

/*
score [0][0] = 101
score [0][1] = 102
...
score[3][2] = 43
sum??
 */
public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
        };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < score[i].length; z++) {
                sum = sum + score[i][z];
                System.out.printf("score[%d][%d] = %d\n", i, z, score[i][z]);
            }
        }
        System.out.println("sum : " + sum);
    }
}

class ArrayEx18_2 {
    //향상된 for문을 이용해 sum값을 구하고싶다
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
        };

        /*
        for(int[]arr : score) =
            for (int i = 0; i < score.length; i++) {
            int[] arr = score[i];} 과같다.

        for (int val : arr) =     for (int z = 0; z < score[i].length; z++) {
             int val = score[i][z];와 같음
         */
       int sum = 0;
        for(int[] arr : score){
            for (int val : arr){
                sum += val; //각 값을 사용할 수 없음.
            }
        }
        System.out.println("sum : " + sum);
    }
}

