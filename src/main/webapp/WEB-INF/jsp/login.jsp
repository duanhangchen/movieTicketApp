<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/login.js" />"></script>
<script src="<c:url value="/resources/js/fb.js" />"></script>
<div class="container">
	<div class="card card-container">
		<h3 class="title" align="center">TEAM CEDAR</h3>
		<img id="profile-img" class="profile-img-card"
			src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
		<p id="profile-name" class="profile-name-card"></p>
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<form action="/login" method="POST" class="form-signin">
			<span id="reauth-email" class="reauth-email"></span>
			<p class="user-password-label">Email</p>
			<input name="name" type="email" id="inputEmail" class="form-control"
				placeholder="Email address" required autofocus>
			<p class="user-password-label">Password</p>
			<input name="password" type="password" id="inputPassword"
				class="form-control" placeholder="Password" required>
			<div id="remember" class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					<span class="user-password-label">Remember me</span>
				</label>
			</div>
			<br>
			<button class="btn btn-lg btn-primary btn-block btn-signin"
				type="submit">Sign in</button>
		</form>
		<!-- /form -->
		<a href="#" class="forgot-password"> Forgot the password? </a>
		<br>
		<br>
		<div>
			<div class="fb-login-button" data-max-rows="1" data-size="large"
				data-button-type="login_with" data-show-faces="false"
				data-auto-logout-link="false" data-use-continue-as="true"
				scope="public_profile,email" onlogin="checkLoginState();"></div>
				<!-- 	<fb:login-button scope="public_profile,email" onlogin="checkLoginState();"></fb:login-button> -->
		</div>
	</div>

	<!--   <button id="logout" class="btn btn-lg btn-primary btn-block btn-signin" onclick = "logout();">Logout</button> -->