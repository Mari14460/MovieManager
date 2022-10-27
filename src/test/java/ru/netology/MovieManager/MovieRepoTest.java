package ru.netology.MovieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.MovieRepository.MovieRepo;

public class MovieRepoTest {
    MovieRepo movieRepository = new MovieRepo();
    Movie movie = new Movie("Terminator", "action");
    Movie movie1 = new Movie("Man In Black", "comedy");
    Movie movie2 = new Movie("5th Element", "fiction");

    @BeforeEach
    public void setup () {
        movieRepository.addMovie(movie);
        movieRepository.addMovie(movie1);
        movieRepository.addMovie(movie2);
    }

    @Test
    void shouldReturnAll() {
        Movie[] expected = {movie, movie1, movie2};
        Movie[] actual = movieRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addOneMovie() {
        Movie movie3 = new Movie("King King", "thriller");
        movieRepository.addMovie(movie3);

        Movie[] expected = {movie, movie1, movie2, movie3};
        Movie[] actual = movieRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
