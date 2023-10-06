package com.green.day7.ch4;
/*
반복문을 사용
i값이 계속 증가가 되면서 sum에 중첩으로 더하기
sum값이 100초과가 되는 시점의 i값
 */
public class FlowEX30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        final int TARGET = 100;

        while (sum<TARGET){
            System.out.printf("sum: %d\n: ", sum);
            sum = sum + ++i;
            System.out.printf("sum: %d, i : %d \n:", sum, i);
        }
        System.out.println("i: "+i);
    }
}

class FlowEX30R {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        final int TARGET = 100;
        while (true){
            sum = sum + ++i;
            if(sum>TARGET){break;}
        }
        System.out.println("i: "+i);
    }
}