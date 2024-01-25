package com.green.day44;

public class MyOpenAPI {
    private MyInfo info;

    public MyOpenAPI info(MyInfo mi){
        this.info = mi;
        return this;
    }
    @Override
    public String toString(){
        return String.format("info: %s", info);
    }
}
