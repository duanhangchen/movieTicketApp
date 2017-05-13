package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
	@Query(value="SELECT * FROM movie ORDER BY releaseDate DESC LIMIT 50", nativeQuery = true)
	List<Movie> findFeaturedMovies();
	
	@Query(value="SELECT * FROM movie  where movieId in(select movies_movieId from moviegenre where genres_genreId in(SELECT genreId from genre where genreType= :genre)) ORDER BY releaseDate DESC LIMIT 50",nativeQuery=true)
	List<Movie> findMoviesByGenre(@Param("genre") String movieGenre);
	
	@Query(value="select * from movie where movieId in(select movies_movieId from castin where actors_actorId = :actor_id)", nativeQuery = true)
	List<Movie> findMoviesByActorId(@Param("actor_id") Integer actorid);
	
	@Query(value="select * from movie where releaseDate > :date", nativeQuery=true)
	List<Movie> findComingSoon(@Param("date") java.sql.Date date);
	
	@Query(value="select * from movie where releaseDate < :date order by releaseDate desc limit 50",nativeQuery=true)
	List<Movie> findNowPlaying(@Param("date") java.sql.Date date);
	
	@Query(value="SELECT * FROM movie where movieId in(select movies_movieId from moviegenre where genres_genreId in(SELECT genreId from genre where genreType= :genre)) and releaseDate > :date order by releaseDate desc",nativeQuery=true)
	List<Movie> findComingSoonAndGenre(@Param("date")java.sql.Date date,@Param("genre")String genre);
	
	@Query(value="SELECT * FROM movie  where movieId in(select movies_movieId from moviegenre where genres_genreId in(SELECT genreId from genre where genreType= :genre)) and releaseDate < :date order by releaseDate desc limit 50",nativeQuery=true)
	List<Movie> findNowPlayingAndGenre(@Param("date")java.sql.Date date,@Param("genre")String genre);
	
	@Query(value="select * from movie where movieId in(select movieId from showing where theaterid= :theater_id)",nativeQuery=true)
	List<Movie> findMovieByTheater(@Param("theater_id")Integer theater_id);

}
 