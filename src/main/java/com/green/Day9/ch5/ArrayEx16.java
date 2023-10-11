package com.green.Day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

/*
3개의 String 값을 담을 수 있는 배열을 생성
3번 문자열로 입력을 받는다. (scan사용)
입력받은 문자열들을 순차적으로 배열에 값에 넣는다.
값 넣는게 종료가 되면 향상된 for문을 이용해 저장되어 있는 값들을 콘솔에 출력한다.
 */
public class ArrayEx16 {
    public static void main(String[] args) {
        String[] strarr = new String[3];

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < strarr.length; i++) {
            System.out.print("3번 문자열을 입력해주세요 >> ");
            String input = scan.nextLine();
            strarr[i] = input;
        }

        for (String str : strarr) {
            System.out.println(str);
        }
    }
}
