package com.green.day16.ch7;

public class Time {
    public final static int Max_hour = 23;
    public final static int Min_hour = 0;
    private int hour, minute, second; //멤버필드에 private 이제 넣기
    //1. 생성자
    public Time(int hour, int minute, int second){ //속성은 은닉화를 해야함. 나중에 값이 변경되는 것을 막기위해
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //1. 생성자 예
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }

    //2. stter 메소드
    public void setHour(final int hour){

        if (hour >Max_hour){ //return
            this.hour = Max_hour;
            return;
        } else if (hour < Min_hour) {
            this.hour = Min_hour;
            return;
        }
        this.hour= hour;

    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setMecond(int second){
        this.second = second;
    }
    public int getHour(int hour){
       return this.hour;
    }
    public int getMinute(int minute){
        return this.minute;
    }
    public int getMecond(int second){
        return this.second;
    }

}

class TimeTest{
    public static void main(String[] args) {
        Time time = new Time(10,20,30);
        System.out.println(time);
        // time.hour = 10; : private을 사용했기 때문에 이문장을 사용 불가
        time.setHour(5);
        System.out.println(time);
    }
}
