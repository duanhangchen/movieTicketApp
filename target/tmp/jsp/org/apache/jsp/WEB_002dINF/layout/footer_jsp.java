package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<link\n");
      out.write("\thref=\"https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!--footer start from here-->\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("button.accordion {\n");
      out.write("    background-color: #eee;\n");
      out.write("    color: black;\n");
      out.write("    cursor: pointer;\n");
      out.write("    padding: 18px;\n");
      out.write("    width: 100%;\n");
      out.write("    border: none;\n");
      out.write("    text-align: left;\n");
      out.write("    outline: none;\n");
      out.write("    font-size: 15px;\n");
      out.write("    transition: 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.accordion.active, button.accordion:hover {\n");
      out.write("    background-color: #ddd; \n");
      out.write("}\n");
      out.write("\n");
      out.write("div.panel2 {\n");
      out.write("    padding: 0 18px;\n");
      out.write("    display: none;\n");
      out.write("    background-color: white;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-4 col-sm-6 footerleft \">\n");
      out.write("\t\t\t\t<div class=\"logofooter\">Team Cedar</div>\n");
      out.write("\t\t\t\t<p>Movie Ticket Application</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-phone\"></i> Phone: xxx-xxx-xxxx\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-envelope\"></i> E-mail :\n");
      out.write("\t\t\t\t\tteamcedar308@gmail.com\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\n");
      out.write("\t\t\t\t<h6 class=\"heading7\">GENERAL LINKS</h6>\n");
      out.write("\t\t\t\t<ul class=\"footer-ul\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> <button type=\"button\" class=\"btn btn-demo\" data-toggle=\"modal\" data-target=\"#myModal2\" style=\"color:black\">Help!\n");
      out.write("\t\t</button></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</footer>\n");
      out.write("<!--footer start from here-->\n");
      out.write("\n");
      out.write("<div class=\"copyright\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<p>Â© 2017 - All Rights with Cedar</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<ul class=\"bottom_ul\">\n");
      out.write("\t\t\t\t<li><a href=\"#\">Team Cedar</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Faq's</a></li>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"reviewModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<form role=\"form\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<h5 id=\"reviewfont\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"message-text\" id=\"reviewfont\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-label\">Title:</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"title\" name=\"title\"></input>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"message-text\" id=\"reviewfont\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-label\">Body:</label>\n");
      out.write("\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control\" id=\"body\" name=\"body\"></textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Submit Form</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container demo\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"text-center\">\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Modal -->\n");
      out.write("\t<div class=\"modal right fade\" id=\"myModal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel2\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\" >\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel2\" style=\"color: black\">Help!</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"myInput\" size=\"50\" onkeyup=\"myFunction()\" placeholder=\"Search for FAQs\" style=\"color:black\" >\n");
      out.write("\n");
      out.write("\t<table id=\"myTable\">\n");
      out.write("\t  <tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t<button class=\"accordion\">HOW DO I PURCHASE MOVIE TICKETS?</button>\n");
      out.write("\t\t<div class=\"panel2\">\n");
      out.write("\t  <p>You can purchase movie tickets in these steps:\n");
      out.write("\t(1) Navigate to a theather page by searching with address or zipcode\n");
      out.write("\t2.Select show time to begin checkout. Choose number of tickets and select your seat if reserved seating is available.\n");
      out.write("\t(3) Log in to your account or checkout as a guest and complete your purchase with valid payment method.\n");
      out.write("\t(4) Review your order, complete your purchase and enjoy the show.\n");
      out.write("\t</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t  <tr>\n");
      out.write("\t\t<td><button class=\"accordion\">WHEN WILL I GET MY EMAIL ORDER CONFIRMATION?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>Shortly after you complete your ticket purchase, an email confirmation will be sent to the email address that you provided during checkout, and will also be stored in your account information under purchase history. If you lost or can't find your confirmation email, please check your SPAM folder. You can also sign in to account to see your purchase history.\n");
      out.write("\t</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t  <tr>\n");
      out.write("\t\t<td><button class=\"accordion\">HOW DO I PICK UP MY TICKETS?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>After you complete your purchase, youâll see a confirmation page that tells you exactly how to pick up your tickets. Depending on the theater and device youâre on, you may print your tickets at home, pick up at a box office or kiosk with a valid credit card, or use a mobile ticket (if available). This information is also available on your confirmation email.\n");
      out.write("\t</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t  <tr>\n");
      out.write("\t\t<td><button class=\"accordion\">ARE THERE ANY DISCOUNTS FOR CHILDREN, SENIORS, STUDENTS, MILITARY, OR GROUPS?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>Generally, a child ticket is available for children between 2 and 11 years old and a senior ticket is available for adults aged 65 years old and over. However, some theaters may have additional restrictions or use a different age break, so please check with your local theater.\n");
      out.write("\n");
      out.write("\tTo see if any discounts are being offered for your theater for purchases, click on a show time to begin the purchase process. All available ticket categories will be displayed on the subsequent page. Look for ticket categories labeled \"child\", \"senior\", \"military\", \"student\", or similarly named categories which would indicate a specially priced ticket.\n");
      out.write("\n");
      out.write("\tPlease be aware that not all theaters make discounts available. Many theaters offer these discounts exclusively at their box office. We suggest that you check with your local theater for their discount policy, identification requirements, and availability.\n");
      out.write("\n");
      out.write("\tGroup discount policies also vary by theater and are not offered. Please check with your local theater for group discount availability.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">ARE TICKETS REFUNDABLE?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>Yes, you may exchange or request a refund for your entire order, less the convenience fee, up until the posted showtime. You'll have to complete your refund and exchange before the posted showtime. For full terms and conditions, please see our Movie Ticket Policy.\n");
      out.write("\n");
      out.write("\tJust sign in or create your free account using the same email address that was used to purchase your tickets. Please note that for some orders, you may be asked to contact our Customer Service team or your local theater to complete your refund.\n");
      out.write("\n");
      out.write("\tIn order to continue to provide movie fans with showtimes, exclusive content and easy-to-use tools, our tickets include a non-refundable convenience fee. A refund of your order, in most cases, returns the cost of your ticket(s) back to your original payment method, less the convenience fee. An exchange allows you to recoup both the cost of your ticket(s), as well as your convenience fee, in the form of a credit that may be used for a future purchase at any ticketing theater.\n");
      out.write("\t</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">HOW DO I GET A REFUND OR EXCHANGE?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>You may exchange or request a refund for your entire order, less the convenience fee, through until the posted showtime. You'll have to complete your refund and exchange before the posted showtime. For full terms and conditions, please see our Movie Ticket Policy.\n");
      out.write("\n");
      out.write("\tIn certain circumstances, you may be asked to contact our Customer Service team or the theater before the refund or exchange can be completed. See our Movie Ticket Policy for more details. Note that we can only refund or exchange your entire order and not individual tickets within the order.\n");
      out.write("\t</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">WHAT ARE CREDITS AND HOW DO I USE THEM?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p> Credits are dollar value balances that are deposited and stored within your account after you make an exchange. These credits never expire and can be used towards any ticket purchase on Cedar.\n");
      out.write("\n");
      out.write("\tYou can use your Credits by logging in with your account during checkout. Your Credit balance will automatically be applied towards your purchase.\n");
      out.write("\n");
      out.write("\tHave a gift card you want to use? No problem. You can still add promo codes and gift cards to your order and they will be applied before your Credit is applied.\n");
      out.write("\n");
      out.write("\tPlease note that unfortunately, Credits cannot be transferred between accounts.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">I FORGOT THE PASSWORD TO MY ACCOUNT AND CAN'T SIGN IN.</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>If you forgot your password, click here to enter the email address that you used to create your account and a temporary password will be sent to your email address. Once you click the 'SEND EMAIL' button (the 'send email' button is shown by clicking on the 'click here' link shown above), your password will be emailed to that address.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">HOW DO I REDEEM MY GIFT CARD?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>Using your gift card is simple:\n");
      out.write("\tGo to our website and use our search box to find showtimes and theaters near you.\n");
      out.write("\tSelect a show time and checkout.\n");
      out.write("\tUnder the payment section, click on Use Gift Card and enter your gift card code and pin (if available).\n");
      out.write("\tIf your purchase is more than the value of your gift card, you will have to pay the remaining balance with another method of payment. If your purchase is less than the value of your gift card, you can use any remaining balance on your next purchase.\n");
      out.write("\tPlease complete your purchase and enjoy the show.\n");
      out.write("\tThere are no additional fees to use or redeem gift cards, However, a per ticket convenience fee will be applied to the order regardless of whether you are using a credit card, PayPal, gift card, or other payment method to pay for the tickets.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">WHERE IS THE GIFT CARD I ORDERED?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>Physical gift cards:\n");
      out.write("\tIf you selected shipping by USPS: all card orders take 2-3 business days to process and print. USPS mail will then take approximately 7-10 business days to arrive after processing.\n");
      out.write("\n");
      out.write("\tIf you selected shipping by FedEx: cards ship out after the standard 2-3 business days processing time. To track your FedEx shipment, please click here.\n");
      out.write("\n");
      out.write("\tDigital gift cards:\n");
      out.write("\tIf you selected immediate delivery (default setting): your gift card will be sent by email within the next 60 minutes.\n");
      out.write("\n");
      out.write("\tIf you selected to schedule your delivery on a specific date: your gift card will be emailed on the date, time, and time zone you specified during checkout.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">WHAT IS A CEDAR GIFT CARD AND WHERE CAN I BUY ONE?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>A gift card is a digital or physical gift card. You can buy gift cards in various preset dollar amounts and can email for immediate use or choose to gift a physical card. gift cards can be redeemed online or on our free mobile app for tickets to any movie at any theater in the network.\n");
      out.write("\n");
      out.write("\tGift cards sent by email deliver instantly, or can be scheduled ahead of time to help you stay on top of birthdays, anniversaries or other important dates.\n");
      out.write("\n");
      out.write("\tPhysical cards are a great collectible keepsake for your favorite movie fan â choose from dozens of designs including ones featuring the latest blockbuster movies, or add a personal touch by uploading your own photo to print on our custom card.\n");
      out.write("\n");
      out.write("\tYou can buy a digital gift card on website and choose to deliver by email instantly, or schedule to be delivered on a specific date.\n");
      out.write("\n");
      out.write("\tYou can buy physical gift cards at retail stores, including Walgreens, CVS, Walmart, Kroger, Target, Safeway, Vons, Ralphs, Rite Aid, The Home Depot, Lowes, Toys âR Us, Kmart, Samâs Club, Giant Eagle, Publix and many more.\n");
      out.write("\n");
      out.write("\tYou can also buy physical gift cards on Amazon. You can choose from dozens of card designs including ones featuring the latest blockbuster movies, or add a personal touch by uploading your own photo to print on our custom card, and ship in a personalized greeting card.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">ARE THERE ANY FEES FOR USING OR BUYING A GIFT CARD?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>There are no extra fees when you purchase a gift card at retail stores, or gift cards that you send via email. You only pay the face value of the card (for example: $25 for a $25 card).</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">WHERE CAN I SEE REVIEWS FOR MOVIE?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>Navigate to a movie page by searching with movie name. Select review tab and you will be able to see reviews on the movie.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><button class=\"accordion\">HOW CAN I WRITE A REVIEW?</button>\n");
      out.write("\t<div class=\"panel2\">\n");
      out.write("\t  <p>Log in to your account with your email. Navigate to the movie review page and click on write review button.</p>\n");
      out.write("\t</div></td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\n");
      out.write("\tvar acc = document.getElementsByClassName(\"accordion\");\n");
      out.write("\tvar i;\n");
      out.write("\n");
      out.write("\tfor (i = 0; i < acc.length; i++) {\n");
      out.write("\t\tacc[i].onclick = function(){\n");
      out.write("\t\t\tthis.classList.toggle(\"active\");\n");
      out.write("\t\t\tvar panel2 = this.nextElementSibling;\n");
      out.write("\t\t\tif (panel2.style.display === \"block\") {\n");
      out.write("\t\t\t\tpanel2.style.display = \"none\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tpanel2.style.display = \"block\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction myFunction() {\n");
      out.write("\t  // Declare variables \n");
      out.write("\t  var input, filter, table, tr, td, i;\n");
      out.write("\t  input = document.getElementById(\"myInput\");\n");
      out.write("\t  filter = input.value.toUpperCase();\n");
      out.write("\t  table = document.getElementById(\"myTable\");\n");
      out.write("\t  tr = table.getElementsByTagName(\"tr\");\n");
      out.write("\n");
      out.write("\t  // Loop through all table rows, and hide those who don't match the search query\n");
      out.write("\t  for (i = 0; i < tr.length; i++) {\n");
      out.write("\t\ttd = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("\t\tif (td) {\n");
      out.write("\t\t  if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("\t\t\t  tr[i].style.display = \"block\";\n");
      out.write("\t\t  } else {\n");
      out.write("\t\t\ttr[i].style.display = \"none\";\n");
      out.write("\t\t  }\n");
      out.write("\t\t} \n");
      out.write("\t  }\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div><!-- modal-content -->\n");
      out.write("\t\t</div><!-- modal-dialog -->\n");
      out.write("\t</div><!-- modal -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</div><!-- container -->\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t<li><a data-toggle=\"modal\" data-target=\"#reviewModal\">Support\n");
        out.write("\t\t\t\t\t\tForm</a></li>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
