package com.green.day17.ch17;

import javax.xml.namespace.QName;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);
    }
}

class Product2{
    private  String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price){
        this.name = name;
        this.price = price;
        bonusPoint = (int)(price*0.1);
    }
    @Override
    public String toString() {
        return String.format("name: %s, price: %d, bonusPoint : %d", name, price, bonusPoint);
    }

}
