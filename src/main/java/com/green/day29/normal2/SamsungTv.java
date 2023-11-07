package com.green.day29.normal2;

public class SamsungTv {
    private boolean isMute;
    private HarmanSpeaker speaker;
    /*private AppleSpeaker speaker;

    public SamsungTv(){
        speaker = new AppleSpeaker();
    }

    public void sound(){
        if(!isMute){
            speaker.sound();
        }
    }*/
    public void toggleMute(){
        isMute =! isMute;
    }
    public SamsungTv(){
        speaker = new HarmanSpeaker();
    }
    public void sound(){
        if(!isMute){
            speaker.speak();
        }
    }
}


