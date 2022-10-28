package org.example.springAnnotationConfig;

import org.example.springAnnotationConfig.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("player")
public class MusicPlayer {
    MusicService musicService;

    @Autowired
    public MusicPlayer(@Qualifier("rock"/*or classic*/) MusicService musicService) {
        this.musicService = musicService;
    }

    public void playSong() {
        musicService.playSong();
    }

}
