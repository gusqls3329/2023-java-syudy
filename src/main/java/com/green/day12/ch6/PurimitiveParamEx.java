package com.green.day12.ch6;

class Data{
    int x;
}
public class PurimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.printf("main(): x = %d\n",d.x); //10
        change(d.x);
        System.out.printf("main(): x = %d\n",d.x);  //10
        System.out.println("---------------");
        Data d2 = new Data();
        d2.x = 100;
        System.out.printf("main(1): x = %d\n",d2.x); //100
        change(d2); //static의 같은 공간에 있으면 생략해서 change(d2) 이런식으로 사용가능
        System.out.printf("main(2): x = %d\n",d2.x); //100


    }

    public static void change(int x) {
        x = 100;
        System.out.printf("change() : x = %d\n",x); //100
    }

    public static void change(Data d) {

        d = new Data();
        d.x = 1000;
        System.out.printf("change() : x = %d\n",d.x); // 1000
    }
}
