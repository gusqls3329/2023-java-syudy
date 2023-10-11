package com.green.day10.ch5;

import java.util.Scanner;

/*
Q1. chair의 뜻은? dsfs?
틀렸습니다. 정답은 의자입니다.

 Q2. computer의 뜻은? 컴퓨터?
정답입니다.

Q1. integer의 뜻은? 정주?
틀렸습니다. 정답은 정수입니다.

 */
public class MultiArryEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                , {"computer", "컴퓨터"}
                , {"integer", "정수"}
                , {"double" , "실수"}
        };
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? >>\n ", i+1, words[i][0]);
            String input = scan.nextLine();
            if (input.equals(words[i][1]) ){
                System.out.println("정답입니다.\n");
            }else{
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n",words[i][1] );
            }
        }
    }
}
class MultiArryEx4_1 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                , {"computer", "컴퓨터"}
                , {"integer", "정수"}
                , {"double" , "실수"}
        };
        Scanner scan = new Scanner(System.in);
        int i = 1;
        for (String [] worsArr : words) {
            System.out.printf("Q%d. %s의 뜻은? >>\n ", i++, worsArr[0]);
            String input = scan.nextLine();
            String expctedAnswer = worsArr[1];
            if (!input.equals(expctedAnswer) ){
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n",expctedAnswer);
                continue;
            }else{
                System.out.print("정답입니다.\n" );
            }
        }
    }
}