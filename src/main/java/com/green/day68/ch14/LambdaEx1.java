package com.green.day68.ch14;

@FunctionalInterface // 메소드가 하나만 있는 지 검증하는 어노테이션
interface Myfunction{
    void run(); //접근제어자가 필요없음
    // 람다식을 이용할 때 메소드는 2개 이상 사용 할 수 없다, 인터페이스는 한개만 가지고 있어야함.
}

public class LambdaEx1  {

    public static void main(String[] args) { //Myfunction을 implements함 Myfunction mfb = ()-> {System.out.println("mfb - run !!");};

        Myfunction mfa = ()-> System.out.println("mfa - run !!");

         //{} : 문장이 한물장일 경우 {}생략가능

        //Myfunction mfc = i-> {System.out.println("mfc - run !!");};
        //()생략 : run(int a)처럼 파라미터가 한개라면 ()생략가능함 , 0개거나 2개이상일경우 생략 불가능

        Myfunction mf1 = new Myfunction() { //익명클래스 익명으로 상속
            //내용이 다른 것을 만들려면 짧고 간단하게 작성할 수 있다.
            //똑같은 내용의 객체를 여러개 만들때 class마다 new를 해야한다.
            @Override
            public void run() {
                System.out.println("fm2 - run");
            }
        };
        mf1.run();
        Myfunction mf2 = new MyfunctionClass();
        mf2.run();
    }
}

class MyfunctionClass implements Myfunction{ //내용이 다른 것을 만들려면 계속 만들어야함
    //똑같은 내용의 객체를 여러개 만들때 유리
    @Override
    public void run() {
        System.out.println("class name - run");
    }
}
