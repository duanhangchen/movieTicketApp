<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/actor-overview.css"/>"
	rel="stylesheet">

<div id="exTab1" class="container">
	<h1 class="actor-name">${movie.name} Overview</h1>
	<ul class="nav nav-pills">
		<li class="active"><a href="#1a" data-toggle="tab">Overview</a></li>
		<li><a href="#2a" data-toggle="tab">Biography</a></li>
		<li><a href="#3a" data-toggle="tab">Filmography</a></li>
		<li><a href="#4a" data-toggle="tab">Photos</a></li>
	</ul>

	<div class="tab-content clearfix">
		<div class="tab-pane active" id="1a">
			<div class="row">
				<div class="col-sm-3 biographyAndPhoto">
					<div class="row photo">
						<div class="col-sm-6 biographyAndPhoto">
							<a> <img class="pop-headshot--photo-img" src="${movie.url}"
								alt="${movie.name}"></a>
						</div>
						<div class="col-sm-6">
							<div class="dob">
								Date of Birth:<br>Jul 18, 1967
							</div>
						</div>
					</div>
					<div class="row bio">
						<div class="col-sm-12">
							<h2 class="heading-center">BIOGRAPHY</h2>
							<p class="para">Actor, producer, writer, and director Vin
								Diesel had a charmed entry into the world of screen acting:
								after seeing Multi-Facial, a short that Diesel wrote, produced,
								financed, directed, and starred in, Steven Spielberg created the
								role of Private Caparzo specifically for the talented young
								newcomer in his Saving Private Ryan (1998). Born in New York
								City on July 18, 1967,...</p>
						</div>
					</div>


				</div>
				<div class="col-sm-6">
					<iframe width="640" height="360"
						src="http://v.traileraddict.com/23699" allowfullscreen="true"
						webkitallowfullscreen="true" mozallowfullscreen="true"
						scrolling="no" frameborder="0"></iframe>

					<p class="video-description">WEEKEND TICKET: EPISODE 137 - VIN
						DIESEL</p>
					<p class="video-description">Which movie's right for you this
						weekend? The Last Witch Hunter? Steve Jobs? Rock the Kasbah? Jem
						and the Holograms? Paranormal Activity: The Ghost Dimension?
						Fandango Chief Correspondent Dave Karger breaks them down with a
						little help from Vin Diesel.</p>
				</div>
			</div>

			<div class="col-sm-3"></div>
		</div>
	</div>
	
	
	
	<div class="tab-pane" id="2a">
		<h3>We use the class nav-pills instead of nav-tabs which
			automatically creates a background color for the tab</h3>
	</div>
	<div class="tab-pane" id="3a">
		<h3>We applied clearfix to the tab-content to rid of the gap
			between the tab and the content</h3>
	</div>
	<div class="tab-pane" id="4a">
		<h3>We use css to change the background color of the content to
			be equal to the tab</h3>
	</div>
	
				<div class="product-list">
					<c:forEach items="${actors}" var="actor">

						<div class="product">
							<div class="inner-product">
								<div class="figure-image">
									<a href="single.html"><img src="${actor.actorUrl}" alt="Game 1"></a>
								</div>
								<h3 class="product-title">
									<a href="<spring:url value="/actors/${actor.id}"/>">${actor.name}</a>
								</h3>
								<a href="cart.html" class="button">Add to cart</a> <a href="#"
									class="button muted">Read Details</a>
							</div>
						</div>

					</c:forEach>
				</div>
</div>
</div>