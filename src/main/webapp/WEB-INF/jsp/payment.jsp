<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link rel="stylesheet"
	href="<c:url value="/resources/css/jquery.seat-charts.css"/>">
<link rel="stylesheet"
	href="<c:url value="/resources/css/seating.css"/>">
<script src="<c:url value="/resources/js/jquery.seat-charts.min.js" />"></script>
<script src="<c:url value="/resources/js/formcalculations.js" />"></script>
<link href="<c:url value="/resources/css/gift.css" />" rel="stylesheet">


<script>
	var firstSeatLabel = 1;
	$(document)
			.ready(
					function() {
						var $cart = $('#selected-seats'), $counter = $('#counter'), $total = $('#total'), sc = $(
								'#seat-map')
								.seatCharts(
										{
											map : [ 'ee_eeeee', 'ee_eeeee',
													'ee_eeeee', 'ee_eeeee',
													'ee_eeeee', 'ee_eeeee',
													'ee_eeeee', 'eeeee_ee',
													'eeeeeeeee', ],
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

<div class="wrapper">
	<div class="container">
		<h1>Please Select Your Seats</h1>
		<div id="seat-map">
			<div class="front-indicator">Front</div>
		</div>
	</div>
</div>

<form method="POST" action="/theaters/${theater.id}/${showing.showingId}/confirmation/${adult}/${senior}/${child}">
<div class="row">
	<div class="col-sm-4">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<div class="form_main">
							<h4 class="heading">
								<strong>Payment Information</strong><span></span>
							</h4>
							<div class="form">
								<input type="text" required="" placeholder="Please input Name"
									value="" name="giftFrom" class="txt"> <input
									type="text" required="" placeholder="Please input Email"
									value="" name="giftEmail" class="txt">
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<div class="col-sm-4">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-md-4">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">Payment Details</h3>
							</div>
							<div class="panel-body">

								<div class="form-group">
									<label for="cardNumber"> CARD NUMBER</label>
									<div class="input-group">
										<input type="text" class="form-control" name="cardNumber"
											placeholder="Valid Card Number" required autofocus /> <span
											class="input-group-addon"><span
											class="glyphicon glyphicon-lock"></span></span>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-7 col-md-7">
										<div class="form-group">
											<label for="expityMonth"> EXPIRY DATE</label>
											<div class="col-xs-6 col-lg-6 pl-ziro">
												<input type="text" class="form-control" id="expityMonth"
													placeholder="MM" required />
											</div>
											<div class="col-xs-6 col-lg-6 pl-ziro">
												<input type="text" class="form-control" id="expityYear"
													placeholder="YY" required />
											</div>
										</div>
									</div>
									<div class="col-xs-5 col-md-5 pull-right">
										<div class="form-group">
											<label for="cvCode"> CV CODE</label> <input type="password"
												class="form-control" id="cvCode" placeholder="CV" required />
										</div>
									</div>
								</div>

							</div>
						</div>
						<br /> <input type="submit" value="Pay" name="submit"
							class="btn btn-success btn-lg btn-block">
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</form>