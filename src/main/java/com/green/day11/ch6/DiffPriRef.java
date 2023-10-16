package com.green.day11.ch6;

public class DiffPriRef { // 기본형과 참조형의 차이점
    public static void main(String[] args) {
        int num = 30;//num의 주소값에 30값을 넣음
        changeVal(num); //changeVal(int num)의 주소값과 chan
        System.out.println("num: "+num);

        NumBox nb = new NumBox(); //맨아래 NumBox을 객체화함. nb 주소값이 저장됨.
        System.out.println("(1)nb.num: "+nb.num); //10
        nb.num = 30; // 그속성에 30을 넣음.
        System.out.println("(2)nb.num: "+nb.num); //30
        changeVal(nb); // 타입이 맞는 changeVal가 넣어짐 그래서 changeVal(NumBox nb)가 실행
        System.out.println("(3)nb.num: "+nb.num); //10

    }
    public static void changeVal(int num){ //오버로드 : 타입이 다르면 changeVal처럼 이름을 2개 사용할 수 있다.
        System.out.println("changeVal-int");
        System.out.println("num.a: "+num);
        num = 10;
        System.out.println("num.b: "+num);
    }


    public static void changeVal(NumBox dd){
        System.out.println("changeVal-NumBox");


        dd.num = 10;
        dd= new NumBox(); //00?
        dd.num = 50;
    }
}

class NumBox{
    int num = 10;

}
