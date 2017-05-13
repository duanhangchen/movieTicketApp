<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link href="<c:url value="/resources/css/actor-overview.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/rating.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/gift.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/js/rating.js" />"></script>
<link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>



<div id="exTab1" class="container">

	<span>
		<h1 class="actor-name">User Dashboard</h1>
	</span>

	<ul class="nav nav-pills">
		<li class="active"><a href="#1a" data-toggle="tab">DASHBOARD</a></li>
		<li><a href="#2a" data-toggle="tab">PURCHASE HISTORY</a></li>
		<li><a href="#3a" data-toggle="tab">ACCOUNT SETTINGS</a></li>
		<li><a href="#4a" data-toggle="tab">SUBSCRIPTIONS</a></li>
		<li><a href="#5a" data-toggle="tab">GIFT CARD</a></li>
		<li><a href="#6a" data-toggle="tab">REDEEM GIFT CARD</a></li>
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
											<h4>${user.firstName} ${user.lastName}</h4>
											<small><cite title="San Diego, USA">Stony
													Brook, NY<i class="glyphicon glyphicon-map-marker"></i>
											</cite></small>
											<p>
												<i class="glyphicon glyphicon-envelope"></i>${user.email}
												<br /> <br /> <i class="glyphicon glyphicon-gift"></i>Joined
												${user.creationDate}
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>


						<div class="container">
							<h1>MY THEATRE</h1>
							<div class="row pricing">
								<c:forEach items="${userTheaters}" var="theater">
									<div class="col-md-3">
										<div class="well card">
											<h3>
												<b>${theater.name}</b>
											</h3>
											<hr>
											<p>Theatre Address Line 1</p>
											<hr>
											<p>NY</p>
											<hr>
											<p>ZIP: 11790</p>
										</div>
									</div>
								</c:forEach>
							</div>
						</div>
						<div class="container">
							<h1>MY REVIEWS</h1>
							<div class="row pricing">
							<c:forEach items="${userreviews}" var="review">
								<div class="col-md-3">
									<div class="well card">
										<h3>
											<b>${review.movie.name}</b>
										</h3>
										<hr>
										<p>Review Title</p>
										<hr>
										<p>${review.review}</p>
									</div>
								</div>
								</c:forEach>
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
				<div class="container">
					<div class="row">
						<div class="col-md-12 card">
							<div class="panel-group" id="accordion">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#accordion"
												href="#collapseOne"><span
												class="glyphicon glyphicon-file"> </span>BASIC INFORMATION</a>
										</h4>
									</div>
									<div id="collapseOne" class="panel-collapse collapse in">
										<div class="panel-body">
											<div class="row">
												<div class="col-md-6">
												<form action="/updateInfo" role="form" method="POST">
													<div class="form-group ">
														<label for="firstName">First Name</label> <input
															type="text" class="form-control" name="firstName"
															value="${user.firstName}" required />
													</div>
													<div class="form-group">
														<label for="lastName">Last Name</label> 
														<input type="text"
															class="form-control" name="lastName" value="${user.lastName}" required />
													</div>
													<!-- <button type="submit" class="btn btn-primary">Save</button> -->
													<button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Save</button>
													<div class="modal fade" id="myModal" role="dialog">
														<div class="modal-dialog">
															<div class="modal-content">
																<div class="modal-body">
																	<p>Account settings saved.</p>
																	<button type="button" class="btn btn-default"
																		data-dismiss="modal">Close</button>
																</div>
															</div>
															</div>
													</div>
													</form>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#accordion"
												href="#collapseTwo"><span
												class="glyphicon glyphicon-th-list"> </span>Administration</a>
										</h4>
									</div>
									<div id="collapseTwo" class="panel-collapse collapse">
										<div class="panel-body">
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<label for="grantpo">Grant PO</label> <select
															class="form-control" id="grantpo">
															<option>Data1772457</option>
															<option>Data4516</option>
															<option>Data24572457</option>
														</select>
													</div>
												</div>
												<div class="col-md-6">
													<div class="well well-sm well-primary">
														<label for="grantor">Grantor</label> <select
															class="form-control" id="grantor">
															<option>Data1772457</option>
															<option>Data4516</option>
															<option>Data24572457</option>
														</select>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="tab-pane" id="4a">
			<div class="row actor">
				<div class="container">
				<form action="/newsletter" method="POST" class="form-signin">
					<h2>News Letter Subscription</h2>
					<input  id="toggle-event" type="checkbox"  name= "subscribed" <c:if test="${subscribed}">checked</c:if> data-toggle="toggle" data-on="Subscribed" data-off="Unsubscribed" data-width= "10%">
 			</form>
				</div>
			</div>
		</div>
		<div class="tab-pane" id="6a">
			

			<div class="container">
			    <div class="row">
			        <div class="col-md-offset-5 col-md-3">
			            <form action="/redeemCard" role=form method=POST>
				            <h4>Current Balance: ${balance}</h4>				            
				            <h4>Redeem Gift Code</h4>
				            <input type="text" name="giftCode" class="form-control input-sm chat-input" placeholder="code" />      
					        <input type="submit" value="Redeem Code" name="submit" class="btn btn-success btn-lg btn-block">
			            </form>
			            </div>
			        
			        </div>
			    </div>
			</div>
		</div>
		
		
	</div>