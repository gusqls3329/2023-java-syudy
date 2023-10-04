package com.green.day3.ch4;

import java.util.Scanner;

//score 값이 90점보다 같거나 크면 A학점 출력
//score 값이 80점보다 같거나 크면 B학점 출력
//1의자리가 9이상이면 +, , 3이하면 - , 나머지는 없음 (빈칸)
// 나머지는 c학점 (c학점은 +,- 없음)

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if (score > 90) {
            if (score >= 98) {
                System.out.println("A+학점");
            } else if (score <= 93) {
                System.out.println("A-학점");
            } else {
                System.out.println("A학점");
            }
        } else if (score > 80) {
            if (score >= 88) {
                System.out.println("B+학점");
            } else if (score <= 83) {
                System.out.println("B-학점");
            } else {
                System.out.println("B학점");
            }
        } else {
            System.out.println("C학점");
        }
        System.out.println("-- 끝 --");
    }


}

class FlowEx5_1 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        String grade = "C";
        String opt = ""; //opt : 옵션


        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                opt = "+";
            } else if (score <= 83) {
                opt = "-";
            }


        }
        System.out.printf("%s%s학점\n", grade, opt);
        System.out.println("-- 끝 --");
    }
}

class FlowEx5_2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        String grade = "C";
        String opt = "";


        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        if (score >= 80) {
            if (score % 10 >= 8 || score == 100) {
                opt = "+";
            } else if (score % 10 <= 3) {
                opt = "-";
            }

        }
        System.out.printf("%s%s학점\n", grade, opt);
        System.out.println("-- 끝 --");
    }
}

class FlowEx5_3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        String grade = "C";
        String opt = "";


        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        if (score >= 80) {
            int rMod = score % 10; // rMod엔 score %10를 나눈 나머지가 들어감.
            if (rMod >= 8 || score == 100) {
                opt = "+";
            } else if (rMod <= 3) {
                opt = "-";
            }

        }
        System.out.printf("%s%s학점\n", grade, opt);
        System.out.println("-- 끝 --");
    }
}