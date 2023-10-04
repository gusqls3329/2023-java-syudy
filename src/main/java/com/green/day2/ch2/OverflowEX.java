package com.green.day2.ch2;

public class OverflowEX {
    public static void main(String[] args) {
        int intVal = 128;
        byte byteVal = (byte)intVal;

        System.out.printf("byteVal : %d\n", byteVal);
        int intVal2 = 128;
        byte byteVal2 = (byte)intVal2; //오버플로우 Overflow
        System.out.printf("byteVal2 : %d\n", byteVal2);

        int intVal3 = -129;
        byte byteVal3 = (byte)intVal3; // 언더풀로우 Underflow
        System.out.printf("byteVal3 : %d\n", byteVal3);
        System.out.println("byteVal3 : " + byteVal3);
    }
}
