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


<div id="site-content">
	<div class="site-header">
		<div class="container">
			<div class="main-navigation">
				<button class="toggle-menu">
					<i class="fa fa-bars"></i>
				</button>
				<ul class="menu">
					<li class="menu-item home current-menu-item"></li>
					<li class="menu-item"><a>Action</a></li>
					<li class="menu-item"><a>Drama</a></li>
					<li class="menu-item"><a>Comedy</a></li>
					<li class="menu-item"><a>Kids</a></li>
					<li class="menu-item"><a>Horror</a></li>
					<li class="menu-item"><a>Romance</a></li>
					<li class="menu-item"><a>Sci-Fi</a></li>
					<li class="menu-item"><a>Animated</a></li>
				</ul>
				<div class="mobile-navigation"></div>
			</div>
		</div>
	</div>
	<main class="main-content">
	<div class="container">
		<div class="page">
			<section>
				<header>
					<h2 class="section-title">New Products</h2>
					<a href="#" class="all">Show All</a>
				</header>


				<div class="product-list">
					<c:forEach items="${movies}" var="movie">

						<div class="product">
							<div class="inner-product">
								<div class="figure-image">
									<a href="single.html"><img src="${movie.url}" alt="Game 1"></a>
								</div>
								<h3 class="product-title">
									<a href="<spring:url value="/movies/${movie.id}"/>">${movie.name}</a>
								</h3>
								<a href="cart.html" class="button">Add to cart</a> <a href="#"
									class="button muted">Read Details</a>
							</div>
						</div>

					</c:forEach>
				</div>





			</section>


		</div>
	</div>
	</main>
</div>