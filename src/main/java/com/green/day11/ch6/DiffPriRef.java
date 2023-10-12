package com.green.day11.ch6;

public class DiffPriRef { // 기본형과 참조형의 차이점
    public static void main(String[] args) {
        int num = 30;
        changeVal(num);
        System.out.println("num: "+num);

        NumBox nb = new NumBox(); //맨아래 NumBox을 객체화함. nb 주소값이 저장됨.
        System.out.println("(1)nb.num: "+nb.num);
        nb.num = 30; // 그속성에 30을 넣음.
        System.out.println("(2)nb.num: "+nb.num);
        changeVal(nb); // 타입이 맞는 changeVal가 넣어짐 그래서 changeVal(NumBox nb)가 실행
        System.out.println("(3)nb.num: "+nb.num); //

    }
    public static void changeVal(int num){ //타입이 다르면 changeVal처럼 이름을 2개 사용할 수 있다.
        System.out.println("changeVal-int");
        num = 10;
    }

    public static void changeVal(NumBox dd){
        System.out.println("changeVal-NumBox");

        dd.num = 10;
        dd= new NumBox();
    }
}

class NumBox{
    int num;
}
