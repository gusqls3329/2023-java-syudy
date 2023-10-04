package com.green.day5.ch4;

import java.util.Scanner;

/* scaner을 이용해 정수를 입력받음
*을 출력할 라인의 수를 입력하세요 >>
만약 3을 입력했다면
*
* *
* * *

만약 4을 입력했다면
*
* *
* * *
* * * *
 */
public class FlowEx17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        String tmp = scan.nextLine();
        int score = Integer.parseInt(tmp);

        for (int i = 1; i <= score; i++)  {
            for (int z = 0; z < i; z++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}






class FlowEx17_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        String tmp = scan.nextLine();
        int score = Integer.parseInt(tmp);

        for (int i = 0; i < score; i++) {
            for (int a = 0; a<= i; a++) {
                System.out.printf("*");
            } System.out.println();
        }
    }
}


