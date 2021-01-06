package com.lesson11.lesson11.controller;

import com.lesson11.lesson11.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    {
        movies.add(new Movie(1, "Assassin", 158));
        movies.add(new Movie(2, "Harry Potter", 142));
        movies.add(new Movie(3, "Uno", 224));
    }

    @GetMapping(value = "/movies")
    public List<Movie> getAllMovies() {
        return movies;
    }

    @PostMapping(value = "/movies")
    public Movie createMovie(@RequestBody Movie movie){
        movies.add(movie);
        return movie;
    }

}
