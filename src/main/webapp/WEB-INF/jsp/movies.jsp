<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link
	href="http://fonts.googleapis.com/css?family=Roboto:100,300,400,700|"
	rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style2.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/plugins.js" />"></script>
<script src="<c:url value="/resources/js/app.js" />"></script>
<link href="<c:url value="/resources/css/blur.css" />" rel="stylesheet">

<div id="site-content">
	<div class="site-header">
		<div class="container move">
			<div class="main-navigation">
				<button class="toggle-menu">
					<i class="fa fa-bars"></i>
				</button>
				<ul class="menu">
					<form role="form" method="POST">
						<div class="form-group">
							<label id="reviewfont" for="exampleSelect">Categories</label>
							<select name= "category" class="form-control" id="exampleSelect">
							 	<option value="default">All Categories</option>
							 	<option value="coming_soon">Coming Soon</option>
							 	<option value="now_playing">Now Playing</option>
							</select>
						
							<label id="reviewfont" for="exampleSelect1">Genres</label>
							 <select name= "genre" class="form-control" id="exampleSelect1">
							 	<c:if test="${empty currentGenre}">
							 	<option value="default" selected="selected">Select a Genre</option>
							 	<option value="default">All Genres</option>
							 	</c:if>
							 	<c:if test="${not empty currentGenre}">
							 	<option value="default" selected="selected">${currentGenre}</option>
							 	<option value="default">All Genres</option>
							 	</c:if>
								<c:forEach items="${genres}" var="genres">
									<option value="${genres.type}">${genres.type}</option>
								</c:forEach>
							</select>
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</ul>
				<div class="mobile-navigation"></div>
			</div>
		</div>
	</div>
	<main class="main-content">
	<div class="container">
		<div class="page">
			<section>
			<c:if test="${not empty currentGenre}">
                           <header>
                           <h2 class="section-title">Movies >> ${currentGenre}</h2>
                           </header>
                        </c:if>
				
				<header>
					<h2 class="section-title">Newest Movies</h2>
				</header>


				<div class="product-list">
					<c:forEach items="${featuredMovies}" var="movie">

						<div class="product">
							<div class="inner-product">
								<div class="figure-image">
									<div class="blur">
										<a href="<spring:url value="/movies/${movie.id}"/>"><img
											src="${movie.url}" alt="Game 1" style="max-height: 250px"></a>
									</div>
								</div>
								<h3 class="product-title">
									<a href="<spring:url value="/movies/${movie.id}"/>">${movie.name}</a>
								</h3>
								<!-- 								<a href="cart.html" class="button">Add to cart</a> <a href="#" -->
								<!-- 									class="button muted">Read Details</a> -->
							</div>
						</div>

					</c:forEach>
				</div>





			</section>


		</div>
	</div>
	</main>
</div>