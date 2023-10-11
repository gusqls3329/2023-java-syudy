package com.green.day10.ch6;

public class Tv {
    //day10.ch6.TvTest, TvTest2와 함께 보기.

    // 속성 = 멤버 필드, property
    String color;
    boolean power;
    int channel;

    //메소드 = 멤버메소드
    // 리턴 타입(=void), 메소드명(=power), 파라미터 (=())
   /*
    void power () : 메소드의 선언부로 없을 수 없음, { power = !power;}구현부로 없을 수 있음
    호출시는 선언부만 작성 가능
    */
    void power () { power = !power;} //  = 메소드를 정의했다 (만들었다.)
    void channelUp () { channel++;}
    void channelDown () { channel--;}
}
 /*
객체는 속성(명사)(값과관련된) + 메소드(동사)(움직임과 관련된)
클래스 : 문서, 설계도, 설명
객체 = Object, 인스턴스, Instance : 클래스를 보고 만듦.

디폴트 값
불린 = 펄스
숫자 = 0
참조형 = null (null은 주소값을 가지고 있지않다.)

heap : FIFO
stack : FILO 젤먼저 들어간 값이 젤 마지막에 나온다.
 */

/*
Steck 메모리영역            Heap 메모리영역
쌓임 퍼스트인 라스트아웃      퍼스트인 퍼스트아웃
↓3↑                         →3 2 1→
↓2↑
↓1↑

Steck 메모리영역            Heap 메모리영역
Tv tv1 주소값저장     →     TV | channel color | 메소드
                          주소값 16진수 0*1111
Tv tv2 주소값저장     →     TV | channel color | 메소드
                          주소값 16진수 0*2222

Steck 메모리영역            Heap 메모리영역
Tv tv1 주소값저장     →      TV | channel color | 메소드
    | (쉘로우카피)          주소값 16진수 0*1111
Tv tv2 주소값저장   → ↑
 */
