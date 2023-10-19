package com.green.day16.ch7;

public class Animal {
    public void crying(){
        System.out.println("동물이 운다");
    }
}
class AnimalTest3{
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog); //결과 타입은 boolean이 나옴
        System.out.println(ani instanceof Cat);
        Cat cat = (Cat)ani;
        System.out.println("끝");
        Dog dog = (Dog)ani; //강제 형변환하면 에러가 발생
    }
}
class AnimalTest2{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        System.out.println(bulldog instanceof Dog);

        System.out.println(bulldog instanceof Bulldog);
        System.out.println(bulldog instanceof Animal);
        Animal ani = bulldog;
        System.out.println(ani instanceof Cat);

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog); //   호출하는 곳에 static이 붙고 같은 클래스 내에서 호출할 경우는 .을 사용하지 않음
    }
    private static void callCrying(Animal ani){


        ani.crying();
       if (ani instanceof Bulldog){
           ((Bulldog)ani).jump();
       }

            /* =
    private static void callCrying(Dog dog){
        dog.crying();
    }
    private static void callCrying(Cat cat){
        cat.crying();
    }
    private static void callCrying(Bulldog bulldog){
        bulldog.crying();
    }

     */
    }

}
class AnimalTest{
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값을 담을 수  있다.

        Dog d1 = new Bulldog();
        Animal ani1 = new Bulldog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();
        //2. 자식타입은 부모객체 주소값을 담을 수 없다

        Dog d2 = new Dog();
        //Bulldog bull2 = (Bulldog)d2;
        //System.out.println("끝");

        //3. 타입은 알고있는 메소드만 호출할 수있고, 호출이 된다면 객체기준이다. : 가까운걸 실행
        Bulldog bull3 = new Bulldog();
        bull3.jump();
        bull3.crying();

        Dog dog2 = new Bulldog();
        //dog2.jump

    }
}

class Dog extends Animal{
    @Override
    public void crying(){ // 오버라이딩
        System.out.println("멍! 멍!");
    }
    public void crying1(){ // 오버라이딩
        System.out.println("멍! 멍!");
    }
}

class Bulldog extends Dog{
    public void jump(){ // 오버라이딩
        System.out.println("불독이 점프!");
    }
    public void crying(){ // 오버라이딩
        System.out.println("불독이 왈! 왈!");
    }
}

class Cat extends Animal{
    public void crying(){
        System.out.println("야옹~야옹");
    }
}
