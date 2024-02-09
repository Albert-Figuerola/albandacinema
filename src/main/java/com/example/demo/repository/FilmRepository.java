package com.example.demo.repository;

import com.example.demo.Mapper.FilmSummaryMapper;
import com.example.demo.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

    @Query(value = """
            SELECT f.name, f.description, f.url, f.duration, s.score
            FROM film f
            JOIN score s ON (f.id = s.film_id)
            AND f.active = true
    """, nativeQuery = true)
    List<FilmSummaryMapper> getSummaryFilms();
}
