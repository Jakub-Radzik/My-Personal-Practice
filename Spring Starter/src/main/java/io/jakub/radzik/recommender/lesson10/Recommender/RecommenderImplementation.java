package io.jakub.radzik.recommender.lesson10.Recommender;

import io.jakub.radzik.recommender.lesson10.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("contentBasedFilter") Filter filter) {
        this.filter = filter;
    }


    @Value("${recommender.implementation.favoriteMovie: Finding dory}")
    String favoriteMovie ;

    public String returnFavoriteMovie (){
        return favoriteMovie;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter is: "+ filter +"\n");

        String[] results = filter.getRecommendations("Finding diory");
        return results;
    }

    public Filter getFilter() {
        return filter;
    }

//    @PostConstruct
//    public void postConstruct(){
//        logger.info("postConstruct in ReccomenderImplementation");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("preDestroy in RecommenderImplement");
//    }
}
