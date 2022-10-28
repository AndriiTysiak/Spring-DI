package org.example.springAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example.springAnnotationConfig");
        MusicPlayer musicPlayer = applicationContext.getBean(MusicPlayer.class);
        musicPlayer.playSong();
    }
}
