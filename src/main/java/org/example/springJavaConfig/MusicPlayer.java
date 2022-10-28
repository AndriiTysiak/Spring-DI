package org.example.springJavaConfig;

import org.example.springAnnotationConfig.service.MusicService;


public class MusicPlayer {
    MusicService musicService;

    public MusicPlayer(MusicService musicService) {
        this.musicService = musicService;
    }

    public void playSong() {
        musicService.playSong();
    }

}
