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

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .container {\r\n");
      out.write("            width: 90%;\r\n");
      out.write("        }\r\n");
      out.write("        .carousel-inner > .item > img,\r\n");
      out.write("        .carousel-inner > .item > a > img {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>");
      if (_jspx_meth_tiles_getAsString_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><img src=\"/resources/img/movie.png\" alt=\"Team Cedar\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\r\n");
      out.write("            <form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <a class=\"team-name\" href=\"#\"> TEAM CEDAR</a>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control search-bar\" placeholder=\"Search\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"actor_overview.html\" class=\"dropdown\">MOVIES<b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu multi-column columns-4\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\">NOW PLAYING</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">The Lego Batman Movie</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Fifty Shades Darker</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">The Great Wall (2017)</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">John Wick: Chapter 2</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Fist Fight</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Hidden Figures</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Split (2017)</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\">OPENING THIS WEEK</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Collide</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Get Out</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Rock Dog</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Bitter Harvest (2017)</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Dying Laughing</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Fabricated City</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">My Life as a Zucchini</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\">PRE SALES TICKETS</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Beauty and the Beast (2017)</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Kong: Skull Island</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Before I Fall</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Logan (2017)</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">The Shack</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Kong: Skull Island</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">The Belko Experiment</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\">EXPLORE MORE</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Watch Trailers on Movieclips</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Top Box Office</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">New DVDs</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">MOVIES TIME + TICKETS<b\r\n");
      out.write("                            class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu multi-column columns-3\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                    <li class=\"divider\"></li>\r\n");
      out.write("                                    <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("                       aria-expanded=\"false\">MOVIE NEWS <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu multi-column columns-4 movie-news\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\">FEATURED MOVIE NEWS</a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><img class=\"nav-movie-news-img\" alt=\"\"\r\n");
      out.write("                                                         src=\"http://images.fandango.com/r103.4/ImageRenderer/300/210/redesign/static/img/noxlandscape.jpg/0/cp/cpc/images/fandangoblog/everettcollection_huntsman2-neighbors2_170223.jpg\"></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"#\">News Briefs: Charlize Theron, Seth Rogen to Star in 'Flarsky'</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\"><br></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><img class=\"nav-movie-news-img\" alt=\"\"\r\n");
      out.write("                                                         src=\"https://images.fandango.com/images/spotlight/everettcollection_logan-170220.jpg\"></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"#\">'Logan' Buzz: Is There a Postcredits Scene? Plus: What Might Bring\r\n");
      out.write("                                        Hugh Jackman Back As Wolverine?</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\"><br></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><img class=\"nav-movie-news-img\" alt=\"\"\r\n");
      out.write("                                                         src=\"https://images.fandango.com/images/fandangoblog/nightwing-arkham.jpg\"></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                    <li><a href=\"#\">More Batman News: Nightwing Is Getting His Own Movie</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <ul class=\"multi-column-dropdown\">\r\n");
      out.write("                                    <li class=\"coloumn-heading\"><a href=\"#\">EXPLORE CONTENT</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">MOVIE REVIEWS</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">FAMILY</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">INDIE MOVIE GUIDE</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">AWARDS MATCH</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">WEEKEND TICKET</a></li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("                       aria-expanded=\"false\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("<span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu login\">\r\n");
      out.write("                        <a href=\"/sign-up\" class=\"btn btn-lg btn-primary\"><span class=\"glyphicon glyphicon-fire\"></span> JOIN\r\n");
      out.write("                            CEDAR FOR FREE</a>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <p class=\"text-muted\"><em>(it only takes few moments to join)</em></p>\r\n");
      out.write("                        <p>Already a Cedar Member? <a href=\"/login\" class=\"text-primary\"><strong>Sign In</strong></a></p>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div><!-- /.navbar-collapse -->\r\n");
      out.write("    </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_tiles_insertAttribute_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_insertAttribute_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</center>\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/js/jquery.1.10.2.min.js");
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
    _jspx_th_c_url_1.setValue("/resources/js/main.js");
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
    _jspx_th_c_url_2.setValue("/resources//semantic/dist/semantic.min.js");
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
    _jspx_th_c_url_3.setValue("/resources/js/carousel.js");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty name}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty name}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            LOGIN\r\n");
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
