package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_002dup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<script src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<form data-toggle=\"validator\" role=\"form\" method=\"POST\">\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"firstName\" class=\"control-label\">Name</label> \n");
      out.write("\t\t\t<input\n");
      out.write("\t\t\t\ttype=\"text\" class=\"form-control\" id=\"firstName\"\n");
      out.write("\t\t\t\tname=\"firstName\" placeholder=\"First Name\" required>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"lastName\" class=\"control-label\">Last Name</label> \n");
      out.write("\t\t\t<input\n");
      out.write("\t\t\t\ttype=\"text\" class=\"form-control\" id=\"lastName\" name=\"lastName\"\n");
      out.write("\t\t\t\tplaceholder=\"Last Name\" required>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"Email\" class=\"control-label\">Email</label> \n");
      out.write("\t\t\t<input\n");
      out.write("\t\t\t\ttype=\"email\" class=\"form-control\" id=\"Email\" name=\"email\" placeholder=\"Email\"\n");
      out.write("\t\t\t\tdata-error=\"Bruh, that email address is invalid\" required>\n");
      out.write("\t\t\t<div class=\"help-block with-errors\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"password\" class=\"control-label\">Password</label>\n");
      out.write("\t\t\t<div class=\"form-inline row\">\n");
      out.write("\t\t\t\t<div class=\"form-group col-sm-6\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" data-minlength=\"6\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\tid=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("\t\t\t\t\t<div class=\"help-block\">Minimum of 6 characters</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group col-sm-6\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"passwordConfirm\"\n");
      out.write("\t\t\t\t\t\tdata-match=\"#password\"\n");
      out.write("\t\t\t\t\t\tdata-match-error=\"Whoops, these don't match\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Confirm Password\" required>\n");
      out.write("\t\t\t\t\t<div class=\"help-block with-errors\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t<label> <input type=\"checkbox\" id=\"terms\"\n");
      out.write("\t\t\t\t\tdata-error=\"Please accept terms and conditions\" required>\n");
      out.write("\t\t\t\t\tAccept Terms and Conditions\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t\t<div class=\"help-block with-errors\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
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
    _jspx_th_c_url_0.setValue("/resources/js/sign-up.js");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
