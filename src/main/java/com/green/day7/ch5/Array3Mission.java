package com.green.day7.ch5;

/*
arr2는 길이가 4고 arr1과 같은 방은 값은 값을 가지고 있다
3번 방은 20을 갖고 있는 배열을 만들어주세요
 */
public class Array3Mission {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};
        int[] arr2 = new int[4];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[3] = 20;
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}

class Array3MissionR {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 16, 17};
        int[] arr2 = new int[arr1.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = 20;
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}

/*
arr2는 길이가 4고 arr1과 같은 방은 값은 값을 가지고 있다
3번 방은 20을 갖고 있는 배열을 만들어주세요
 */
class Array3Missio {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};
        int[] arr2 = new int[arr1.length+1];

        for (int i = 0; i < arr1.length; i++) { // arr1값을 arr2에 복사를 위한 것
            arr2[i] = arr1[i];
        }
        arr2[3] = 20;
        for (int i = 0; i < arr2.length; i++){ // 값을 출력 하기 위한 것
        System.out.printf("arr2[%d]= %d\n", i, arr2[i]);}

    }
}