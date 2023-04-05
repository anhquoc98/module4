package com.example.music_library.repository;

import com.example.music_library.model.Music;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicRepository extends PagingAndSortingRepository<Music, Integer> {
}
