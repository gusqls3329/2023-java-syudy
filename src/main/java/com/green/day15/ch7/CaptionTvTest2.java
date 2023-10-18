package com.green.day15.ch7;

    class Tv2 {//부모는 자식에 있는 값 변경불가능
        boolean power;
        int channel;
        void power(){power=!power;}
        void channelUp(){channel++;}
        void channelDown(){channel--;}
        }

class CaptionTv2 extends Tv2{ //자식은 부모에 있는 값 변경가능
    int channel;
    boolean caption;
    void displayCaption(String text){
        if( caption){
            System.out.println(text);
        }
    }
    void getParentChannel(){
        System.out.printf("parent-channel: %d\n",super.channel ); //Tv3을 사용
        //System.out.printf("parent-channel: %d\n",this.channel ); : CaptionTv3을 사용
        //System.out.printf("parent-channel: %d\n",channel ); : getParentChannel을 사용
        this.channelUp();
    }
}

public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel=10;

        Tv2 ctv1 = new Tv2();
        ctv.channelUp();
        ctv1.channelUp();
        System.out.printf("ctv.channel: %d\n", ctv.channel);
        System.out.printf("ctv.channel: %d\n", ctv1.channel);
        ctv.getParentChannel();
    }
}