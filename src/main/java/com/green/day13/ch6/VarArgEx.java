package com.green.day13.ch6;

public class VarArgEx {

    public static void sum (int ...arr){ //가변인자 =배열
        int tmp = 0;
        for (int n : arr) {
           tmp += n ;
        }
        System.out.println(tmp);
    }

    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20,30,40,50,50,50);
    }
}
