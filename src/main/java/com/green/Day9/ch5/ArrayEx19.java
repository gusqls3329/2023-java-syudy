package com.green.Day9.ch5;

/*
첫 행은 국어점수, 두번째 행은 영어 점수, 세번째 행은 수학점수
번호  국어  영어  수학  총점  평균
1    101   102   103  306  102.0
...
5   51    52    53      ??  ??
----------------------------
총점 ??
 */
public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
                , {51, 52, 53}
        };
        int[] sumArr = new int[score[0].length];
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");


        for (int i = 0; i < score.length; i++) {
            int sum = 0; // 한줄의 국영수를 더하기 위해 지정, 한줄을 다 출력한 후 다시 sum=0이 되도록 아래 for문 밖으로 작성
            System.out.printf("%d\t", i + 1);
            for (int a = 0; a < score[i].length; a++) {
                int val = score[i][a];
                sumArr[a] += val; // 국영수 의 점수를 더하기 위한것.
                sum += val;
                System.out.printf("\t%d", val);
            }
            float avg = (float) sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, avg);
        }
        System.out.print("총점");
        for (int val : sumArr) {
            System.out.printf("\t%d", val);
        }
        System.out.println();
    }
}

