package com.green.day6.ch4;

import java.util.Scanner;

/*
12345 > 15 처럼 각자 자리 수를 다 더하기
 */
public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (예:12345) >> ");
        num = scan.nextInt();
        while (num != 0) {
            int modval = num % 10; //일의자리 숫자 구하기
        num = num /10; // 일의자리를 제외한 수 구하면 빠져나와 다시 whlil 문에 들어가 일의자리 구하기부터 시작됨.
        sum = + sum + modval;
            System.out.printf("sum(%d)= sum(%d)+madval(%d)\n",sum,sum,modval);
        }
        System.out.println("결과 >> "+ sum);
    }
}

class FlowEx25_1 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (예:12345) >> ");
        num = scan.nextInt();

        while (num != 0) {
            sum += num % 10; // sum =sum+ num /10;
            /*
            int modval = num % 10;
            sum += num /= 10
             */
            num /= 10;

        }
        System.out.println("결과 >> "+ sum);
    }
}