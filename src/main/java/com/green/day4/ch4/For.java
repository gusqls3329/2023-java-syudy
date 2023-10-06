package com.green.day4.ch4;

/*  for ( a  ; b  ;  c )
a: 첫번째 공간으로 초기화공간
b: 두번째 공간으로  반복여부 체크
c: 세번째 공간으로 증감식
a가 먼저 실행되어 b가 실행되는데 a가 ture일때 아래 System.out.println가 실행되어  c가 표현,
그후 b로 가서  b가 실행되는데 a가 ture일때 아래 System.out.println가 실행되어  c가 표현,
그후 계속 반복. b의 숫자만큼 실행될 때.
 */
public class For {
    public static void main(String[] args) {
        for (int i =0; i<2; i++) {
            System.out.println("안녕");

            int j = 0;
            for (j =0; j<3;j++) {
                System.out.println("j: "+ j); // ++, --가 없으면 무한루프
            }
        }
    }
}

