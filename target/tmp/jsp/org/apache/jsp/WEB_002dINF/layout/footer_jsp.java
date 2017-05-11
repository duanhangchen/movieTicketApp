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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<link href=\"https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("<!--footer start from here-->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4 col-sm-6 footerleft \">\n");
      out.write("        <div class=\"logofooter\"> Team Cedar</div>\n");
      out.write("        <p>Movie Ticket Application</p>\n");
      out.write("\n");
      out.write("        <p><i class=\"fa fa-phone\"></i> Phone: xxx-xxx-xxxx</p>\n");
      out.write("        <p><i class=\"fa fa-envelope\"></i> E-mail : duanhang.chen@stonybrooke.edu</p>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\n");
      out.write("        <h6 class=\"heading7\">GENERAL LINKS</h6>\n");
      out.write("        <ul class=\"footer-ul\">\n");
      out.write("          <li><a href=\"#\"> Career</a></li>\n");
      out.write("          <li><a href=\"#\"> Privacy Policy</a></li>\n");
      out.write("          <li><a href=\"#\"> Terms & Conditions</a></li>\n");
      out.write("          <li><a href=\"#\"> Client Gateway</a></li>\n");
      out.write("          <li><a href=\"#\"> Ranking</a></li>\n");
      out.write("          <li><a href=\"#\"> Case Studies</a></li>\n");
      out.write("          <li><a href=\"#\"> Frequently Ask Questions</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\n");
      out.write("        <h6 class=\"heading7\">Latest Movies</h6>\n");
      out.write("        <div class=\"post\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<!--footer start from here-->\n");
      out.write("\n");
      out.write("<div class=\"copyright\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <p>© 2017 - All Rights with Cedar</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <ul class=\"bottom_ul\">\n");
      out.write("        <li><a href=\"#\">Team Cedar</a></li>\n");
      out.write("        <li><a href=\"#\">About us</a></li>\n");
      out.write("        <li><a href=\"#\">Faq's</a></li>\n");
      out.write("        <li><a href=\"#\">Contact us</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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
