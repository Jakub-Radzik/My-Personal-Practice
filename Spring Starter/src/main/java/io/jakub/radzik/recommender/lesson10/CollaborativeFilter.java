package io.jakub.radzik.recommender.lesson10;

import io.jakub.radzik.recommender.lesson10.Filter;
import org.springframework.stereotype.Service;

@Service
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"film1", "film2"};
    }
}
