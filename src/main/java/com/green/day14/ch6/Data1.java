package com.green.day14.ch6;

public class Data1 {
    private int value;
    private int value2;
    private int value3;

    int valus;

    public Data1() { //=생성자 : new Data1()과 이름이 같음, int 등 return이 없음.
        //객체화를 하고 생성자를 하나도 안만들경우 자동 생성 = 기본생성 (파라미터가 없는 메소드) 객체 생성할때만 호출 할 수 있는 것.
        this(100,200,300);
        /*
        this. : 멤버필드, 메소드에 접근할 때 사용하며 주소값. 과 같음
        this() : 생성자를 호출할 때 사용
         */
        }

    public Data1(int a) {
        value = 1;
    }

    public Data1(int a, int b, int c) { // 위의 this 가 호출하고 있는 생성자
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf() { //생성자는 객체를 생성할때만 사용가능, 메소드에서는 생성자를 사용할 수 없음 new를 하였을때만 사용가능

        System.out.printf("value: %d, value2: %d, value3: %d\n", value, value2, value3);

    }



}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        data1.printMySelf();
        Data1 data1_2 = new Data1(10, 20, 30);
        data1_2.printMySelf();

    }
}