package org.example.springAnnotationConfig.service.impl;

import org.example.springAnnotationConfig.Song;
import org.example.springAnnotationConfig.service.RockMusicService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;

@Component("rock")
public class RockMusicServiceImpl implements RockMusicService {
    List<Song> rockListSongs = new ArrayList<>();

    @PostConstruct
    public void init() {
        Song song1 = new Song();
        song1.setSongName("RockSongName1");
        song1.setSinger("RockSinger1");

        Song song2 = new Song();
        song2.setSongName("RockSong2");
        song2.setSinger("RockSinger2");

        rockListSongs.add(song1);
        rockListSongs.add(song2);
    }

    @Override
    public void playRockMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        System.out.println("Playing: " + rockListSongs.get(randomNumber));
    }
}

