package com.green.day10.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = new Tv();

        System.out.printf("tv1.channel: %d\n", tv1.channel);
        tv1.channelUp();
        System.out.printf("tv1.channel: %d\n", tv1.channel); // tv에 있는 channelUp에 ++가 되었기 때문
        System.out.printf("tv2.channel: %d\n", tv2.channel); // 결과값0 : 객체를 2개만들어 tv1과 tv2가 각자 다르기 때문에 0이 나옴
    }
}
