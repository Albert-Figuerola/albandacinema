package com.example.demo.controller;

import com.example.demo.entity.Film;
import com.example.demo.repository.FilmRepository;
import com.example.demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping("film")
    public ResponseEntity createFilm(
            @RequestBody Film film
    ) {
        filmService.addFilm(film);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("film")
    public @ResponseBody Iterable<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

    @DeleteMapping("film/{id}")
    public ResponseEntity deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
