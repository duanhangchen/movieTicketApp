<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<table>
	<thead>
		<tr>
			<th>Movie Name</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach items="${movies}" var="movie">
			<tr>
				<a href="<spring:url value="/movies/${movie.id}"/>">
					${movie.name}
				</a>
			</tr>
		</c:forEach>

	</tbody>

</table>