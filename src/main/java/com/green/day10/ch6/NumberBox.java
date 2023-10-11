package com.green.day10.ch6;

public class NumberBox { // = 메소드를 만듦 = 정의

    //NumberBoxTest와 같이보기
    // class 는 문서, 문서를 이용해 객체를 만들수 있다.
    // 속성 = int n; 처럼
    void sum(int n1, int n2) {
        System.out.printf("%d+%d=%d\n", n1, n2, (n1 + n2));
        return; // 생략해도 괜찮음.  void메소드일 경우에만, return이 자동으로 들어가기 때문에
    }

    void minus(int n1, int n2) {
        System.out.printf("%d-%d=%d\n", n1, n2, (n1 - n2));
    }
    void abs(int n) {
        System.out.println(n >0? n : -n);
    }

}
