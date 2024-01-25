package com.green.day83;

public class Gbox<T> {
    //static을 사용하면 제네릭이랑 상관없음 : static은 객체생성과 상관이 없고 제네릭은 객체생성할때 사용을 하기 때문에
    //:Gbox<T> : 제네릭 클래스 T의 gbox라고 읽음, T:타입변수 > 들어오는데로 결정이 됨, Gbox :원시타입
    protected T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
