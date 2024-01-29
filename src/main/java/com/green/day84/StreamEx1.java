package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArr = {10, 2, 22, 80, 90, 33};
        Integer[] integerArr = {10, 2, 22, 80, 90, 33};
        Stream<Integer> stream2 = Stream.of(integerArr); // integerArr는 .boxed();가 필요없음 .boxed();가 필요한경우는 프라머티브 타입일 경우
        //방법1 : Stream<Integer> stream1 = Arrays.stream(intArr).boxed(); //프라머티브?타입??
        /*Stream<Integer> stream1 = IntStream.of(intArr).boxed();

        List<Integer> list =  stream1.sorted().limit(3).collect(Collectors.toList()); //stream1스트림 만들기 , sorted(): 중간연산,limit(3):중간연산, 3개의값까지만 자른다, collect(Collectors.toList()) : 최종연산 (현제는 리스트로 다시 변경)
        //limit을 먼저 두면 자르고 sorted를 함
        아래 코드를 한 줄로 줄인것이 위코드임*/
        Stream<Integer> stream1 = IntStream.of(intArr).boxed();
        stream1 = stream1.sorted().limit(3);
        List<Integer> list = stream1.collect(Collectors.toList());
        //stream1.forEach(item -> System.out.println(item)); //위도 옆코드도 최종연산자라서 최종연산하는 한번만 사용해야해서, 만약한번더 하고 싶다면 아래 코드처럼 한번더 만들어 줘야함
        IntStream.of(intArr).boxed() //배열을 스트림으로 만듦
                .sorted().limit(3) //중간 연산, 몇번을 해도 상관없지만 순서는 중요
                .forEach(item -> System.out.print(item + ",")); //최종연산 딱한번만 해야함

        System.out.println(list);
        System.out.println(Arrays.toString(intArr));
    }
}
