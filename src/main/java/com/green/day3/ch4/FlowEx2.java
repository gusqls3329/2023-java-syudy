package com.green.day3.ch4;

/*(콘솔에) 숫자를 하나 입력하세요 >
(입력을 기다려야함)
숫자를 입력하고 엔터를 누르면
string 변수에 해당값이 저장될 수 있도록
해당 문자열을 정수형으로 형변환
해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다"
해당 숫자가 0이아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다"
*/

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("숫자를 하나 입력하세요 >");
        }
        String str = scan.nextLine();
        int num = Integer.parseInt(str);

        if (num == 0) {
            System.out.println("입력하신 숫자는 0입니다");
        }
        if (num != 0) {
            System.out.println("입력하신 숫자는 0이 아닙니다");
        } // = else {  System.out.println("입력하신 숫자는 0이 아닙니다"); }

    }
}

class FlowEx2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //여러개의 답을 듣길 원해도 new scanner은 한번만 작성
        {
            System.out.print("숫자를 하나 입력하세요 >");
        }
        String str = scan.nextLine();
        int num = Integer.parseInt(str); //문자를 정수형으로 바꿀때 사용

        if (num == 0) {
            System.out.println("입력하신 숫자는 0입니다");
        } else {
            System.out.printf("입력하신 숫자는 0이 아닙니다. 입력하신 숫자는 %s 입니다.", str);
        }

    }
}