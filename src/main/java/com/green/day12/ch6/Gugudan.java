package com.green.day12.ch6;

public class Gugudan {
    void print (int n){
        for (int i = 1; i <10 ; i++) {
                System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }

    void printFromTo (int n1, int n2){
        for (int i = n1; i <= n2; i++) {
            print(i);
        }

    }
    void printFromTo (int n1, int n2, String a){ // 구분만 가능하면 같은 이름을 사용할 수 있다. 위아래 구분은 ()안의 갯수

        for (int i = n1; i <= n2; i++) {
            print(i);
            System.out.println(a);
        }

    }
}
