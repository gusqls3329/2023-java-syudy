package com.green.day11.ch6;

public class StarPrint {
    void line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void square1(int n) {//square와같음.
        for (int i = 0; i < n; i++) {
            line(n);
        }
        System.out.println();
    }

    void triangle(int n) {

        for (int i = 1; i <= n; i++) {
            line(i);
        }
    }

    String chkGenderById(String reasult) {
        char a = reasult.charAt(7);

        if (a == '2' || a == '4' ) return "여성"; // ==: 기본형 타입비교 , equals: 참조형 타입 비교 (String 포함.)
        else if (a == '1' || a == '3') {
            return "남성";
        }
        return "잘못";
    }

    int sumFromTo (int n1, int n2){
        int sum = 0;

        for (int i = n1; i <= n2; i++) {


            sum+=i;
        } return sum;
    }
}



