package com.green.day7.ch4;

/* 3,6,9게임
i=1
i=2
i=3 짝
i=4
i=5
i=6 짝
i=30 짝
i=33 짝짝
 */
public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int a = i % 10;
            String b = "";
            double c = i / 10;
            int d = (int) (c % 10);
            System.out.printf("i=%d %s%s\n", i, a == 3 || a == 6 || a == 9 ? "짝" : "", c == 3 || c == 6 || c == 9 ? "짝" : "");

        }
    }
}

class FlowEx29_R {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            System.out.printf("i=%d", i);
            int tmp = i ;
            while (tmp > 0){
                int modVal = tmp % 10;
                if(modVal != 0 && modVal % 3 ==0){
                    System.out.print("짝");
                }
                tmp /=10;
            }
            System.out.println("");
        }
    }
}

class FlowEx29_R2 {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            System.out.printf("i=%d", i);
            int tmp = i;
            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0)

                    System.out.print ("짝");
            } while ((tmp /= 10) != 0);
            System.out.println();
        }
    }
}
