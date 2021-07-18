package com.example.demo.Repository;

import com.example.demo.Model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Course save(Course course){
        entityManager.persist(course);;
        return course;
    }

}
