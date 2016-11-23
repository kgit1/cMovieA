package com.cMovieA.DAO;

import java.util.List;

import com.cMovieA.entity.Movie;

public interface MovieDAO {
	public List<Movie> getMovies();

	public void saveMovie(Movie theMovie);

	public void deleteMovieById(int theId);
}
