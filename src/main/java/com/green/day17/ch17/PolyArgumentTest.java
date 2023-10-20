package com.green.day17.ch17;

public class PolyArgumentTest {
    public static void main(String[] args) {
        //Tv tv = new Tv();
        //System.out.println(tv);
        // Computer computer = new Computer();
        // System.out.println(computer);
        Computer c = new Computer();
        int price = c.getprice(); //200
        int bonusPoint = c.getbonusPoint(); //20
        System.out.printf("price : %d, bonusPoint : %d\n", price, bonusPoint);
        Tv t = new Tv();
        /*int price1 = c.getprice(); //200
        int bonusPoint1 = c.getbonusPoint(); //20
        System.out.printf("1. price : %d, bonusPoint : %d", price,bonusPoint);*/
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); //money = 1050, bonusPoint = 0
        buyer.buy(new Tv()); // price : 100, bonusPoint 10
        buyer.buy(new Computer());// price : 200, bonusPoint 10



        //buyer money가 부족하면 "잔액부족" money 값ㅇ느 마이너스 처리 x
        // 잔액이 부족하지 않으면 Tv을/를 구입하셨습니다
    }
}

class Buyer {

    void buy(Product product){ //Computer, Tv각각 하지말고 부모 클래스 활용
        //System.out.printf("제품명 : %s\n", product);
        //System.out.printf("bonusPoint : %d\n", product.getbonusPoint());
       // System.out.printf("pricer : %d\n", product.getprice());
        if (money < product.getprice()){
                System.out.println("잔액부족");
                return;
            } else {
            money = money - product.getprice();
            bonusPoint = bonusPoint + product.getbonusPoint();
            System.out.printf("%s을/를 구입하셨습니다.\t", product);
            System.out.printf("money는 %d남았고, bonusPoint는 %d추가되었습니다.\n", money, bonusPoint);
        }
    }
    private int money;
    private int bonusPoint;

    public Buyer() {
        money = 1050;
        bonusPoint = 0;
    }

    @Override
    public String toString() {
        return String.format("price : %d, bonusPoint : %d", money, bonusPoint);
    }
}

class Product {
    private int price;
    private int bonusPoint;


    public Product(int n) {
        price = n;
        bonusPoint = n / 10;
    }

    @Override
    public String toString() {
        return String.format("price : %d, bonusPoint : %d", price, bonusPoint);
    }

    public int getprice() {
        return price;
    }

    public int getbonusPoint() {
        return bonusPoint;
    }


}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
       // return String.format("computer, %s ", super.toString());
        return "computer";
    }


}

class Tv extends Product {
    public Tv() {
        super(100);
    }

    public String toString() {
        return "tv, " ;//+ super.toString();
    }
}



