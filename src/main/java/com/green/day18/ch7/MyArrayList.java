package com.green.day18.ch7;

import java.util.Arrays;

import static javax.swing.UIManager.get;

public class MyArrayList {
    private int [] arr;
    public MyArrayList(){

        arr = new int[0]; //방이 하나도 없는 배열을 만들수 있다.
    }
    public void add(int val){
        int [] tmp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = val;
        arr = tmp;
    }
    public void add(int idx, int val){
        int [] tmp = new int[arr.length+1];
        tmp[idx] = val;
        for (int i = 0; i< arr.length; i++){
            tmp[i<idx ? i : i+1] =arr[i];
        }
        arr = tmp;
    }
    public void add2(int idx, int val){
        int [] tmp = new int[arr.length+1];
        tmp[idx] = val;
        for (int i = 0; i< idx; i++){
            tmp[i] = arr[i];       }
        for (int i = idx; i < arr.length; i++) {
            tmp[i+1] = arr[i];
        }
        arr = tmp;
    }
    @Override
    public String toString(){
        /*String r = String.format("[%d",arr[0]);
        for (int i = 1; i < arr.length; i++) {
            r += String.format(", %d", arr[i]);
        }
        r+= "]";
        return r;*/
        if (arr.length == 0 ){
            return "[]";
        }
        String r = String.format("[%d",arr[0]);
        for (int i = 1; i < arr.length; i++) {
            r += String.format(", %d", arr[i]);
        }
        r+= "]";
        return r;
    }
}


class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10); // 0:10
        list.add(20); // 1:20
        list.add(30); // 2:30
        list.add(45); // 3:45
        System.out.println(list); //[10,20,30,45]
        list.add(1,55); //[10,55,20,30,45]
        System.out.println(list);
        //list.add2(1,55);
       // System.out.println(list);

    }

}
