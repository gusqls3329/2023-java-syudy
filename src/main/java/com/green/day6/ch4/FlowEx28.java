package com.green.day6.ch4;

import java.util.Scanner;

/*
while문을 활용
1~100사이의 정수를 입력하세요.
입력한 숫자보다 정답이 크다 > Up
입력한 숫자보다 정답이 작서 > Down
만출때까지 반복한다.
 */
public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("answer : "+answer);

        while (true) {
            System.out.print("1~100사이의 정수를 입력하세요. >> ");
            input = scan.nextInt();

            if (input < answer) {
                System.out.println("Up");
            } else if (input > answer) {
                System.out.println("Down");
            } else if (input == answer) {
                break;
            }

        } System.out.println("정답");
    }
}


class FlowEx28_1 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("answer : "+answer);

        while (true) {
            System.out.print("1~100사이의 정수를 입력하세요. >> ");
            input = scan.nextInt();

            if(input == answer){break;}
            System.out.println(input < answer ? "up":"down");
        } System.out.println("정답");
    }
}