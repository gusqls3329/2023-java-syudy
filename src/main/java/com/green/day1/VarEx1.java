package com.green.day1;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;
        System.out.println(year + age);

        System.out.println(year);
        year = 100;
        System.out.println(year);
        System.out.println(age);
        System.out.println(year + age);

        int a = 5, b= 13;
        System.out.println(a + b);
        System.out.println("안녕하세요" +a);
    }
}

//public은 없어도 상관없지만 제목의 앞에만 public을 붙일수 있다.
//제목은 옆에있는 main이나 varEx1 등
//public static void main(String[] args) : 메인메소드 는 모든것의 시작점
//public static void main(String[] args) 의 모든문장은 변경은 불가능하지만 args 부분만 수정가능
// 키워드에 파랑색이 띄면 이름으로 사용불가능 : 예약어이름으로 정해진 단어가 있음
//"~" : 문자배열로 ""안에 있는 단어는 문자로 결과값이 나옴
//int year:  변수선언 : 타입(int) + 변수명 (year) 가 필요. 변수는 데이터를 담아 두는 것
// A = B 오른쪽에 있는값이 왼쪽(변수)에 있는 곳에 저장하는 것
// 리터럴 : 답 자제인 값. 예 : int a = 8일 경우 8을 뜻함.
//