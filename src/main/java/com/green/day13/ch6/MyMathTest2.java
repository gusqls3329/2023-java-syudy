package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2.staticNum =1;
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum = 30;
        MyMath2 mm2_2 = new MyMath2();
        System.out.printf("1. mm2.num : %d, staticNum = %d\n", mm2.num, mm2.staticNum);

        mm2_2.num = 100;
        mm2_2.staticNum = 50;
        System.out.printf("2. mm2.num : %d, staticNum = %d\n", mm2.num, mm2.staticNum);
        System.out.printf("3. mm2_2.num : %d, staticNum = %d\n", mm2_2.num, mm2_2.staticNum);


        System.out.printf("MyMath2.staticNum = %d\n", MyMath2.staticNum);
        /*1. System.out : 멤버필드 : 소괄호가 있으면 메소드 없으면 멤버필드
          2. System : 대문자로 시작하기 때문에  클래스 이름이고 클래스 이름을 바로 가져왔기 때문에  그 클래스에 스태틱이 붙음
          3. System.out.printf : .을사용했기 때문에 객체 주소값을 가지는 것을 알수있음
          4. class. = static만 사용가능 다른 . 은 객체주소값을 가지는 것을 뜻함.*/
    }
}
