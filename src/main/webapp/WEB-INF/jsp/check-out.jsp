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


<h1>${showing.movie.name}</h1>
<h1>${showing.theater.name}</h1>
<h1>${showing.startTime}</h1>


<form class="form-inline">
	<label class="mr-sm-2" for="inlineFormCustomSelect">Adult
		Ticket:</label> <select class="custom-select mb-2 mr-sm-2 mb-sm-0"
		id="inlineFormCustomSelect">
		<option selected>Choose...</option>
		<option value="1">One</option>
		<option value="2">Two</option>
		<option value="3">Three</option>
	</select> <label class="mr-sm-2" for="inlineFormCustomSelect">Child
		Ticket:</label> <select class="custom-select mb-2 mr-sm-2 mb-sm-0"
		id="inlineFormCustomSelect">
		<option selected>Choose...</option>
		<option value="1">One</option>
		<option value="2">Two</option>
		<option value="3">Three</option>
	</select> <label class="mr-sm-2" for="inlineFormCustomSelect">Senior
		Ticket:</label> <select class="custom-select mb-2 mr-sm-2 mb-sm-0"
		id="inlineFormCustomSelect">
		<option selected>Choose...</option>
		<option value="1">One</option>
		<option value="2">Two</option>
		<option value="3">Three</option>
	</select>






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



	<button type="submit" class="btn btn-primary" style="position: absolute; right: 0;">Submit</button>
</form>

<script>
	var firstSeatLabel = 1;
	$(document)
			.ready(
					function() {
						var $cart = $('#selected-seats'), $counter = $('#counter'), $total = $('#total'), sc = $(
								'#seat-map')
								.seatCharts(
										{
											map : [ 'ee_ee', 'ee_ee', 'ee_ee',
													'ee_ee', 'ee', 'ee_ee',
													'ee_ee', 'ee_ee', 'eeeee', ],
											seats : {
												e : {
													price : 40,
													classes : 'economy-class', //your custom CSS class
													category : 'Economy Class'
												}
											},
											naming : {
												top : false,
												getLabel : function(character,
														row, column) {
													return firstSeatLabel++;
												},
											},

											click : function() {
												if (this.status() == 'available') {
													//let's create a new <li> which we'll add to the cart items
													$(
															'<li>'
																	+ this
																			.data().category
																	+ ' Seat # '
																	+ this.settings.label
																	+ ': <b>$'
																	+ this
																			.data().price
																	+ '</b> <a href="#" class="cancel-cart-item">[cancel]</a></li>')
															.attr(
																	'id',
																	'cart-item-'
																			+ this.settings.id)
															.data(
																	'seatId',
																	this.settings.id)
															.appendTo($cart);

													/*
													 * Lets update the counter and total
													 *
													 * .find function will not find the current seat, because it will change its stauts only after return
													 * 'selected'. This is why we have to add 1 to the length and the current seat price to the total.
													 */
													$counter
															.text(sc
																	.find('selected').length + 1);
													$total
															.text(recalculateTotal(sc)
																	+ this
																			.data().price);

													return 'selected';
												} else if (this.status() == 'selected') {
													//update the counter
													$counter
															.text(sc
																	.find('selected').length - 1);
													//and total
													$total
															.text(recalculateTotal(sc)
																	- this
																			.data().price);

													//remove the item from our cart
													$(
															'#cart-item-'
																	+ this.settings.id)
															.remove();

													//seat has been vacated
													return 'available';
												} else if (this.status() == 'unavailable') {
													//seat has been already booked
													return 'unavailable';
												} else {
													return this.style();
												}
											}
										});

						//this will handle "[cancel]" link clicks
						$('#selected-seats').on(
								'click',
								'.cancel-cart-item',
								function() {
									//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here
									sc.get(
											$(this).parents('li:first').data(
													'seatId')).click();
								});
						$('.seatCharts-space').hide();

					});

	function recalculateTotal(sc) {
		var total = 0;

		//basically find every selected seat and sum its price
		sc.find('selected').each(function() {
			total += this.data().price;
		});

		return total;
	}
</script>
<script type="text/javascript">
	var _gaq = _gaq || [];
	_gaq.push([ '_setAccount', 'UA-36251023-1' ]);
	_gaq.push([ '_setDomainName', 'jqueryscript.net' ]);
	_gaq.push([ '_trackPageview' ]);

	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://ssl'
				: 'http://www')
				+ '.google-analytics.com/ga.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
</script>