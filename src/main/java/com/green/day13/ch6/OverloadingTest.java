package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(10.2D);
    }
    void print(){}
    void print(int n){}
    void print(int n1, int n2){}
    void print(int n1, String str1){}
    void print(String str1, int n1){}


}
