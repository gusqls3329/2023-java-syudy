package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //객체화됨 > 객체에 주소값을 저장
        //객체는 속성(값저장, 명사)와 메소드 (기능, 동사)로 이루어짐
        System.out.print("두자리 정수를 하나 입력해주세요 >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        // int unm = Integer.parseInt(input);
        //double num = Double.parseInt(input);
        System.out.println("입력내용: "+ input); //문자열
        System.out.printf("num=%d\n", num);

    }
}
