package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

import java.util.List;
import java.util.Optional;

@RequestMapping("apiMovies/v1")
@RestController
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }

    @PostMapping("/addMovie")
    public Movie createMovie(@RequestBody Movie movie){
        return movieService.createMovie(movie);
    }

    @DeleteMapping("/deleteMovie/{id}")
    public void deleteMovie(@PathVariable Integer id){
    	movieService.deleteMovie(id);
    }

    @PutMapping("/updateMovie")
    public Movie updateMovie(@RequestBody Movie movie){
        return movieService.updateMovie(movie);
    }
    @GetMapping("/findId/{id}")
	public Optional < Movie> findById(@PathVariable Integer id) {
		return movieService.findById(id);
	}
    @GetMapping("/findName/{title}")
	public List <Movie> findByName(@PathVariable String title ) {
		return movieService.findByName(title);
	}
    @GetMapping("/popular/{title}")
	public List <Movie> popular( ) {
		return movieService.popular();
    }
    @GetMapping("/classif/{classified}")
	public List <Movie> classif( @PathVariable String classif) {
		return movieService.classif(classif);
	}
}