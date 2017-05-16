<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 -->
<html>
<head>
<link href="<c:url value="/resources/css/footer.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/navbar.css" />"
	rel="stylesheet">
<%-- <script src="<c:url value="/resources/js/jquery-3.2.1.min.js" />"></script> --%>
<script src="<c:url value="/resources/js/jquery-3.2.1.min.js" />"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/semantic/dist/semantic.min.css" />"
	rel="stylesheet">
<linl rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/semantic-ui/0.12.0/css/semantic.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<c:url value="/resources/js/validator.min.js" />"></script>
<script src="<c:url value="/resources/js/logout.js" />"></script>

<script src="<c:url value="/resources/js/validator.min.js" />"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>
</head>

<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<a class="navbar-brand" href='<spring:url value="/" />'><img
					src="/resources/img/newLogo.png" alt="Team Cedar"></a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">

				<form class="navbar-form navbar-left" role="search" method="POST" action="/searchResult">
					<div class="form-group">
						<a class="team-name" href="/"> TEAM CEDAR</a> 
						<input type="text"
							class="form-control search-bar" placeholder="Search" name="search">
						<button type="submit" class="btn btn-primary">
							<span class="glyphicon glyphicon-search"></span>
						</button>

					</div>
				</form>
				<ul class="nav navbar-nav">

				</ul>
				<ul class="nav navbar-nav navbar-right">

					<li class="dropdown"><a href='<spring:url value="/movies" />'
						class="dropdown">MOVIES<b class="caret"></b></a>
						<ul class="dropdown-menu multi-column columns-4">
							<div class="row">
								<div class="col-sm-3">
									<ul class="multi-column-dropdown">
										<li id="nearby" class="coloumn-heading" id="reviewfont"><a href="#">NOW
												PLAYING</a></li>
										<c:forEach items="${now_playing}" var="now_playing">
											<li><a
												href="<spring:url value="/movies/${now_playing.id}"/>">${now_playing.name}</a></li>
										</c:forEach>
									</ul>
								</div>
								<div class="col-sm-3">
									<ul class="multi-column-dropdown">
										<li class="coloumn-heading"><a href="#"></a></li>
										<c:forEach items="${now_playing2}" var="now_playing">
											<li><a
												href="<spring:url value="/movies/${now_playing.id}"/>">${now_playing.name}</a></li>
										</c:forEach>
									</ul>
								</div>
								<div class="col-sm-3">
									<ul class="multi-column-dropdown">
										<li class="coloumn-heading" id="reviewfont"><a href="#">COMING
												SOON</a></li>
										<c:forEach items="${coming_soon}" var="coming_soon">
											<li><a
												href="<spring:url value="/movies/${coming_soon.id}"/>">${coming_soon.name}</a></li>
										</c:forEach>
									</ul>
								</div>
								<div class="col-sm-3">
									<ul class="multi-column-dropdown">
										<c:forEach items="${coming_soon2}" var="coming_soon">
											<li><a
												href="<spring:url value="/movies/${coming_soon.id}"/>">${coming_soon.name}</a></li>
										</c:forEach>
									</ul>
								</div>
							</div>
						</ul></li>
					<li class="dropdown"><a
						href='<spring:url value="/theaters" />' class="dropdown">THEATERS<b
							class="caret"></b></a>
						<ul class="dropdown-menu multi-column columns-3">
							<div class="row">
								<div class="col-sm-8">
									<ul class="multi-column-dropdown">
										<li id="nearby"> NEARBY THEATERS</li>
										<c:forEach items="${nearbyTheaters}" var="theaters">
										<li id="theatername"><a href="<spring:url value="/theaters/${theaters.id}"/>">${theaters.name}</a></li>
										</c:forEach>
									</ul>
								</div>
								<div class="col-sm-4">
									<ul class="multi-column-dropdown">
										<br>
										<br>
										<br>
										<li>LOCATION</li>
										<big><cite title="${location}">${location}<i class="glyphicon glyphicon-map-marker"></i>
										</cite></big>
										<li class="divider"></li>
									</ul>
								</div>
							</div>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">MOVIE NEWS <span class="caret"></span></a>
						<ul class="dropdown-menu multi-column columns-4 movie-news">
							<div class="row">
								<div class="col-sm-3">

									<ul class="multi-column-dropdown">
										<li id="nearby" class="coloumn-heading"><a href="#">FEATURED
												MOVIE NEWS</a></li>
										<li><a href="http://www.fandango.com/movie-news/news-briefs-charlize-theron-seth-rogen-to-star-in-flarsky-751962"><img class="nav-movie-news-img"
												alt=""
												src="http://images.fandango.com/r103.4/ImageRenderer/300/210/redesign/static/img/noxlandscape.jpg/0/cp/cpc/images/fandangoblog/everettcollection_huntsman2-neighbors2_170223.jpg"></a>
										</li>
										<li><a href="#">News Briefs: Charlize Theron, Seth
												Rogen to Star in 'Flarsky'</a></li>
									</ul>
								</div>
								<div class="col-sm-3">
									<ul class="multi-column-dropdown">
										<li class="coloumn-heading"><a href="#"><br></a></li>
										<li><a href="http://www.fandango.com/movie-news/logan-buzz-is-there-a-postcredits-scene-plus-what-might-bring-hugh-jackman-back-as-wolverine-751964"><img class="nav-movie-news-img"
												alt=""
												src="https://images.fandango.com/images/spotlight/everettcollection_logan-170220.jpg"></a>
										</li>
										<li><a href="#">'Logan' Buzz: Is There a Postcredits
												Scene? Plus: What Might Bring Hugh Jackman Back As
												Wolverine?</a></li>
									</ul>
								</div>
								<div class="col-sm-3">
									<ul class="multi-column-dropdown">
										<li class="coloumn-heading"><a href="#"><br></a></li>
										<li><a href="http://www.fandango.com/movie-news/more-batman-news-nightwing-is-getting-his-own-movie-751965"><img class="nav-movie-news-img"
												alt=""
												src="https://images.fandango.com/images/fandangoblog/nightwing-arkham.jpg"></a>
										</li>

										<li><a href="#">More Batman News: Nightwing Is
												Getting His Own Movie</a></li>
									</ul>
								</div>
							</div>
						</ul></li>
					<li class="dropdown"><a id="username" href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">
						 <c:if test="${not empty user}">
                            ${user.firstName}
                        </c:if> 
                        <c:if test="${empty user}">
                            LOGIN
                        </c:if> <span class="caret"></span></a>
						<ul class="dropdown-menu login">
							<c:if test="${empty user}">
								<a href="/sign-up" class="btn btn-lg btn-primary"><span
									class="glyphicon glyphicon-fire"></span> JOIN CEDAR FOR FREE</a>
								<br>
								<p class="text-muted">
									<em>(it only takes few moments to join)</em>
								</p>
								<p>
									Already a Cedar Member? <a href="/login" class="text-primary"><strong>Sign
											In</strong></a>
								</p>
							</c:if>
							<c:if test="${not empty user}">
								
								<p>
									<a href="/logout" onclick='return logout()'
										class="text-primary"><strong>LOGOUT</strong></a>
								</p>
								<p>
								<c:if test="${user.role=='user'}">
									<a href="/user-dashboard" class="text-primary"><strong>MY
											ACCOUNT</strong></a>
								</c:if>
								<c:if test="${user.role=='client'}">
									<a href="/user-dashboard" class="text-primary"><strong>CLIENT
											ACCOUNT</strong></a>
								</c:if>
								<p>
								<c:if test="${user.role=='user'}">
									<a href="/giftcard" class="text-primary"> <strong>BUY GIFT CARD</strong></a>
								</c:if>
								</p>
								
								<c:if test="${user.role=='admin'}">
								
								<a href="/admin-dashboard" class="text-primary"><strong>ADMIN DASHBOARD</strong></a>
								</c:if>
								</p>
							</c:if>
							
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<tiles:insertAttribute name="body" />
	<br>
	<br>
	<tiles:insertAttribute name="footer" />
</body>
</html>