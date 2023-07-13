package com.cinemaregestrationbackend.cinemaregestrationbackend.controller;

import com.cinemaregestrationbackend.cinemaregestrationbackend.entity.Movie;
import com.cinemaregestrationbackend.cinemaregestrationbackend.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/movie")
public class MovieController {
    @Autowired
    private MovieRepo movieRepo;
    @GetMapping("/movies")
    List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }
}
