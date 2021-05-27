package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationsController {
    //return all movies
    //translate URI into method

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return Arrays.asList(
                new Movie(1, "Ice Age", 7.5),
                new Movie(2, "Happy Feet", 6.4),
                new Movie(3, "Shark Tales", 6.0) );
    }

    @GetMapping("/movie")
    public Movie getMovie(){
        return new Movie(1, "Icdded Age", 7.5);
    }

}
