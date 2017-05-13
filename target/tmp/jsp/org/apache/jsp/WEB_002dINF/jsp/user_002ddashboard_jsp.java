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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<link href=\"https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"exTab1\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<span>\r\n");
      out.write("\t\t<h1 class=\"actor-name\">User Dashboard</h1>\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t<li class=\"active\"><a href=\"#1a\" data-toggle=\"tab\">DASHBOARD</a></li>\r\n");
      out.write("\t\t<li><a href=\"#2a\" data-toggle=\"tab\">PURCHASE HISTORY</a></li>\r\n");
      out.write("\t\t<li><a href=\"#3a\" data-toggle=\"tab\">ACCOUNT SETTINGS</a></li>\r\n");
      out.write("\t\t<li><a href=\"#4a\" data-toggle=\"tab\">SUBSCRIPTIONS</a></li>\r\n");
      out.write("\t\t<li><a href=\"#5a\" data-toggle=\"tab\">GIFT CARD</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<div class=\"tab-content clearfix\">\r\n");
      out.write("\t\t<div class=\"tab-pane active\" id=\"1a\">\r\n");
      out.write("\t\t\t<div class=\"row actor\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 biographyAndPhoto\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container wrap\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-6 col-md-offset-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"well well-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4 col-md-6 col-lg-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/300x200\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-rounded img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-md-6 col-lg-5 card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<small><cite title=\"San Diego, USA\">Stony\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tBrook, NY<i class=\"glyphicon glyphicon-map-marker\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</cite></small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-envelope\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<br /> <br /> <i class=\"glyphicon glyphicon-gift\"></i>Joined\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.creationDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>MY THEATRE</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row pricing\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"well card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<b>Theatre Name</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Theatre Address Line 1</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>NY</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>ZIP: 11790</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"well card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<b>Theatre Name</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Theatre Address Line 1</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>NY</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>ZIP: 11790</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>MY REVIEWS</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row pricing\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"tab-pane\" id=\"2a\">\r\n");
      out.write("\t\t\t<div class=\"row actor\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row pricing\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"well card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b>Movie Name</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Cost: $50</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Theatre: Name</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Date: 1 January 2017</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b># of Tickets: 4</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"well card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b>Movie Name</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Cost: $50</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Theatre: Name</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Date: 1 January 2017</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b># of Tickets: 4</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"tab-pane\" id=\"3a\">\r\n");
      out.write("\t\t\t<div class=\"row actor\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-group\" id=\"accordion\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseOne\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-file\"> </span>BASIC INFORMATION</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"collapseOne\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"/updateInfo\" role=\"form\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"firstName\">First Name</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"firstName\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"lastName\">Last Name</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"lastName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- <button type=\"submit\" class=\"btn btn-primary\">Save</button> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\">Save</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Account settings saved.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseTwo\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-th-list\"> </span>Administration</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"collapseTwo\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"grantpo\">Grant PO</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"grantpo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data1772457</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data4516</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data24572457</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"well well-sm well-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"grantor\">Grantor</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"grantor\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data1772457</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data4516</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>Data24572457</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"tab-pane\" id=\"4a\">\r\n");
      out.write("\t\t\t<div class=\"row actor\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<form action=\"/newsletter\" method=\"POST\" class=\"form-signin\">\r\n");
      out.write("\t\t\t\t\t<h2>News Letter Subscription</h2>\r\n");
      out.write("\t\t\t\t\t<input  id=\"toggle-event\" type=\"checkbox\"  name= \"subscribed\" ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" data-toggle=\"toggle\" data-on=\"Subscribed\" data-off=\"Unsubscribed\" data-width= \"10%\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userreviews}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("review");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"well card\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<h3>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${review.movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</h3>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>Review Title</p>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${review.review}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
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
