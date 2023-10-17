package com.green.day14.ch6;

public class Card {
    String pattern; //전역변수 = 객체가 살아있는 동안 계속 살아있음: 스코프={}가 다름,

    String denomination;

    public Card(String pattern, String denomination){ //지역변수 = 호출이 끝나면 죽음.
        this.pattern=pattern;
        this.denomination=denomination;
    }
    void printMySelf(){
        System.out.printf("%s(%s)\n",pattern,denomination);
    }
}
