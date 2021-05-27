package com.example.demo.Repositories;

import com.example.demo.Aspect.MeasureTime;
import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    @MeasureTime
    public String getMovieDetails(){
        return "movie details";
    }
}
