package com.green.day2.ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        float f1= 15.1f, f2 = 15.6f, f3 = 15.9f;
//ceil은 올림처리
        System.out.printf("ceil(%f): %f\n", f1, Math.ceil(f1));
        System.out.printf("ceil(%f): %f\n", f2, Math.ceil(f2));
        System.out.printf("ceil(%f): %f\n", f3, Math.ceil(f3));
        System.out.printf("ceil(%f): %f\n", 15.000, Math.ceil(15.000));
        System.out.printf("ceil(%f): %f\n", 15.00041, Math.ceil(15.00041));
//floor은 내림
        System.out.printf("floor(%f): %f\n", f1, Math.floor(f1));
        System.out.printf("floor(%f): %f\n", f2, Math.floor(f2));
        System.out.printf("floor(%f): %f\n", f3, Math.floor(f3));
// round는 반올림
        System.out.printf("round(%f): %d\n", f1, Math.round(f1));
        System.out.printf("round(%f): %d\n",15.5, Math.round(15.5));
        System.out.printf("round(%f): %d\n", 15.4, Math.round(15.4));
        System.out.printf("round(%f): %d\n", f2, Math.round(f2));
        System.out.printf("round(%f): %d\n", f3, Math.round(f3));

    }
}
