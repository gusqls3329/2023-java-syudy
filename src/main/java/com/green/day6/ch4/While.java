package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
        //While은 반복문. 원하는 값이 나올때 까지 반복할때 사용.
        //for : 반복 횟수를 정확히 알때.
        for(int i = 0; i <10; i++) {
            System.out.println("for-"+ i);
        }
        System.out.println("----------------");
        int i = 0;
        while(i<10){
            System.out.println("while-"+ i++);
        }
    }
}
