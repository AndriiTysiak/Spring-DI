package org.example.springXmlConfig;

import org.example.springXmlConfig.service.MusicService;

public class MusicPlayer {
    MusicService musicService;

    public MusicPlayer(MusicService musicService) {
        this.musicService = musicService;
    }

    public void playSong() {

        musicService.playSong();
    }
}
