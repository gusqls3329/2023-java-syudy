package com.green.day10.ch6;

public class ReturnNumberBox {
    int sum(int n1, int n2){ //2차 가공이 필요할 경우 대부분 return, 필요없을 경우 void를 주로 사용.
        return  n1 + n2; //void메소드가 아니기 때문에 return을 작성해야함.
    }

    int abs (int n){
        return n<0?-n:n;
    }


}
