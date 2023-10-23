package com.green.day18.ch7;

import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();
    }

}

class NumberBaseball {
    private final int GAME_COUNT;
    private final int[] gameNumbers;

    NumberBaseball(int count) {
        GAME_COUNT = count;
        gameNumbers = new int[count];
    }


    public void start() {
        setRandomNumNotDuplicate();

    }

    public void setRandomNumNotDuplicate() {
        int num = 10;
        for (int i = 0; i< num ; i++) {
            int randon = (int) (Math.random() * 10);
            gameNumbers[i] = randon;
            for (int j = 0; j < i; j++) {
                if(gameNumbers[i] == gameNumbers[j]){
                    i--;
                    break;
                }
            }
        }
    }
    public void getUserInput(){
        Scanner scan = new Scanner(System.in);
        int[] userArr = new int[GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d 숫자 >> ",i + 1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult(userArr);
        //빨간 줄 안생기게

        scan.close();
    }
    private boolean isContinueCheckResult(int[] arr) {
        int strike=0, ball=0, out;
        for(int i=0; i<gameNumbers.length; i++) {
            for(int z=0; z<arr.length; z++) {
                if(gameNumbers[i] == arr[z]) {
                    if(i == z) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);

        return false;
    }
}