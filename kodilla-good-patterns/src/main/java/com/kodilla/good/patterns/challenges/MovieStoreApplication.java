package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreApplication {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> mapOfMovies = movieStore.getMovies();

        String movies = mapOfMovies.entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.joining(" ! ", "These is the list of movies: ", "."));
        System.out.println(movies);
    }
}
