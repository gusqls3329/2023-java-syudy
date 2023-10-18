package com.green.day15.ch7;

class Tv {
    boolean power;
    int channel;
    void power(){power=!power;}
    void channelUp(){channel++;}
    void channelDown(){channel--;}
}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if( caption){
            System.out.println(text);
        }
    }

    @Override
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
        cTv.channel=10;
        cTv.channelUp();
        System.out.printf("cTv.channelUp : %d\n", cTv.channel);
        cTv.displayCaption("반갑다 친구야");
        cTv.caption = true;
        cTv.displayCaption("ㅁ");
    }
}
