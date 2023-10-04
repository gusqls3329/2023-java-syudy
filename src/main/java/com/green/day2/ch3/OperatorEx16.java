package com.green.day2.ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f; // float pi = (float)3.1
        int pro1 = (int)(pi * 1000);
        System.out.println(pi);

        System.out.println("pro1: "+ pro1);

        float pro2 = pro1 *0.001f;

        System.out.println("pro2 : " + pro2);

        System.out.println("one: "+ (int)(pi * 1000)*0.001f);

    }

}

class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592; // float pi = (float)3.1
        int pro1 = (int)(pi * 1000);
        System.out.println(pi);

        System.out.println("pro1: "+ pro1);

        double pro2 = pro1 *0.001;

        System.out.println("pro2 : " + pro2);

        System.out.println("one: "+ (int)(pi * 1000)*0.001);

    }

}