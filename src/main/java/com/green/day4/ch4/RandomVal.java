package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleval = Math.random(); // Math.random() : 0.000~0.9999 절대 1이상이 나오지 않음
        System.out.println("val:"+ doubleval);

        int intval = (int)(doubleval * 10) ; //doubleval * 10 는 doubleval가 double이라 뒤의 10을 10.x(소수값)으로 변경시켜서 강제형변환필요
        System.out.println("intval: "+ intval);

        int rVal = (int)(Math.random() * 20);
        System.out.println("rVal: "+ rVal);

    }
}
