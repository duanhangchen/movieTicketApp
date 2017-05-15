package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_002dresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<hgroup class=\"mb20\">\r\n");
      out.write("\t\t<h1>Search Results</h1>\r\n");
      out.write("\t\t<h2 class=\"lead\">\r\n");
      out.write("\t\t\t<strong class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(searchMovie)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</strong> movie results were found for the\r\n");
      out.write("\t\t\tsearch for <strong class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${keyword}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t</hgroup>\r\n");
      out.write("\t<section class=\"col-xs-12 col-sm-6 col-md-12\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</section>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchMovie}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("movie");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<article class=\"search-result row\">\r\n");
          out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-3\">\r\n");
          out.write("\t\t\t\t\t<a href=\"#\" title=\"Lorem ipsum\" class=\"thumbnail\"><img\r\n");
          out.write("\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Lorem ipsum\" /></a>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-2\">\r\n");
          out.write("\t\t\t\t\t<ul class=\"meta-search\">\r\n");
          out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-calendar\"></i> <span>02/15/2014</span></li>\r\n");
          out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-time\"></i> <span>4:28\r\n");
          out.write("\t\t\t\t\t\t\t\tpm</span></li>\r\n");
          out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-tags\"></i> <span>People</span></li>\r\n");
          out.write("\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-7 excerpet\">\r\n");
          out.write("\t\t\t\t\t<h3>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"#\" title=\"\">Voluptatem, exercitationem, suscipit,\r\n");
          out.write("\t\t\t\t\t\t\tdistinctio</a>\r\n");
          out.write("\t\t\t\t\t</h3>\r\n");
          out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\r\n");
          out.write("\t\t\t\t\t\tVoluptatem, exercitationem, suscipit, distinctio, qui sapiente\r\n");
          out.write("\t\t\t\t\t\taspernatur molestiae non corporis magni sit sequi iusto debitis\r\n");
          out.write("\t\t\t\t\t\tdelectus doloremque.</p>\r\n");
          out.write("\t\t\t\t\t<span class=\"plus\"><a href=\"#\" title=\"Lorem ipsum\"><i\r\n");
          out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-plus\"></i></a></span>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<span class=\"clearfix borda\"></span>\r\n");
          out.write("\t\t\t</article>\r\n");
          out.write("\t\t");
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
}
