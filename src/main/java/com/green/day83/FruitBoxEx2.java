package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitGboxList = new FruitBox<>();
        FruitBox<Apple> appleGBoxList = new FruitBox<>();
        FruitBox<Grape> grapeGBoxList = new FruitBox<>();
        // FruitBox<Toy> toyGBoxList = new FruitBox<>();Fruit과 아무 관계가 없어서

    }
}

class FruitBox<T extends Fruit> extends GBoxList<T>{ //T 는 꼭 Fruit을 상속받아야한다. 그래서 Fruit과 Fruit 자식은 사용할 수있다
    /*public String toString(){//toString = 오버라이딩
        return "Fruit";
    }*/
    List<T> getList(){
        return list;
    }
}
