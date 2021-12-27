package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
	
	private final MovieRepository movieRepository;
		
	@Autowired
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	public List<Movie>getMovies() {
		return movieRepository.findAll();
	}
	public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Integer id) {
    	movieRepository.deleteById(id);
    }

    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }
	
	public Optional < Movie> findById(Integer id) {
		return movieRepository.findById(id);
		}
	
	
	public List<Movie> findByName(String title) {
		return movieRepository.findByName(title);
	}
	
	//buscar por popular
	public List<Movie> popular() {
		return movieRepository.popular(PageRequest.of(0,3));
	}
	
	//buscar por clasificación de pelicula

	public List<Movie> classif(String classif) {
		return movieRepository.classif(classif);
	}
    
    
}
