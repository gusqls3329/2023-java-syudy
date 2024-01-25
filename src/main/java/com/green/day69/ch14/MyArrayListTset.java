package com.green.day69.ch14;

import com.green.day18.ch7.MyArrayList;

public class MyArrayListTset {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(9);
        list.add(10);
        list.add(13);
        list.add(16);
        list.forEach(i -> System.out.println("i:"+i));
        System.out.println("---------");
        list.removeIf(i -> i %2 ==0);
        list.forEach(i -> System.out.println(i + ","));
    }
}
