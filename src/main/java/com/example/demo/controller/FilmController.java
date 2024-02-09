package com.example.demo.controller;

import com.example.demo.Mapper.FilmSummaryMapper;
import com.example.demo.domain.Film;
import com.example.demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin("*")
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

    @GetMapping("filmSummary")
    public List<FilmSummaryMapper> getSummaryFilms() {
        return filmService.getSummaryFilms();
    }

    @DeleteMapping("film/{id}")
    public ResponseEntity deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
