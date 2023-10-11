package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd");
       //  Tv tv3 = str; 오류 뜸 : 타입이 다르기때문에
        Tv tv1 = new Tv(); // Tv tv1 = (대문자로 시작하기 때문)참조형 변수 : 참조형은 주소값(객체, 배열의 주소값만 담을수있음)이 저장됨.
        tv1. channel = 10;
        tv1.power = true;
        tv1.color = " 파랑";

        Tv tv2 = new Tv(); // new는 문서를 객체화할때 사용하는 키워드,  클래스를 객체화하고 싶을때  new 클래스명 (), new Tv()에 주소 값이 입력되어 tv1에 저장
        tv2. channel = 20;

        System.out.println("tv1 == tv2>>"+ (tv1 == tv2 ? true: false)); // 위 아래의 new Tv()는 동일하지 않음(=주소값이 같이 않음.)
        tv1.channel++;//주소값 메소드 -.은 접근
        System.out.println("tv1.channel: "+ tv1. channel);
        System.out.println("tv2.channel: "+ tv2. channel);
        System.out.println("-------------- ");

        System.out.println("tv1.channel: "+ tv1. channel);
        System.out.println("tv2.power: "+ tv1. power);
        System.out.println("tv2.power: "+ tv1. color);
        System.out.println("-------------- ");

        System.out.println("tv1.channel: "+ tv2. channel);
        System.out.println("tv2.power: "+ tv2. power);
        System.out.println("tv2.power: "+ tv2. color);
    }
}
