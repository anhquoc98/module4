package com.example.developing_song_features.repository;

import com.example.developing_song_features.model.SongModel;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ISongRepository extends PagingAndSortingRepository<SongModel,Integer> {
}
