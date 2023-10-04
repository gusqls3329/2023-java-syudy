package com.green.day1;

public class VarEx2 {
    public static void main(String[] args){
            int x = 10, y = 20;
            int temp = x;//A=10
            x = y; //x=20
            y = temp; //y = 10
            System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}

class VarE {
    public static void main(String[] args){
        final int x = 10, y = 20;
        int temp = x;//A=10
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("y : " + temp);
    }
}

// x와 y의 값을 변경하고 싶을경우 x를 다른단어(temp)로 옮김 > y값을 x값으로 변경 > 다른단어(temp)값을 다시 x에 삽입
// System.out.println("x : " + x);의 "x : " + x에 있는 +는 문자열을 합치는데 사용 (값은 x : 20 로 나옴)
