package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private int score;

    public Score() {
    }

    public Score(Long id, User user, Film film, int score) {
        this.id = id;
        this.user = user;
        this.film = film;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setUserAndFilm(Long userId, Long filmId) {
        this.user = new User();
        this.user.setId(userId);

        this.film = new Film();
        this.film.setId(filmId);
    }
}
