package com.green.day83;

import org.checkerframework.checker.units.qual.A;

import java.util.List;

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBoxV2<Apple> appleBox = new FruitBoxV2<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        String strMix = FruitBoxV2.mix(new Toy(), new Toy());
        System.out.println("strMix: "+ strMix);
    }
}
class FruitBoxV2<T extends Fruit> extends GBoxList<T>{
    List<T> getList(){
        return list;
    }
    static <T> String mix(T val1, T val2){ //위의 T와 옆의 T는 관계가 없다
        //return val1+ val2; >T일경우 +를 사용할 수없다
        return val1.toString()+ val2.toString();
    }
}