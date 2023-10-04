package com.green.day5.ch4;

/*중첩반복문을 사용해
가로 10개 세로 5줄 별을 찍으세요.
 */
public class FlowEx16 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int z = 0; z < 10; z++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}


class FlowEx16_1 { //i % 10 == 0 :10을 나누어 0이 떨어져서 이식은 10번하고 ln을 하겠다
    public static void main(String[] args) {

        for (int i = 1; i <= 10 * 5; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}