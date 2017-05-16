<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link rel="stylesheet"
	href="<c:url value="/resources/css/jquery.seat-charts.css"/>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/seating.css"/>">
<%-- <script src="<c:url value="/resources/js/jquery.seat-charts.js" />"></script> --%>
<script src="<c:url value="/resources/js/jquery.seat-charts.min.js" />"></script>
<!-- <script src="http://code.jquery.com/jquery-1.12.4.min.js"></script> -->

<div class="wrapper">
		<div class="container">
			<h1>jQuery Seat Charts Plugin Demo</h1>
			<div id="seat-map">
				<div class="front-indicator">Front</div>
			</div>
			<div class="booking-details">
				<h2>Booking Details</h2>
				<h3>
					Selected Seats (<span id="counter">0</span>):
				</h3>
				<ul id="selected-seats">
				</ul>
				Total: <b>$<span id="total">0</span></b>
				<button class="checkout-button">Checkout &raquo;</button>
				<div id="legend"></div>
			</div>
		</div>
	</div>