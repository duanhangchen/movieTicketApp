<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="container">

	<hgroup class="mb20">
		<h1>Search Results</h1>
		<h2 class="lead">
			<strong class="text-danger">${fn:length(searchMovie)}</strong> movie results were found for the
			search for <strong class="text-danger">${keyword}</strong>
		</h2>
	</hgroup>
	<section class="col-xs-12 col-sm-6 col-md-12">
		<c:forEach items="${searchMovie}" var="movie">
			<article class="search-result row">
				<div class="col-xs-12 col-sm-12 col-md-3">
					<a href="#" title="Lorem ipsum" class="thumbnail"><img
						src="${movie.url}" alt="Lorem ipsum" /></a>
				</div>
				<div class="col-xs-12 col-sm-12 col-md-2">
					<ul class="meta-search">
						<li><i class="glyphicon glyphicon-calendar"></i> <span>02/15/2014</span></li>
						<li><i class="glyphicon glyphicon-time"></i> <span>4:28
								pm</span></li>
						<li><i class="glyphicon glyphicon-tags"></i> <span>People</span></li>
					</ul>
				</div>
				<div class="col-xs-12 col-sm-12 col-md-7 excerpet">
					<h3>
						<a href="#" title="">Voluptatem, exercitationem, suscipit,
							distinctio</a>
					</h3>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Voluptatem, exercitationem, suscipit, distinctio, qui sapiente
						aspernatur molestiae non corporis magni sit sequi iusto debitis
						delectus doloremque.</p>
					<span class="plus"><a href="#" title="Lorem ipsum"><i
							class="glyphicon glyphicon-plus"></i></a></span>
				</div>
				<span class="clearfix borda"></span>
			</article>
		</c:forEach>
	</section>
</div>