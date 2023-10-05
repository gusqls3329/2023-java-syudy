package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile { //강사님은 안씀, 아래 While은 같은 방법, 최소한 한번은 실행함
    //While을 반복문 들어가기 전에 조건식을 체크함 do While은 일단 실행하고 조건식을 체크함
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        do {
            System.out.print("1~100사이의 숫자 입력 (종료:0) >>");
            input = scan.nextInt();
            sum += input;

        } while (input != 0);
        System.out.println("끝!!" + sum);


    }

    class While {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("1~100사이의 숫자 입력 (종료:0) >>");
            int input = scan.nextInt();
            while (input != 0) {
                System.out.print("1~100사이의 숫자 입력 (종료:0) >>");
                input = scan.nextInt();

            }
            System.out.println("끝!!");
        }
    }
}

class DoWhile_2 { //강사님은 안씀, 아래 While은 같은 방법
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        while (true) {
            System.out.print("1~100사이의 숫자 입력 (종료:0) >>");
            input = scan.nextInt();
            if(input==0) {
                break;
            }
            sum += input;

        }
        System.out.println("끝!!" + sum);


    }
}