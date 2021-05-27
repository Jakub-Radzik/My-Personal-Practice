package io.jakub.radzik.recommender.lesson10;

import io.jakub.radzik.recommender.lesson10.Filter;
import io.jakub.radzik.recommender.lesson10.Movie.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ContentBasedFilter implements Filter {
    private static int instances = 0;
    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        super();
        instances++;
    }

    public static int getInstances() {
        return instances;
    }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy feeet", "Ice age", "Shark tale"};
    }

//    @PostConstruct
//    public void postConstruct(){
//        logger.info("postConstruct in ContentBasedFilter");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("preDestroy in ContentBasedFilter");
//    }
}
