package com.green.day16.ch7;

public class Singleton {
    private Singleton(){} //class내부에서만 접근가능


    private static Singleton singleton; //private Singleton singleton; 사용하려면 객체화를 해야하는데 객체화와 상관없이 사용하는 static은 메모리를 가지고있기때문에 사용못해
    /*
    - private 때문에 다른 class에서 사용을 하지 못함.
    - 다른 클래스에서 사용을 위해서는 static을 사용 : 객체화와 상관없이 사용할 수있는 static
    - private클래스 내에 static return메소드를 사용
    - 다른 클래스에서 Singleton주소값을 s1에 저장
     */
    public static Singleton getInstance(){
        if (singleton == null){
            singleton=new Singleton();
        } return singleton;
    }
}


class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        //Singleton s1 = new Singleton();
    }
}