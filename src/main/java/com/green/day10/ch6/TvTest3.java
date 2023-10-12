package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = tv1;// 셰도우카피,결과값이 같음.

        System.out.printf("tv1.channel: %d\n", tv1.channel); // 결과값  : 0
        tv1.channelUp();
        tv1.channelUp();
        System.out.printf("tv1.channel: %d\n", tv1.channel); // 결과값  : 2
        System.out.printf("tv2.channel: %d\n", tv2.channel); // 결과값  : 2
    }
}
