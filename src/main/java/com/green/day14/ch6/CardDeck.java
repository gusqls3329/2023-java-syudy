package com.green.day14.ch6;

public class CardDeck {
    Card[] cards; //배열 Card의 주소값을 가짐

    public CardDeck() {
        cards = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int idx = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int j = 1; j <= 13; j++) {
                String denomination = getNumberFromInt(j);
                Card c = new Card(pattern, denomination);
                cards[idx++] = c;
            }
        }
    }

    public void printAll() {
        for (Card c : cards) {
            c.printMySelf();
        }
    }

    public Card getCard() {
        Card c ;
        while (true) {
            int rIdx = (int) (Math.random() * (cards.length));
            c = cards[rIdx];
            if (c != null) {
                cards[rIdx] = null;
                break;
            }
        }
        return c;
    }

    private String getNumberFromInt(int num) { //private은 같은 class에서만 사용가능,외부에서 주소 값을 가지고 있어도 사용불가
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

}
