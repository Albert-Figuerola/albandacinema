package com.example.demo.controller;

import com.example.demo.entity.Film;
import com.example.demo.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api")
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    @PostMapping(path = "/film")
    public ResponseEntity createFilm(@RequestBody Film film) {
        filmRepository.save(film);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping(path = "/film")
    public @ResponseBody Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

}
