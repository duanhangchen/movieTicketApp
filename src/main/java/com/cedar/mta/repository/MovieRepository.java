package com.cedar.mta.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Query(value="select * from movie where movieName like %:keyword% order by releaseDate Desc limit 15",nativeQuery=true)
	List<Movie> searchMovie(@Param("keyword")String keyword);
	
	@Transactional
	@Modifying
	@Query(value="update movie set movieName = :mName, boxOffice = :bOffice, rated = :eRated, releaseDate = :releaseD, runtime = :rTime, moviePoster = :mPoster, plot = :pt where movieId = :id", nativeQuery=true)
	void updateMovie(@Param("mName")String movieName, @Param("bOffice")double boxOffice, @Param("eRated")String rated, @Param("releaseD")Date releaseDate, @Param("rTime")String runtime, @Param("mPoster")String moviePoster, @Param("pt")String plot, @Param("id")Integer movieId);
	
	@Transactional
	@Modifying
	@Query(value="insert into movie (movieId, boxOffice, movieName, plot, rated, releaseDate, runtime, moviePoster) values(:movieId, :boxOffice, :movieName, :plot, :rated, :releaseDate, :runtime, :moviePoster)", nativeQuery=true)
	void insertMovie(@Param("movieId")Integer movieId, @Param("boxOffice")String boxOffice, @Param("movieName")String movieName, @Param("plot")String plot, @Param("rated")String rated, @Param("releaseDate")String releaseDate, @Param("runtime")String runtime, @Param("moviePoster")String moviePoster);
}
 