package org.example.springAnnotationConfig;

import org.example.springAnnotationConfig.service.ClassicalMusicService;
import org.example.springAnnotationConfig.service.RockMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class MusicPlayer {
    ClassicalMusicService classicalMusicService;
    RockMusicService rockMusicService;

    @Autowired
    public MusicPlayer(ClassicalMusicService classicalMusicService,RockMusicService rockMusicService) {
        this.classicalMusicService = classicalMusicService;
        this.rockMusicService = rockMusicService;
    }

    public void playClassicSong(){
        classicalMusicService.playClassicalSong();
    }
    public void playRockSong(){
        rockMusicService.playRockMusic();
    }

}
