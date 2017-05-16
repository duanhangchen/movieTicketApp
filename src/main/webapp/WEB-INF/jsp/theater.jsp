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
	<main class="main-content">
	<div class="container">
		<div class="page">
			<section>
				<header>
					<h2 class="section-title">THEATER LIST</h2>
				</header>
				<div class="w3-container">
					<c:forEach items="${theaters}" var="theater">

						<div class="panel panel-default">
							<div class="panel-heading">
								<h1 class="panel-title">
									<a href="<spring:url value="/theaters/${theater.id}"/>">${theater.name}</a>
									<button name="favouriteMovie" value="${favouriteMovie}"
										onClick="toggleValue()" type="submit" class="btn btn-lg">
										<span class="glyphicon glyphicon-heart"></span>
									</button>
								</h1>
							</div>
						</div>
					</c:forEach>
				</div>
			</section>
		</div>
	</div>
	</main>
</div>