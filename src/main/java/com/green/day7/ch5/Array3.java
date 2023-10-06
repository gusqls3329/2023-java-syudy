package com.green.day7.ch5;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = {5,10,15};
        int[] arr2 = new int[arr1.length]; //[]안은 방크기
        for (int i =0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }

        // String [] arr23 =  new String[arr1.length] : new String안에는 문자열이 담기는 공간이 생김
        // String [] str = arr23 []; > 배열을 담고 싶다면 배열을 작성
        // String str2 = arr2 []; > 타입이 안맞아서 불가능, str는 객체 하나만 담을수 있지만, arr2는 여러 객체(배열)을 담고있기 때문
        arr2[1] =200;
        arr1[2] =100;

        System.out.println("------------arr1");
        for (int i =0; i<arr1.length; i++){
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }System.out.println("------------arr2");
        for (int i =0; i<arr2.length; i++){
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
