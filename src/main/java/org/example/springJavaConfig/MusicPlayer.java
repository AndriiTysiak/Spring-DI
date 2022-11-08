package org.example.springJavaConfig;


public class MusicPlayer {
    MusicService musicService;

    public MusicPlayer(MusicService musicService) {
        this.musicService = musicService;
    }

    public void playSong() {
        musicService.playSong();
    }

}
