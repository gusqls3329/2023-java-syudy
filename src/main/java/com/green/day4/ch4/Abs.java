package com.green.day4.ch4;

/*
10은 절대값 10
-9(은) 절대값 9
 */
public class Abs { //양수 만들기 _ 분기문
    public static void main(String[] args) {
        int num = -10;

        if (num < 0) {
            System.out.printf("%s는(은) 절대값 %d.\n", num, -num);
        } else {
            System.out.printf("%s는(은) 절대값 %d.\n", num, num);
        }
        System.out.printf("%s는(은) 절대값 %d.\n", num, num< 0 ? -num : num);
    }
}

class Abs2 {
    public static void main(String[] args) {
        int num = -10;
        int i = num >= 0 ? num : -num;
        {
            System.out.printf("%s는(은) 절대값 %d.\n", num, i);
        }
    }
}

 class Abs3 {
    public static void main(String[] args) {
        int num = -10;

        System.out.printf("%s는(은) 절대값 %d.\n", num, num< 0 ? -num : num);

    }
}
