package com.green.day14.ch6;

public class Car {
    String color;
    String gearType;
    int door;

    public Car() {
        this("white"); //생성자 호출 시 사용
    }
    public Car(String color) {
        this(color, "auto", 4);
    }
    public Car (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;

    }


    public void printMySelf() {
        System.out.printf("color=%s, gearType=%s, door=%d\n", color, gearType, door);
    }
}


class CarTestk {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue");

        car1.printMySelf();
        car2.printMySelf();

    }
}
