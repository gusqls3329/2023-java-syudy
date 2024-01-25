package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        GBoxList<Fruit> fruitGboxList = new GBoxList<>();
        fruitGboxList.add(new Fruit());
        fruitGboxList.add(new Apple());
        fruitGboxList.add(new Grape());
        System.out.println(fruitGboxList);
        //fruitGboxList.add(new Toy()); >상속관계가 아니기때문에 들어가지 않음

        GBoxList<Apple> appleGBoxList = new GBoxList<>();
       // appleGBoxList.add(new Fruit()); > 부모(형제)를 담지못함
        appleGBoxList.add(new Apple());

        //GBoxList<Fruit> fruitGBoxList2 = new GBoxList<Apple>();

        GBoxList<Toy> toyGBoxList = new GBoxList<>();
        toyGBoxList.add(new Toy());
    }
}

class Fruit{
    public String toString(){//toString = 오버라이딩
        return "Fruit";
    }
}

class Apple extends Fruit{
    public String toString(){//toString = 오버라이딩
        return "Apple";
    }
}

class Grape extends Fruit{
    public String toString(){//toString = 오버라이딩
        return "Grape";
    }
}
class Toy{
    public String toString(){//toString = 오버라이딩
        return "Toy";
    }
}
class GBoxList<T> { //원래 ArrayList에 있는 대표 기능 3가지만 감싼내용
    private List<T> list = new ArrayList<>();
     void add(T item) {
         list.add(item);
     }
     T get(int idx){
         return list.get(idx);
     }
     int size(){
         return list.size();
     }
     @Override
     public String toString(){
         return list.toString();
     }
}
