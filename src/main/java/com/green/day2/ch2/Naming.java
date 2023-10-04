package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args) {
        // 네이밍:ㅣ 1. 대소문자 구별이 됨, 길이 제한이 없다. 예: int안에 들어가 있는 a와 A는 다름
        int abc, aBc, abC;
        //2. 이름으로 예약어 사용을 할수 없다. 파랑색으로 뜸 예: int int, void, static은 사용할 수 없음
        //3.숫자로 시작해서는 안된다. 처음만 아니면 가능 ex: int 1ab는 불가능, int a1b 는 가능
        //4. 특수문자는 _, $ 만 가능 ex: int _ab, int $ab;

        /*케이스기법
        //예: hello my name is hong
        //1. 파스칼 케이스 기법(클래스명) : HelloMyNameIsHong , 첫글자 대문자
        //2. 카멜 케이스 기법(변수명, 메소드명) : helloMyNameIsHong 첫글자 소문자
        //3. 케밥 케이스 기법 : hello-my-name-is-hong : java에서 사용불가 : -는 문자로 인식안함 (-는 특수문자라서 사용불가)
        //4. 스네이크 케이스 기법: hello_my_name_is_hong
         */

        /* 상수는 전부 대문자로 구분하며 표현은 언더바로
        ex: PI, MAX_NUMBER > final int PI =0, MAX_NUMBER= 10;
        (final이 붙은 순간 상수로 사용)
         */

        //참조형 : 변수타입에 대문자일경우, 소문자로 시작하면 기본형= 원시형
        Date today = new Date();

        final int a = 10;
    }
}