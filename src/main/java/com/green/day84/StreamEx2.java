package com.green.day84;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx2 {
    //무한 스트림 > 꼭 유한 스트림을 사용해야함
    public static void main(String[] args) {
        Random r = new Random();
        IntStream intStream = r.ints();

        intStream.limit(10).forEach( System.out::println);

        System.out.println("--------");
        r.ints(10).forEach(System.out::println);

        System.out.println("--------");
        r.doubles(10).forEach(System.out::println);

        System.out.println("----랜덤 1~10 숫자, 5개 추출----");
        //map :
        //mapToInt :
        List<Integer> intList = r.doubles().mapToInt(item -> (int)(item*10)+1) //들어오는 것은 doubles, 나와야 할 것은 int 이기때문에 mapToInt을 사용함
                        .boxed().distinct().limit(5).collect(Collectors.toList());
        System.out.println(intList);
        System.out.println("----랜덤 1~45 숫자, 6개 추출----");
        //위코드의 쉬운버전
        r.ints(1,46).distinct().limit(6).sorted().forEach(item -> System.out.print(item +","));

        System.out.println("\n끝");
    }
}
