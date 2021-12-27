package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	
		@Query ("SELECT m FROM Movie m WHERE m.name LIKE %:name%")
		List<Movie> findByName(@Param("title") String title);

		@Query ("SELECT m FROM  Movie m ORDER BY m.rate DESC")
		List<Movie> popular(PageRequest pageRequest);

		@Query ("SELECT m FROM Movie m WHERE m.classified LIKE %:classified%")
		List<Movie> classif(@Param("classified") String classified);
	
	
}
