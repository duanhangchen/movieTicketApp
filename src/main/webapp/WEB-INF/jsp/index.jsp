<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table>
	<thead>
		<tr>
			<c:forEach items="${movies}" var="movie">
				<tr>
					<td>${movie.name}</td>
				</tr>
			</c:forEach>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${movies}" var="movie">
			<tr>
				<td>${movie.name}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
