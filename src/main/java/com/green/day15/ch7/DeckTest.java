package com.green.day15.ch7;
class Card{
    static final int KIND_MAX = 4; //카드무늬의수
    static final int NUM_MAX = 13; //무늬별 카드수
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int COVER = 1;
    int kind;
    int number;

    public Card(){
        this(SPADE, 1);
    }
    public Card(int n,int n2){
        kind = n;
        number = n2;
    }
    @Override
    public String toString(){ //object가 가진 것을 재정의
       // return "kind:" +kind +"\tnumber:" +number;
        return String.format("kind: %d, number: %d", kind,number);
    }

}

class Deck{
    final int CARD_NUM = 52;

    Card[] cardArr = new Card[CARD_NUM];


     public Deck(){
         int idx = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {
            for (int j = 1; j <= Card.NUM_MAX; j++) {
                cardArr[idx++] = new Card (i,j);
            }
        }
        for(Card c : cardArr) {
            System.out.println(c);
        }
    }

    public Card pick(int idx){
        System.out.println(idx);
       return cardArr[idx];
    }

    public Card pick(){
        return cardArr[(int)(Math.random()*CARD_NUM)]; // 카드 배열안에 둠
    }

    void shuffle(){

        for (int i = 0; i < CARD_NUM; i++) {
            int randomIdx = (int)(Math.random()*CARD_NUM); // 랜덤 값을 만듬(위 랜덤_배열이랑 다름)
            Card tmp = cardArr [i];
            cardArr[i] = cardArr[randomIdx];
            cardArr[randomIdx] = tmp;
        }
        for(Card card : cardArr){
            System.out.println(card);
        }
    }


}



public class DeckTest {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.printf("c.kind : %d, c.number: %d\n",c.kind, c.number );

        Card c2 = new Card(Card.COVER,5);
        System.out.printf("c2.kind : %d, c2.number: %d\n",c2.kind, c2.number );

        System.out.println(c2.toString()); //리턴메소드 sout가 안아줘서
        System.out.println(c2);

        String str = new String("dd");
        System.out.println(str);
        System.out.println(str.toString()); //오버라이딩 : 부모거 사용하지 않겠다.

        Card a = new Card(4,2);
        System.out.println(a);
        System.out.println(a.toString());
        String introduce = c.toString(); //객체에게 스트링을 달라고함
        System.out.println("-------------------");

        Deck deck = new Deck(); //카드객체 주소값
        deck.shuffle();

    }
}
