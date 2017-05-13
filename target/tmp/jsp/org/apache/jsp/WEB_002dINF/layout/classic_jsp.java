package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class classic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_spring_url_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!-- <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write(" -->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<linl rel=\"stylesheet\"\n");
      out.write("\thref=\"http://cdnjs.cloudflare.com/ajax/libs/semantic-ui/0.12.0/css/semantic.min.css\" />\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>");
      if (_jspx_meth_tiles_getAsString_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href='");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("'><img\n");
      out.write("\t\t\t\t\tsrc=\"/resources/img/movie.png\" alt=\"Team Cedar\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\"\n");
      out.write("\t\t\t\tid=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("\t\t\t\t<form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<a class=\"team-name\" href=\"#\"> TEAM CEDAR</a> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control search-bar\" placeholder=\"Search\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<li><a href=\"/giftcard\"> Buy Gift Card</a></li>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href='");
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown\">MOVIES<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-4\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\">NOW PLAYING</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">The Lego Batman Movie</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Fifty Shades Darker</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">The Great Wall (2017)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">John Wick: Chapter 2</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Fist Fight</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Hidden Figures</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Split (2017)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\">OPENING THIS\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tWEEK</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Collide</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Get Out</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Rock Dog</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Bitter Harvest (2017)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Dying Laughing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Fabricated City</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">My Life as a Zucchini</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\">PRE SALES\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tTICKETS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Beauty and the Beast (2017)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Kong: Skull Island</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Before I Fall</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Logan (2017)</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">The Shack</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Kong: Skull Island</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">The Belko Experiment</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\">EXPLORE MORE</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Watch Trailers on Movieclips</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Top Box Office</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">New DVDs</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\">MOVIES TIME + TICKETS<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\">MOVIE NEWS <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-4 movie-news\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\">FEATURED\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tMOVIE NEWS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><img class=\"nav-movie-news-img\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"http://images.fandango.com/r103.4/ImageRenderer/300/210/redesign/static/img/noxlandscape.jpg/0/cp/cpc/images/fandangoblog/everettcollection_huntsman2-neighbors2_170223.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">News Briefs: Charlize Theron, Seth\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tRogen to Star in 'Flarsky'</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\"><br></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><img class=\"nav-movie-news-img\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://images.fandango.com/images/spotlight/everettcollection_logan-170220.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">'Logan' Buzz: Is There a Postcredits\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tScene? Plus: What Might Bring Hugh Jackman Back As\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tWolverine?</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\"><br></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><img class=\"nav-movie-news-img\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"https://images.fandango.com/images/fandangoblog/nightwing-arkham.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">More Batman News: Nightwing Is\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tGetting His Own Movie</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"coloumn-heading\"><a href=\"#\">EXPLORE\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tCONTENT</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">MOVIE REVIEWS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">FAMILY</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">INDIE MOVIE GUIDE</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">AWARDS MATCH</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">WEEKEND TICKET</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                         ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                         <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu login\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.container-fluid -->\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_tiles_insertAttribute_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t");
      if (_jspx_meth_tiles_insertAttribute_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/css/footer.css");
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
    _jspx_th_c_url_1.setValue("/resources/css/navbar.css");
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
    _jspx_th_c_url_2.setValue("/resources/js/jquery-3.2.1.min.js");
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
    _jspx_th_c_url_3.setValue("/resources/semantic/dist/semantic.min.css");
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
    _jspx_th_c_url_4.setValue("/resources/js/validator.min.js");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/resources/js/logout.js");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/resources/js/validator.min.js");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_tiles_getAsString_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_getAsString_0 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.GetAsStringTag.class) : new org.apache.tiles.jsp.taglib.GetAsStringTag();
    _jspx_th_tiles_getAsString_0.setJspContext(_jspx_page_context);
    _jspx_th_tiles_getAsString_0.setName("title");
    _jspx_th_tiles_getAsString_0.doTag();
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tiles_getAsString_0);
    return false;
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setValue("/movies");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_1);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            LOGIN\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"/sign-up\" class=\"btn btn-lg btn-primary\"><span\n");
        out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-fire\"></span> JOIN CEDAR FOR FREE</a>\n");
        out.write("\t\t\t\t\t\t\t\t<br>\n");
        out.write("\t\t\t\t\t\t\t\t<p class=\"text-muted\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<em>(it only takes few moments to join)</em>\n");
        out.write("\t\t\t\t\t\t\t\t</p>\n");
        out.write("\t\t\t\t\t\t\t\t<p>\n");
        out.write("\t\t\t\t\t\t\t\t\tAlready a Cedar Member? <a href=\"/login\" class=\"text-primary\"><strong>Sign\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tIn</strong></a>\n");
        out.write("\t\t\t\t\t\t\t\t</p>\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"/\" class=\"btn btn-lg btn-primary\"><span\n");
        out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-fire\"></span> MY ACCOUNT SETTINGS</a>\n");
        out.write("\t\t\t\t\t\t\t\t<br>\n");
        out.write("\t\t\t\t\t\t\t\t<p> <a  href=\"/logout\" onclick='return logout()' class=\"text-primary\"><strong>LOGOUT</strong></a></p>\n");
        out.write("\t\t\t\t\t\t\t\t<p> <a  href=\"/user-dashboard\"  class=\"text-primary\"><strong>MY ACCOUNT</strong></a></p>\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_0 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_0.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_0.setName("body");
    _jspx_th_tiles_insertAttribute_0.doTag();
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tiles_insertAttribute_0);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_1 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_1.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_1.setName("footer");
    _jspx_th_tiles_insertAttribute_1.doTag();
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tiles_insertAttribute_1);
    return false;
  }
}
