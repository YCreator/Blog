package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"gb2312\">\r\n");
      out.write("<title>Dong个人博客</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/mini_logo.ico\"\r\n");
      out.write("\trel=\"SHORTCUT ICON\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap3/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/blog.css\" rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/css/base.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/css/index.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/js/sliders.js\"></script>\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"js/modernizr.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!-- 返回顶部调用 begin -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/up/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/up/js.js\"></script>\r\n");
      out.write("<!-- 返回顶部调用 end-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction checkData() {\r\n");
      out.write("\t\t\t\tvar q = document.getElementById(\"q\").value.trim();\r\n");
      out.write("\t\t\t\tif (q == null || q == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"请输入您要查询的关键字！\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction backToTop() {\r\n");
      out.write("\t\t\t\t$('body,html').animate({scrollTop:0},500);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<div class=\"topbg\">\r\n");
      out.write("\t\t\t<ul class=\"topnav\">\r\n");
      out.write("\t\t\t\t<a href=\"http://www.jiyouh.com/ \" target=\"_blank\">Home</a>\r\n");
      out.write("\t\t\t\t<a href=\"http://weibo.com/jiyouh\" target=\"_blank\">官方微博</a>\r\n");
      out.write("\t\t\t\t<a href=\"http://www.jiyouh.com/about.html \" target=\"_blank\">关于我们</a>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"topbgline\"></div>\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<div class=\"logo_l f_l\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.html\"><img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/logo.png\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"search\" class=\"logo_r f_r\">\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/blog/q.html\"\r\n");
      out.write("\t\t\t\t\tclass=\"bs-example bs-example-form\" role=\"search\" method=\"post\"\r\n");
      out.write("\t\t\t\t\tonsubmit=\"return checkData()\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"q\" name=\"q\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${q }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control f_l\" placeholder=\"请输入要查询的关键字...\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"input-group-btn f_l\"><button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary\">搜索</button></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<nav id=\"topnav\" class=\"f_r\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.html\">首页</a>\r\n");
      out.write("\t\t\t\t<a href=\"p.html\" target=\"_blank\">文章</a>\r\n");
      out.write("\t\t\t\t<a href=\"a.html\" target=\"_blank\">相册</a>\r\n");
      out.write("\t\t\t\t<a href=\"c.html\" target=\"_blank\">资源</a>\r\n");
      out.write("\t\t\t\t<a href=\"b.html\" target=\"_blank\">留言</a>\r\n");
      out.write("\t\t\t\t<a href=\"news.html\" target=\"_blank\">关于我</a>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<script src=\"js/nav.js\"></script>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<article>\r\n");
      out.write("\t\t<div class=\"l_box f_l\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainPage }", java.lang.String.class, (PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"r_box f_r\">\r\n");
      out.write("\t\t\t<div class=\"tit01\">\r\n");
      out.write("\t\t\t\t<h3>关注我</h3>\r\n");
      out.write("\t\t\t\t<div class=\"gzwm\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"xlwb\" href=\"#\" target=\"_blank\">新浪微博</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"txwb\" href=\"#\" target=\"_blank\">腾讯微博</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"rss\" href=\"portal.php?mod=rss\" target=\"_blank\">RSS</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"wx\" href=\"mailto:admin@admin.com\">邮箱</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--tit01 end-->\r\n");
      out.write("\t\t\t<div class=\"ad300x100\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/mystyle/images/ad300x100.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"moreSelect\" id=\"lp_right_select\">\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\twindow.onload = function() {\r\n");
      out.write("\t\t\t\t\t\tvar oLi = document.getElementById(\"tab\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.getElementsByTagName(\"li\");\r\n");
      out.write("\t\t\t\t\t\tvar oUl = document.getElementById(\"ms-main\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.getElementsByTagName(\"div\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < oLi.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\toLi[i].index = i;\r\n");
      out.write("\t\t\t\t\t\t\toLi[i].onmouseover = function() {\r\n");
      out.write("\t\t\t\t\t\t\t\tfor (var n = 0; n < oLi.length; n++)\r\n");
      out.write("\t\t\t\t\t\t\t\t\toLi[n].className = \"\";\r\n");
      out.write("\t\t\t\t\t\t\t\tthis.className = \"cur\";\r\n");
      out.write("\t\t\t\t\t\t\t\tfor (var n = 0; n < oUl.length; n++)\r\n");
      out.write("\t\t\t\t\t\t\t\t\toUl[n].style.display = \"none\";\r\n");
      out.write("\t\t\t\t\t\t\t\toUl[this.index].style.display = \"block\"\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<div class=\"ms-top\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"hd\" id=\"tab\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"cur\"><a href=\"/\">点击排行</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/\">最新文章</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/\">站长推荐</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ms-main\" id=\"ms-main\">\r\n");
      out.write("\t\t\t\t\t<div style=\"display: block;\" class=\"bd bd-news\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"bd bd-news\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"bd bd-news\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/\" target=\"_blank\">手机的16个惊人小秘密，据说99.999%的人都不知</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/\" target=\"_blank\">你面对的是生活而不是手机</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/\" target=\"_blank\">住在手机里的朋友</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/\" target=\"_blank\">豪雅手机正式发布! 在法国全手工打造的奢侈品</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/\" target=\"_blank\">教你怎样用欠费手机拨打电话</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/\" target=\"_blank\">原来以为，一个人的勇敢是，删掉他的手机号码...</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--ms-main end -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--切换卡 moreSelect end -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"cloud\">\r\n");
      out.write("\t\t\t\t<h3>标签云</h3>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"/\">个人博客</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">web开发</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">前端设计</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">Html</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">CSS3</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">Html5+css3</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">百度</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">Javasript</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">web开发</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">前端设计</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">Html</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">CSS3</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">Html5+css3</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\">百度</a></li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tuwen\">\r\n");
      out.write("\t\t\t\t<h3>图文推荐</h3>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/images/01.jpg\"><b>住在手机里的朋友</b></a>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tulanmu\"><a href=\"/\">手机配件</a></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"tutime\">2015-02-15</span>\r\n");
      out.write("\t\t\t\t\t\t</p></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/images/02.jpg\"><b>教你怎样用欠费手机拨打电话</b></a>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tulanmu\"><a href=\"/\">手机配件</a></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"tutime\">2015-02-15</span>\r\n");
      out.write("\t\t\t\t\t\t</p></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\" title=\"手机的16个惊人小秘密，据说99.999%的人都不知\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/images/03.jpg\"><b>手机的16个惊人小秘密，据说...</b></a>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tulanmu\"><a href=\"/\">手机配件</a></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"tutime\">2015-02-15</span>\r\n");
      out.write("\t\t\t\t\t\t</p></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/images/06.jpg\"><b>住在手机里的朋友</b></a>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tulanmu\"><a href=\"/\">手机配件</a></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"tutime\">2015-02-15</span>\r\n");
      out.write("\t\t\t\t\t\t</p></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/images/04.jpg\"><b>教你怎样用欠费手机拨打电话</b></a>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"tulanmu\"><a href=\"/\">手机配件</a></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"tutime\">2015-02-15</span>\r\n");
      out.write("\t\t\t\t\t\t</p></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"ad\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/images/03.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"links\">\r\n");
      out.write("\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t<span>[<a href=\"/\">申请友情链接</a>]\r\n");
      out.write("\t\t\t\t\t</span>友情链接\r\n");
      out.write("\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--r_box end -->\r\n");
      out.write("\t</article>\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<p class=\"ft-copyright\">Dong博客 Design by DanceSmile\r\n");
      out.write("\t\t\t蜀ICP备11002373号-1</p>\r\n");
      out.write("\t\t<div id=\"tbox\">\r\n");
      out.write("\t\t\t<a id=\"togbook\" href=\"javascript:void(0)\"></a> <a id=\"gotop\" href=\"javascript:backToTop()\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");

	if (request.getAttribute("clickBlogs") != null) {
		application.setAttribute("clickBlogs", request.getAttribute("clickBlogs"));
	}
	if (request.getAttribute("dateBlogs") != null) {
		application.setAttribute("dateBlogs", request.getAttribute("dateBlogs"));
	}

      out.write("\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_c_forEach_0.setVar("blog");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clickBlogs }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/blog/articles/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.title }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("blog");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dateBlogs }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/blog/articles/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blog.title }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("blogTypeCount");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blogTypeCountList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/index.html?typeId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blogTypeCount.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blogTypeCount.typeName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("link");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${linkList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<li><span><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${link.linkUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${link.linkName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></span></li>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
