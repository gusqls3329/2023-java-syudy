package com.green.day27;

public class SubstringTest {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";

        String r1 = str.substring(2,4);// 2~4번까지 숫자를 가져와라
        System.out.println("r1: "+r1);

        System.out.println("r2: "+str.substring(4)); //4부터 끝가지 숫자를 가져와라

        System.out.println(str);
    }
}
