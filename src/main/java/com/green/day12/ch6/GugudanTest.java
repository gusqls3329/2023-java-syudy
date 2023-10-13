package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(4); // 4단에 구구단 콘솔에 출력
        gugudan.print(5);
        System.out.println("------a-------");
        gugudan.printFromTo(4,7);
        System.out.println("------b-------");
        gugudan.printFromTo(3,4);
        System.out.println("------c-------");
        gugudan.printFromTo(3,6,"--------");

    }
}
