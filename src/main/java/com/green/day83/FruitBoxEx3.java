package com.green.day83;

import org.checkerframework.checker.units.qual.A;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitGboxList = new FruitBox<>();
        fruitGboxList.add(new Apple());
        fruitGboxList.add(new Apple());
        fruitGboxList.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitGboxList);
        System.out.println("j1"+j1);

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        Juice j2 = Juicer.makeJuice(appleFruitBox);
        System.out.println("j2"+j2);
    }
}
class Juice{
    private String name;

    Juice(String name){
        this.name = name+ "Juice";
    }

    public String toString(){
        return this.name;
    }
}

class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        //Fruit만 받을 수 있음 FruitBox<?> box 전부다 사용할 수 있음
       // FruitBox<? extends Fruit> box : Fruit과 그 자식만 사용할 수있음
        String temp = "";
        for(Fruit f : box.getList()){
            temp += f + " ";
        }
        return new Juice(temp);
    }
}
