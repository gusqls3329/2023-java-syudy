package com.green.day5.ch4;
/*
중첩 fot문을 활용해 구구단 2단부터 9단까지 출력
 */
public class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int z = 1; z < 10; z++){
                System.out.printf("%d X %d = %d\n", i , z, i*z );
            }
        }
    }
}
