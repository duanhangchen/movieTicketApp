package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cedar.mta.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
	@Query(value="SELECT * FROM movie ORDER BY releaseDate DESC LIMIT 15", nativeQuery = true)
	List<Movie> findFeaturedMovies();

}
 