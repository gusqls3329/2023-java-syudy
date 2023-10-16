package com.green.day12.ch6;

public class Card {
    public String kind;
    public String number; // 속성 : 객체의 값을 담고있다.
    public void printYourSelf (){ //메소드
        System.out.printf("%s (%s)\n", kind,number);
    }
    public int getScore() {//메소드
        switch (number){
            case "A": return 1;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
        }
        return Integer.parseInt(number);
    }

}
