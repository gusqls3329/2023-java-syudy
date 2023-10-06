package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {

        int n1 = 10, n2=20, n3=30; //변수에는 값이 하나만 저장됨
        int[] arr = {10,20,30,40,50}; //레퍼런스타입 (참조형)으로 변경됨 []에 저장할 수 있는것은 주소값뿐임. 읽기 :  arr[0]
        //[] 첫번호는 0부터 시작,
        char[] b = {'a','b', 'c'};
        String [] arr2 = {"a","aa", "강남"};

        int [] arr3 = new int[30]; //각방엔 0이 들어가 있음

        arr[0] = 200;
        System.out.println("arr[0]"+ arr[0]);
        System.out.println("arr[1]"+ arr[1]);
        System.out.println("arr[2]"+ arr[2]);

        System.out.println("arr2[0]"+ arr2[0]);
        System.out.println("arr2[1]"+ arr2[1]);
        System.out.println("arr2[2]"+ arr2[2]);

        System.out.println("b"+ b[0]);
        System.out.println("b"+ b[1]);
        System.out.println("b"+ b[2]);

        System.out.println("arr.length: "+arr.length);



    }
}
