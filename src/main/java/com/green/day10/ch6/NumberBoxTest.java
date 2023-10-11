package com.green.day10.ch6;

public class NumberBoxTest { // = 사용함 = 호출
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(); //타입은 이름과 같이것을 사용하기., new NumberBox()=그 객체의 주소값.

        nb1.sum(10,20); //10,20 아규먼트보내
        nb1.sum(30,40);

        nb1.minus(40,20);

        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(-33);
        nb1.abs(39);
    }
}
