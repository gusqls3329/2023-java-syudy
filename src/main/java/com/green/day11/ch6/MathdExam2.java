package com.green.day11.ch6;

public class MathdExam2 { // return은 return을 만나야 함.
    String scoreResultOpt(int n){
        String grade = "C학점";
        if (n == 100) {
            return "A+학점";
        } else  if (n<70){
            return "D학점";
        } else  if (n>=90){
            return "A학점";
        } else  if (n>=80){
            return "B학점";
        }

       String opt = "0";
        int modVal = n % 10;
        if (modVal >=8){
            opt = "+";
        } else if (modVal <= 3){
            opt = "-";
        }
        // String result =String.format ("%s%s학점", grade, opt);  : 이 문자 자체를 result 에 담음
        return grade+opt  ;
    }

    String getSeason(int n){
        switch (n){
            case 3,4,5 :
                return "봄";
            case 6,7,8 :
                return "여름";
            case 9,10,11 :
                return "가을";
            case 12,1,2 :
                return "겨울";
        } return "잘못입력했습니다." ;
    }

}

