package com.green.day69.ch14;

public class MyArrayList {
    private int[] arr;

    public MyArrayList(){
        arr = new int[0];

    }
    public void add(int val){
        int [] tmp = new int[]{arr.length + 1};
        for (int i = 0; i <tmp.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = val;
        arr = tmp;
    }

}
