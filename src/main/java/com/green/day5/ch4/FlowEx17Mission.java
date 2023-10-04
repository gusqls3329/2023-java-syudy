package com.green.day5.ch4;

import java.util.Scanner;

/*
5입력 ____*
     ---**
     --***
     -****
     *****


            }
            System.out.println();
 */
class FlowEx17Mission_R {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int tmp = scan.nextInt();

        for (int i = 1; i <= tmp; i++) {
            for (int a = tmp - i; a > 0; a--) {
                System.out.print("_");

            }
            for (int b = 0; b < i; b++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

class FlowEx17Mission_R2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int tmp = scan.nextInt();

        for (int i = tmp; i > 0; i--) {
            for (int a = 1; a <= tmp; a++) {
                if (a < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }


            }
            System.out.println();
        }
    }
}
