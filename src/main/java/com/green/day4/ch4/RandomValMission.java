package com.green.day4.ch4;

public class RandomValMission {
    public static void main(String[] args) {
        double doubleval = Math.random(); //0.0~0.09

        int rVal = (int)(doubleval * 6)+5 ; // 5~10 (* 는 숫자는 최대값에 +한 값을 뺀후 +1한 값)

        System.out.println("rVal: " + rVal);

        int rVa2 = (int)(doubleval * 10)+14 ; //14~23
        System.out.println("rVa2: " + rVa2);


    }
}
