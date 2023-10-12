package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5);
        sp.line(7);
        System.out.println("---------------");
        sp.square(5);
        System.out.println("------==------");
        for (int i = 0; i < 5; i++) {
            sp.line(5);
        }
        System.out.println("-------1--------");
        sp.triangle(5);

        System.out.println("-------2--------");
        String gender = sp.chkGenderById("011231-2117111");
        System.out.println("gender : "  +gender);

        System.out.println("-------3--------");
        int sum = sp. sumFromTo(4,10);
        int sum2 = sp. sumFromTo(10,15);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
