package com.green.day3.ch4;

public class FlowEx1 {

    public static void main(String[] args) {
        int x = 0; //0을 초기화
        System.out.printf("x=%d 일 때, 참은것은\n", x);

        if (x == 0) {
            System.out.println("x == 0");
        } //if() 안에는 t, f 가 나오는 것을 작성 (boolean,비교연산자가 ()안에 들어감)={} 안이 t일때만 실행가능
        //
        if (x != 0) {
            System.out.println("x != 0");
        } // {} 안이 t일때만 실행가능하기 때문에 표현되지 않음
        System.out.println("------------------------");

        x = 1;
        System.out.printf("x=%d 일 때, 참인것은\n", x);

        if (x == 0) {
            System.out.println("x == 0");
        }  // !=not
        if (x != 0) {
            System.out.println("x != 0");
        }

        if (!(x == 0)) {
            System.out.println("! ( x == 0) ");
        }
        if (!(x != 0)) {
            System.out.println("! ( x != 0) ");
        }


        System.out.println("끝");


    }
}
