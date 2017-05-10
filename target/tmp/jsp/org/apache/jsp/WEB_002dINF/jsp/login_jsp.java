package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

<<<<<<< HEAD
      out.write("<<<<<<< HEAD\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"card card-container\">\r\n");
      out.write("        <h3 class=\"title\" align=\"center\">TEAM CEDAR</h3>\r\n");
      out.write("        <img id=\"profile-img\" class=\"profile-img-card\" src=\"//ssl.gstatic.com/accounts/ui/avatar_2x.png\" />\r\n");
      out.write("        <p id=\"profile-name\" class=\"profile-name-card\"></p>\r\n");
      out.write("        <p><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font></p>\r\n");
      out.write("        <form action=\"/login\" method=\"POST\" class=\"form-signin\">\r\n");
      out.write("            <span id=\"reauth-email\" class=\"reauth-email\"></span>\r\n");
      out.write("            <p class=\"user-password-label\">Email</p>\r\n");
      out.write("            <input name=\"name\" type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\r\n");
      out.write("            <p class=\"user-password-label\">Password</p>\r\n");
      out.write("            <input name=\"password\" type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("            <div id=\"remember\" class=\"checkbox\">\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input  type=\"checkbox\" value=\"remember-me\"> <span class=\"user-password-label\" >Remember me</span>\r\n");
      out.write("                </label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button class=\"btn btn-lg btn-primary btn-block btn-signin\" type=\"submit\">Sign in</button>\r\n");
      out.write("        </form><!-- /form -->\r\n");
      out.write("        <a href=\"#\" class=\"forgot-password\">\r\n");
      out.write("            Forgot the password?\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
=======
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
      out.write("<script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"card card-container\">\n");
      out.write("\t\t<h3 class=\"title\" align=\"center\">TEAM CEDAR</h3>\n");
      out.write("\t\t<img id=\"profile-img\" class=\"profile-img-card\"\n");
      out.write("\t\t\tsrc=\"//ssl.gstatic.com/accounts/ui/avatar_2x.png\" />\n");
      out.write("\t\t<p id=\"profile-name\" class=\"profile-name-card\"></p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<form action=\"/login\" method=\"POST\" class=\"form-signin\">\n");
      out.write("\t\t\t<span id=\"reauth-email\" class=\"reauth-email\"></span>\n");
      out.write("\t\t\t<p class=\"user-password-label\">Email</p>\n");
      out.write("\t\t\t<input name=\"name\" type=\"email\" id=\"inputEmail\" class=\"form-control\"\n");
      out.write("\t\t\t\tplaceholder=\"Email address\" required autofocus>\n");
      out.write("\t\t\t<p class=\"user-password-label\">Password</p>\n");
      out.write("\t\t\t<input name=\"password\" type=\"password\" id=\"inputPassword\"\n");
      out.write("\t\t\t\tclass=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("\t\t\t<div id=\"remember\" class=\"checkbox\">\n");
      out.write("\t\t\t\t<label> <input type=\"checkbox\" value=\"remember-me\">\n");
      out.write("\t\t\t\t\t<span class=\"user-password-label\">Remember me</span>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<button class=\"btn btn-lg btn-primary btn-block btn-signin\"\n");
      out.write("\t\t\t\ttype=\"submit\">Sign in</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!-- /form -->\n");
      out.write("\t\t<a href=\"#\" class=\"forgot-password\"> Forgot the password? </a>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<div class=\"fb-login-button\" data-max-rows=\"1\" data-size=\"large\"\n");
      out.write("\t\t\t\tdata-button-type=\"login_with\" data-show-faces=\"false\"\n");
      out.write("\t\t\t\tdata-auto-logout-link=\"false\" data-use-continue-as=\"true\"\n");
      out.write("\t\t\t\tscope=\"public_profile,email\" onlogin=\"checkLoginState();\"></div>\n");
      out.write("\t\t\t\t<!-- \t<fb:login-button scope=\"public_profile,email\" onlogin=\"checkLoginState();\"></fb:login-button> -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!--   <button id=\"logout\" class=\"btn btn-lg btn-primary btn-block btn-signin\" onclick = \"logout();\">Logout</button> -->");
>>>>>>> 9301d2136551dd8df9a9fb1d4b920cc8d53bb968
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
    _jspx_th_c_url_0.setValue("/resources/css/login.css");
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
    _jspx_th_c_url_1.setValue("/resources/js/login.js");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
<<<<<<< HEAD
=======

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/js/fb.js");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }
>>>>>>> 9301d2136551dd8df9a9fb1d4b920cc8d53bb968
}
