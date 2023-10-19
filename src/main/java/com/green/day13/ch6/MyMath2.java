package com.green.day13.ch6;

public class  MyMath2 {

   int num  ; //객체화가 되기 전이라 ..
    static int staticNum ;
    /* static이 붙으면 다른 메모리 영역에 저장됨. static은 공간이 1개임. MyMath2접근할 때 사용
    객체 생성과 상관이 없음 */


    static void staticAbs(int n){ //인스턴스 변수를 사용할 경우 static사용금지, 인스턴스메서드에서 static호출은 불가
        System.out.println(n<0?-n:n);
        //객체화가 되기 전이라 ..

    }


    void print2(){
        System.out.printf("staticNum : %d, num : %d\n", staticNum, num);
    }

}
