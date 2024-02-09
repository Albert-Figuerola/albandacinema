package com.example.demo.repository;

import com.example.demo.domain.Film;
import com.example.demo.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    @Query("SELECT SUM(s.score) FROM Score s WHERE s.film = :film")
    Integer getScoreByFilm(@Param("film") Film film);

}
