/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-13 10:24:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bgGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1476930139514L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\t\r\n");
      out.write("    <title>后台商品管理页面</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"  type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\"  type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/font-slider.css\" type=\"text/css\">\r\n");
      out.write("\t<script src=\"js/jquery-2.1.1.js\"></script>\t \r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table class=\"table table-striped\" >\r\n");
      out.write("\t\t<tr bgcolor=\"lightblue\">\r\n");
      out.write("\t\t\t<td>商品编号</td>\r\n");
      out.write("\t\t\t<td>商品图片</td>\r\n");
      out.write("\t\t\t<td>商品名称</td>\r\n");
      out.write("\t\t\t<td>价格</td>\r\n");
      out.write("\t\t\t<td>商品类型</td>\r\n");
      out.write("\t\t\t<td>库存</td>\r\n");
      out.write("\t\t\t<td>操作</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\t");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/content/bgGoods.jsp(33,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/content/bgGoods.jsp(33,2) '${requestScope.goods_list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.goods_list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/content/bgGoods.jsp(33,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("goods");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t<td><img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"></td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>￥ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.inventory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>\r\n");
          out.write("\t\t\t<!-- 操作按钮 -->\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<!-- 修改商品按钮 -->\r\n");
          out.write("\t\t\t<!-- Button trigger modal -->\r\n");
          out.write("\t\t\t<button type=\"button\" class=\"btn btn-mini btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\">修改</button>\r\n");
          out.write("\t\t\t<!-- Modal -->\r\n");
          out.write("\t\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
          out.write("\t\t\t  <div class=\"modal-dialog\" role=\"document\">\r\n");
          out.write("\t\t\t    <div class=\"modal-content\">\r\n");
          out.write("\t\t\t      <div class=\"modal-header\">\r\n");
          out.write("\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
          out.write("\t\t\t        <h4 class=\"modal-title\" id=\"myModalLabel\">修改商品信息</h4>\r\n");
          out.write("\t\t\t      </div>\r\n");
          out.write("\t\t\t      <div class=\"modal-body\">\r\n");
          out.write("\t\t\t      <form class=\"form-horizontal\" action=\"updateGoods\" method=\"get\">\r\n");
          out.write("\t\t\t\t\t  <div class=\"control-group\">\r\n");
          out.write("\t\t\t\t\t    <label class=\"control-label\" for=\"inputId\">商品编号</label>\r\n");
          out.write("\t\t\t\t\t    <div class=\"controls\">\r\n");
          out.write("\t\t\t\t\t      <input type=\"hidden\" id=\"inputId\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\t\t\t\t\t    </div>\r\n");
          out.write("\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t  <div class=\"control-group\">\r\n");
          out.write("\t\t\t\t\t    <label class=\"control-label\" for=\"inputImage\">商品图片</label>\r\n");
          out.write("\t\t\t\t\t    <div class=\"controls\">\r\n");
          out.write("\t\t\t\t\t      <input type=\"text\" id=\"inputImage\" name=\"image\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t    </div>\r\n");
          out.write("\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t  <div class=\"control-group\">\r\n");
          out.write("\t\t\t\t\t    <label class=\"control-label\" for=\"inputName\">商品名称</label>\r\n");
          out.write("\t\t\t\t\t    <div class=\"controls\">\r\n");
          out.write("\t\t\t\t\t      <input type=\"text\" id=\"inputName\" name=\"name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t    </div>\r\n");
          out.write("\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t  <div class=\"control-group\">\r\n");
          out.write("\t\t\t\t\t    <label class=\"control-label\" for=\"inputPrice\">价格</label>\r\n");
          out.write("\t\t\t\t\t    <div class=\"controls\">\r\n");
          out.write("\t\t\t\t\t      <input type=\"number\" id=\"inputPrice\" name=\"price\" min=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t    </div>\r\n");
          out.write("\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t  <div class=\"control-group\">\r\n");
          out.write("\t\t\t\t\t    <label class=\"control-label\"  for=\"inputType\">商品类型</label>\r\n");
          out.write("\t\t\t\t\t    <div class=\"controls\">\r\n");
          out.write("\t\t\t\t\t      <input type=\"text\" id=\"inputType\" name=\"type\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t    </div>\r\n");
          out.write("\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t  <div class=\"control-group\">\r\n");
          out.write("\t\t\t\t\t    <label class=\"control-label\" for=\"inputInventory\">库存</label>\r\n");
          out.write("\t\t\t\t\t    <div class=\"controls\">\r\n");
          out.write("\t\t\t\t\t      <input type=\"number\" id=\"inputInventory\" name=\"inventory\" min=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.inventory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t    </div>\r\n");
          out.write("\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t  <div class=\"control-group\">\r\n");
          out.write("\t\t\t\t\t    <div class=\"controls\">\r\n");
          out.write("\t\t\t\t\t      <button type=\"submit\" class=\"btn\">提交修改</button>\r\n");
          out.write("\t\t\t\t\t    </div>\r\n");
          out.write("\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t  </div>\r\n");
          out.write("\t\t\t      <div class=\"modal-footer\">\r\n");
          out.write("\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
          out.write("\t\t\t      </div>\r\n");
          out.write("\t\t\t    </div>\r\n");
          out.write("\t\t\t  </div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<!-- 删除商品按钮 -->\r\n");
          out.write("\t\t\t<form action=\"deleteGoods\" method=\"get\">\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-small btn-default\" value=\"删除\">\r\n");
          out.write("\t\t\t</form>\r\n");
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t</tr>\t\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
