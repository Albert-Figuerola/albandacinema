package com.example.demo.controller;

import com.example.demo.DTO.ScoreDTO;
import com.example.demo.domain.Film;
import com.example.demo.domain.Score;
import com.example.demo.domain.User;
import com.example.demo.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping("score")
    public ResponseEntity addScore(
            @RequestBody ScoreDTO scoreDTO
    ) {
        scoreService.addScore(scoreDTO);
        return  ResponseEntity.ok("Score added.");
    }


}
