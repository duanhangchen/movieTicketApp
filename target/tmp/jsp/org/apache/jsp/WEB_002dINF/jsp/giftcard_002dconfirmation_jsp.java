package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class giftcard_002dconfirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>User Information</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Purchase Confirmation</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xs-12\">\r\n");
      out.write("    \t\t<div class=\"invoice-title\">\r\n");
      out.write("    \t\t\t<h2>Invoice</h2><h3 class=\"pull-right\">Order # 12345</h3>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t\t<hr>\r\n");
      out.write("    \t\t<div class=\"row\">\r\n");
      out.write("    \t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("    \t\t\t\t<address>\r\n");
      out.write("    \t\t\t\t<strong>Billed To:</strong><br>\r\n");
      out.write("    \t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gFrom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("    \t\t\t\t</address>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"col-xs-6 text-right\">\r\n");
      out.write("    \t\t\t\t<address>\r\n");
      out.write("        \t\t\t<strong>Shipped To:</strong><br>\r\n");
      out.write("    \t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("    \t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("    \t\t\t\t</address>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t\t<div class=\"row\">\r\n");
      out.write("    \t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("    \t\t\t\t<address>\r\n");
      out.write("    \t\t\t\t\t<strong>Payment Method:</strong><br>\r\n");
      out.write("    \t\t\t\t\tVisa ending **** ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cNumEnd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("    \t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("    \t\t\t\t</address>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"col-xs-6 text-right\">\r\n");
      out.write("    \t\t\t\t<address>\r\n");
      out.write("    \t\t\t\t\t<strong>Order Date:</strong><br>\r\n");
      out.write("    \t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br><br>\r\n");
      out.write("    \t\t\t\t</address>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    \t<div class=\"col-md-12\">\r\n");
      out.write("    \t\t<div class=\"panel panel-default\">\r\n");
      out.write("    \t\t\t<div class=\"panel-heading\">\r\n");
      out.write("    \t\t\t\t<h3 class=\"panel-title\"><strong>Order summary</strong></h3>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"panel-body\">\r\n");
      out.write("    \t\t\t\t<div class=\"table-responsive\">\r\n");
      out.write("    \t\t\t\t\t<table class=\"table table-condensed\">\r\n");
      out.write("    \t\t\t\t\t\t<thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("        \t\t\t\t\t\t\t<td><strong>Item</strong></td>\r\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Price</strong></td>\r\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-center\"><strong>Quantity</strong></td>\r\n");
      out.write("        \t\t\t\t\t\t\t<td class=\"text-right\"><strong>Totals</strong></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("    \t\t\t\t\t\t</thead>\r\n");
      out.write("    \t\t\t\t\t\t<tbody>\r\n");
      out.write("    \t\t\t\t\t\t\t<!-- foreach ($order->lineItems as $line) or some such thing here -->\r\n");
      out.write("    \t\t\t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td><strong>Gift Card</strong><br>\r\n");
      out.write("    \t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("    \t\t\t\t\t\t\t\t</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-center\">1</td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"text-right\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line\"></td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-center\"><strong>Total</strong></td>\r\n");
      out.write("    \t\t\t\t\t\t\t\t<td class=\"no-line text-right\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("    \t\t\t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t\t\t</tbody>\r\n");
      out.write("    \t\t\t\t\t</table>\r\n");
      out.write("    \t\t\t\t\t<a href=\"/\" class=\"btn btn-success btn-lg btn-block\" role=\"button\">Confirm</a>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
