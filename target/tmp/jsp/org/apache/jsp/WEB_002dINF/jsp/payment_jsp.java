package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar firstSeatLabel = 1;\n");
      out.write("\t$(document)\n");
      out.write("\t\t\t.ready(\n");
      out.write("\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\tvar $cart = $('#selected-seats'), $counter = $('#counter'), $total = $('#total'), sc = $(\n");
      out.write("\t\t\t\t\t\t\t\t'#seat-map')\n");
      out.write("\t\t\t\t\t\t\t\t.seatCharts(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmap : [ 'ee_eeeee', 'ee_eeeee',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'ee_eeeee', 'ee_eeeee',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'ee_eeeee', 'ee_eeeee',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'ee_eeeee', 'eeeee_ee',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'eeeeeeeee', ],\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tseats : {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\te : {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tprice : 40,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclasses : 'economy-class', //your custom CSS class\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcategory : 'Economy Class'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnaming : {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttop : false,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tgetLabel : function(character,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trow, column) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn firstSeatLabel++;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclick : function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (this.status() == 'available') {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//let's create a new <li> which we'll add to the cart items\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<li>'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().category\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ' Seat # '\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this.settings.label\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ': <b>$'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().price\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</b> <a href=\"#\" class=\"cancel-cart-item\">[cancel]</a></li>')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'id',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'cart-item-'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this.settings.id)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'seatId',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.settings.id)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.appendTo($cart);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t * Lets update the counter and total\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t *\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t * .find function will not find the current seat, because it will change its stauts only after return\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t * 'selected'. This is why we have to add 1 to the length and the current seat price to the total.\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t */\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$counter\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(sc\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('selected').length + 1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$total\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(recalculateTotal(sc)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().price);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn 'selected';\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else if (this.status() == 'selected') {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//update the counter\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$counter\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(sc\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('selected').length - 1);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//and total\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$total\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(recalculateTotal(sc)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t- this\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().price);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//remove the item from our cart\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#cart-item-'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this.settings.id)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.remove();\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//seat has been vacated\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn 'available';\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else if (this.status() == 'unavailable') {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//seat has been already booked\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn 'unavailable';\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn this.style();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t//this will handle \"[cancel]\" link clicks\n");
      out.write("\t\t\t\t\t\t$('#selected-seats').on(\n");
      out.write("\t\t\t\t\t\t\t\t'click',\n");
      out.write("\t\t\t\t\t\t\t\t'.cancel-cart-item',\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here\n");
      out.write("\t\t\t\t\t\t\t\t\tsc.get(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(this).parents('li:first').data(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'seatId')).click();\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t$('.seatCharts-space').hide();\n");
      out.write("\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\tfunction recalculateTotal(sc) {\n");
      out.write("\t\tvar total = 0;\n");
      out.write("\n");
      out.write("\t\t//basically find every selected seat and sum its price\n");
      out.write("\t\tsc.find('selected').each(function() {\n");
      out.write("\t\t\ttotal += this.data().price;\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\treturn total;\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar _gaq = _gaq || [];\n");
      out.write("\t_gaq.push([ '_setAccount', 'UA-36251023-1' ]);\n");
      out.write("\t_gaq.push([ '_setDomainName', 'jqueryscript.net' ]);\n");
      out.write("\t_gaq.push([ '_trackPageview' ]);\n");
      out.write("\n");
      out.write("\t(function() {\n");
      out.write("\t\tvar ga = document.createElement('script');\n");
      out.write("\t\tga.type = 'text/javascript';\n");
      out.write("\t\tga.async = true;\n");
      out.write("\t\tga.src = ('https:' == document.location.protocol ? 'https://ssl'\n");
      out.write("\t\t\t\t: 'http://www')\n");
      out.write("\t\t\t\t+ '.google-analytics.com/ga.js';\n");
      out.write("\t\tvar s = document.getElementsByTagName('script')[0];\n");
      out.write("\t\ts.parentNode.insertBefore(ga, s);\n");
      out.write("\t})();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1>Please Select Your Seats</h1>\n");
      out.write("\t\t<div id=\"seat-map\">\n");
      out.write("\t\t\t<div class=\"front-indicator\">Front</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<form method=\"POST\" action=\"/theaters/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${theater.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showing.showingId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/confirmation/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adult}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${senior}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${child}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"col-sm-4\">\n");
      out.write("\t\t<div class=\"well\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form_main\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"heading\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Payment Information</strong><span></span>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" required=\"\" placeholder=\"Please input Name\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"\" name=\"giftFrom\" class=\"txt\"> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" required=\"\" placeholder=\"Please input Email\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"\" name=\"giftEmail\" class=\"txt\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-sm-4\">\n");
      out.write("\t\t<div class=\"well\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-md-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"panel-title\">Payment Details</h3>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"cardNumber\"> CARD NUMBER</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"cardNumber\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Valid Card Number\" required autofocus /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"input-group-addon\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-lock\"></span></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-7 col-md-7\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"expityMonth\"> EXPIRY DATE</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-6 pl-ziro\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"expityMonth\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"MM\" required />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-6 pl-ziro\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"expityYear\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"YY\" required />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-5 col-md-5 pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"cvCode\"> CV CODE</label> <input type=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"cvCode\" placeholder=\"CV\" required />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<br /> <input type=\"submit\" value=\"Pay\" name=\"submit\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success btn-lg btn-block\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</form>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/css/jquery.seat-charts.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/resources/css/seating.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/js/jquery.seat-charts.min.js");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/resources/js/formcalculations.js");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/resources/css/gift.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }
}
