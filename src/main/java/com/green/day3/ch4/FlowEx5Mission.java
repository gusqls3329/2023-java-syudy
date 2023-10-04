package com.green.day3.ch4;

/* 남자의 평균키는 179, 여자의 평균키는 157
Scanner을 이용해 성별을 입력받습니다. (남자,여자)
키를 입력받습니다
평균키 미만면 "156cm는 남자 평균 이하입니다."
평균키랑 같다면 " 170cm는 남자 평균입니다."
평균키 초과면 "170cm는 남자 평균초과입니다."

키를 입력받습니다
평균키 미만면 "156cm는 여자 평균 이하입니다."
평균키랑 같다면 " 170cm는 여자 평균입니다."
평균키 초과면 "170cm는 여자 평균초과입니다."
 */

import java.util.Scanner;

public class FlowEx5Mission {
    private static int gender;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("남자, 여자를 입력하세요 >>");
        String gender = scan.nextLine();

        {
            System.out.println("키를 입력해주세요 >");
        }
        int height = scan.nextInt();

        if ("남자".equals(gender)) {
            if (height > 170) {
                System.out.printf("%dcm는 남자 평균 초과입니다.", height);
            } else if (height < 170) {
                System.out.printf("%dcm는 남자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 남자 평균 입니다.", height);
            }
        } else {
            if (height > 157) {
                System.out.printf("%dcm는 여자 평균 초과입니다.", height);
            } else if (height < 157) {
                System.out.printf("%dcm는 여자 평균 미만입니다.", height);
            } else {
                System.out.printf("%dcm는 여자 평균 입니다.", height);
            }
        }

    }
}


