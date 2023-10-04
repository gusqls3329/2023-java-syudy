package com.green.day3.ch4;

/*
사망식
조건식 ? true 였을때 : false였을 때
 */
public class OperaterEx32 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        int r = n1 < n2 ? n1 : n2;
        //      식 뒤>에 ? 일떄 t면 t : f면 f
        //      ? 앞의 식이 ture일때 n1(앞)이 r에 대입. false일때 n2(뒤)가 r에 대입
        System.out.println("r: " + r);
    }
}
