package com.example.music_library.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MusicCreateDTO {
    private int id;
    @NotBlank
    @Size(max = 800,message = "No input characters")
    private String nameMusic;
    @NotBlank
    @Size(max = 800,message = "No input characters")
    private String nameSinger;
    @NotBlank
    @Size(max = 800,message = "No input characters")
    private String kindOfMusic;

    public MusicCreateDTO(int id, String nameMusic, String nameSinger, String kindOfMusic) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.nameSinger = nameSinger;
        this.kindOfMusic = kindOfMusic;
    }

    public MusicCreateDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
