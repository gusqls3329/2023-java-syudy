package com.green.day69.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();  //값을 넣는것
        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
        }
        for (Integer val : list) {
            System.out.println(val);
        }
        //1
        list.forEach(new Myconsumer<Integer>()); //forEach는 List안에 원래 존재하는것
        // consumer : interface 타입으로 받음 :
        System.out.println("------------");
        //2
        /*Consumer aa = new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("Myconsumer(2)" + o);
            }
        };
        list.forEach(aa);
        아래의 코드와 같아*/
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("Myconsumer(2)" + o);
            }
        });
        System.out.println("------------");
        //3 :1,2,3 다 같은 말
        list.forEach(i -> System.out.println("Myconsumer(3)" + i));
        System.out.println("------");
        /*
        1.
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 ==0;
            }
        });
        2.
        list.removeIf(i -> {return i % 2 == 0;}); {}를 넣으면 return이 필요함
        1,2,3은 다 같은 코드
        */
        //3
        list.removeIf(i -> i % 2 == 0);//{}를 넣으면 return을 넣을 수 없다
        System.out.println(list);
        list.replaceAll(v -> v <= 15 ? v*2 : v);

        System.out.println("T: "+list);
        list.replaceAll(v -> v*2);
        System.out.println(list);

        Map<String,String> map = new HashMap<>();
        map.put("name","홍길동");
        map.put("age","32살");
        map.put("height","160cm");
        map.forEach((k,v)-> System.out.printf("%s: %s\n",k,v));

    }
}

class Myconsumer<T> implements Consumer<T> { //<T>: 제네릭 : 객체를 생성할땧 타입을 확정, 상속은 자식 부모가 타입이 같음.
    //부모가 하나의 타입을 가지고 있다면 자식은 그 타입을 무조건 가지고 있다.
    @Override
    public void accept(T o) {
        System.out.println("Myconsumer(1)" + o);
    }
}