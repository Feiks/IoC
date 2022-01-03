package org.springframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        music.getSong();
    }
}

