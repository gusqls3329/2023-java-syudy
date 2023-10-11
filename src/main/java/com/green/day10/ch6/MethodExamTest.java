package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.CheckZero(10); //0이 아닙니다.
        me.CheckZero(9);//0이 아닙니다.
        me.CheckZero(0);//0입니다.


        int r1 = me.randomValFlromTo(5,9);
        System.out.println(r1);

        for (int i =0; i<100000; i++){ //확인을 위한것
            int r = me.randomValFlromTo(10,100);
            if(r<10 || r>100){
                System.out.println("틀림");
                break;
            }
        }

        me.scoreResultPrint(101); //잘못된 점수입니다.
        me.scoreResultPrint(100); //A학점
        me.scoreResultPrint(90); //A학점
        me.scoreResultPrint(89); //B학점
        me.scoreResultPrint(80); //B학점
        me.scoreResultPrint(79); //C학점
        me.scoreResultPrint(69); //C학점
        me.scoreResultPrint(101); //잘못된 점수입니다.
    }
}
