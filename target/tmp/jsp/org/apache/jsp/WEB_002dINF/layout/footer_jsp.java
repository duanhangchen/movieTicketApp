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

      out.write("<link href=\"https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--footer start from here-->\r\n");
      out.write("<footer>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-4 col-sm-6 footerleft \">\r\n");
      out.write("        <div class=\"logofooter\"> Team Cedar</div>\r\n");
      out.write("        <p>Movie Ticket Application</p>\r\n");
      out.write("\r\n");
      out.write("        <p><i class=\"fa fa-phone\"></i> Phone: xxx-xxx-xxxx</p>\r\n");
      out.write("        <p><i class=\"fa fa-envelope\"></i> E-mail : duanhang.chen@stonybrooke.edu</p>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <h6 class=\"heading7\">GENERAL LINKS</h6>\r\n");
      out.write("        <ul class=\"footer-ul\">\r\n");
      out.write("          <li><a href=\"#\"> Career</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Privacy Policy</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Terms & Conditions</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Client Gateway</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Ranking</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Case Studies</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Frequently Ask Questions</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <h6 class=\"heading7\">Latest Movies</h6>\r\n");
      out.write("        <div class=\"post\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!--footer start from here-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("      <p>© 2017 - All Rights with Cedar</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("      <ul class=\"bottom_ul\">\r\n");
      out.write("        <li><a href=\"#\">Team Cedar</a></li>\r\n");
      out.write("        <li><a href=\"#\">About us</a></li>\r\n");
      out.write("        <li><a href=\"#\">Faq's</a></li>\r\n");
      out.write("        <li><a href=\"#\">Contact us</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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
