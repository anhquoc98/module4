package com.example.music_library.service.impl;

import com.example.music_library.dto.MusicCreateDTO;
import com.example.music_library.model.Music;
import com.example.music_library.repository.IMusicRepository;
import com.example.music_library.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MusicRepository implements IMusicService {
    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public Page<Music> list(PageRequest pageRequest) {

        return musicRepository.findAll(pageRequest);
    }

    @Override
    public void create(MusicCreateDTO musicCreateDTO) {
        Music music=new Music();
        BeanUtils.copyProperties(musicCreateDTO,music);
        musicRepository.save(music);
    }
}
