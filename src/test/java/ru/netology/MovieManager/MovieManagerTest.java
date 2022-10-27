package ru.netology.MovieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    void addOneMovie() {
        MovieManager movieManager = new MovieManager();

        Movie movie = new Movie("Terminator", "action");
        Movie movie1 = new Movie("Man In Black", "comedy");
        Movie movie2 = new Movie("5th Element", "fiction");
        Movie movie3 = new Movie("King King", "thriller");

        movieManager.addMovie(movie);
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);

        Movie[] expected = {movie, movie1, movie2, movie3};
        Movie[] actual = movieManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnLessThanTen() {
        MovieManager movieManager = new MovieManager();

        Movie movie = new Movie("Terminator", "action");
        Movie movie1 = new Movie("Man In Black", "comedy");
        Movie movie2 = new Movie("5th Element", "fiction");

        movieManager.addMovie(movie);
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);

        Movie[] expected = {movie2, movie1, movie};
        Movie[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnLastOne() {
        MovieManager movieManager = new MovieManager(1);

        Movie movie = new Movie("Terminator", "action");
        Movie movie1 = new Movie("Man In Black", "comedy");
        Movie movie2 = new Movie("5th Element", "fiction");

        movieManager.addMovie(movie);
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);

        Movie[] expected = {movie2};

        Movie[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnLastTwo() {
        MovieManager movieManager = new MovieManager(2);

        Movie movie = new Movie("Terminator", "action");
        Movie movie1 = new Movie("Man In Black", "comedy");
        Movie movie2 = new Movie("5th Element", "fiction");

        movieManager.addMovie(movie);
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);

        Movie[] expected = new Movie[2];
        expected[0] = movie2;
        expected[1] = movie1;

        Movie[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
