package org.springframework;

public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        music.getSong();
    }
}