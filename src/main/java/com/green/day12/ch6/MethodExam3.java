package com.green.day12.ch6;

public class MethodExam3 {
    int sumText(String str) {
        int tmp = 0;
        int a = Integer.parseInt(str);
        while (a != 0) {
            int modval = a % 10;
            a = a / 10;
            tmp += modval;
        } return tmp;
    }

    int sumText1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            int val = Character.getNumericValue(result);
            sum += val;
        }
        return sum;
    }

    int sumText2(String str) {
        char[] charArr = str.toCharArray(); // char[]이다.
        int sum = 0;
        for (char ch : charArr) {
            sum += Character.getNumericValue(ch); // char를 정수로 바꾸며 더하는 문장
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodExam3 me = new MethodExam3();
        int sum = me.sumText("123123");
        System.out.println("sum2 : "+sum);
        System.out.println("sum2 : "+me.sumText("222"));
        System.out.println("---------1-------");
        int sum1 = me.sumText1("123123");
        System.out.println("sum1 : "+sum1);
        System.out.println("---------2-------");
        int sum2 = me.sumText2("123123");
        System.out.println("sum1 : "+sum2);
    }
}
