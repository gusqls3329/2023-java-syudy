package com.green.day8.ch4;

//score은 누군가의 점수이며 총점과 평균점수는
public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100,88,100,100,90};
        int sum = 0; //각방에 있는 값을 저장하는 법 (밑의 for문까지)
        for(int i =0; i< score.length; i++ ){
            sum = sum +score[i];
        }

        System.out.println("총점: "+ sum);
        System.out.printf("평균: "+ (double)sum/score.length );
    }
}
