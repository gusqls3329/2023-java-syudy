package com.green.day7.ch5;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200};
        int[] arr2 = {5, 10, 15};

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
        arr1 = arr2;   //셜로우 카피
        //셜로우 카피 얕은복사 주소값만 (=만)복사 동등성 O, 동일성O
        //딮 카피 : 건물을 복사 동등성 O,동일성X

        /*
        동등성 (equals): 주소값이 다르더라도 들고 있는 값이 같다면 동등
        동일성(==) : 주소값이 같은지
         */
        System.out.println("-----------");
        arr1[1] = 44;
        arr2[2] = 55;
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
        System.out.println("||||||||||");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr2[i]);
        }
        System.out.println("arr1 == arr2 : " + (arr1 == arr2));

    }
}
