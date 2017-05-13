<link
	href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--footer start from here-->
<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-sm-6 footerleft ">
				<div class="logofooter">Team Cedar</div>
				<p>Movie Ticket Application</p>

				<p>
					<i class="fa fa-phone"></i> Phone: xxx-xxx-xxxx
				</p>
				<p>
					<i class="fa fa-envelope"></i> E-mail :
					duanhang.chen@stonybrooke.edu
				</p>

			</div>
			<div class="col-md-2 col-sm-6 paddingtop-bottom">
				<h6 class="heading7">GENERAL LINKS</h6>
				<ul class="footer-ul">
					<li><a href="#"> Career</a></li>
					<li><a href="#"> Privacy Policy</a></li>
					<li><a href="#"> Terms & Conditions</a></li>
					<li><a href="#"> Client Gateway</a></li>
					<li><a href="#"> Ranking</a></li>
					<li><a href="#"> Case Studies</a></li>
					<li><a href="#"> Frequently Ask Questions</a></li>
				</ul>
			</div>
			<div class="col-md-3 col-sm-6 paddingtop-bottom">
				<h6 class="heading7">Latest Movies</h6>
				<div class="post"></div>
			</div>
		</div>
	</div>
</footer>
<!--footer start from here-->

<div class="copyright">
	<div class="container">
		<div class="col-md-6">
			<p>© 2017 - All Rights with Cedar</p>
		</div>
		<div class="col-md-6">
			<ul class="bottom_ul">
				<li><a href="#">Team Cedar</a></li>
				<li><a href="#">About us</a></li>
				<li><a href="#">Faq's</a></li>
				<c:if test="${not empty user}">
				<li><a data-toggle="modal" data-target="#reviewModal">Support
						Form</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</div>

<div class="modal fade" id="reviewModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<form role="form" method="POST">
					<div>
						<h5 id="reviewfont">${user.firstName}</h5>
					</div>
					<div class="form-group">
						<label for="message-text" id="reviewfont"
							class="form-control-label">Title:</label> <input type="text"
							class="form-control" id="title" name="title"></input>
					</div>
					<div class="form-group">
						<label for="message-text" id="reviewfont"
							class="form-control-label">Body:</label>
						<textarea type="text" class="form-control" id="body" name="body"></textarea>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Submit Form</button>
					</div>
				</form>
			</div>

		</div>
	</div>
</div>