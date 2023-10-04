package com.green.day2.ch2;

public class StingEx {
    public static void main (String[] args) {
        String name = "Ja" + "va";
        System.out.println(name);

        System.out.println("Ja" + "va"); //위랑 결과값은 같이만 위는 계속사용가능하나 이건 일회용

        System.out.println("12" + 10 + 9);
        //"12" + 10 > "12" + "10" > "1210" > "1210" + 9 > "1210" + "9" > "12109"

        System.out.println("12" + (10 + 9));
        //()를 먼저 취급함. 문자열은 다른 타입과 더해질 경우 문자열로 바꿈.
        //10+9 = 19 > "12" + 19 > "1219"
    }
}
