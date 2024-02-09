package com.example.demo.service;

import com.example.demo.DTO.ScoreDTO;
import com.example.demo.domain.Score;

import java.util.List;

public interface ScoreService {
    void addScore(ScoreDTO scoreDTO);

    int getScoreByFilm(Long filmId);
}
