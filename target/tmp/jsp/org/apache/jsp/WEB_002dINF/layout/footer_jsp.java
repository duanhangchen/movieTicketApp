package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write("<link\n");
      out.write("\thref=\"https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--footer start from here-->\n");
      out.write("<footer>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-4 col-sm-6 footerleft \">\n");
      out.write("\t\t\t\t<div class=\"logofooter\">Team Cedar</div>\n");
      out.write("\t\t\t\t<p>Movie Ticket Application</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-phone\"></i> Phone: xxx-xxx-xxxx\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-envelope\"></i> E-mail :\n");
      out.write("\t\t\t\t\tduanhang.chen@stonybrooke.edu\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\n");
      out.write("\t\t\t\t<h6 class=\"heading7\">GENERAL LINKS</h6>\n");
      out.write("\t\t\t\t<ul class=\"footer-ul\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Career</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Privacy Policy</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Terms & Conditions</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Client Gateway</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Ranking</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Case Studies</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"> Frequently Ask Questions</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\n");
      out.write("\t\t\t\t<h6 class=\"heading7\">Latest Movies</h6>\n");
      out.write("\t\t\t\t<div class=\"post\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</footer>\n");
      out.write("<!--footer start from here-->\n");
      out.write("\n");
      out.write("<div class=\"copyright\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<p>© 2017 - All Rights with Cedar</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<ul class=\"bottom_ul\">\n");
      out.write("\t\t\t\t<li><a href=\"#\">Team Cedar</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Faq's</a></li>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"reviewModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<form role=\"form\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<h5 id=\"reviewfont\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"message-text\" id=\"reviewfont\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-label\">Title:</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"title\" name=\"title\"></input>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"message-text\" id=\"reviewfont\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-label\">Body:</label>\n");
      out.write("\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control\" id=\"body\" name=\"body\"></textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Submit Form</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
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
        out.write("\t\t\t\t<li><a data-toggle=\"modal\" data-target=\"#reviewModal\">Support\n");
        out.write("\t\t\t\t\t\tForm</a></li>\n");
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
}
