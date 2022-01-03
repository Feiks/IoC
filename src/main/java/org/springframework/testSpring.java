package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext boom = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = boom.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playMusic();
        boom.close();


    }
}
