package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {
        //Card c = new Card();
        // Card [] cards = new Card[10];  카드 배열의 주소값만 받겠다.
        //  int [] cards = new int[10]; int 배열의 주소값만 받겠다.

        Card[] cards = makeCard(); //void 라면  makeCard(); 만 작성함.

        Card[] cards1 = makeCard(); //cards와 다른 존재임.

        System.out.println(cards.length);
        for (Card c : cards) {
            c.printYourSelf(); //카드 주소 값만 담을 수 있는 것.
        }


    }

    public static Card[] makeCard() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "club"};
        int cnt = 0;

        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number = getNumberFromInt(j);
                Card c = new Card();
                c.kind = kinds[i];
                c.number = number;
                cards[cnt++] = c;
                //cards[(i*13)+(j-1)] = c;
            }
        }
        return cards;

    }

    public static String getNumberFromInt(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(num); //정수를 문자열로
    }

    public class CardTest2_1 {
        public static void main(String[] args) {
            Card[] cards = makeCard();
            System.out.println(cards.length);




        }



    }
}
/*
Spade, Heart, Diamond, club
A,1~10, J, Q, K
 */