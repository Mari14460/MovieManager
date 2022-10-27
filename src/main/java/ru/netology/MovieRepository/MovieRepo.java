package ru.netology.MovieRepository;

import ru.netology.MovieManager.Movie;

public class MovieRepo {
    private Movie[] movies = new Movie[0];

    public void addMovie(Movie movie) {
        Movie[] temp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            temp[i] = movies[i];
        }
        temp[movies.length] = movie;
        movies = temp;
    }

    public Movie[] findAll() {
        return movies;
    }
}
