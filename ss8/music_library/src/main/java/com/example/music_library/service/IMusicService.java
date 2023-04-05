package com.example.music_library.service;

import com.example.music_library.dto.MusicCreateDTO;
import com.example.music_library.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IMusicService {
    Page<Music> list(PageRequest pageRequest);
    void create(MusicCreateDTO musicCreateDTO);
}
