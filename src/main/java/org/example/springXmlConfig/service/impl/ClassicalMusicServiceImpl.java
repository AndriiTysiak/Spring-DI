package org.example.springXmlConfig.service.impl;

import org.example.springXmlConfig.Song;
import org.example.springXmlConfig.service.ClassicalMusicService;

import java.util.List;
import java.util.Random;

public class ClassicalMusicServiceImpl implements ClassicalMusicService {
    private List<Song> classicalListSongs;

    public ClassicalMusicServiceImpl(List<Song> classicalListSongs) {
        this.classicalListSongs = classicalListSongs;
    }


    @Override
    public void playClassicalSong() {
        Random random = new Random();
        int randomNumber =random.nextInt(2);
        System.out.println("Playing: "+classicalListSongs.get(randomNumber));
    }
}
