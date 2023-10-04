package com.green.day5.ch4;

public class FlowEx18Mission {
    public static void main(String[] args) {
        for (int z = 1; z < 10; z++) {
            for (int i = 2; i < 10; i++) {
                System.out.printf("%d X %d = %d\t", i, z, z * i);
            }
            System.out.println();
        }
    }
}
