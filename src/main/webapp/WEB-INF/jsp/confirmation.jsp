<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Information</title>



</head>



<body>
	<h1>Purchase Confirmation</h1>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="invoice-title">
					<h2>Invoice</h2>
					<h3 class="pull-right">Order # 12345</h3>
				</div>
				<hr>
				<div class="row">
					<div class="col-xs-6">
						<address>
							<strong>Billed To:</strong><br> ${gFrom}<br>
						</address>
					</div>
					<div class="col-xs-6 text-right">
						<address>
							<strong>Shipped To:</strong><br> ${gTo}<br> ${gEmail}
						</address>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<address>
							<strong>Payment Method:</strong><br> Visa ending ****
							${cNumEnd}<br> ${user.email}
						</address>
					</div>
					<div class="col-xs-6 text-right">
						<address>
							<strong>Order Date:</strong><br> ${date}<br>
							<br>
						</address>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>Order summary</strong>
						</h3>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-condensed">
								<thead>
									<tr>
										<td><strong>${theater.name}</strong></td>

									</tr>
									<td><strong>Show Time: </strong>${showing.startTime}</td>
								</thead>




								<thead>
									<tr>
										<td><strong>Item</strong></td>
										<td class="text-center"><strong>Price</strong></td>
										<td class="text-center"><strong>Quantity</strong></td>
										<td class="text-right"><strong>Totals</strong></td>
									</tr>
								</thead>
								<tbody>
									<!-- foreach ($order->lineItems as $line) or some such thing here -->
									<tr>
										<td><strong>Adult Ticket</strong><br></td>
										<td class="text-center">$11.99</td>
										<td class="text-center">${adult}</td>
										<c:set var="adultTotal" value="${adult*11.99}" />
										<td class="text-right">$${adultTotal}</td>
									</tr>
									<tr>
										<td><strong>Senior Ticket</strong><br></td>
										<td class="text-center">$10.49</td>
										<td class="text-center">${senior}</td>
										<c:set var="seniorTotal" value="${senior*10.49}" />
										<td class="text-right">$${seniorTotal}</td>
									</tr>
									<tr>
										<td><strong>Child Ticket</strong><br></td>
										<td class="text-center">$8.99</td>
										<td class="text-center">${child}</td>
										<c:set var="childTotal" value="${child*8.99}" />
										<td class="text-right">$${childTotal}</td>
									</tr>
									<tr>
										<td class="no-line"></td>
										<td class="no-line"></td>
										<td class="no-line text-center"><strong>Total</strong></td>
										<c:set var="allTotal" value="${childTotal+seniorTotal+adultTotal}" />
										<td class="no-line text-right">$${allTotal}</td>
									</tr>
								</tbody>
							</table>
							<a href="/" class="btn btn-success btn-lg btn-block"
								role="button">Confirm</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>




</body>
</html>