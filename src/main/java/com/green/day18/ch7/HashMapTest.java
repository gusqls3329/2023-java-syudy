package com.green.day18.ch7;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",10); //"a":key, 10: val
        map.put("b",20);
        map.put("b",30);//나중에 저장된 값이 출력


        Object obj = map.get("b"); //key값에 저장된 값을 불러올때
        int val = (int)obj;
        System.out.println("val: "+val);

    }
}

class HashMapTest2{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("Tv",0);
        map.put("Computer",0);
        map.put("Audio",0);

        map.put("Tv",map.get("Tv")+1);
        map.put("Tv",map.get("Tv")+1);
        map.put("Tv",map.get("Tv")+1);

        System.out.println("Tv-Count : "+ map.get("Tv"));
        System.out.println("Tv-size : "+ map.size());

    }
}
