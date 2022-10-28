package org.example.springJavaConfig.service.impl;

import org.example.springAnnotationConfig.service.MusicService;
import org.example.springJavaConfig.Song;

import java.util.List;
import java.util.Random;


public class ClassicalMusicServiceImpl implements MusicService {
    private List<Song> classicalListSongsJ;

    public ClassicalMusicServiceImpl(List<org.example.springJavaConfig.Song> classicalListSongsJ) {
        this.classicalListSongsJ = classicalListSongsJ;
    }

    @Override
    public void playSong() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println("Playing: " + classicalListSongsJ.get(randomNumber));

    }

}
