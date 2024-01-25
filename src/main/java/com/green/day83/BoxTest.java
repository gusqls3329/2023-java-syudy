package com.green.day83;

public class BoxTest {//제네릭이 나오기 전에는 형변환을 해주어야했음
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setItem(1);
        int intVal =(int) b1.getItem();
        System.out.println("intVal:"+ intVal);
        b1.setItem("아아아아");
        String strVal = (String)b1.getItem();

        Box b2 = new Box();
        b2.setItem("안녕");
    }
}
