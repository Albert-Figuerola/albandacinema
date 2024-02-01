package com.example.demo.service.impl;

import com.example.demo.domain.Film;
import com.example.demo.repository.FilmRepository;
import com.example.demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public void addFilm(Film film) {
        filmRepository.save(film);
    }

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }

}
