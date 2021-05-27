package io.jakub.radzik.recommender.lesson10;

import io.jakub.radzik.recommender.lesson10.Recommender.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

//        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);

        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class);
//        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

//        System.out.println("BEANS LOADED");
//
//        for (String e: appContext.getBeanDefinitionNames()) {
//            System.out.println(e);
//        }

        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

//        ContentBasedFilter filter = appContext.getBean("contentBasedFilter", ContentBasedFilter.class);

//        System.out.println(recommender);
//        System.out.println(recommender.recommendMovies("doryu"));

        System.out.println(recommender.returnFavoriteMovie());
    }
}
