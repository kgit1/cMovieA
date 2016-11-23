package com.cMovieA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cMovieA.DAO.MovieDAO;
import com.cMovieA.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDAO movieDAO;
	
	@Override
	@Transactional
	public List<Movie> getMovies() {
		return movieDAO.getMovies();
	}

	@Override
	@Transactional
	public void saveMovie(Movie theMovie) {
		movieDAO.saveMovie(theMovie);		
	}

	@Override
	@Transactional
	public void deleteMovieById(int theId) {
		movieDAO.deleteMovieById(theId);
		
	}

}
