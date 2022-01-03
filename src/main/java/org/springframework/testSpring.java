package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext boom = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = boom.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        Music music1 = boom.getBean("rockMusic", Music.class);
        MusicPlayer classicalPlayer = new MusicPlayer(music1);
        classicalPlayer.playMusic();


        boom.close();


    }
}
