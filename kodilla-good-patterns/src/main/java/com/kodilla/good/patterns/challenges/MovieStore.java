package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

class MovieStore {
    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Iron Man");
        ironManTranslations.add("Iron Man");
        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Avengers");
        avengersTranslations.add("Avengers");
        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Lightning");
        flashTranslations.add("Flash");
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();

        String allTitles = movies.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));

        System.out.println(allTitles);
    }
}
