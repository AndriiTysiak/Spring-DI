package org.example.springXmlConfig.service.impl;

import org.example.springXmlConfig.Song;
import org.example.springXmlConfig.service.MusicService;

import java.util.List;
import java.util.Random;

public class RockMusicServiceImpl implements MusicService {
    private List<Song> rockListSongs;

    public RockMusicServiceImpl(List<Song> rockListSongs) {
        this.rockListSongs = rockListSongs;
    }

    @Override
    public void playSong() {
        Random random = new Random();
        int randomNumber =random.nextInt(2);
        System.out.println("Playing: "+rockListSongs.get(randomNumber));
    }
}
