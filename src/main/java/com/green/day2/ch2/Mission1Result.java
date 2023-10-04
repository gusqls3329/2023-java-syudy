package com.green.day2.ch2;

public class Mission1Result {
    public static void main(String[] args) {
    int n1 = 10, n2= 3;

  double r = (double)n1 / n2;

        System.out.println("r: " + r);

        double r3 = n1 / n2; // n1 / n2는 int / int이기 때문에 정수로 나누어져 r에 대입
        System.out.println("r3: " + r3);

        double r4 = (double)n1 / (int)n2; // int가 double보다 작기때문에 int가 double로 바뀜

        System.out.println("r4: " + r4);


    }
}

class Mission1Result2 {
    public static void main(String[] args) {
        int n1 = 10, n2= 3;

       float r2 = (float)n1 / n2;

        System.out.println("r2: " + r2);
    }
}