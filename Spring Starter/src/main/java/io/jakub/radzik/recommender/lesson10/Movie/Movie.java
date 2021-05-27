package io.jakub.radzik.recommender.lesson10.Movie;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        super();
        instances++;
        System.out.println("Movie created");
    }

    public static int getInstances() {
        return instances;
    }

//    @PostConstruct
//    public void postConstruct(){
//        logger.info("postConstruct in Movie");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("preDestroy in Movie");
//    }
}
