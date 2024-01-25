package com.green.day83;

public class Gbox<T> {
    //:Gbox<T> : 제네릭 클래스 T의 gbox라고 읽음, T:타입변수 > 들어오는데로 결정이 됨, Gbox :원시타입
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
