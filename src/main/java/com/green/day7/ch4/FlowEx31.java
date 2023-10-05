package com.green.day7.ch4;
/*
0~10까지 반복 : 11번 반복
3의 배수는 (0)포함 출력이 안되도록 해주세요
1
2
4
...
8
10
 */
public class FlowEx31 {
    public static void main(String[] args) {
        int i = 0;
        while (i <10){
            i++;
            if (i==3 || i==6|| i==9)
                continue;
            System.out.printf("i : %d\n",i);
        }
    }
}

class FlowEx31R {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------");
        for (int i = 0; i < 11; i++) {
            if (i % 3 != 0)
                System.out.println(i);

        }
    }
}