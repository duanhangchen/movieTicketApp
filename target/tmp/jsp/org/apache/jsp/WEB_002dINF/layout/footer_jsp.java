package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"ui inverted vertical footer segment\">\n");
      out.write("    <div class=\"ui center aligned container\">\n");
      out.write("        <div class=\"ui stackable inverted divided grid\">\n");
      out.write("            <div class=\"three wide column\">\n");
      out.write("                <h4 class=\"ui inverted header\">Experience + Explore</h4>\n");
      out.write("                <div class=\"ui inverted link list\">\n");
      out.write("                    <a href=\"#\" class=\"item\">Movies In Theaters</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Movie Actors and Actresses</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Mobile</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">New DVD Releases</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Special Offers</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Gift Cards</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"three wide column\">\n");
      out.write("                <h4 class=\"ui inverted header\">Editorial Features</h4>\n");
      out.write("                <div class=\"ui inverted link list\">\n");
      out.write("                    <a href=\"#\" class=\"item\">Family</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Indie Movie Guide</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Movie News</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Awards Watch</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"three wide column\">\n");
      out.write("                <h4 class=\"ui inverted header\">Videos</h4>\n");
      out.write("                <div class=\"ui inverted link list\">\n");
      out.write("                    <a href=\"#\" class=\"item\">Movie Trailers</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Frontrunners</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Weekend Ticket</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Mom's Movie Minute</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Reel Kids</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"three wide column\">\n");
      out.write("                <h4 class=\"ui inverted header\">Photos</h4>\n");
      out.write("                <div class=\"ui inverted link list\">\n");
      out.write("                    <a href=\"#\" class=\"item\">Red Carpet</a>\n");
      out.write("                    <a href=\"#\" class=\"item\">Frontrunners</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"ui inverted section divider\"></div>\n");
      out.write("        <img src=\"http://www.indayscomix.com/file/2016/12/can_you_legally_watch_free_movies_online.jpg\"\n");
      out.write("             class=\"ui centered small image\">\n");
      out.write("        <div class=\"ui horizontal inverted small divided link list\">\n");
      out.write("            <a class=\"item\" href=\"#\">Site Map</a>\n");
      out.write("            <a class=\"item\" href=\"#\">Contact Us</a>\n");
      out.write("            <a class=\"item\" href=\"#\">Terms and Conditions</a>\n");
      out.write("            <a class=\"item\" href=\"#\">Privacy Policy</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
}
