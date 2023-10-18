package com.green.day15.ch7;

public class Parent { //객체가 있으면 생성자가 무조건 존재 //모든 객체는 object를 상속받는다.그래서 Parent도 부모 객체(object)가 있음
    int age;
    public Parent(int age){
        this.age = age;
    }
    public Parent(){
        super();
    }
}

class  Child extends Parent{ //Child는 Parent를 상속받았기 때문에 age를 사용할 수 있다.
    public Child(){
        super(10); //값은 super보다 아래에 나와야함!! 부모가 가진 age를 가져옴, 부모의 주소값을 가짐 // this는 내가 가진  age를 가져옴, 나자신의 주소값을 가짐
    }
    void play(){
        System.out.println("놀자~");
    }
}

class  Child2 extends Parent { //Child와 Child2는 상관이 없음
    void jump(){
        System.out.println("놀자~");
    }
}
//class  Child2 extends Parent, Child : 다중상속 불가능.
class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10; //Child와 Child2는 상관이 없음을 보여주는 결과값
        c1.play();
        Parent p = new Child(); //부모가 자식의 주소값을 담을 수 있음(=다형성), 자식이 부모의 주소값을 담을 수 없음. 형제간에도 주소값을 담을 수 없음
        Child2 c2 = new Child2();
        c2.jump();
    }
}