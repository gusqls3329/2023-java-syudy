package com.green.day2.ch3;

public class OperaterEx24 {
    public static void main(String[] args) {
        boolean b1 = 1 == 1 && 2 == 2; //&& = and 연산자, 전부 true가 나와야 ture, 수천개중 하나라도 false면 앤드 연산자는 false
        System.out.println("b1: "+b1);

        boolean b2 = 1 == 1 && 2 ==2 && 3 ==4; //&& = and 연산자
        System.out.println("b2: "+b2);
        // and, or연산자는 boolean타입

        System.out.println("____________________");

        boolean b3 = 1 ==2 || 2 ==3 || 4 ==4; //||  = or 연산자 하나라도  true면 전부true
        System.out.println("b3: "+b3);

        boolean b4 = 1 == 2 || 2 ==3 || 3 ==4;
        System.out.println("b4: "+b4);

        System.out.println("____________________");

        //부정연산자 : !를 붙이면 결과의 반대값이 나옴
        boolean b5 = 1 == 1;
        System.out.println("b5: "+b5);
        System.out.println("!b5: "+!b5);
        System.out.println("!!b5: "+!!b5);



    }
}
