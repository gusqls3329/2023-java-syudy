package com.green.day11.ch6;

public class MathdExam2 { // return은 return을 만나야 함.
    String scoreResultOpt(int n){
        String grade = "c";
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
        return grade+opt  ;
    }

}

