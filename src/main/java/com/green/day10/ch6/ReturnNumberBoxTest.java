package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox();
        //ReturnNumberBox rnb : ReturnNumberBox 객체의 주소값을 담을 수 있는 참조형변수
        rnb.sum(10,20); // 출력되지 않음. sum이라는 메소드에 출력하라는 게 있어야 출력값이 나옴

        int r1 = rnb.sum(10,20);
        System.out.println("r1: "+r1);
        int r2 = rnb.sum(20,30);
        System.out.println("r2: "+r2);
        System.out.println("--끝--");

        int r3 = rnb.abs(-10);
        System.out.println("r3: "+r3);

        System.out.println("r4: "+rnb.abs(rnb.abs(-98)));
        System.out.println("r5: "+rnb.abs(-98));
        System.out.println("r6: "+rnb.abs(98));


    }
}
