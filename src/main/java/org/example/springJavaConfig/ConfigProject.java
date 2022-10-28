package org.example.springJavaConfig;

import org.example.springJavaConfig.service.impl.ClassicalMusicServiceImpl;
import org.example.springJavaConfig.service.impl.RockMusicServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example.springJavaConfig")
public class ConfigProject {
    @Bean
    public Song classicSong1() {
        Song classicSong1 = new Song();
        classicSong1.setSongName("ClassicSongName1");
        classicSong1.setSinger("ClassicSinger1");
        return classicSong1;
    }

    @Bean
    public Song classicSong2() {
        Song classicSong2 = new Song();
        classicSong2.setSongName("ClassicSongName2");
        classicSong2.setSinger("ClassicSinger2");
        return classicSong2;
    }

    @Bean
    public Song rockSong1() {
        Song rockSong1 = new Song();
        rockSong1.setSongName("RockSongName1");
        rockSong1.setSinger("RockSinger1");
        return rockSong1;
    }

    @Bean
    public Song rockSong2() {
        Song rockSong2 = new Song();
        rockSong2.setSongName("RockSongName1");
        rockSong2.setSinger("RockSinger1");
        return rockSong2;
    }

    @Bean
    public List<Song> classicalListSongsJ() {
        return Arrays.asList(classicSong1(), classicSong2());
    }

    @Bean
    public List<Song> rockListSongsJ() {
        return Arrays.asList(rockSong1(), rockSong2());
    }

    @Bean
    public ClassicalMusicServiceImpl classicalMusicPlayerService() {
        return new ClassicalMusicServiceImpl(classicalListSongsJ());
    }

    @Bean
    public RockMusicServiceImpl rockMusicService() {
        return new RockMusicServiceImpl(rockListSongsJ());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusicPlayerService()/*rockMusicService()*/);
    }
}
