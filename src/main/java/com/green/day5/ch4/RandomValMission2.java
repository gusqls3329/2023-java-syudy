package com.green.day5.ch4;
/*
리터럴을 더이상 사용하지 않음
MIN, MAX 상수만 사용해
MIN~MAX로 나 올 수 있는 랜덤 숫자를 만드는 로직을 구현하시오
 */
public class RandomValMission2{
    public static void main(String[] args) {
       final int MIN = 10, MAX = 50 ;

       for (int i=0; i<1000; i++){ //i += 2


           int val = (int)(Math.random()*((MAX-MIN)+1))+MIN;
           System.out.println("val :" + val);
           if(val < MIN || val > MAX){
               System.out.println("범위를 벗어났습니다.");
               break;
           }
       } System.out.print("끝.");

    }
}
