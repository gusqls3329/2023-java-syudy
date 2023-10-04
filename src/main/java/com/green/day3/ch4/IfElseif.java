package com.green.day3.ch4;

public class IfElseif {
    // if, else 문장들을 따로 두는지 묶어 두는지에 따라 답이 다름
    public static void main(String[] args) {
        if (1 == 1) {
            System.out.println("1");
        } else if (2 == 2) {
            System.out.println("2");
        } else if (3 == 3) {
            System.out.println("3");
        } else {
            System.out.println("else");
        }     // 마지막 문구에 else가 있다면 무조건 답이 나옴
    }
}

