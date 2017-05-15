package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

<<<<<<< HEAD
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

=======
>>>>>>> David
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

<<<<<<< HEAD
  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

=======
>>>>>>> David
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

<<<<<<< HEAD
      out.write("<link\r\n");
      out.write("\thref=\"https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!--footer start from here-->\r\n");
      out.write("<footer>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-sm-6 footerleft \">\r\n");
      out.write("\t\t\t\t<div class=\"logofooter\">Team Cedar</div>\r\n");
      out.write("\t\t\t\t<p>Movie Ticket Application</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-phone\"></i> Phone: xxx-xxx-xxxx\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-envelope\"></i> E-mail :\r\n");
      out.write("\t\t\t\t\tduanhang.chen@stonybrooke.edu\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("\t\t\t\t<h6 class=\"heading7\">GENERAL LINKS</h6>\r\n");
      out.write("\t\t\t\t<ul class=\"footer-ul\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Career</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Privacy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Terms & Conditions</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Client Gateway</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Ranking</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Case Studies</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Frequently Ask Questions</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("\t\t\t\t<h6 class=\"heading7\">Latest Movies</h6>\r\n");
      out.write("\t\t\t\t<div class=\"post\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
=======
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
>>>>>>> David
      out.write("</footer>\r\n");
      out.write("<!--footer start from here-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\">\r\n");
<<<<<<< HEAD
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t<p>© 2017 - All Rights with Cedar</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t<ul class=\"bottom_ul\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Team Cedar</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">About us</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Faq's</a></li>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"reviewModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<form role=\"form\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<h5 id=\"reviewfont\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"message-text\" id=\"reviewfont\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-label\">Title:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"title\" name=\"title\"></input>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"message-text\" id=\"reviewfont\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-label\">Body:</label>\r\n");
      out.write("\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control\" id=\"body\" name=\"body\"></textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Submit Form</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
=======
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
>>>>>>> David
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
<<<<<<< HEAD

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
        out.write("\r\n");
        out.write("\t\t\t\t<li><a data-toggle=\"modal\" data-target=\"#reviewModal\">Support\r\n");
        out.write("\t\t\t\t\t\tForm</a></li>\r\n");
        out.write("\t\t\t\t");
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
=======
>>>>>>> David
}
