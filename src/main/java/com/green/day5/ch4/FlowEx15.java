package com.green.day5.ch4;
/*
반복문 사용
6*1=6
6*2=12
...
6*9=54
 */
public class FlowEx15 {
    public static void main(String[] args) {
        final int DAN = 6;
        for(int i = 1; i < 10 ; i++) {

            System.out.printf("%d X %d = %d\n",DAN, i, DAN*i );
        }
    }
    }
