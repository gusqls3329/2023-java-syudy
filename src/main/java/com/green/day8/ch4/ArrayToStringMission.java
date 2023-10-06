package com.green.day8.ch4;

import java.util.Arrays;

//for문을 활용해 콘솔에 [5,10,7,3]이 출력되도록
public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3, 11, 100};
        System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.printf("%d, ", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.println("]\n");
        System.out.println("------------------------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
            System.out.printf(i < arr.length - 1 ? arr[i] + ", " : arr[i] + "");
        System.out.println("]\n");
        System.out.println("------------------------");


    }
}

class ArrayToStringMissionR {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3, 11, 100};
        int com = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < com) { //콤마를 숫자 뒤에 할경우
                System.out.printf(", ");
            }
        }
        System.out.println("]\n");
        System.out.println("------------------------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i > 0) { //콤마를 숫자 앞에 할경우
                System.out.printf(", ");
            }
        }
        System.out.println("]\n");

    }
}

class ArrayToStringMissionR2 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3, 11, 100};
        System.out.println(Arrays.toString(arr));
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]\n");
    }
}
