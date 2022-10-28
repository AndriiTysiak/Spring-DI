package org.example.springAnnotationConfig.service.impl;

import org.example.springAnnotationConfig.Song;
import org.example.springAnnotationConfig.service.MusicService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("classic")
public class ClassicalMusicServiceImpl implements MusicService {
    private List<Song> classicalListSongs = new ArrayList<>();

    @PostConstruct
    public void init() {
        Song song1 = new Song();
        song1.setSongName("ClassicalSongName1");
        song1.setSinger("ClassicalSinger1");

        Song song2 = new Song();
        song2.setSongName("ClassicalSongName2");
        song2.setSinger("ClassicalSinger2");

        classicalListSongs.add(song1);
        classicalListSongs.add(song2);
    }

    @Override
    public void playSong() {
        Random random = new Random();
        int randomNumber =random.nextInt(2);
        System.out.println("Playing: "+classicalListSongs.get(randomNumber));

    }

}
