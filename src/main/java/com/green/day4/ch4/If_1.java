package com.green.day4.ch4;

import java.util.Scanner;

/*
scanner을 이용해 성별을 입력 ( 남자, 여자 )
만약, 남자가 입력되었다면 콘솔에 잘 생겼다가 출력
만약, 여자가 입력되었다면 콘솔에 예쁘다가 출력
만약, 남자 여자가 아닌 값이 입력되었다면 누구냐로 출력
 */
public class If_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 (남자,여자) > ");
        String gender = scan.nextLine();
        if ("여자".equals(gender)) {
            System.out.printf("예쁘다.");
        } else if ("남자".equals(gender)) {
            System.out.printf("잘생겼다.");
        } else {
            System.out.printf("누구냐");
        }
    } }

class If_1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 (남자,여자) > ");
        String gender = scan.nextLine();

        System.out.printf("%s\n", gender.equals("남자") ? "잘생겼다." : gender.equals("여자") ? "예쁘다." : "누구냐.");

    } }

/*
class If_1_1에 관련 설명
System.out.printf( a : b ? c : d )
gender.equals("남자")

A : System.out.printf("%s", gender.equals("남자") ? "잘생겼다." : "누구냐.");
B : System.out.printf("%s", gender.equals("여자") ? "예쁘다." : "누구냐."); A의 끝 누구냐에 B를 대입

System.out.printf("%s", gender.equals("남자") ? "잘생겼다." : gender.equals("여자") ? "예쁘다." : "누구냐.");

 */