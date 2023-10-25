package com.green.day19.ch7;

public interface PlayingCard {
    public static final int SPADE = 4; // interface 에서 public static final은 자동으로 들어감
    final int DIAMOND = 3; // interface 에서 public static final은 자동으로 들어감
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind(); // public abstract이 생략되어있음 public abstract  String getCardKind();이지만 현코드처럼 사용
}

interface Playingchess extends PlayingCard{//같은 interface끼리는 extends를 사용
    void moveHorse(int x, int y);
}

class Card implements PlayingCard{//interface는 extends가 아닌 implements로 상속함
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

}
class PlayingCardTest {

    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
