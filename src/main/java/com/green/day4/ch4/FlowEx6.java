package com.green.day4.ch4;

import java.util.Scanner;
/*
switch문으로 해결
mon 값이 3~5면 "현재 계절은 봄입니다."
mon 값이 6~8면 "현재 계절은 여름입니다."
mon 값이 9~11면 "현재 계절은 가을입니다."
mon 값이 12~2면 "현재 계절은 겨울입니다."

 */
public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요>>");

        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        switch (mon) {
            case 3, 4, 5:
                System.out.println("현재 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 계절은 가을입니다.");
                break;
            case 12, 1, 2:
                System.out.println("현재 계절은 겨울입니다.");
                break;
            default:
                System.out.println("없는 월입니다.");
        }
    }
}
