package com.cMovieA.service;

import java.util.List;

import com.cMovieA.entity.Movie;

public interface MovieService {
	
	public List<Movie> getMovies();

	public void saveMovie(Movie theMovie);

	public void deleteMovieById(int theId);

}
