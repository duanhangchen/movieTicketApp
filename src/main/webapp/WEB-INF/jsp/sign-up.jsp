<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<script src="<c:url value="/resources/js/sign-up.js" />"></script>


<div class="container">
	<form data-toggle="validator" role="form" method="POST">
		<div class="form-group">
			<label for="firstName" class="control-label">Name</label> 
			<input
				type="text" class="form-control" id="firstName"
				name="firstName" placeholder="First Name" required>
		</div>
		<div class="form-group">
			<label for="lastName" class="control-label">Last Name</label> 
			<input
				type="text" class="form-control" id="lastName" name="lastName"
				placeholder="Last Name" required>
		</div>
		<div class="form-group">
			<label for="Email" class="control-label">Email</label> 
			<input
				type="email" class="form-control" id="Email" name="email" placeholder="Email"
				data-error="Bruh, that email address is invalid" required>
			<div class="help-block with-errors"></div>
		</div>
		<div class="form-group">
			<label for="password" class="control-label">Password</label>
			<div class="form-inline row">
				<div class="form-group col-sm-6">
					<input type="password" data-minlength="6" class="form-control"
						id="password" name="password" placeholder="Password" required>
					<div class="help-block">Minimum of 6 characters</div>
				</div>
				<div class="form-group col-sm-6">
					<input type="password" class="form-control" id="passwordConfirm"
						data-match="#password"
						data-match-error="Whoops, these don't match"
						placeholder="Confirm Password" required>
					<div class="help-block with-errors"></div>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="checkbox">
				<label> <input type="checkbox" id="terms"
					data-error="Please accept terms and conditions" required>
					Accept Terms and Conditions
				</label>
				<div class="help-block with-errors"></div>
			</div>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
</div>