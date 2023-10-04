package com.green.day3.ch4;

import java.util.Scanner;
/*(콘솔) 숫자를 하나 입력하세요 >
     (입력값을 기다려야함)
     숫자를 입력하고 엔터를 누르면
     (타입자유) 변수에 해당값이 저장될 수 있도록
     해당값이 홀수명
     00은 홀수입니다
     해당값이 짝수면
     00은 짝수입니다.
    */

public class FlowEx2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("숫자를 하나 입력하세요 >");
        }
        String input = scan.nextLine();
        double num = Integer.parseInt(input);
        if (num == 0) {
            System.out.println("다른값을 입력해 주세요.");
            if (num % 2 == 1) {
                System.out.printf(" %f 은 홀수입니다.", num);
            }
            if (num % 2 == 0) {
                System.out.printf(" %f 은 짝수입니다.", num);
            }
        }

    }
}


class FlowEx2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("숫자를 하나 입력하세요 >");
        }
        String input = scan.nextLine();
        double num = Double.parseDouble(Double.toString(Double.parseDouble(input)));


        if (num % 2 == 0) {
            System.out.printf(" %f 은 짝수입니다.", num);
        } else {
            if (num % 2 == 1) {
                System.out.printf(" %f 은 홀수입니다.", num);
            } else {
                System.out.printf(" %f 은 소수점입니다.", num);
            }
        }
    }
}