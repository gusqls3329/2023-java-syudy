package com.green.Day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);

        }
        System.out.println("-----------------------");
        names[0] = "woo";
        System.out.println(Arrays.toString(names));
        System.out.println("-----------------------");

        for (String str : names) { //향상된 for문 = foreach문
            System.out.println(str);

            System.out.println("----------5-------------");
            int z = 0;
            for (String str1 : names) { //i를 사용하고 싶다면...사용
                System.out.printf("names[%d]: %s\n", z++, str1);
            }
            System.out.println("-----------------------"); //위의 foreach문이라 적힌 fot과 같아서 주로 위에 for문을 사용
            for (int i = 0; i < names.length; i++) {
                String str2 = names[i];
                System.out.println(str2);
            }

        }
    }
}

