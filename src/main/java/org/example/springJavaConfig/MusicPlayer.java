package org.example.springJavaConfig;


import org.example.springJavaConfig.service.ClassicalMusicService;
import org.example.springJavaConfig.service.RockMusicService;

public class MusicPlayer {
   ClassicalMusicService classicalMusicService;
   RockMusicService rockMusicService;

    public MusicPlayer(ClassicalMusicService classicalMusicService,RockMusicService rockMusicService) {
        this.classicalMusicService = classicalMusicService;
        this.rockMusicService = rockMusicService;
    }
    public void playClassicSong(){
        classicalMusicService.playClassicSong();
    }
    public void playRockSong(){
        rockMusicService.playRockSong();
    }

}
