package com.green.day29.normal;

public class SamsungTv {
    private boolean isMute;
    private AppleSpeaker speaker;
    public SamsungTv(){
        speaker = new AppleSpeaker();
    }

    public void sound(){
        if(!isMute){
            speaker.sound();
        }
    }
    public void toggleMute(){
        isMute =! isMute;
    }

}


