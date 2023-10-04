package com.green.day2.ch3;

public class OperaterEx23 {
    public static void main(String[] args) {
        String s1= "Hello", s2 = "Hello";
        String s3 = new String("Hello");

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2); //동일성
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);
        System.out.printf("%s, equals(%s) : %b\n", s1, s3, s1.equals(s3)); //동등성
        System.out.printf("%s, equals(%s) : %b\n", s3, s1, s3.equals(s1));
        //JAVA에서 문자열 비교는 equals를 꼭 사용해야함 (reference type에서 == 비교는 주소값 비교임_)

    }
}
