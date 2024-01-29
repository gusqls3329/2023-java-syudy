package com.green.day84;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"), new File("Ex1.bak")
                , new File("Ex2.java"), new File("Ex2")
                , new File("Ex2.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr); //프라머티브 타입이 아닐 경우 :Stream.of
        // //프라머티브 타입일 경우Stream<File> fileStream = Stream.of(fileArr).boxed();
        Stream<String> strStream = fileStream.map(item -> item.getName());
        strStream.forEach(System.out::println);

        System.out.println("---------1--------");
        Stream.of(fileArr).map(File::getName) //Stream<String> strStream랑 똑같음
                .filter(item -> item.indexOf(".") != -1) //원하는 것만 통과시켜줌 //indexOf문자열에서 특정 문자를 찾는것
                .map(item -> item.substring(item.indexOf('.') + 1)) // substring문자열 자르기
                .map(item -> item.toUpperCase()) //똑같은 타입에  stream을 만듦 //toUpperCase : 전부 대문자로 바꾸겠다
                .forEach(System.out::println);

        System.out.println("---------2--------");
        System.out.println("12345".indexOf(".")); //-1로 나옴 : .이 없으면 -1이 나옴
        System.out.println("123.45".indexOf(".")); //3이 나옴 .앞에 몇개가 있는 지 확인
        System.out.println(".12345".indexOf("."));
    }
}
