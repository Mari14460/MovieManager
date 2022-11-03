package ru.netology.MovieManager;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int lastMovieNumber;

    public MovieManager() {
        this.lastMovieNumber = 10;
    }

    public MovieManager(int lastMovieNumber) {
        this.lastMovieNumber = lastMovieNumber;
    }

    public void addMovie(Movie movie) {
        Movie[] temp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            temp[i] = movies[i];
        }
        temp[movies.length] = movie;
        movies = temp;
    }

    public Movie[] findLast() {
        Movie[] all = findAll();

        if (lastMovieNumber > all.length) {

            Movie[] result = new Movie[all.length];

            for (int i = 0; i < all.length; i++) {
                result[i] = all[result.length - 1 - i];
            }
            return result;
        } else {
            Movie[] result = new Movie[lastMovieNumber];

            for (int i = 0; i < lastMovieNumber; i++) {
                result[i] = all[all.length - 1 - i];
            }
            return result;
        }
    }

    public Movie[] findAll() {
        return movies;
    }
}
