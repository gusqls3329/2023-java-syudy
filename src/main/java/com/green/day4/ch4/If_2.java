package com.green.day4.ch4;
/*
scanner을 이용해 성별을 입력 ( 남자_남자,남,man,Man/ 여자_여자,여,woman,Woman )
만약, 남자가 입력되었다면 콘솔에 잘 생겼다가 출력
만약, 여자가 입력되었다면 콘솔에 예쁘다가 출력
만약, 남자 여자가 아닌 값이 입력되었다면 누구냐로 출력
 */

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 (남자,여자) >> ");
        String gender = scan.nextLine();

        if ("여자".equals(gender) || "여".equals(gender) || "woman".equals(gender) || "Woman".equals(gender)) {
            System.out.printf("예쁘다.");
        } else if ("남자".equals(gender) || "남".equals(gender) || "man".equals(gender) || "Man".equals(gender)) {
            System.out.printf("잘생겼다.");
        } else {
            System.out.printf("누구냐");
        }

    }
}

