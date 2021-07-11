package com.example.demo.Services;

import com.example.demo.Aspect.MeasureTime;
import com.example.demo.Repositories.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {

    @Autowired
    private Movie movie;

    @MeasureTime
    public String contentBasedFiltering(){
        String movieDetails = movie.getMovieDetails();
        return movieDetails;
    }
}
