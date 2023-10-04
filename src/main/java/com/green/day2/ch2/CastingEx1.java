package com.green.day2.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        float score1 = (float) d;
        int score = (int)d; //형변환
        System.out.println("score: "+ score);
        System.out.println("d: "+ d);

        byte b1 = 127; //자동형변환
        short s1 = b1; // = short s1 = (short)b1
        int i1 = s1;

        float f1 = i1;

        int i2 = (int)f1;
        long l1 = i2;

    }
}
