package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class giftcard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<title>Giftcard Purchase</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\r\n");
      out.write("    .row.content {height: 550px}\r\n");
      out.write("        \r\n");
      out.write("    /* On small screens, set height to 'auto' for the grid */\r\n");
      out.write("    @media screen and (max-width: 767px) {\r\n");
      out.write("      .row.content {height: auto;} \r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Giftcard Purchase</h1>\r\n");
      out.write("<form method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t  <div class=\"row content\">\r\n");
      out.write("\t    \r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    \r\n");
      out.write("\t    <div class=\"col-sm-12\">\r\n");
      out.write("\t      <div class=\"well\">\r\n");
      out.write("\t        <h3 class=\"heading\"><strong>SELECT </strong> CARD <strong>TYPE </strong> <span></span></h3>\r\n");
      out.write("\t        <br>\r\n");
      out.write("\t\t\t<input \r\n");
      out.write("\t\t\t  type=\"radio\" name=\"card\"\r\n");
      out.write("\t\t\t  id=\"g1\" class=\"input-hidden\" />\r\n");
      out.write("\t\t\t<label for=\"g1\">\r\n");
      out.write("\t\t\t  <img\r\n");
      out.write("\t\t\t  src=\"http://i.imgur.com/2ZmDX2i.png\" \r\n");
      out.write("\t\t\t    alt=\"gift1\" />\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t<input \r\n");
      out.write("\t\t\t  type=\"radio\" name=\"card\" \r\n");
      out.write("\t\t\t  id=\"g2\" class=\"input-hidden\" />\r\n");
      out.write("\t\t\t<label for=\"g2\">\r\n");
      out.write("\t\t\t  <img src=\"http://i.imgur.com/OQ4Gutr.png\" \r\n");
      out.write("\t\t\t    alt=\"gift2\" />\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t<input \r\n");
      out.write("\t\t\t  type=\"radio\" name=\"card\" \r\n");
      out.write("\t\t\t  id=\"g3\" class=\"input-hidden\" />\r\n");
      out.write("\t\t\t<label for=\"g3\">\r\n");
      out.write("\t\t\t  <img src=\"http://i.imgur.com/iXC7OVu.png\" \r\n");
      out.write("\t\t\t    alt=\"gift3\" />\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t<input \r\n");
      out.write("\t\t\t  type=\"radio\" name=\"card\"\r\n");
      out.write("\t\t\t  id=\"g4\" class=\"input-hidden\" />\r\n");
      out.write("\t\t\t<label for=\"g4\">\r\n");
      out.write("\t\t\t  <img\r\n");
      out.write("\t\t\t  src=\"http://i.imgur.com/OQ4Gutr.png\" \r\n");
      out.write("\t\t\t    alt=\"gift4\" />\r\n");
      out.write("\t\t\t</label>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      \r\n");
      out.write("\t      <div class=\"row\">\r\n");
      out.write("\t        <div class=\"col-sm-4\">\r\n");
      out.write("\t          <div class=\"well\">\r\n");
      out.write("\t            <div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form_main\">\r\n");
      out.write("\t\t\t\t        \t<h4 class=\"heading\"><strong>Customize </strong> Card <span></span></h4>\r\n");
      out.write("\t\t\t                <div class=\"form\">\r\n");
      out.write("\t\t\t                \t<input type=\"radio\" name=\"giftAmount\" value=\"25\" checked> $25\r\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"radio\" name=\"giftAmount\" value=\"50\"> $50\r\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"radio\" name=\"giftAmount\" value=\"75\"> $75\r\n");
      out.write("\t\t\t                \t<input type=\"radio\" name=\"giftAmount\" value=\"100\"> $100\r\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"radio\" name=\"giftAmount\" value=\"150\"> $150\r\n");
      out.write("\t\t\t\t\t\t\t    <input type=\"radio\" name=\"giftAmount\" value=\"300\"> $200\r\n");
      out.write("\t\t\t                \t\r\n");
      out.write("\t\t\t                    <input type=\"text\" required=\"\" placeholder=\"Please input recipient Name\" value=\"\" name=\"giftTo\" class=\"txt\">\r\n");
      out.write("\t\t\t                    <input type=\"text\" required=\"\" placeholder=\"Please input sender Name\" value=\"\" name=\"giftFrom\" class=\"txt\">\r\n");
      out.write("\t\t\t                    <input type=\"text\" required=\"\" placeholder=\"Please input recipient Email\" value=\"\" name=\"giftEmail\" class=\"txt\">\r\n");
      out.write("\t\t\t                    \r\n");
      out.write("\t\t\t                \t<textarea placeholder=\"Message to Recipient\" name=\"giftMsg\" type=\"text\" class=\"txt_3\"></textarea>\r\n");
      out.write("\t\t\t                     \r\n");
      out.write("\t\t\t                \r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"col-sm-4\">\r\n");
      out.write("\t          <div class=\"well\">\r\n");
      out.write("\t            <div class=\"container\">\r\n");
      out.write("\t\t\t\t    <div class=\"row\">\r\n");
      out.write("\t\t\t\t        <div class=\"col-xs-12 col-md-4\">\r\n");
      out.write("\t\t\t\t            <div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t                <div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t                    <h3 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t                        Payment Details\r\n");
      out.write("\t\t\t\t                    </h3>\r\n");
      out.write("\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t                <div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t                 \r\n");
      out.write("\t\t\t\t                    <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t                        <label for=\"cardNumber\">\r\n");
      out.write("\t\t\t\t                            CARD NUMBER</label>\r\n");
      out.write("\t\t\t\t                        <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t                            <input type=\"text\" class=\"form-control\" name=\"cardNumber\" placeholder=\"Valid Card Number\"\r\n");
      out.write("\t\t\t\t                                required autofocus />\r\n");
      out.write("\t\t\t\t                            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-lock\"></span></span>\r\n");
      out.write("\t\t\t\t                        </div>\r\n");
      out.write("\t\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t                    <div class=\"row\">\r\n");
      out.write("\t\t\t\t                        <div class=\"col-xs-7 col-md-7\">\r\n");
      out.write("\t\t\t\t                            <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t                                <label for=\"expityMonth\">\r\n");
      out.write("\t\t\t\t                                    EXPIRY DATE</label>\r\n");
      out.write("\t\t\t\t                                <div class=\"col-xs-6 col-lg-6 pl-ziro\">\r\n");
      out.write("\t\t\t\t                                    <input type=\"text\" class=\"form-control\" id=\"expityMonth\" placeholder=\"MM\" required />\r\n");
      out.write("\t\t\t\t                                </div>\r\n");
      out.write("\t\t\t\t                                <div class=\"col-xs-6 col-lg-6 pl-ziro\">\r\n");
      out.write("\t\t\t\t                                    <input type=\"text\" class=\"form-control\" id=\"expityYear\" placeholder=\"YY\" required /></div>\r\n");
      out.write("\t\t\t\t                            </div>\r\n");
      out.write("\t\t\t\t                        </div>\r\n");
      out.write("\t\t\t\t                        <div class=\"col-xs-5 col-md-5 pull-right\">\r\n");
      out.write("\t\t\t\t                            <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t                                <label for=\"cvCode\">\r\n");
      out.write("\t\t\t\t                                    CV CODE</label>\r\n");
      out.write("\t\t\t\t                                <input type=\"password\" class=\"form-control\" id=\"cvCode\" placeholder=\"CV\" required />\r\n");
      out.write("\t\t\t\t                            </div>\r\n");
      out.write("\t\t\t\t                        </div>\r\n");
      out.write("\t\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t                    \r\n");
      out.write("\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            <br/>\r\n");
      out.write("\t\t\t\t            <input type=\"submit\" value=\"Pay\" name=\"submit\" class=\"btn btn-success btn-lg btn-block\">\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
    _jspx_th_c_url_0.setValue("/resources/css/gift.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
