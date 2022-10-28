package org.example.springJavaConfig.service.impl;

import org.example.springAnnotationConfig.service.MusicService;
import org.example.springJavaConfig.Song;

import java.util.List;
import java.util.Random;

public class RockMusicServiceImpl implements MusicService {
    List<Song> rockListSongsJ;

    public RockMusicServiceImpl(List<org.example.springJavaConfig.Song> rockListSongsJ) {
        this.rockListSongsJ = rockListSongsJ;
    }


    @Override
    public void playSong() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println("Playing: " + rockListSongsJ.get(randomNumber));
    }
}

