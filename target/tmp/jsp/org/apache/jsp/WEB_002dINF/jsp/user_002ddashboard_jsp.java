package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002ddashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link href=\"https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"exTab1\" class=\"container\">\n");
      out.write("\n");
      out.write("\t<span>\n");
      out.write("\t\t<h1 class=\"actor-name\">User Dashboard</h1>\n");
      out.write("\t</span>\n");
      out.write("\n");
      out.write("\t<ul class=\"nav nav-pills\">\n");
      out.write("\t\t<li class=\"active\"><a href=\"#1a\" data-toggle=\"tab\">DASHBOARD</a></li>\n");
      out.write("\t\t<li><a href=\"#2a\" data-toggle=\"tab\">PURCHASE HISTORY</a></li>\n");
      out.write("\t\t<li><a href=\"#3a\" data-toggle=\"tab\">ACCOUNT SETTINGS</a></li>\n");
      out.write("\t\t<li><a href=\"#4a\" data-toggle=\"tab\">SUBSCRIPTIONS</a></li>\n");
      out.write("\t\t<li><a href=\"#5a\" data-toggle=\"tab\">GIFT CARD</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t<div class=\"tab-content clearfix\">\n");
      out.write("\t\t<div class=\"tab-pane active\" id=\"1a\">\n");
      out.write("\t\t\t<div class=\"row actor\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 biographyAndPhoto\">\n");
      out.write("\t\t\t\t\t<div class=\"container wrap\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-6 col-md-offset-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"well well-sm\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4 col-md-6 col-lg-7\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/300x200\" alt=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-rounded img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-md-6 col-lg-5 card\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<small><cite title=\"San Diego, USA\">Stony\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tBrook, NY<i class=\"glyphicon glyphicon-map-marker\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</cite></small>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-envelope\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br /> <br /> <i class=\"glyphicon glyphicon-gift\"></i>Joined\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.creationDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<h1>MY THEATRE</h1>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row pricing\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<h1>MY REVIEWS</h1>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row pricing\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"tab-pane\" id=\"2a\">\n");
      out.write("\t\t\t<div class=\"row actor\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row pricing\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"well card\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<b>Movie Name</b>\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Cost: $50</p>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Theatre: Name</p>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Date: 1 January 2017</p>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<b># of Tickets: 4</b>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"well card\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<b>Movie Name</b>\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Cost: $50</p>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Theatre: Name</p>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Date: 1 January 2017</p>\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<b># of Tickets: 4</b>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"tab-pane\" id=\"3a\">\n");
      out.write("\t\t\t<div class=\"row actor\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 card\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-group\" id=\"accordion\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#accordion\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseOne\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-file\"> </span>BASIC INFORMATION</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"collapseOne\" class=\"panel-collapse collapse in\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"/updateInfo\" role=\"form\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"firstName\">First Name</label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"firstName\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"lastName\">Last Name</label> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"lastName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- <button type=\"submit\" class=\"btn btn-primary\">Save</button> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\">Save</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Account settings saved.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#accordion\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseTwo\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-th-list\"> </span>Administration</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"collapseTwo\" class=\"panel-collapse collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"grantpo\">Grant PO</label> <select\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"grantpo\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data1772457</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data4516</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data24572457</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"well well-sm well-primary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"grantor\">Grantor</label> <select\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"grantor\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data1772457</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data4516</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data24572457</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"tab-pane\" id=\"4a\">\n");
      out.write("\t\t\t<div class=\"row actor\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<form action=\"/newsletter\" method=\"POST\" class=\"form-signin\">\n");
      out.write("\t\t\t\t\t<h2>News Letter Subscription</h2>\n");
      out.write("\t\t\t\t\t<input  id=\"toggle-event\" type=\"checkbox\"  name= \"subscribed\" ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" data-toggle=\"toggle\" data-on=\"Subscribed\" data-off=\"Unsubscribed\" data-width= \"10%\">\n");
      out.write(" \t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
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
    _jspx_th_c_url_0.setValue("/resources/css/actor-overview.css");
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
    _jspx_th_c_url_1.setValue("/resources/css/rating.css");
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
    _jspx_th_c_url_2.setValue("/resources/js/rating.js");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userTheaters}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("theater");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"well card\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${theater.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</h3>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<hr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Theatre Address Line 1</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<hr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<p>NY</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<hr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<p>ZIP: 11790</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userreviews}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("review");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"well card\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h3>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${review.movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</h3>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<hr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>Review Title</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<hr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${review.review}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subscribed}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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
