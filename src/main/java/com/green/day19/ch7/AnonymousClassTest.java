package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobotImpl();
        Runnable2 run2 = new Runnable2() { //class이름없이 익명 클래스로 활용, 만들때 마다 달라져야 할 경우 사용
            // ui가 있는 플랫폼에서 자주 사용
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };

    }
}

interface Runnable2{
    void run();
}

class RunRobotImpl implements Runnable2{ // RunRobot + Impl : implements했다는 의미로 이름에 Impl에 붙임.
    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}