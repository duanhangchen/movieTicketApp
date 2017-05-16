<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/carousel.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/carousel.js" />"></script>
<link href="<c:url value="/resources/css/actor-overview.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/rating.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/js/rating.js" />"></script>


<div id="exTab1" class="container">

	<span>
		<h1 class="actor-name">${movie.name} Overview
			<c:if test="${not empty user}">
			<button id = "favourite" name="favouriteMovie" value="${favouriteMovie}"
				onClick="toggleValue()" type="submit" class="btn btn-lg ">
				<span id= "movie-like" class="glyphicon glyphicon-heart ${favouriteMovie}"> </span>
			</button>
			</c:if>
		</h1>
	</span>

	<ul class="nav nav-pills">
		<li class="active"><a href="#1a" data-toggle="tab">Overview</a></li>
		<li><a href="#2a" data-toggle="tab">Synopsis</a></li>
		<li><a href="#3a" data-toggle="tab">Reviews</a></li>
	</ul>
	<div class="tab-content clearfix">
		<div class="tab-pane active" id="1a">
			<div class="row actor">
				<div class="col-sm-3 biographyAndPhoto">
					<div class="row photo">
						<div class="col-sm-6 biographyAndPhoto">
							<a> <img class="pop-headshot--photo-img" src="${movie.url}"
								alt="${movie.name}"></a>
						</div>
						<div class="col-sm-6">
							<div class="dob">
								Release Date: ${movie.releaseDate}
								<div class="row lead">
									<c:if test="${empty rating}">
										<div id="stars" class="starrr"></div>
									</c:if>
									<c:if test="${not empty rating}">
										<div id="stars" class="starrr" data-rating='${rating.score}'></div>
									</c:if>
								</div>
							</div>
						</div>
					</div>
					<div class="row bio">
						<div class="col-sm-12"></div>
					</div>
				</div>
				<div class="col-sm-6">
					${movie.trailer}
					<p class="video-description">${movie.plot}</p>
				</div>
			</div>
		</div>

		<div class="tab-pane" id="2a">
			<div class="row actor">
				<div class="col-sm-3 biographyAndPhoto">
					<div class="row photo">
						<div class="col-sm-6 biographyAndPhoto">
							<a> <img class="pop-headshot--photo-img" src="${movie.url}"
								alt="${movie.name}"></a>
						</div>
						<div class="col-sm-6">
							<div class="dob">
								Release Date: ${movie.releaseDate}
								<div class="row lead">
									<div id="stars" class="starrr" data-rating='${movie.rating}'></div>
								</div>
							</div>
						</div>
					</div>
					<div class="row bio">
						<div class="col-sm-12"></div>
					</div>
				</div>
				<div class="col-sm-6">
					<p class="video-description">${movie.plot}</p>
				</div>
			</div>
		</div>
		<div class="tab-pane" id="3a">
			<div class="row actor">
				<div class="col-sm-3 biographyAndPhoto">
					<div class="row photo">
						<div class="col-sm-6 biographyAndPhoto">
							<a> <img class="pop-headshot--photo-img" src="${movie.url}"
								alt="${movie.name}"></a>
						</div>
						<div class="col-sm-6">
							<div class="dob">
								Release Date: ${movie.releaseDate}
								<div class="row lead">
									<div id="stars" class="starrr" data-rating='${movie.rating}'></div>
								</div>
							</div>
						</div>
					</div>
					<div class="row bio">
						<div class="col-sm-12"></div>
					</div>
				</div>
				<div class="col-sm-6">
					<button type="button" class="btn btn-primary" data-toggle="modal"
						data-target="#reviewModal">Write Review</button>

					<br> <br>
					<c:forEach items="${reviews}" var="review">
						<div class="well">
							<div class="row-fluid">
								<c:if test="${not empty user}">
								<button id = "favouriteReview" name="${review.id}" value="${review.color}"
									onClick="toggleValue()" type="submit" class="btn btn-lg ">								
									<span id="${review.id}" class="glyphicon glyphicon-heart ${review.color} review"> </span>
									<span id= "reviewCount">${review.likeCount}</span>
									<input id= "reviewId" type="hidden" value= "${review.id}">
								</button>
								</c:if>
								<div id="reviewfont"><strong>${review.review}</strong></div>
								<div class="span2 muted mycenter" style="text-align: right;">
									<a>${review.user.firstName}</a>
									<c:if test="${user.role=='admin'}">
									<p style="color:red;"><a href="/movies/${movie.id}/delete/${review.id}">DELETE</a></p>
									</c:if>
								</div>
							</div>
						</div>
					</c:forEach>

					<div class="modal fade" id="reviewModal" tabindex="-1"
						role="dialog" aria-labelledby="exampleModalLabel"
						aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<form role="form" method="POST">
										<div>
											<h5 id="reviewfont">${movie.name}</h5>
										</div>
										<div class="form-group">
											<label for="message-text" id="reviewfont"
												class="form-control-label">Review:</label>
											<textarea type="text" class="form-control" id="reviewText" 
												name="reviewText">${review.review}</textarea>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-primary"
												data-dismiss="modal">Close</button>
											<button type="submit" class="btn btn-primary">Submit
												Review</button>
										</div>
									</form>
								</div>

							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<div class="container actor">
	<div class="row">
		<div class="col-md-12">
			<div class="carousel slide multi-item-carousel" id="theCarousel">
				<div class="carousel-inner">
					<c:forEach items="${cast}" var="actor">
						<div class="item">
							<div class="col-xs-4">
								<a href="#1"><img src="${actor.url}"
									class="img-responsive"></a>
								<div class="movie-details">
									<p class="movie-name">
										<a href="<spring:url value="/actor/${actor.actorId}"/>">${actor.name}</a>
									</p>
									<p class="text-muted release-date">
										<em>${actor.doB}</em>
									</p>
								</div>
							</div>
						</div>
					</c:forEach>

					<!--  Example item end -->
				</div>
				<a class="left carousel-control" href="#theCarousel"
					data-slide="prev"><i class="glyphicon glyphicon-chevron-left"></i></a>
				<a class="right carousel-control" href="#theCarousel"
					data-slide="next"><i class="glyphicon glyphicon-chevron-right"></i></a>
			</div>
		</div>
	</div>
</div>
</div>