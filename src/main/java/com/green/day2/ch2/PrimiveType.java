package com.green.day2.ch2;

public class PrimiveType {
    public static void main(String[] args) {
        //논리형
        boolean test = true, test2 = false;

        //문자형
        char ch = 'a', ch2= '가';

        //정수형 : int를 그냥 사용하면 됨.
        // 옛날엔 속도때문에 사용. 요즘은 컴퓨터 메모리가 좋아져서 기본처리값이 int를 사용
        byte b1 = 1;     //1byte
        short s1 = 10;   //2byte
        int i1 = 100;   //4byte

        long l1 = 1000; //8byte

        //실수형 : Double타입으로 그냥 사용하면 됨.
        //float f1 = 10.1;
        float f2 = 10.1f, f3 = 10.1F; //리터럴(값)자체를 플롯타입으로 변환
        float f4 = (float)10.1; //강제 형변환
        double d1 = 10.1, d2 = 10.1d, d3 = 10.1D;
        float f5 = (float)d1;
        //int i1 = 100l일 경우 int i1 = (int)100l 로 변경해서 사용
    }
}