package com.green.day18.ch7;

import com.green.day12.ch6.Card;

import java.util.*; //아래 두개를 줄이는법 : *붙이기
//import java.util.ArrayList;
//import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList(); //상속관계 : 이름이 달라서  List: 부모, 부모class는 자식 class를 담을 수 있기 때문에
        list.add(10);
        list.add(10.3f);
        list.add(10.3d);
        list.add(103l);
        list.add("ddd");
        list.add(new Card());

        Object val1 = list.get(0); //바로 int를 사용하지 못함 : 들어갈때 Object라면 나올 때도 Object여야하기 때문에
        int intVal = (int)val1;

        float intVal2 = (float)list.get(1); // 계속 방의 형태을 알고 형변환을 시켜줘야함

        Object obj = 10; // 잘 사용안함: 숫자, 문자등 다 사용할 수 있어 구분이 힘들기 때문에.
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj ="ddd";
        obj = new Card();

    }


}

class ArrayListTest2{
    public static void main(String[] args) {
        int v1 = 10;
        Integer v2 = 10;
        System.out.println(v1 == v2);
        List<Integer>list = new ArrayList(); //p.491 <Integer>: <>:안에는 기본형을 사용할 수 없구, 래퍼클래스만 넣어야한다. 출력의 타입을 같게 하기위해 사용
        list.add(10); //값넣기 : add (대입연산자(=)를 사용하는게 아닌 추가한다는 뜻) boolean타입(return 메소드)이지만 작성하지 않음 void처럼 보임,
        // list.add(10.3f); Integer로 타입을 정했기 때문에 정수만 사용이 가능하다.
        int val1 = list.get(0); //정수형타입으로 나옴. 값빼기: get
       // System.out.println( list.get(1)); : 에러메세지가 나옴

        list.add(20);
        list.add(30);
        list.add(45);
        System.out.println( list.get(1)); // 바른 방을 출력하고 싶다면 list.add를 해야함
        System.out.println("size : "+ list.size()); // 방크기를 알 수 있는 코드

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("[%d]: %d\n", i, list.get(i));
        }

        System.out.println("-----------");
        for (int val : list){
            System.out.println(val);
        }
    }
}

class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("1: "+ list); //  주소가 나와야하는데 값이나오기 때문에 list 가 toString을 오버라이딩 함.

        list.add(1, 100); // list.add(n, number); n번방에 number을 넣어달라, 뒤에숫자는 뒤로 밀림.
        System.out.println("2: "+ list);
        list.add(3, 200);
        System.out.println("3: "+ list);

        list.remove(0); //list.remove(n); n번방을 지움, 뒤의 숫자는 앞으로 감
        System.out.println("4: "+ list+ ", size: "+ list.size());

    }
}