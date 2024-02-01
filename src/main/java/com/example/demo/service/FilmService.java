package com.example.demo.service;

import com.example.demo.domain.Film;

import java.util.List;

public interface FilmService {
    void addFilm(Film film);

    List<Film> getAllFilms();

    void deleteById(Long id);

}

