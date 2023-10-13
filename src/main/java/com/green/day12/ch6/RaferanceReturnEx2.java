package com.green.day12.ch6;
class Data2{
    int x;
    double d;
}
public class RaferanceReturnEx2 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        d.d = 100.5;

        Data2 d2 = copyObj(d);
        System.out.println("d==d2 : "+ (d == d2)); //true
        System.out.println("d.x==d2.x : "+ (d.x == d2.x)); //true
        System.out.printf("d.x==d2.x : "+ (d.d == d2.d));//true
    }

    public static Data2 copyObj(Data2 obj){
        // return obj; : 셸로우카피
        Data2 tmp = new Data2();
        tmp.x = obj.x;
        tmp.d = obj.d;
        return tmp;
    }
}
