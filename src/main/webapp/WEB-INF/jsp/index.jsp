<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/carousel.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/carousel.js" />"></script>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/main.js" />"></script>
<link href="<c:url value="/resources/css/blur.css" />" rel="stylesheet">

<h1 class="ui block header">Buy Movie Tickets</h1>
<br>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div class="carousel slide multi-item-carousel" id="theCarousel">
				<div class="carousel-inner">
					<c:forEach items="${featuredMovies}" var="movie">
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

<br>
<br>

<div class="container">
	<br>
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img
					src="/resources/img/hero_ExclusiveFeaturette_TheBelkoExperiment_Video.jpg"
					alt="Chania" width="460" height="345">
			</div>

			<div class="item">
				<img src="/resources/img/hero_Infographic_BestPictureNominees.jpg"
					alt="Chania" width="460" height="345">
			</div>

			<div class="item">
				<img
					src="/resources/img/hero_Interview_KongSkullIsand_JordonVogt.jpg"
					alt="Flower" width="460" height="345">
			</div>

			<div class="item">
				<img src="/resources/img/hero_Junket_GetOut_Video.jpg" alt="Flower"
					width="460" height="345">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
</div>
<br>
<br>
<br>
<center>
	<img
		src="https://images.fandango.com/images/spotlight/fd_50SD_1680x350_homestrip_v3.jpg"
		alt="Fandango 50 Shades Darker Movie Free Gift" class="offer-tout-img">
</center>
<br>
<h1 class="ui block header">Featuring</h1>
<br>
<div class="ui six column grid stackable doubling container">
	<c:forEach items="${featuredMovies}" var="movie">
		<div class="column">
			<div class="ui segments">
				<div class="ui segments">
					<div class="blur">
						<a href="<spring:url value="/movies/${movie.id}"/>"><img src="${movie.url}" class="ui fluid bordered image"></a>
					</div>
				</div>
				<div class="ui secondary segment center aligned">
					<a href="<spring:url value="/movies/${movie.id}"/>">${movie.name}</a>
				</div>
			</div>
		</div>
	</c:forEach>
</div>
