package com.green.day15.ch7;

class Tv {
    boolean power;
    int channel;
    void power(){power=!power;} //토글 : (=버튼 스위치) 같은 문장을 실행했는데 계속 값이 변경되는것.
    void channelUp(){channel++;}
    void channelDown(){channel--;}
}

class CaptionTv extends Tv{ //extends Tv를 제외해도 외 tv의 자녀인걸 아는걸까?
    boolean caption;
    void displayCaption(String text){
        if( caption){
            System.out.println(text);
        }
    }

    @Override // 메소드위에 작성해두면 오버라이딩이 맞다라고 검증하는 것. 애노테이션 : annotaion
    void channelUp(){ //오버라이드 : 부모가 가진 메소드를 새롭게 정의하여 사용하겠다. 부모값을 사용하지 않겠다. 부모랑 이름과 타입이같아야함 구현부는 다를수 있음
        channel= channel+2;
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.channel = 10;
        cTv.channelUp();
        System.out.printf("cTv.channelUp : %d\n", cTv.channel);
        cTv.displayCaption("반갑다 친구야");
        cTv.caption = true;
        cTv.displayCaption("ㅁ");
    }
}
