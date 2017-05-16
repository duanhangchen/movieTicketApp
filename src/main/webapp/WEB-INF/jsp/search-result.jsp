<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<link href="<c:url value="/resources/css/blur.css" />" rel="stylesheet">
<div class="container">

	<hgroup class="mb20">
		<h1>Search Results</h1>
		<h2 class="lead">
			<strong class="text-danger">${fn:length(searchMovie)}</strong> movie
			results were found for the search for <strong class="text-danger">${keyword}</strong>
		</h2>
	</hgroup>
	<section class="col-xs-12 col-sm-6 col-md-12">
		<c:forEach items="${searchMovie}" var="movie">
			<article class="search-result row">
				<div class="col-xs-12 col-sm-12 col-md-3">
					<div class="blur">
						<a href="<spring:url value="/movies/${movie.id}"/>" title="${movie.name}" class="thumbnail"><img
							src="${movie.url}" alt="${movie.name}" /></a>
					</div>
				</div>
				<div class="col-xs-12 col-sm-12 col-md-7 excerpet">
					<br>
					<h3>
						<a href="<spring:url value="/movies/${movie.id}"/>" title="">${movie.name}</a>
					</h3>
					<p>${movie.plot}</p>
				</div>
				<span class="clearfix borda"></span>
			</article>
		</c:forEach>
	</section>
	<hgroup class="mb20">
		<h2 class="lead">
			<strong class="text-danger">${fn:length(searchZip)}</strong> theater
			results were found for the search for <strong class="text-danger">${keyword}</strong>
		</h2>
	</hgroup>

	<section class="col-xs-12 col-sm-6 col-md-12">
		<c:forEach items="${searchZip}" var="theaters">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h1 class="panel">
								<a href="<spring:url value="/theaters/${theaters.id}"/>">${theaters.name}</a>
							</h1>
							<h1 class="panel-title">
								<div>${theaters.addressLine}, ${theaters.city}, ${theaters.state}, ${theaters.zipcode}</div>
							</h1>
						</div>
					</div>
		</c:forEach>
	</section>
</div>