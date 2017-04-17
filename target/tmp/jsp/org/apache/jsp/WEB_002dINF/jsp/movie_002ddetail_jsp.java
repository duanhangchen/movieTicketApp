package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class movie_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_spring_url_value_nobody.release();
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
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"exTab1\" class=\"container\">\r\n");
      out.write("\t<h1 class=\"actor-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Overview</h1>\r\n");
      out.write("\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t<li class=\"active\"><a href=\"#1a\" data-toggle=\"tab\">Overview</a></li>\r\n");
      out.write("\t\t<li><a href=\"#2a\" data-toggle=\"tab\">Biography</a></li>\r\n");
      out.write("\t\t<li><a href=\"#3a\" data-toggle=\"tab\">Filmography</a></li>\r\n");
      out.write("\t\t<li><a href=\"#4a\" data-toggle=\"tab\">Photos</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"tab-content clearfix\">\r\n");
      out.write("\t\t<div class=\"tab-pane active\" id=\"1a\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-3 biographyAndPhoto\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row photo\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-6 biographyAndPhoto\">\r\n");
      out.write("\t\t\t\t\t\t\t<a> <img class=\"pop-headshot--photo-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dob\">\r\n");
      out.write("\t\t\t\t\t\t\t\tRelease Date: Jul 18, 1967\r\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"input-1\" name=\"input-1\" class=\"rating rating-loading\" data-min=\"0\" data-max=\"5\" data-step=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row bio\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"heading-center\">BIOGRAPHY</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<iframe width=\"640\" height=\"360\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"http://v.traileraddict.com/23699\" allowfullscreen=\"true\"\r\n");
      out.write("\t\t\t\t\t\twebkitallowfullscreen=\"true\" mozallowfullscreen=\"true\"\r\n");
      out.write("\t\t\t\t\t\tscrolling=\"no\" frameborder=\"0\"></iframe>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"video-description\">WEEKEND TICKET: EPISODE 137 - VIN\r\n");
      out.write("\t\t\t\t\t\tDIESEL</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"video-description\">Which movie's right for you this\r\n");
      out.write("\t\t\t\t\t\tweekend? The Last Witch Hunter? Steve Jobs? Rock the Kasbah? Jem\r\n");
      out.write("\t\t\t\t\t\tand the Holograms? Paranormal Activity: The Ghost Dimension?\r\n");
      out.write("\t\t\t\t\t\tFandango Chief Correspondent Dave Karger breaks them down with a\r\n");
      out.write("\t\t\t\t\t\tlittle help from Vin Diesel.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"tab-pane\" id=\"2a\">\r\n");
      out.write("\t\t<h3>We use the class nav-pills instead of nav-tabs which\r\n");
      out.write("\t\t\tautomatically creates a background color for the tab</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"tab-pane\" id=\"3a\">\r\n");
      out.write("\t\t<h3>We applied clearfix to the tab-content to rid of the gap\r\n");
      out.write("\t\t\tbetween the tab and the content</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"tab-pane\" id=\"4a\">\r\n");
      out.write("\t\t<h3>We use css to change the background color of the content to\r\n");
      out.write("\t\t\tbe equal to the tab</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<div class=\"product-list\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("</div>\r\n");
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
    _jspx_th_c_url_0.setValue("/resources/css/actor-overview.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actors}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("actor");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class=\"product\">\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"inner-product\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"figure-image\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actor.actorUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Game 1\"></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<h3 class=\"product-title\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
          if (_jspx_meth_spring_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"cart.html\" class=\"button\">Add to cart</a> <a href=\"#\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\tclass=\"button muted\">Read Details</a>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_spring_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/actors/${actor.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }
}
