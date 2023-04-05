package com.example.developing_song_features.model;

import javax.persistence.*;

@Entity
@Table
public class SongModel {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String nameSong;
    @Column(name = "artist")

    private String artist;
    @Column(name = "kind_of_music")

    private String kindOfMusic;

    public SongModel() {
    }

    public SongModel(int id, String nameSong, String artist, String kindOfMusic) {
        this.id = id;
        this.nameSong = nameSong;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
