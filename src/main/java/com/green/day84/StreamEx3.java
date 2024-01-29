package com.green.day84;

import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream.iterate(0, item -> item+2)
                .mapToInt(Integer::valueOf)
        //.mapToInt(item -> {Integer.valueOf(item);});  (.mapToInt(Integer::valueOf))와 같은 코드
                //.skip(3)
                .limit(10)
                .boxed()
                .forEach(System.out::println);
        // 파라미터 : item에 0이 들어감 > return 0 + 2 > return 2 +2 > return 4 +2
    }
}
