package com.green.day3.ch4;

/*만약에 n이 (음수 아무 값) -10 이였다면 콘솔에 10이 출력
만약에 n이 (양수 아무 값) 9 였다면 콘솔에 9가 출력
 */

public class OperaterEx32Mission {
    public static void main(String[] args) {
        int n = -10;

        //n = n * -1;
        n = -n;
        System.out.println("n: " + n);
    }
}

class OperaterEx32Mission2 {
    public static void main(String[] args) {

        int n = -10;

        if (n < 0) {
            System.out.println("n: " + -n);
        }
        if (n > 0) {
            System.out.println("n: " + n);
        }
    }
}

class OperaterEx32Mission3 {
    public static void main(String[] args) {

        double n = -10.5;

        if (n < 0) {
            System.out.println("n: " + -n);
        }
        if (n > 0) {
            System.out.println("n: " + n);
        }
    }
}

class OperaterEx32Mission4 {
    public static void main(String[] args) {

        int n = 10;
        int n1 = n > 0 ? n : -n;
        System.out.println("n: " + n1);


    }
}

class OperaterEx32Mission5 {
    public static void main(String[] args) {

        int n = 10;
        System.out.println(n < 0 ? -n : n);


    }
}
