package org.example.springXmlConfig;

import org.example.springXmlConfig.service.ClassicalMusicService;
import org.example.springXmlConfig.service.RockMusicService;

public class MusicPlayer {
    ClassicalMusicService classicalMusicService;
    RockMusicService rockMusicService;

    public MusicPlayer(ClassicalMusicService classicalMusicService, RockMusicService rockMusicService) {
        this.classicalMusicService = classicalMusicService;
        this.rockMusicService = rockMusicService;
    }

    public void playClassicalSong() {
        classicalMusicService.playClassicalSong();
    }
    public void playRockSong() {
        rockMusicService.playRockSong();
    }

}
