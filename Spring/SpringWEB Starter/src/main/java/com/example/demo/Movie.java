package com.example.demo;

import java.util.StringJoiner;

public class Movie {
    int id;
    String name;
    double rating;

    public Movie() {
    }

    public Movie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Movie.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("rating=" + rating)
                .toString();
    }
}
