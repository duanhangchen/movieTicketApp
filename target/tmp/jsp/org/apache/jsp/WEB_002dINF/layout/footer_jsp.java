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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"ui inverted vertical footer segment\">\r\n");
      out.write("    <div class=\"ui center aligned container\">\r\n");
      out.write("        <div class=\"ui stackable inverted divided grid\">\r\n");
      out.write("            <div class=\"three wide column\">\r\n");
      out.write("                <h4 class=\"ui inverted header\">Experience + Explore</h4>\r\n");
      out.write("                <div class=\"ui inverted link list\">\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Movies In Theaters</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Movie Actors and Actresses</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Mobile</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">New DVD Releases</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Special Offers</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Gift Cards</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"three wide column\">\r\n");
      out.write("                <h4 class=\"ui inverted header\">Editorial Features</h4>\r\n");
      out.write("                <div class=\"ui inverted link list\">\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Family</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Indie Movie Guide</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Movie News</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Awards Watch</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"three wide column\">\r\n");
      out.write("                <h4 class=\"ui inverted header\">Videos</h4>\r\n");
      out.write("                <div class=\"ui inverted link list\">\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Movie Trailers</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Frontrunners</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Weekend Ticket</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Mom's Movie Minute</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Reel Kids</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"three wide column\">\r\n");
      out.write("                <h4 class=\"ui inverted header\">Photos</h4>\r\n");
      out.write("                <div class=\"ui inverted link list\">\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Red Carpet</a>\r\n");
      out.write("                    <a href=\"#\" class=\"item\">Frontrunners</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"ui inverted section divider\"></div>\r\n");
      out.write("        <img src=\"http://www.indayscomix.com/file/2016/12/can_you_legally_watch_free_movies_online.jpg\"\r\n");
      out.write("             class=\"ui centered small image\">\r\n");
      out.write("        <div class=\"ui horizontal inverted small divided link list\">\r\n");
      out.write("            <a class=\"item\" href=\"#\">Site Map</a>\r\n");
      out.write("            <a class=\"item\" href=\"#\">Contact Us</a>\r\n");
      out.write("            <a class=\"item\" href=\"#\">Terms and Conditions</a>\r\n");
      out.write("            <a class=\"item\" href=\"#\">Privacy Policy</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
