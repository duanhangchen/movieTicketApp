<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/actor-overview.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/rating.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/blur.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/theater-detail.css"/>"
	rel="stylesheet">
<script src="<c:url value="/resources/js/rating.js" />"></script>
<script src="<c:url value="/resources/js/theater-detail.js" />"></script>






<div class="col-md-10 col-md-offset-1">
	<div class="carousel slide" data-ride="carousel" data-type="multi"
		data-interval="3000" id="myCarousel">
		<div class="carousel-inner">
			<div class="item active">
				<div class="col-md-2 col-sm-6 col-xs-12">
					<a href="#">
					<c:set var = "time" value = "2017-05-17"/>
						<div class="card">
							<a href="/showing/${theater.id}/${time}">
								<div class="card-block" value="2017-05-17" name="showDay">
									<h4 class="card-title">
										<center>Tuesday</center>
									</h4>
									<p class="card-text">
									<center>May 17</center>
									</p>
									<br>
								</div>
							</a>

						</div>
					</a>
				</div>
			</div>
			<div class="item">
				<div class="col-md-2 col-sm-6 col-xs-12">
				<c:set var = "time" value = "2017-05-18"/>
				
					<a href="#"> <a href="/showing/${theater.id}/${time}">
							<div class="card">
								<div class="card-block" name="showDay">
									<h4 class="card-title">
										<center>Wednesday</center>
									</h4>
									<p class="card-text">
									<center>May 18</center>
									</p>
									<br>
								</div>
							</div>
					</a>
					</a>
				</div>
			</div>
			<div class="item">
				<div class="col-md-2 col-sm-6 col-xs-12">
				<c:set var = "time" value = "2017-05-19"/>
					<a href="href="/showing/${theater.id}/${time}"">
						<div class="card">
							<div class="card-block" name="showDay">
								<h4 class="card-title">
									<center>Thursday</center>
								</h4>
								<p class="card-text">
								<center>May 19</center>
								</p>
								<br>
							</div>
						</div>
					</a>
				</div>
			</div>
			<div class="item">
				<div class="col-md-2 col-sm-6 col-xs-12">
					<a href="/showing/${theater.id}/${time}">
						<div class="card">
							<div class="card-block">
								<h4 class="card-title">
									<center>Friday</center>
								</h4>
								<p class="card-text">
								<center>May 20</center>
								</p>
								<br>
							</div>
						</div>
					</a>
				</div>
			</div>
			<div class="item">
				<div class="col-md-2 col-sm-6 col-xs-12">
					<a href="/showing/${theater.id}/${time}">
						<div class="card">
							<div class="card-block">
								<h4 class="card-title">
									<center>Saturday</center>
								</h4>
								<p class="card-text">
								<center>May 21</center>
								</p>
								<br>
							</div>
						</div>
					</a>
				</div>
			</div>
			<div class="item">
				<div class="col-md-2 col-sm-6 col-xs-12">
					<a href="/showing/${theater.id}/${time}">
						<div class="card">
							<div class="card-block">
								<h4 class="card-title">
									<center>Sunday</center>
								</h4>
								<p class="card-text">
								<center>May 22</center>
								</p>
								<br>
							</div>
						</div>
					</a>
				</div>
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" data-slide="prev"><i
			class="glyphicon glyphicon-chevron-left"></i></a> <a
			class="right carousel-control" href="#myCarousel" data-slide="next"><i
			class="glyphicon glyphicon-chevron-right"></i></a>
	</div>
</div>

<div class="container">
	<div class="page">
		<div class="w3-container">
			<h1>
				<a href="<spring:url value="/theaters/${theater.id}"/>">${theater.name}</a>
				<c:if test="${not empty user}">
			<button id = "favouriteTheatre" name="favouriteTheatre" value="${favouriteTheatre}"
				onClick="toggleValue()" type="submit" class="btn btn-lg ">
				<span id="theatre-like" class="glyphicon glyphicon-heart ${favouriteTheatre}"> </span>
			</button>
			</c:if>
			</h1>
			<h2 style="font-size: 15px">
			${theaterAddress} /
			<a id = "directions" href ="https://www.google.com/maps/dir/${coordinate}/${theaterAddressDirection}" style="font-size: 15px">Get Directions</a>
			</h2>
		</div>
		<br>
		<c:forEach items="${moviesInThisTheater}" var="movies">
			<div class="panel panel-default">
				<div class="panel-body theaters">
					<div class="media">
						<div class="media-left">
							<div class="blur">
								<a href="<spring:url value="/movies/${movies.id}"/>"><img
									src="${movies.url}" alt="Game 1"
									style="max-height: 250px; max-width: 130px"></a>
							</div>
						</div>
						<div class="media-body">
							<h1 class="product-title">
								<a href="<spring:url value="/movies/${movies.id}"/>">${movies.name}</a>
							</h1>
							<c:forEach items="${movies.showings}" var="movie">

								<c:if test="${not empty user}">
									<button class="ui orange button">
										<a id = "showing-button" href="<spring:url value="/theaters/${theater.id}/${movie.showingId}"/>">${movie.startTime}<a>
									</button>
								</c:if>
								<c:if test="${empty user}">
									<button class="ui orange button">
										<a id = "showing-button" href="<spring:url value="/login"/>">${movie.startTime}<a>
									</button>
								</c:if>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>

	</div>
</div>