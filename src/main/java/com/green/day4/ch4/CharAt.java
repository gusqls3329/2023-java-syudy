package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk";
        str = str.toUpperCase(); //대문자로 바꿔줌 = String str1 = "abcdefghijk".toUpperCase();
        char reasult = str.charAt(0); // = ()안의 숫자는 String str의 위치를 뜻함 0은 첫자리부터 시작

        int val = Character.getNumericValue(reasult); //입력 된 문자를 정수 값으면 변경처리
        System.out.println("val: "+ val);

        System.out.println(str);
        System.out.println("reasult1: " +reasult);
        System.out.println("reasult2: " +str.charAt(2));



    }
}
