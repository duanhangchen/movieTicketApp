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
		<h1 class="actor-name">${actor.name} Overview
		</h1>
	</span>



	<ul class="nav nav-pills">
		<li class="active"><a href="#1a" data-toggle="tab">Overview</a></li>
		<li><a href="#2a" data-toggle="tab">Biography</a></li>
		<li><a href="#3a" data-toggle="tab">Reviews</a></li>
	</ul>
	<div class="tab-content clearfix">
		<div class="tab-pane active" id="1a">
			<div class="row actor">
				<div class="col-sm-3 biographyAndPhoto">
					<div class="row photo">
						<div class="col-sm-6 biographyAndPhoto">
							<a> <img class="pop-headshot--photo-img" src="${actor.url}"
								alt="${actor.name}"></a>
						</div>
						<div class="col-sm-6">
							<div class="dob">
								DOB: ${actor.doB}
							</div>
						</div>
					</div>
					<div class="row bio">
						<div class="col-sm-12"></div>
					</div>
				</div>
				<div class="col-sm-6">
					${moviesbyactor[0].trailer}
					<p class="video-description">${moviesbyactor[0].plot}</p> 
				</div>
			</div>
		</div>

		<div class="tab-pane" id="2a">
			<div class="row actor">
				<div class="col-sm-3 biographyAndPhoto">
					<div class="row photo">
						<div class="col-sm-6 biographyAndPhoto">
							<a> <img class="pop-headshot--photo-img" src="${actor.url}"
								alt="${actor.name}"></a>
						</div>
						<div class="col-sm-6">
							<div class="dob">
								DOB: ${actor.doB}
							</div>
						</div>
					</div>
					<div class="row bio">
						<div class="col-sm-12"></div>
					</div>
				</div>
				<div class="col-sm-6">
					<p class="video-description">${actor.biography}</p>
				</div>
			</div>
		</div>
		<div class="tab-pane" id="3a">
			<div class="row actor">
				<div class="col-sm-3 biographyAndPhoto">
					<div class="row photo">
						<div class="col-sm-6 biographyAndPhoto">
							<%-- <a> <img class="pop-headshot--photo-img" src="${movie.url}"
								alt="${movie.name}"></a> --%>
						</div>
						<div class="col-sm-6">
							<div class="dob">
								DOB: ${actor.doB}
							</div>
						</div>
					</div>
					<div class="row bio">
						<div class="col-sm-12"></div>
					</div>
				</div>
				<div class="col-sm-6">
					<p class="video-description">Reviews</p>
				</div>
			</div>
		</div>
	</div>
	<div class="container actor">
	<div class="row">
		<div class="col-md-12">
			<div class="carousel slide multi-item-carousel" id="theCarousel">
				<div class="carousel-inner">
					<c:forEach items="${moviesbyactor}" var="movie">
						<div class="item">
							<div class="col-xs-4">
								<a href="#1"><img src="${movie.url}"
									class="img-responsive"></a>
								<div class="movie-details">
									<p class="movie-name">
										<a href="<spring:url value="/movies/${movie.id}"/>">${movie.name}</a>
									</p>
									<p class="text-muted release-date">
										<em>${movie.releaseDate}</em>
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