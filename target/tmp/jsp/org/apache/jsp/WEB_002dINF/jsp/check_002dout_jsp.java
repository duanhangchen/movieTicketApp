package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_002dout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1>Movie Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showing.movie.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("<h1>Theater Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showing.theater.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("<h1>Movie Time: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${showing.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\t<form role=\"form\" method=\"POST\" id=\"cakeform\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<div class=\"cont_order\">\n");
      out.write("\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t<legend>Select Your Tickets</legend>\n");
      out.write("\t\t\t\t\t<label>Adult Ticket</label> \n");
      out.write("\t\t\t\t\t<select id=\"adult\" name='adult' onchange=\"calculateTotal()\">\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">Select Amount</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">4</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">5</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"6\">6</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"7\">7</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"8\">8</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"9\">9</option>\n");
      out.write("\t\t\t\t\t</select> <br />\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<label>Senior Ticket</label> \n");
      out.write("\t\t\t\t\t<select id=\"senior\" name='senior' onchange=\"calculateTotal()\">\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">Select Amount</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">4</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">5</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"6\">6</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"7\">7</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"8\">8</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"9\">9</option>\n");
      out.write("\t\t\t\t\t</select> <br />\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<label>Child Ticket</label> \n");
      out.write("\t\t\t\t\t<select id=\"child\t\" name='child' onchange=\"calculateTotal()\">\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">Select Amount</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">4</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">5</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"6\">6</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"7\">7</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"8\">8</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"9\">9</option>\n");
      out.write("\t\t\t\t\t</select> <br />\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div id=\"totalPrice\"></div>\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<input type='submit' id='submit' value='Submit'\n");
      out.write("\t\t\t\tonclick=\"calculateTotal()\" />\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
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
    _jspx_th_c_url_0.setValue("/resources/css/jquery.seat-charts.css");
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
    _jspx_th_c_url_1.setValue("/resources/css/seating.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/js/jquery.seat-charts.min.js");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/resources/css/cakeform.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/resources/js/formcalculations.js");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }
}
