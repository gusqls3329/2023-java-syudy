package com.green.day3.ch4;

public class AssignmentOperators {
    public static void main(String[] args) {
        //복합 대입 연산자 cor:132
        int n1, n2, n3;
        n3 = 10;
        n1 = n2 = n3;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n1 = n1 + 4; // = 을 만나면 오른 쪽 값을 먼저 연산  = n1+= 4;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n2 += 4;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n3++; // ++은 1씩 올라감 =++n3;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n2--;
        --n2;// --은 1씩 내려감 =++n3;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

    }
}
