package com.example.demo.repository;

import com.example.demo.entity.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Long> {
}
