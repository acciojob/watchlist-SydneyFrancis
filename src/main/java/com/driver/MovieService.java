package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void addMovie(Movie movie) {
        movieRepository.AddMovieToDB(movie);
    }


    public void addDirector(Director director) {
        movieRepository.AddDirectorToDB(director);
    }

    public void PairMAndD(String movieName, String directorName){
        movieRepository.PairMovieAndDirectorToDB(movieName,directorName);
    }

    public Movie FindMovie(String name){
        return movieRepository.findMovieInDB(name);
    }

    public Director FindDirector(String name){
        return movieRepository.findDirectorInDB(name);
    }

    public List<Movie> getMoviesByDirector(String name){
        return movieRepository.ListofMoviesInDBByDirector(name);
    }

    public List<Movie> findAllMovies(){
        return movieRepository.findAllMoviesInDB();
    }

    public void DeleteMovieByDirectorName(String name){
        movieRepository.DeleteMovieFromDBbyName(name);
    }

    public void DeleteAll(){
        movieRepository.DeleteAllMappedInDB();
    }

}


