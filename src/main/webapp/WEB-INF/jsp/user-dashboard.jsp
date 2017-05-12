<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/actor-overview.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/rating.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/js/rating.js" />"></script>


<div id="exTab1" class="container">

	<span>
		<h1 class="actor-name">User Dashboard</h1>
	</span>

	<ul class="nav nav-pills">
		<li class="active"><a href="#1a" data-toggle="tab">DASHBOARD</a></li>
		<li><a href="#2a" data-toggle="tab">PURCHASE HISTORY</a></li>
		<li><a href="#3a" data-toggle="tab">ACCOUNT SETTINGS</a></li>
		<li><a href="#4a" data-toggle="tab">SUBSCRIPTIONS</a></li>
		<li><a href="#4a" data-toggle="tab">GIFT CARD</a></li>
	</ul>
	<div class="tab-content clearfix">
		<div class="tab-pane active" id="1a">
			<div class="row actor">
				<div class="col-sm-6 biographyAndPhoto">
					<div class="container wrap">
						<div class="row">
							<div class="col-xs-12 col-sm-6 col-md-6 col-md-offset-3">
								<div class="well well-sm">
									<div class="row">
										<div class="col-sm-4 col-md-6 col-lg-7">
											<img src="http://placehold.it/300x200" alt=""
												class="img-rounded img-responsive" />
										</div>
										<div class="col-sm-8 col-md-6 col-lg-5 card">
											<h4>Sanchay Agrawal</h4>
											<small><cite title="San Diego, USA">Stony
													Brook, NY<i class="glyphicon glyphicon-map-marker"></i>
											</cite></small>
											<p>
												<i class="glyphicon glyphicon-envelope"></i>kaka.sanchay@gmail.com
												<br /> <br /> <i class="glyphicon glyphicon-gift"></i>Joined
												January 19, 1993
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						
					
					<div class="container">
					<h1>MY THEATRE</h1>
					<div class="row pricing">
						<div class="col-md-3">
							<div class="well card">
								<h3>
									<b>Theatre Name</b>
								</h3>
								<hr>
								<p>Theatre Address Line 1</p>
								<hr>
								<p>NY</p>
								<hr>
								<p>ZIP: 11790</p>
							</div>
						</div>
						<div class="col-md-3">
							<div class="well card">
								<h3>
									<b>Movie Name</b>
								</h3>
								<hr>
								<p>Cost: $50</p>
								<hr>
								<p>Theatre: Name</p>
								<hr>
								<p>Date: 1 January 2017</p>
								<hr>
								<p>
									<b># of Tickets: 4</b>
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="container">
					<h1>MY REVIEWS</h1>
					<div class="row pricing">
						<div class="col-md-3">
							<div class="well card">
								<h3>
									<b></b>
								</h3>
								<hr>
								<p>Cost: $50</p>
								<hr>
								<p>Theatre: Name</p>
								<hr>
								<p>Date: 1 January 2017</p>
								<hr>
								<p>
									<b># of Tickets: 4</b>
								</p>
							</div>
						</div>
						<div class="col-md-3">
							<div class="well card">
								<h3>
									<b>Movie Name</b>
								</h3>
								<hr>
								<p>Cost: $50</p>
								<hr>
								<p>Theatre: Name</p>
								<hr>
								<p>Date: 1 January 2017</p>
								<hr>
								<p>
									<b># of Tickets: 4</b>
								</p>
							</div>
						</div>
					</div>
				</div>
					</div>
				</div>
			</div>
		</div>

		<div class="tab-pane" id="2a">
			<div class="row actor">
				<div class="container">
					<div class="row pricing">
						<div class="col-md-3">
							<div class="well card">
								<h3>
									<b>Movie Name</b>
								</h3>
								<hr>
								<p>Cost: $50</p>
								<hr>
								<p>Theatre: Name</p>
								<hr>
								<p>Date: 1 January 2017</p>
								<hr>
								<p>
									<b># of Tickets: 4</b>
								</p>
							</div>
						</div>
						<div class="col-md-3">
							<div class="well card">
								<h3>
									<b>Movie Name</b>
								</h3>
								<hr>
								<p>Cost: $50</p>
								<hr>
								<p>Theatre: Name</p>
								<hr>
								<p>Date: 1 January 2017</p>
								<hr>
								<p>
									<b># of Tickets: 4</b>
								</p>
							</div>
						</div>
					</div>
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
					<c:forEach items="${reviews}" var="reviews">
						<div class="well">
							<div class="row-fluid">
								<div id="reviewfont">
									<strong>${reviews.review}</strong>
								</div>
								<div class="span2 muted mycenter" style="text-align: right;">
									<a>${reviews.user.firstName}</a>
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
</div>