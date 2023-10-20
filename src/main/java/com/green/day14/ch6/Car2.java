package com.green.day14.ch6;

public class Car2 {
    String color;
    String gearType;
    int door;
    public Car2(){
        this("w");
    }
    public Car2(String color){
        this(color,"o",4);
    }

    public Car2(String color, String gearType,int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }


    void printMySelf(){
        System.out.printf("color=%s, gearType=%s, door=%d\n", color, gearType, door);
    }

}
class CarTest1 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();  //w, o, 4
        Car2 car2 = new Car2("blue");

        car1.printMySelf();
        car2.printMySelf();

    }
}
