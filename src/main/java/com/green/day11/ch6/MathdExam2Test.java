package com.green.day11.ch6;

public class MathdExam2Test {
    public static void main(String[] args) {
        MathdExam2 me2 = new MathdExam2();
        String r1 = me2.scoreResultOpt(90);
        System.out.println("r1: " + r1);
        /*
        100초과 0 미만은 "점수를 확인해주세요" 값이 리턴
        A학점 8점 이상은 +, 3점이하는 -, 나머지는 0
        B학점 8점 이상은 +, 3점이하는 -, 나머지는 0
        C학점 8점 이상은 +, 3점이하는 -, 나머지는 0
        D학점 +-0없음
         */

        String season = me2.getSeason(2);
        /*
        3,4,5>봄
        6~8여름
        9~11가을
        12~2겨울
        나머지> 없음
         */
        System.out.println(season);

    }
}
