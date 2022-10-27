package ru.netology.MovieManager;

import ru.netology.MovieRepository.MovieRepo;

public class MovieManager {
    MovieRepo movieRepo = new MovieRepo();
    private int lastMovieNumber;

    public MovieManager() {
        this.lastMovieNumber = 10;
    }

    public MovieManager(int lastMovieNumber) {
        this.lastMovieNumber = lastMovieNumber;
    }

    public Movie[] findLast(){
        Movie[] all = movieRepo.findAll();

        if (lastMovieNumber > all.length){

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
        return movieRepo.findAll();
    }

    public void addMovie (Movie movie){
        movieRepo.addMovie(movie);
    }
}
