package com.green.day4.ch4;

/*
?? 안은 1~100
val 값이 11이면 ? 11는(은) 홀수입니다.
val 값이 12이면 ? 11는(은) 짝수입니다.
 */

public class If_3 {
    public static void main(String[] args) {
        int val = (int) (Math.random() * 100) + 1;

        if (val % 2 == 1) {
            System.out.printf("%s는(은) 홀수입니다.", val);
        } else if (val % 2 == 0) {
            System.out.printf("%s는(은) 짝수입니다.", val);
        }
    }
}

class If_3_1 {
    public static void main(String[] args) {
        int val = (int) (Math.random() * 100) + 1;

        System.out.printf("%d는(은) %s수입니다.", val, val % 2 == 1 ? "홀" : "짝");

    }
}
