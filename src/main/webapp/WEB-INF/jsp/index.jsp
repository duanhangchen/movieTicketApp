<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
					<c:forEach items="${movies}" var="movie">
						<div class="item">
							<div class="col-xs-4">
								<a href="#1"><img
									src="${movie.url} }"
									class="img-responsive"></a>
								<div class="movie-details">
									<p class="movie-name">
										<strong>${movie.name}</strong>
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
<img
	src="https://images.fandango.com/images/spotlight/fd_50SD_1680x350_homestrip_v3.jpg"
	alt="Fandango 50 Shades Darker Movie Free Gift" class="offer-tout-img">
<h1 class="ui block header">Coming Soon</h1>
<div class="ui six column grid stackable doubling container">

	<div class="column">
		<div class="ui segments">
			<div class="ui segments">
				<div class="blur">
					<b><img
						src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196708/ROCKDOG_1Sht_Payoff_VF.jpg"
						class="ui fluid bordered image"></b>
				</div>
			</div>
			<div class="ui secondary segment center aligned">
				<a>Rock Dog</a>
			</div>
		</div>
	</div>

	<div class="column">
		<div class="ui segments">
			<div class="ui segments">
				<div class="blur">
					<b><img
						src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/183587/The%20Great%20Wall.jpg"
						class="ui fluid bordered image"></b>
				</div>
			</div>
			<div class="ui secondary segment center aligned">
				<a>The Great Wall</a>
			</div>
		</div>
	</div>

	<div class="column">
		<div class="ui segments">
			<div class="ui segments">
				<div class="blur">
					<b><img
						src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/184016/COLLIDE_POSTER_2_24_17.jpg"
						class="ui fluid bordered image"></b>
				</div>
			</div>
			<div class="ui secondary segment center aligned">
				<a>Collide</a>
			</div>
		</div>
	</div>

	<div class="column">
		<div class="ui segments">
			<div class="ui segments">
				<div class="blur">
					<b><img
						src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196901/Logan_48x70ForFandango_sRGB.jpg"
						class="ui fluid bordered image"></b>
				</div>
			</div>
			<div class="ui secondary segment center aligned">
				<a>Logan</a>
			</div>
		</div>
	</div>

	<div class="column">
		<div class="ui segments">
			<div class="ui segments">
				<div class="blur">
					<b><img
						src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196665/Get%20Out.jpg"
						class="ui fluid bordered image"></b>
				</div>
			</div>
			<div class="ui secondary segment center aligned">
				<a>Get Out</a>
			</div>
		</div>
	</div>

	<div class="column">
		<div class="ui segments">
			<div class="ui segments">
				<div class="blur">
					<b><img
						src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/191368/legobatmanmovie-posterart.jpg"
						class="ui fluid bordered image"></b>
				</div>
			</div>
			<div class="ui secondary segment center aligned">
				<a>The Lego Batman Movie</a>
			</div>
		</div>
	</div>


</div>
