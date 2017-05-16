package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_002dout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- <script src=\"http://code.jquery.com/jquery-1.12.4.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>Movie Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showing.movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("<h1>Theater Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showing.theater.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("<h1>Movie Time: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showing.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("\r\n");
      out.write("<form class=\"form-inline\">\r\n");
      out.write("\t<label class=\"mr-sm-2\" for=\"inlineFormCustomSelect\">Adult\r\n");
      out.write("\t\tTicket:</label> <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\"\r\n");
      out.write("\t\tid=\"inlineFormCustomSelect\">\r\n");
      out.write("\t\t<option selected>Choose...</option>\r\n");
      out.write("\t\t<option value=\"1\">One</option>\r\n");
      out.write("\t\t<option value=\"2\">Two</option>\r\n");
      out.write("\t\t<option value=\"3\">Three</option>\r\n");
      out.write("\t</select> <label class=\"mr-sm-2\" for=\"inlineFormCustomSelect\">Child\r\n");
      out.write("\t\tTicket:</label> <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\"\r\n");
      out.write("\t\tid=\"inlineFormCustomSelect\">\r\n");
      out.write("\t\t<option selected>Choose...</option>\r\n");
      out.write("\t\t<option value=\"1\">One</option>\r\n");
      out.write("\t\t<option value=\"2\">Two</option>\r\n");
      out.write("\t\t<option value=\"3\">Three</option>\r\n");
      out.write("\t</select> <label class=\"mr-sm-2\" for=\"inlineFormCustomSelect\">Senior\r\n");
      out.write("\t\tTicket:</label> <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\"\r\n");
      out.write("\t\tid=\"inlineFormCustomSelect\">\r\n");
      out.write("\t\t<option selected>Choose...</option>\r\n");
      out.write("\t\t<option value=\"1\">One</option>\r\n");
      out.write("\t\t<option value=\"2\">Two</option>\r\n");
      out.write("\t\t<option value=\"3\">Three</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h1>jQuery Seat Charts Plugin Demo</h1>\r\n");
      out.write("\t\t\t<div id=\"seat-map\">\r\n");
      out.write("\t\t\t\t<div class=\"front-indicator\">Front</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"booking-details\">\r\n");
      out.write("\t\t\t\t<h2>Booking Details</h2>\r\n");
      out.write("\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\tSelected Seats (<span id=\"counter\">0</span>):\r\n");
      out.write("\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t<ul id=\"selected-seats\">\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\tTotal: <b>$<span id=\"total\">0</span></b>\r\n");
      out.write("\t\t\t\t<button class=\"checkout-button\">Checkout &raquo;</button>\r\n");
      out.write("\t\t\t\t<div id=\"legend\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-primary\" style=\"position: absolute; right: 0;\">Submit</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar firstSeatLabel = 1;\r\n");
      out.write("\t$(document)\r\n");
      out.write("\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\tvar $cart = $('#selected-seats'), $counter = $('#counter'), $total = $('#total'), sc = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t'#seat-map')\r\n");
      out.write("\t\t\t\t\t\t\t\t.seatCharts(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmap : [ 'ee_ee', 'ee_ee', 'ee_ee',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'ee_ee', 'ee', 'ee_ee',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'ee_ee', 'ee_ee', 'eeeee', ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tseats : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\te : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tprice : 40,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclasses : 'economy-class', //your custom CSS class\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcategory : 'Economy Class'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnaming : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttop : false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tgetLabel : function(character,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\trow, column) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn firstSeatLabel++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclick : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (this.status() == 'available') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//let's create a new <li> which we'll add to the cart items\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<li>'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().category\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ' Seat # '\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this.settings.label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ': <b>$'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().price\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</b> <a href=\"#\" class=\"cancel-cart-item\">[cancel]</a></li>')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'id',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'cart-item-'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this.settings.id)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'seatId',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis.settings.id)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.appendTo($cart);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t/*\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t * Lets update the counter and total\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t *\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t * .find function will not find the current seat, because it will change its stauts only after return\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t * 'selected'. This is why we have to add 1 to the length and the current seat price to the total.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t */\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$counter\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(sc\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('selected').length + 1);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$total\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(recalculateTotal(sc)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().price);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn 'selected';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else if (this.status() == 'selected') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//update the counter\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$counter\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(sc\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('selected').length - 1);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//and total\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$total\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.text(recalculateTotal(sc)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t- this\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data().price);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//remove the item from our cart\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'#cart-item-'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ this.settings.id)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.remove();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//seat has been vacated\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn 'available';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else if (this.status() == 'unavailable') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//seat has been already booked\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn 'unavailable';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn this.style();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t//this will handle \"[cancel]\" link clicks\r\n");
      out.write("\t\t\t\t\t\t$('#selected-seats').on(\r\n");
      out.write("\t\t\t\t\t\t\t\t'click',\r\n");
      out.write("\t\t\t\t\t\t\t\t'.cancel-cart-item',\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsc.get(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(this).parents('li:first').data(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'seatId')).click();\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t$('.seatCharts-space').hide();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction recalculateTotal(sc) {\r\n");
      out.write("\t\tvar total = 0;\r\n");
      out.write("\r\n");
      out.write("\t\t//basically find every selected seat and sum its price\r\n");
      out.write("\t\tsc.find('selected').each(function() {\r\n");
      out.write("\t\t\ttotal += this.data().price;\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\treturn total;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar _gaq = _gaq || [];\r\n");
      out.write("\t_gaq.push([ '_setAccount', 'UA-36251023-1' ]);\r\n");
      out.write("\t_gaq.push([ '_setDomainName', 'jqueryscript.net' ]);\r\n");
      out.write("\t_gaq.push([ '_trackPageview' ]);\r\n");
      out.write("\r\n");
      out.write("\t(function() {\r\n");
      out.write("\t\tvar ga = document.createElement('script');\r\n");
      out.write("\t\tga.type = 'text/javascript';\r\n");
      out.write("\t\tga.async = true;\r\n");
      out.write("\t\tga.src = ('https:' == document.location.protocol ? 'https://ssl'\r\n");
      out.write("\t\t\t\t: 'http://www')\r\n");
      out.write("\t\t\t\t+ '.google-analytics.com/ga.js';\r\n");
      out.write("\t\tvar s = document.getElementsByTagName('script')[0];\r\n");
      out.write("\t\ts.parentNode.insertBefore(ga, s);\r\n");
      out.write("\t})();\r\n");
      out.write("</script>");
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
}
