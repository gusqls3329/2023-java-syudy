package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
        // break를 사용할 수 있는 곳은 switch , 반복문 , 분기문이랑 대부분 함께 사용, break를 만나면 바로 빠져나옴
        //Continue를 사용할 수 있는 곳은 반복문, continue밑에 내용을 실행 안했으면 할때 사용

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("---------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
           // continue; 이떄 사용하면 continue를 만나면 다시 for로 감.
            if(i %2 == 0) {continue;}
            System.out.println(i * i);
        }
    }
}