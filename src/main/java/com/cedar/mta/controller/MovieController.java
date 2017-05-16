package com.cedar.mta.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;


import javax.servlet.http.HttpSession;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import com.cedar.mta.entity.Actor;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.MovieAlert;
import com.cedar.mta.entity.NewsLetter;
import com.cedar.mta.entity.User;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Rating;
import com.cedar.mta.entity.Review;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.MovieAlertRepository;
import com.cedar.mta.repository.RatingRepository;

import com.cedar.mta.service.ActorService;
import com.cedar.mta.service.GenreService;
import com.cedar.mta.repository.ReviewRepository;
import com.cedar.mta.repository.UserRepository;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.RatingService;
import com.cedar.mta.service.ReviewService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ActorService actorService;
	
	@Autowired
	private RatingService ratingService;
	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private GenreService genreService;
	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private MovieAlertRepository movieAlertRepository;
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/movies")
	public String movies(Model model){
		model.addAttribute("featuredMovies",movieService.findFeaturedMovies());
		model.addAttribute("genres", genreService.findGenres());
		return "movies";
	}
	
	@RequestMapping(value="/movies", method=RequestMethod.POST)
	public String filter(Model model,@RequestParam String category,@RequestParam String genre){
		System.out.println("test "+genre+category);
		java.util.Date date = new java.util.Date();
		java.sql.Date todayDate = new java.sql.Date(date.getTime());
		if(genre.equals("default")&&category.equals("default")){
			model.addAttribute("featuredMovies",movieService.findFeaturedMovies());
			model.addAttribute("currentGenre",null);
		}
		else if(category.equals("coming_soon")&&genre.equals("default")){
			model.addAttribute("featuredMovies",movieService.findComingSoon(todayDate));
		}
		else if(category.equals("now_playing")&&genre.equals("default")){
			model.addAttribute("featuredMovies",movieService.findNowPlaying(todayDate));
		}
		else if(category.equals("coming_soon")){
			model.addAttribute("featuredMovies",movieService.findComingSoonAndGenre(todayDate, genre));
		}
		else if(category.equals("now_playing")){
			model.addAttribute("featuredMovies", movieService.findNowPlayingAndGenre(todayDate, genre));
		}
		else{
			model.addAttribute("featuredMovies",movieService.findMoviesByGenre(genre));
			model.addAttribute("currentGenre",genre);
		}
		model.addAttribute("genres", genreService.findGenres());
		return "movies";
	}
	
	
	@RequestMapping("/movies/{id}")
	public String detail(Model model,@PathVariable int id,HttpSession session){
		User user=(User) session.getAttribute("user");
		Movie movie=movieService.findById(id);
		if(user!=null){
			Review personalReview=reviewService.findReview(movie.getId(),user.getAccountId());
			Rating test=ratingService.findRatingScore(movie.getId(),user.getAccountId());
			if(test!=null){
				model.addAttribute("rating",test);
			}
			model.addAttribute("review",personalReview);
			
			userRepository.findUserFavourite(id,user.getAccountId());
			
			Integer isFavourite = userRepository.findUserFavourite(id,user.getAccountId());
			if(isFavourite == null){
				model.addAttribute("favouriteMovie", "white");
			}
			else {
				model.addAttribute("favouriteMovie", "red");
			}
			List<Integer> ratedReviews = reviewRepository.findRatedReview(user.getAccountId(), id);
			List<Review> dam=reviewService.findReviews(id);
			for(int j=0;j<ratedReviews.size();j++){
				//movies.get(i).addShowing(temp.get(j));
				for(int i=0;i<dam.size();i++){
					if(dam.get(i).getId()==ratedReviews.get(j)){
						dam.get(i).setColor("red");
					}
				}
			}
			
			model.addAttribute("reviews", dam);
			
			MovieAlert alert = movieAlertRepository.findMoviesAlert(id,user.getAccountId());
			if (alert != null) {
				model.addAttribute("subscribed", true);
			} else {
				System.out.println("Hello Im in newletter");
				model.addAttribute("subscribed", false);
			}
		}
		model.addAttribute("movie",movieService.findById(id));
		if(user==null){
			model.addAttribute("reviews",reviewService.findReviews(id));
		}
		List<Actor> actors=actorService.findActor(id);
		model.addAttribute("cast",actors);
		return "movie-detail";
	}
	
	@RequestMapping(value="/movies/{id}", method=RequestMethod.POST)
	public String handleReview(Model model,@PathVariable int id,HttpSession session,@RequestParam String reviewText){
		User user=(User) session.getAttribute("user");
		Movie movie=movieService.findById(id);	
		if(user!=null){
			Review personalReview=reviewService.findReview(movie.getId(),user.getAccountId());
			Rating test=ratingService.findRatingScore(movie.getId(),user.getAccountId());
			if(test!=null){
				model.addAttribute("rating",test);
			}
			if(personalReview==null){
				Review review=new Review();
				review.setMovie(movie);
				review.setUser(user);
				review.setReview(reviewText);
				reviewRepository.save(review);
				model.addAttribute("review",review);
			}
			else{
				reviewService.changeReview(reviewText,movie.getId(),user.getAccountId());
				Review newReview=reviewService.findReview(movie.getId(),user.getAccountId());
				model.addAttribute("review",newReview);
			}
		}
		else{
			return "redirect:/login";
		}
		model.addAttribute("movie",movieService.findById(id));
		List<Actor> actors = actorService.findActor(id);
		System.out.println("Actors"+ actors.toString());
		session.setAttribute("cast",actorService.findActor(id));
		model.addAttribute("reviews",reviewService.findReviews(id));
		return "movie-detail";
	}
	
	

	@RequestMapping(value="/movies/rating/{id}/{score}",method=RequestMethod.POST)
	public @ResponseBody String ratings(Model model,HttpSession session,@PathVariable int id,@PathVariable int score){
		User user=(User) session.getAttribute("user");
		if(user!=null){
			Rating test=ratingService.findRatingScore(id,user.getAccountId());
			if(test==null){
				Rating rating=new Rating();
				Movie movie=movieService.findById(id);
				rating.setUser(user);
				rating.setMovie(movie);
				rating.setScore(score);
				ratingRepository.save(rating);
				return "success";
			}
			else{
				ratingService.updateRatingScore(id,user.getAccountId(),score);
				return "success";
			}
		}
		else{
			return "FAIL";
		}
	}
	
	@RequestMapping(value="/movies/{id}/toggleFavourite",method=RequestMethod.POST)
	public @ResponseBody String toggleFavourite(Model model,HttpSession session,@PathVariable int id,@RequestParam String value){
		User user=(User) session.getAttribute("user");
		if(user!=null){
			if(value.equals("red")){
				userRepository.addMovieToUser(user.getAccountId(), id);
			}
			else if(value.equals("white")){
				userRepository.deleteMovieFromUser(user.getAccountId(), id);
			}
		}
		return "success";
	}
	
	@RequestMapping(value="/review/{id}/toggleFavourite",method=RequestMethod.POST)
	public @ResponseBody String toggleFavouriteReview(Model model,HttpSession session,@PathVariable int id,@RequestParam String value,@RequestParam int reviewId){
		
		User user=(User) session.getAttribute("user");
		if(user!=null){
			if(value.equals("red")){
				userRepository.addReviewLike(user.getAccountId(), reviewId);
				reviewRepository.incReviewCount(reviewId);
			}
			else if(value.equals("white")){
				userRepository.deleteReviewLike(user.getAccountId(), reviewId);
				reviewRepository.decReviewCount(reviewId);
			}
		}
		return "success";
	}
	

	
@RequestMapping(value = "/movieAlert/{movieId}", method = RequestMethod.POST)
	public @ResponseBody String toggleNewsLetter(Model model, HttpSession session, @RequestParam Boolean value,@PathVariable int movieId) {

		User user = (User) session.getAttribute("user");
		// model.addAttribute("userreviews",reviewService.findPersonalReview(user.getAccountId()));

		if (value) {
			
			System.out.println("Movie ALert");
			MovieAlert alert = new MovieAlert();

			alert.setUserId(user.getAccountId());
			alert.setEmail(user.getEmail());
			alert.setMovieId(movieId);
			movieAlertRepository.save(alert);
		} else {
			movieAlertRepository.deleteUserFromMovieAlert(user.getAccountId(),movieId);
		}
		return "Success";
	}

	
	@RequestMapping(value="/movies/{movieid}/delete/{reviewid}",method=RequestMethod.GET)
	public String deleteReview(Model model,HttpSession session,@PathVariable("reviewid") int reviewId,@PathVariable("movieid") int movieid){
		//User user=(User) session.getAttribute("user");
	
		reviewService.deleteReview1();
		reviewService.deleteReview2(reviewId);
		reviewService.deleteReview3(reviewId);
		reviewService.deleteReview4();
	
		return "redirect:/movies/"+ movieid;
	}
	@RequestMapping(value="/movies/{id}/edit-movie",method=RequestMethod.POST)
	public String updateMovie(Model model, HttpSession session, @PathVariable int id, @RequestParam String editMovieName, @RequestParam double editBoxOffice, 
			@RequestParam String editRated, @RequestParam Date editReleaseDate, @RequestParam String editRunTime, @RequestParam String editMoviePoster,
			@RequestParam String editPlot){
		System.out.println(editMovieName + editBoxOffice + editRated + editReleaseDate + editRunTime + editMoviePoster + editPlot + id);
		movieService.updateMovie(editMovieName, editBoxOffice, editRated, editReleaseDate, editRunTime, editMoviePoster, editPlot, id);
		
		return "redirect:/movies/" + id;
	}
}
