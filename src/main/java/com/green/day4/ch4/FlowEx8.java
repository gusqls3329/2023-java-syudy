package com.green.day4.ch4;

import java.util.Scanner;

/*
주민번호 압력 받고 주민번호를 확인하고
여자인지 남자인지 유효하지 않은 주민등록번호인지 출력
swtich문사용
 */
public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) >>");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char num2 = input.charAt(8);

        System.out.println("reasult2: " + input.charAt(7));

        switch (num2) {
            case '2', '4': //입력된건은 문자이기 때문에 문자로 바꾸는 ''을 사용
                System.out.println("여자입니다.");
                break;
            case '1', '3':
                System.out.println("남자입니다");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
                break;
        }

    }
}


class FlowEx8_1 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) >>");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();  //숫자만 있자면  int input = scan.nextInt(); 로 사용하면 문자열 > 숫자로 바뀜

        char num2 = input.charAt(7);

        System.out.println("reasult2: " + input.charAt(7));

        switch (num2) {
            case '2', '4':
                System.out.println("여자입니다.");
                break;
            case '1', '3':
                System.out.println("남자입니다");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
                break;
        }

    }
}