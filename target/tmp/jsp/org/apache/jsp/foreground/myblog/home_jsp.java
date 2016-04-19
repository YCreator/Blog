package org.apache.jsp.foreground.myblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<div class=\"banner\">\r\n");
      out.write("      <div id=\"slide-holder\">\r\n");
      out.write("        <div id=\"slide-runner\"> <a href=\"/\" target=\"_blank\"><img id=\"slide-img-1\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/images/a1.jpg\"  alt=\"\" /></a> <a href=\"/\" target=\"_blank\"><img id=\"slide-img-2\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/images/a2.jpg\"  alt=\"\" /></a> <a href=\"/\" target=\"_blank\"><img id=\"slide-img-3\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/images/a3.jpg\"  alt=\"\" /></a> <a href=\"/\" target=\"_blank\"><img id=\"slide-img-4\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/images/a4.jpg\"  alt=\"\" /></a>\r\n");
      out.write("          <div id=\"slide-controls\">\r\n");
      out.write("            <p id=\"slide-client\" class=\"text\"><strong></strong><span></span></p>\r\n");
      out.write("            <p id=\"slide-desc\" class=\"text\"></p>\r\n");
      out.write("            <p id=\"slide-nav\"></p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script>\r\n");
      out.write("\t  if(!window.slider) {\r\n");
      out.write("\t\tvar slider={};\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tslider.data= [\r\n");
      out.write("    {\r\n");
      out.write("        \"id\":\"slide-img-1\", // 与slide-runner中的img标签id对应\r\n");
      out.write("        \"client\":\"标题1\",\r\n");
      out.write("        \"desc\":\"这里修改描述 这里修改描述 这里修改描述\" //这里修改描述\r\n");
      out.write("    },\r\n");
      out.write("    {\r\n");
      out.write("        \"id\":\"slide-img-2\",\r\n");
      out.write("        \"client\":\"标题2\",\r\n");
      out.write("        \"desc\":\"add your description here\"\r\n");
      out.write("    },\r\n");
      out.write("    {\r\n");
      out.write("        \"id\":\"slide-img-3\",\r\n");
      out.write("        \"client\":\"标题3\",\r\n");
      out.write("        \"desc\":\"add your description here\"\r\n");
      out.write("    },\r\n");
      out.write("    {\r\n");
      out.write("        \"id\":\"slide-img-4\",\r\n");
      out.write("        \"client\":\"标题4\",\r\n");
      out.write("        \"desc\":\"add your description here\"\r\n");
      out.write("    } \r\n");
      out.write("\t];\r\n");
      out.write("\r\n");
      out.write("\t  </script> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- banner代码 结束 -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPage }", java.lang.String.class, (PageContext)_jspx_page_context, null), out, false);
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
