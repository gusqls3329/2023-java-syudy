package com.green.day19.ch7;

public abstract class Player {
    public abstract void play (int pos);
    /*class는 추상 메소드(abstract)가 하나라도 있으면 class는 추상class(abstract)가 되므로 class를 맞춰줘야함 but, 추상 class이지만 추상 메소드를 안가지고 있을수 잇다.
    구현부가 없는 메소드 (선언부만 있는 메소드)는 추상 메소드이다.
    추상클래스는 객체화가 되지않음. 부모로서 (타입으로서 )활동가능
    추상 메소드가 있다면 자식에게 강제성이 있다. > 오버라이딩을 해야한다. but, 추상 class이지만, 추상 메소드가 없다면 오버라이딩 강제성은 없다.
    추상메소드를 가지고 있지 않아도 class에 추상class로 만드는것 : 객체화를 하지 않을려고.
    */
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap; //Player부모 타입이기 때문에 자식인 AudioPlayer(ap)주소값을 알고있고 그것을 호출할 수 있다.
        player.play(30);
        player = vp;
        player.play(40);
    }
}

class AudioPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Audio Player 위치 : " + pos);
    }
}
class VideoPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Video Player 위치 : " + pos);
    }
}
