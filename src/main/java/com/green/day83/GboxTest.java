package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class GboxTest {//제네릭이 나오면서 자동 형변환을 해줌
    public static void main(String[] args) {
        Gbox g1 = new Gbox();
        g1.setItem(1);
        g1.setItem("아아아아");

        Gbox<Integer> g2 = new Gbox(); // > 실행할 댕시에 Gbox가 Integer이 됨

        g2.setItem(1);

        int intVal = g2.getItem();

        Gbox<String> g3 = new Gbox();
        g3.setItem("ㅎㅎ");
        String strVal = g3.getItem();

        List<Integer> list = new ArrayList<>(); //컨파일시점에 제네릭이 결정됨
    }

}
