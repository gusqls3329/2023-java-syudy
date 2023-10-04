package com.green.day4.ch4;
/*
50~200 사이의 랜덤값
100이하면 그 값의 곱하기 2한 결과값
100초과면 그 값의 더하기 10한 결과값
 */
public class If_4 {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 151)+50 ;
        System.out.println(val);

        if (val <= 100) {
            System.out.println(val*2);
    } else {
            System.out.println(val+10);
        }

        int x = val <= 100 ? val*2 : val+10 ;
        System.out.println(x);
}}
