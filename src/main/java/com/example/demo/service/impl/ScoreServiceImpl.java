package com.example.demo.service.impl;


import com.example.demo.DTO.ScoreDTO;
import com.example.demo.domain.Film;
import com.example.demo.domain.Score;
import com.example.demo.repository.FilmRepository;
import com.example.demo.repository.ScoreRepository;
import com.example.demo.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private FilmRepository filmRepository;

    @Override
    public void addScore(ScoreDTO scoreDTO) {
        Long userId = scoreDTO.userId;
        Long filmId = scoreDTO.filmId;
        int score = scoreDTO.score;
        Score newScore = new Score();
        newScore.setUserAndFilm(userId, filmId);
        newScore.setScore(score);

        scoreRepository.save(newScore);
    }

    @Override
    public int getScoreByFilm(Long filmId) {
        Film film = filmRepository.getReferenceById(filmId);
        return scoreRepository.getScoreByFilm(film);
    }
}
