package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

<<<<<<< HEAD
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

=======
>>>>>>> e0b259753c2fcd86f11a7759083fb489204c0759
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

<<<<<<< HEAD
  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
  }

=======
>>>>>>> e0b259753c2fcd86f11a7759083fb489204c0759
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

<<<<<<< HEAD
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<h1 class=\"ui block header\">\n");
      out.write("    Buy Movie Tickets\n");
      out.write("</h1>\n");
      out.write("<br>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <div class=\"carousel slide multi-item-carousel\" id=\"theCarousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <a href=\"#1\"><img\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/183502/Fifty%20Shades%20Darker.jpg\"\n");
      out.write("                                    class=\"img-responsive\"></a>\n");
      out.write("                            <div class=\"movie-details\">\n");
      out.write("                                <p class=\"movie-name\"><strong>Fifty Shades Darker</strong></p>\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <a href=\"#1\"><img\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/191368/legobatmanmovie-posterart.jpg\"\n");
      out.write("                                    class=\"img-responsive\"></a>\n");
      out.write("                            <div class=\"movie-details\">\n");
      out.write("                                <p class=\"movie-name\"><strong>lego batman movie</strong></p>\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <a href=\"#1\"><img\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196665/Get%20Out.jpg\"\n");
      out.write("                                    class=\"img-responsive\"></a>\n");
      out.write("                            <div class=\"movie-details\">\n");
      out.write("                                <p class=\"movie-name\"><strong>Get Out</strong></p>\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <a href=\"#1\"><img\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196708/ROCKDOG_1Sht_Payoff_VF.jpg\"\n");
      out.write("                                    class=\"img-responsive\"></a>\n");
      out.write("                            <div class=\"movie-details\">\n");
      out.write("                                <p class=\"movie-name\"><strong>ROCK DOG</strong></p>\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <a href=\"#1\"><img\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/192068/HiddenFigures.jpg\"\n");
      out.write("                                    class=\"img-responsive\"></a>\n");
      out.write("                            <div class=\"movie-details\">\n");
      out.write("                                <p class=\"movie-name\"><strong>Hidden Figures</strong></p>\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <a href=\"#1\"><img\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196271/FIST-FIGHT_Tsr_1Sht.jpg\"\n");
      out.write("                                    class=\"img-responsive\"></a>\n");
      out.write("                            <div class=\"movie-details\">\n");
      out.write("                                <p class=\"movie-name\"><strong>FIST-FIGHT</strong></p>\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- add  more items here -->\n");
      out.write("                    <!-- Example item start:  -->\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <a href=\"#1\"><img\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/198127/FIN09_TheShack_1Sht_Payoff_.jpg\"\n");
      out.write("                                    class=\"img-responsive\"></a>\n");
      out.write("                            <div class=\"movie-details\">\n");
      out.write("                                <p class=\"movie-name\"><strong>THE SHACK</strong></p>\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--  Example item end -->\n");
      out.write("                </div>\n");
      out.write("                <a class=\"left carousel-control\" href=\"#theCarousel\" data-slide=\"prev\"><i\n");
      out.write("                        class=\"glyphicon glyphicon-chevron-left\"></i></a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#theCarousel\" data-slide=\"next\"><i\n");
      out.write("                        class=\"glyphicon glyphicon-chevron-right\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <br>\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <!-- Indicators -->\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("        </ol>\n");
      out.write("\n");
      out.write("        <!-- Wrapper for slides -->\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("            <div class=\"item active\">\n");
      out.write("                <img src=\"/resources/img/hero_ExclusiveFeaturette_TheBelkoExperiment_Video.jpg\" alt=\"Chania\" width=\"460\" height=\"345\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img src=\"/resources/img/hero_Infographic_BestPictureNominees.jpg\" alt=\"Chania\" width=\"460\" height=\"345\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img src=\"/resources/img/hero_Interview_KongSkullIsand_JordonVogt.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img src=\"/resources/img/hero_Junket_GetOut_Video.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Left and right controls -->\n");
      out.write("        <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<img src=\"https://images.fandango.com/images/spotlight/fd_50SD_1680x350_homestrip_v3.jpg\"\n");
      out.write("     alt=\"Fandango 50 Shades Darker Movie Free Gift\" class=\"offer-tout-img\">\n");
      out.write("<h1 class=\"ui block header\">\n");
      out.write("    Coming Soon\n");
      out.write("</h1>\n");
      out.write("<div class=\"ui six column grid stackable doubling container\">\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <div class=\"ui segments\">\n");
      out.write("            <div class=\"ui segments\">\n");
      out.write("                <div class=\"blur\">\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196708/ROCKDOG_1Sht_Payoff_VF.jpg\"\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\n");
      out.write("                <a>Rock Dog</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <div class=\"ui segments\">\n");
      out.write("            <div class=\"ui segments\">\n");
      out.write("                <div class=\"blur\">\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/183587/The%20Great%20Wall.jpg\"\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\n");
      out.write("                <a>The Great Wall</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <div class=\"ui segments\">\n");
      out.write("            <div class=\"ui segments\">\n");
      out.write("                <div class=\"blur\">\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/184016/COLLIDE_POSTER_2_24_17.jpg\"\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\n");
      out.write("                <a>Collide</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <div class=\"ui segments\">\n");
      out.write("            <div class=\"ui segments\">\n");
      out.write("                <div class=\"blur\">\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196901/Logan_48x70ForFandango_sRGB.jpg\"\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\n");
      out.write("                <a>Logan</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <div class=\"ui segments\">\n");
      out.write("            <div class=\"ui segments\">\n");
      out.write("                <div class=\"blur\">\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196665/Get%20Out.jpg\"\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\n");
      out.write("                <a>Get Out</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("        <div class=\"ui segments\">\n");
      out.write("            <div class=\"ui segments\">\n");
      out.write("                <div class=\"blur\">\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/191368/legobatmanmovie-posterart.jpg\"\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\n");
      out.write("                <a>The Lego Batman Movie</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
=======
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"ui block header\">\r\n");
      out.write("    Buy Movie Tickets\r\n");
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <div class=\"carousel slide multi-item-carousel\" id=\"theCarousel\">\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"item active\">\r\n");
      out.write("                        <div class=\"col-xs-4\">\r\n");
      out.write("                            <a href=\"#1\"><img\r\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/183502/Fifty%20Shades%20Darker.jpg\"\r\n");
      out.write("                                    class=\"img-responsive\"></a>\r\n");
      out.write("                            <div class=\"movie-details\">\r\n");
      out.write("                                <p class=\"movie-name\"><strong>Fifty Shades Darker</strong></p>\r\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"col-xs-4\">\r\n");
      out.write("                            <a href=\"#1\"><img\r\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/191368/legobatmanmovie-posterart.jpg\"\r\n");
      out.write("                                    class=\"img-responsive\"></a>\r\n");
      out.write("                            <div class=\"movie-details\">\r\n");
      out.write("                                <p class=\"movie-name\"><strong>lego batman movie</strong></p>\r\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"col-xs-4\">\r\n");
      out.write("                            <a href=\"#1\"><img\r\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196665/Get%20Out.jpg\"\r\n");
      out.write("                                    class=\"img-responsive\"></a>\r\n");
      out.write("                            <div class=\"movie-details\">\r\n");
      out.write("                                <p class=\"movie-name\"><strong>Get Out</strong></p>\r\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"col-xs-4\">\r\n");
      out.write("                            <a href=\"#1\"><img\r\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196708/ROCKDOG_1Sht_Payoff_VF.jpg\"\r\n");
      out.write("                                    class=\"img-responsive\"></a>\r\n");
      out.write("                            <div class=\"movie-details\">\r\n");
      out.write("                                <p class=\"movie-name\"><strong>ROCK DOG</strong></p>\r\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"col-xs-4\">\r\n");
      out.write("                            <a href=\"#1\"><img\r\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/192068/HiddenFigures.jpg\"\r\n");
      out.write("                                    class=\"img-responsive\"></a>\r\n");
      out.write("                            <div class=\"movie-details\">\r\n");
      out.write("                                <p class=\"movie-name\"><strong>Hidden Figures</strong></p>\r\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"col-xs-4\">\r\n");
      out.write("                            <a href=\"#1\"><img\r\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196271/FIST-FIGHT_Tsr_1Sht.jpg\"\r\n");
      out.write("                                    class=\"img-responsive\"></a>\r\n");
      out.write("                            <div class=\"movie-details\">\r\n");
      out.write("                                <p class=\"movie-name\"><strong>FIST-FIGHT</strong></p>\r\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- add  more items here -->\r\n");
      out.write("                    <!-- Example item start:  -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <div class=\"col-xs-4\">\r\n");
      out.write("                            <a href=\"#1\"><img\r\n");
      out.write("                                    src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/198127/FIN09_TheShack_1Sht_Payoff_.jpg\"\r\n");
      out.write("                                    class=\"img-responsive\"></a>\r\n");
      out.write("                            <div class=\"movie-details\">\r\n");
      out.write("                                <p class=\"movie-name\"><strong>THE SHACK</strong></p>\r\n");
      out.write("                                <p class=\"text-muted release-date\"><em>Fri, Mar 3</em></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!--  Example item end -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <a class=\"left carousel-control\" href=\"#theCarousel\" data-slide=\"prev\"><i\r\n");
      out.write("                        class=\"glyphicon glyphicon-chevron-left\"></i></a>\r\n");
      out.write("                <a class=\"right carousel-control\" href=\"#theCarousel\" data-slide=\"next\"><i\r\n");
      out.write("                        class=\"glyphicon glyphicon-chevron-right\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("        <!-- Indicators -->\r\n");
      out.write("        <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("\r\n");
      out.write("        <!-- Wrapper for slides -->\r\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("            <div class=\"item active\">\r\n");
      out.write("                <img src=\"/resources/img/hero_ExclusiveFeaturette_TheBelkoExperiment_Video.jpg\" alt=\"Chania\" width=\"460\" height=\"345\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/resources/img/hero_Infographic_BestPictureNominees.jpg\" alt=\"Chania\" width=\"460\" height=\"345\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/resources/img/hero_Interview_KongSkullIsand_JordonVogt.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/resources/img/hero_Junket_GetOut_Video.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Left and right controls -->\r\n");
      out.write("        <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Next</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<img src=\"https://images.fandango.com/images/spotlight/fd_50SD_1680x350_homestrip_v3.jpg\"\r\n");
      out.write("     alt=\"Fandango 50 Shades Darker Movie Free Gift\" class=\"offer-tout-img\">\r\n");
      out.write("<h1 class=\"ui block header\">\r\n");
      out.write("    Coming Soon\r\n");
      out.write("</h1>\r\n");
      out.write("<div class=\"ui six column grid stackable doubling container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("        <div class=\"ui segments\">\r\n");
      out.write("            <div class=\"ui segments\">\r\n");
      out.write("                <div class=\"blur\">\r\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196708/ROCKDOG_1Sht_Payoff_VF.jpg\"\r\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\r\n");
      out.write("                <a>Rock Dog</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("        <div class=\"ui segments\">\r\n");
      out.write("            <div class=\"ui segments\">\r\n");
      out.write("                <div class=\"blur\">\r\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/183587/The%20Great%20Wall.jpg\"\r\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\r\n");
      out.write("                <a>The Great Wall</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("        <div class=\"ui segments\">\r\n");
      out.write("            <div class=\"ui segments\">\r\n");
      out.write("                <div class=\"blur\">\r\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/184016/COLLIDE_POSTER_2_24_17.jpg\"\r\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\r\n");
      out.write("                <a>Collide</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("        <div class=\"ui segments\">\r\n");
      out.write("            <div class=\"ui segments\">\r\n");
      out.write("                <div class=\"blur\">\r\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196901/Logan_48x70ForFandango_sRGB.jpg\"\r\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\r\n");
      out.write("                <a>Logan</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("        <div class=\"ui segments\">\r\n");
      out.write("            <div class=\"ui segments\">\r\n");
      out.write("                <div class=\"blur\">\r\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196665/Get%20Out.jpg\"\r\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\r\n");
      out.write("                <a>Get Out</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("        <div class=\"ui segments\">\r\n");
      out.write("            <div class=\"ui segments\">\r\n");
      out.write("                <div class=\"blur\">\r\n");
      out.write("                    <b><img src=\"http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/191368/legobatmanmovie-posterart.jpg\"\r\n");
      out.write("                            class=\"ui fluid bordered image\"></b>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"ui secondary segment center aligned\">\r\n");
      out.write("                <a>The Lego Batman Movie</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
>>>>>>> e0b259753c2fcd86f11a7759083fb489204c0759
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
<<<<<<< HEAD

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/css/carousel.css");
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
    _jspx_th_c_url_1.setValue("/resources/js/carousel.js");
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
    _jspx_th_c_url_2.setValue("/resources/css/main.css");
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
    _jspx_th_c_url_3.setValue("/resources/js/main.js");
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
    _jspx_th_c_url_4.setValue("/resources/css/blur.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }
=======
>>>>>>> e0b259753c2fcd86f11a7759083fb489204c0759
}
