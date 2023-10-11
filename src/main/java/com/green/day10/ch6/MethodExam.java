package com.green.day10.ch6;

public class MethodExam {
    void CheckZero (int n){
        System.out.println( n !=0 ? "0이 아닙니다." :  "0입니다.");
    }

    int randomValFlromTo (int n1, int n2){
        return (int)(Math.random()*(n2-n1+1))+n1;
    }

    void scoreResultPrint (int n){
        if(n< 0 || n>100){
            System.out.println("잘못된 점수입니다.");
            return;
        } else {
            System.out.printf(n>90 ? "A학점" : n>80 ? "B학점" : n>70 ? "C학점" :"D학점" );
        }
    }
}
