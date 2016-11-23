package com.cMovieA.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cMovieA.entity.Movie;
import com.cMovieA.service.MovieService;

@Controller
@RequestMapping("/movies")
public class HomeController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/list")
	public String listMovies(Model theModel){
		
		List<Movie> theMovies = movieService.getMovies();
		
		theModel.addAttribute("movies", theMovies);
		
		return "list-movies";
	}
	
	@GetMapping("/showFormMovies")
	public String showFormMovies(Model theModel){
		Movie theMovie = new Movie();
		theModel.addAttribute("movie", theMovie);
		return "form-movies";
	}
	
	@PostMapping("/saveMovie")
	public String saveMovie(
			@ModelAttribute("movie") Movie theMovie){
		movieService.saveMovie(theMovie);
		return "redirect:/movies/list";
	}
	
	@GetMapping("/deleteMovie")
	public String deleteMovieById(
			@RequestParam("id") int theId){
		movieService.deleteMovieById(theId);
		return "redirect:/movies/list";
	}

}
