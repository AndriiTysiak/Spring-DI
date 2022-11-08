package org.example.springJavaConfig.service.impl;

import org.example.springJavaConfig.Song;
import org.example.springJavaConfig.service.RockMusicService;

import java.util.List;
import java.util.Random;

public class RockMusicServiceImpl implements RockMusicService {
    List<Song> rockListSongsJ;

    public RockMusicServiceImpl(List<org.example.springJavaConfig.Song> rockListSongsJ) {
        this.rockListSongsJ = rockListSongsJ;
    }

    @Override
    public void playRockSong() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println("Playing: " + rockListSongsJ.get(randomNumber));
    }
}

