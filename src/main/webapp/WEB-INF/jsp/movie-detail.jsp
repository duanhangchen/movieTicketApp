<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/actor-overview.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/rating.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/js/rating.js" />"></script>


<div id="exTab1" class="container">
	<h1 class="actor-name">${movie.name}Overview</h1>
	<ul class="nav nav-pills">
		<li class="active"><a href="#1a" data-toggle="tab">Overview</a></li>
		<li><a href="#2a" data-toggle="tab">Synopsis</a></li>
		<li><a href="#3a" data-toggle="tab">Reviews</a></li>
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
			<div class="row">
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
			<div class="row">
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
					<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Write Review</button>
					<div class="modal fade" id="exampleModal" tabindex="-1"
						role="dialog" aria-labelledby="exampleModalLabel"
						aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<form>
										<div>
											<h5 id="reviewfont">${movie.name}</h5>
										</div>
										<div class="form-group">
											<label for="message-text" id="reviewfont" class="form-control-label">Review:</label>
											<textarea class="form-control" id="message-text"></textarea>
										</div>
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary"
										data-dismiss="modal">Close</button>
									<button type="button" class="btn btn-primary">Submit Review</button>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>