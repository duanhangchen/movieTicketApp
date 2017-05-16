<link
	href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet">

	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--footer start from here-->

<style>
button.accordion {
    background-color: #eee;
    color: black;
    cursor: pointer;
    padding: 18px;
    width: 100%;
    border: none;
    text-align: left;
    outline: none;
    font-size: 15px;
    transition: 0.4s;
}

button.accordion.active, button.accordion:hover {
    background-color: #ddd; 
}

div.panel2 {
    padding: 0 18px;
    display: none;
    background-color: white;
    color: black;
}

tr {
  display: none;
}
</style>



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
					teamcedar308@gmail.com
				</p>

			</div>
			<div class="col-md-2 col-sm-6 paddingtop-bottom">
				<h6 class="heading7">GENERAL LINKS</h6>
				<ul class="footer-ul">
					<li><a href="#"> <button type="button" class="btn btn-demo" data-toggle="modal" data-target="#myModal2" style="color:black">Help!
		</button></a></li>
				</ul>
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


<div class="container demo">
	
	
	<div class="text-center">
		

		
	</div>

	<!-- Modal -->
	<div class="modal right fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel2">
		<div class="modal-dialog" role="document" >
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<h4 class="modal-title" id="myModalLabel2" style="color: black">Help!</h4>
				</div>

				<div class="modal-body">
						<input type="text" id="myInput" size="50" onkeyup="myFunction()" placeholder="Search for FAQs" style="color:black" >

	<table id="myTable">
	  <tr>
		<td>
		<button class="accordion">HOW DO I PURCHASE MOVIE TICKETS?</button>
		<div class="panel2">
	  <p>You can purchase movie tickets in these steps:
	(1) Navigate to a theather page by searching with address or zipcode
	2.Select show time to begin checkout. Choose number of tickets and select your seat if reserved seating is available.
	(3) Log in to your account or checkout as a guest and complete your purchase with valid payment method.
	(4) Review your order, complete your purchase and enjoy the show.
	</p>
	</div></td>
	  </tr>

	  <tr>
		<td><button class="accordion">WHEN WILL I GET MY EMAIL ORDER CONFIRMATION?</button>
	<div class="panel2">
	  <p>Shortly after you complete your ticket purchase, an email confirmation will be sent to the email address that you provided during checkout, and will also be stored in your account information under purchase history. If you lost or can't find your confirmation email, please check your SPAM folder. You can also sign in to account to see your purchase history.
	</p>
	</div></td>
	  </tr>
	  <tr>
		<td><button class="accordion">HOW DO I PICK UP MY TICKETS?</button>
	<div class="panel2">
	  <p>After you complete your purchase, you’ll see a confirmation page that tells you exactly how to pick up your tickets. Depending on the theater and device you’re on, you may print your tickets at home, pick up at a box office or kiosk with a valid credit card, or use a mobile ticket (if available). This information is also available on your confirmation email.
	</p>
	</div></td>
	  </tr>
	  <tr>
		<td><button class="accordion">ARE THERE ANY DISCOUNTS FOR CHILDREN, SENIORS, STUDENTS, MILITARY, OR GROUPS?</button>
	<div class="panel2">
	  <p>Generally, a child ticket is available for children between 2 and 11 years old and a senior ticket is available for adults aged 65 years old and over. However, some theaters may have additional restrictions or use a different age break, so please check with your local theater.

	To see if any discounts are being offered for your theater for purchases, click on a show time to begin the purchase process. All available ticket categories will be displayed on the subsequent page. Look for ticket categories labeled "child", "senior", "military", "student", or similarly named categories which would indicate a specially priced ticket.

	Please be aware that not all theaters make discounts available. Many theaters offer these discounts exclusively at their box office. We suggest that you check with your local theater for their discount policy, identification requirements, and availability.

	Group discount policies also vary by theater and are not offered. Please check with your local theater for group discount availability.</p>
	</div></td>
	  </tr>
		<tr>
		<td><button class="accordion">ARE TICKETS REFUNDABLE?</button>
	<div class="panel2">
	  <p>Yes, you may exchange or request a refund for your entire order, less the convenience fee, up until the posted showtime. You'll have to complete your refund and exchange before the posted showtime. For full terms and conditions, please see our Movie Ticket Policy.

	Just sign in or create your free account using the same email address that was used to purchase your tickets. Please note that for some orders, you may be asked to contact our Customer Service team or your local theater to complete your refund.

	In order to continue to provide movie fans with showtimes, exclusive content and easy-to-use tools, our tickets include a non-refundable convenience fee. A refund of your order, in most cases, returns the cost of your ticket(s) back to your original payment method, less the convenience fee. An exchange allows you to recoup both the cost of your ticket(s), as well as your convenience fee, in the form of a credit that may be used for a future purchase at any ticketing theater.
	</p>
	</div></td>
	  </tr>
		<tr>
		<td><button class="accordion">HOW DO I GET A REFUND OR EXCHANGE?</button>
	<div class="panel2">
	  <p>You may exchange or request a refund for your entire order, less the convenience fee, through until the posted showtime. You'll have to complete your refund and exchange before the posted showtime. For full terms and conditions, please see our Movie Ticket Policy.

	In certain circumstances, you may be asked to contact our Customer Service team or the theater before the refund or exchange can be completed. See our Movie Ticket Policy for more details. Note that we can only refund or exchange your entire order and not individual tickets within the order.
	</p>
	</div></td>
	  </tr>
		<tr>
		<td><button class="accordion">WHAT ARE CREDITS AND HOW DO I USE THEM?</button>
	<div class="panel2">
	  <p> Credits are dollar value balances that are deposited and stored within your account after you make an exchange. These credits never expire and can be used towards any ticket purchase on Cedar.

	You can use your Credits by logging in with your account during checkout. Your Credit balance will automatically be applied towards your purchase.

	Have a gift card you want to use? No problem. You can still add promo codes and gift cards to your order and they will be applied before your Credit is applied.

	Please note that unfortunately, Credits cannot be transferred between accounts.</p>
	</div></td>
	  </tr>
		<tr>
		<td><button class="accordion">I FORGOT THE PASSWORD TO MY ACCOUNT AND CAN'T SIGN IN.</button>
	<div class="panel2">
	  <p>If you forgot your password, click here to enter the email address that you used to create your account and a temporary password will be sent to your email address. Once you click the 'SEND EMAIL' button (the 'send email' button is shown by clicking on the 'click here' link shown above), your password will be emailed to that address.</p>
	</div></td>
	  </tr>
		<tr>
		<td><button class="accordion">HOW DO I REDEEM MY GIFT CARD?</button>
	<div class="panel2">
	  <p>Using your gift card is simple:
	Go to our website and use our search box to find showtimes and theaters near you.
	Select a show time and checkout.
	Under the payment section, click on Use Gift Card and enter your gift card code and pin (if available).
	If your purchase is more than the value of your gift card, you will have to pay the remaining balance with another method of payment. If your purchase is less than the value of your gift card, you can use any remaining balance on your next purchase.
	Please complete your purchase and enjoy the show.
	There are no additional fees to use or redeem gift cards, However, a per ticket convenience fee will be applied to the order regardless of whether you are using a credit card, PayPal, gift card, or other payment method to pay for the tickets.</p>
	</div></td>
	  </tr>

		<tr>
		<td><button class="accordion">WHERE IS THE GIFT CARD I ORDERED?</button>
	<div class="panel2">
	  <p>Physical gift cards:
	If you selected shipping by USPS: all card orders take 2-3 business days to process and print. USPS mail will then take approximately 7-10 business days to arrive after processing.

	If you selected shipping by FedEx: cards ship out after the standard 2-3 business days processing time. To track your FedEx shipment, please click here.

	Digital gift cards:
	If you selected immediate delivery (default setting): your gift card will be sent by email within the next 60 minutes.

	If you selected to schedule your delivery on a specific date: your gift card will be emailed on the date, time, and time zone you specified during checkout.</p>
	</div></td>
	  </tr>

		<tr>
		<td><button class="accordion">WHAT IS A CEDAR GIFT CARD AND WHERE CAN I BUY ONE?</button>
	<div class="panel2">
	  <p>A gift card is a digital or physical gift card. You can buy gift cards in various preset dollar amounts and can email for immediate use or choose to gift a physical card. gift cards can be redeemed online or on our free mobile app for tickets to any movie at any theater in the network.

	Gift cards sent by email deliver instantly, or can be scheduled ahead of time to help you stay on top of birthdays, anniversaries or other important dates.

	Physical cards are a great collectible keepsake for your favorite movie fan – choose from dozens of designs including ones featuring the latest blockbuster movies, or add a personal touch by uploading your own photo to print on our custom card.

	You can buy a digital gift card on website and choose to deliver by email instantly, or schedule to be delivered on a specific date.

	You can buy physical gift cards at retail stores, including Walgreens, CVS, Walmart, Kroger, Target, Safeway, Vons, Ralphs, Rite Aid, The Home Depot, Lowes, Toys ‘R Us, Kmart, Sam’s Club, Giant Eagle, Publix and many more.

	You can also buy physical gift cards on Amazon. You can choose from dozens of card designs including ones featuring the latest blockbuster movies, or add a personal touch by uploading your own photo to print on our custom card, and ship in a personalized greeting card.</p>
	</div></td>
	  </tr>

		<tr>
		<td><button class="accordion">ARE THERE ANY FEES FOR USING OR BUYING A GIFT CARD?</button>
	<div class="panel2">
	  <p>There are no extra fees when you purchase a gift card at retail stores, or gift cards that you send via email. You only pay the face value of the card (for example: $25 for a $25 card).</p>
	</div></td>
	  </tr>

		<tr>
		<td><button class="accordion">WHERE CAN I SEE REVIEWS FOR MOVIE?</button>
	<div class="panel2">
	  <p>Navigate to a movie page by searching with movie name. Select review tab and you will be able to see reviews on the movie.</p>
	</div></td>
	  </tr>

		<tr>
		<td><button class="accordion">HOW CAN I WRITE A REVIEW?</button>
	<div class="panel2">
	  <p>Log in to your account with your email. Navigate to the movie review page and click on write review button.</p>
	</div></td>
	  </tr>

	</table>

	<script>

	var acc = document.getElementsByClassName("accordion");
	var i;

	for (i = 0; i < acc.length; i++) {
		acc[i].onclick = function(){
			this.classList.toggle("active");
			var panel2 = this.nextElementSibling;
			if (panel2.style.display === "block") {
				panel2.style.display = "none";
			} else {
				panel2.style.display = "block";
			}
		}
	}

	function myFunction() {
	  // Declare variables 
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("myInput");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("myTable");
	  tr = table.getElementsByTagName("tr");

	  // Loop through all table rows, and hide those who don't match the search query
	  for (i = 0; i < tr.length; i++) {
		td = tr[i].getElementsByTagName("td")[0];
		if (td) {
		  if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
			  tr[i].style.display = "block";
		  } else {
			tr[i].style.display = "none";
		  }
		} 
	  }
	}
	</script>
				</div>

			</div><!-- modal-content -->
		</div><!-- modal-dialog -->
	</div><!-- modal -->
	
	
</div><!-- container -->
