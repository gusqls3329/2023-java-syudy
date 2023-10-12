package com.green.day11.ch6;

public class MathdExam2Test {
    public static void main(String[] args) {
        MathdExam2 me2 = new MathdExam2();
        String r1 = me2.scoreResultOpt(90);
        /*
        100초과 0 미만은 "점수를 확인해주세요" 값이 리턴
        A학점 8점 이상은 +, 3점이하는 -, 나머지는 0
        B학점 8점 이상은 +, 3점이하는 -, 나머지는 0
        C학점 8점 이상은 +, 3점이하는 -, 나머지는 0
        D학점 +-0없음
         */

        System.out.printf("r1: " + r1);

    }
}
