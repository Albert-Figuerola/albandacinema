package com.example.demo.service;

import com.example.demo.entity.Film;
import com.example.demo.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FilmService {
    void addFilm(Film film);

    List<Film> getAllFilms();

    void deleteById(Long id);

}

