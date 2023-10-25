package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
           Exception e = new Exception("일부러 에러를 터트림!");
           System.out.println("ss");
           throw e; //throw 밑은 실행이 되지 않음. throw되는 순간 일부로 예외를 만듦
            //throw  new Exception();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("--끝--");
    }
}
