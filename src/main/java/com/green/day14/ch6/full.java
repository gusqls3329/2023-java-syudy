package com.green.day14.ch6;

public class full {
    int a;
    int b;
}

/*class full1 extends full {  // 상속
    int c;
}*/

class full1{                   // 포함
    full d = new full();
 int c;
}


class CarTest {
    public static void main(String[] args) {
        full1 ppp = new full1();
        ppp.d.a = 1;
        ppp.d.b = 2;
        ppp.c = 3;

        System.out.println(ppp.d.a);
        System.out.println(ppp.d.b);
        System.out.println(ppp.c);

    }
}
