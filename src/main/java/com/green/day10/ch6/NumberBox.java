package com.green.day10.ch6;

public class NumberBox { // = 메소드를 만듦 = 정의

    //NumberBoxTest와 같이보기
    // class 는 문서, 문서를 이용해 객체를 만들수 있다.
    // 속성 = int n; 처럼
    /*
    void = 호출 값에 nb1.sum처럼 간략하게 있고(int 등 타입이 없음 ) sout도 없음 ,정의 값에는 return도 생략가능(숨어있기때문)
    int = 호출 값에 타입과 함께 있으며 sout도 함께 있음. 정의 값에는 return을 꼭 작성해야함.
    2차 가공이 필요할 경우 대부분 return, 필요없을 경우 void를 주로 사용.
     */
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
