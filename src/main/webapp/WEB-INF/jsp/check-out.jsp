<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link rel="stylesheet"
	href="<c:url value="/resources/css/jquery.seat-charts.css"/>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/seating.css"/>">
<script src="<c:url value="/resources/js/jquery.seat-charts.min.js" />"></script>
<link href="<c:url value="/resources/css/cakeform.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/formcalculations.js" />"></script>



<h1>Movie Name: ${showing.movie.name}</h1>
<h1>Theater Name: ${showing.theater.name}</h1>
<h1>Movie Time: ${showing.startTime}</h1>
<br>
<br>
<br>

<div id="wrap">
	<form role="form" method="POST" id="cakeform">
		<div>
			<div class="cont_order">
				<fieldset>
					<legend>Select Your Tickets</legend>
					<label>Adult Ticket</label> 
					<select id="adult" name='adult' onchange="calculateTotal()">
						<option value="0">Select Amount</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
					</select> <br />
					
					<label>Senior Ticket</label> 
					<select id="senior" name='senior' onchange="calculateTotal()">
						<option value="0">Select Amount</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
					</select> <br />
					
					<label>Child Ticket</label> 
					<select id="child	" name='child' onchange="calculateTotal()">
						<option value="0">Select Amount</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
					</select> <br />
					
					<div id="totalPrice"></div>
				</fieldset>
			</div>
			<input type='submit' id='submit' value='Submit'
				onclick="calculateTotal()" />
		</div>
	</form>
</div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


