/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-05 12:15:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/baseCss.jsp", Long.valueOf(1654346956179L));
    _jspx_dependants.put("jar:file:/D:/JavaEclipseProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OnlineQuiz/WEB-INF/lib/spring-webmvc-5.2.4.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1582628626000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.2.4.RELEASE.jar", Long.valueOf(1650369292790L));
    _jspx_dependants.put("/WEB-INF/views/base.jsp", Long.valueOf(1654250721237L));
    _jspx_dependants.put("/WEB-INF/views/navbar.jsp", Long.valueOf(1654339305456L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".footer-dark {\r\n");
      out.write("	padding: 50px 0;\r\n");
      out.write("	color: #f0f9ff;\r\n");
      out.write("	background-color: #282d32;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark h3 {\r\n");
      out.write("	margin-top: 0;\r\n");
      out.write("	margin-bottom: 12px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark ul {\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	line-height: 1.6;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark ul a {\r\n");
      out.write("	color: inherit;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	opacity: 0.6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark ul a:hover {\r\n");
      out.write("	opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( max-width :767px) {\r\n");
      out.write("	.footer-dark .item:not(.social) {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		padding-bottom: 20px;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark .item.text {\r\n");
      out.write("	margin-bottom: 36px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( max-width :767px) {\r\n");
      out.write("	.footer-dark .item.text {\r\n");
      out.write("		margin-bottom: 0;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark .item.text p {\r\n");
      out.write("	opacity: 0.6;\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark .item.social {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( max-width :991px) {\r\n");
      out.write("	.footer-dark .item.social {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		margin-top: 20px;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark .item.social>a {\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	width: 36px;\r\n");
      out.write("	height: 36px;\r\n");
      out.write("	line-height: 36px;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	box-shadow: 0 0 0 1px rgba(255, 255, 255, 0.4);\r\n");
      out.write("	margin: 0 8px;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	opacity: 0.75;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark .item.social>a:hover {\r\n");
      out.write("	opacity: 0.9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-dark .copyright {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding-top: 24px;\r\n");
      out.write("	opacity: 0.3;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<title>Contact Us</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("	\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"home\" style=\"color: white\">Home</a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n");
      out.write("		aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("		<ul class=\"navbar-nav\">\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"login\" style=\"color: white\">Login</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"register\" style=\"color: white\">Register</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"contact\" style=\"color: white\">Contact</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link disabled\" href=\"#\" style=\"color: white\">About Us</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link disabled\" href=\"#\" style=\"color: white\">Help</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("	* {\r\n");
      out.write("		margin: 0px;\r\n");
      out.write("		padding: 0px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.bigimg {\r\n");
      out.write("		width: 100vw;\r\n");
      out.write("		height: 950px;\r\n");
      out.write("		position: relative;\r\n");
      out.write("		background-image:\r\n");
      out.write("			url(\"https://source.unsplash.com/1600x900/?study\");\r\n");
      out.write("		background-size: cover;\r\n");
      out.write("		background-repeat: no-repeat;\r\n");
      out.write("		z-index: 1;\r\n");
      out.write("		opacity: 50;\r\n");
      out.write("	}\r\n");
      out.write("\n");
      out.write("</style>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"bigimg\">\r\n");
      out.write("\r\n");
      out.write("		<br>\r\n");
      out.write("		<div align=\"center\">\r\n");
      out.write("\r\n");
      out.write("			<h2 style=\"color: white; margin-top: 5%;\">Contact Us</h2>\r\n");
      out.write("\r\n");
      out.write("			");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"footer-dark\">\r\n");
      out.write("		<footer>\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-sm-6 col-md-3 item\">\r\n");
      out.write("						<h3>Services</h3>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"#\">Web design</a></li>\r\n");
      out.write("							<li><a href=\"#\">Development</a></li>\r\n");
      out.write("							<li><a href=\"#\">Hosting</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-sm-6 col-md-3 item\">\r\n");
      out.write("						<h3>About</h3>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"#\">Company</a></li>\r\n");
      out.write("							<li><a href=\"#\">Team</a></li>\r\n");
      out.write("							<li><a href=\"#\">Careers</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6 item text\">\r\n");
      out.write("						<h3>Pradeep Biswas</h3>\r\n");
      out.write("						<p>Praesent sed lobortis mi. Suspendisse vel placerat ligula.\r\n");
      out.write("							Vivamus ac sem lacus. Ut vehicula rhoncus elementum. Etiam quis\r\n");
      out.write("							tristique lectus. Aliquam in arcu eget velit pulvinar dictum vel\r\n");
      out.write("							in justo.</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<p class=\"copyright\">\r\n");
      out.write("					Quiz Show © 2022<b style=\"margin-left: 4%;\">Version 0.0.1</b>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<!-- Optional JavaScript -->\r\n");
      out.write("	<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/contact.jsp(127,3) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("contactHandler");
      // /WEB-INF/views/contact.jsp(127,3) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("cont");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("				<div class=\"form-row\" style=\"margin-top: 2%;\">\r\n");
            out.write("					<div class=\"col-md-4 mb-3\">\r\n");
            out.write("						<input style=\"margin-left: 50%;\" type=\"text\" class=\"form-control\"\r\n");
            out.write("							id=\"validationCustom01\" placeholder=\"First name\"\r\n");
            out.write("							required=\"required\" name=\"fname\">\r\n");
            out.write("						<div class=\"valid-feedback\" style=\"color: white;\">Looks\r\n");
            out.write("							good!</div>\r\n");
            out.write("					</div>\r\n");
            out.write("					<div class=\"col-md-4 mb-3\">\r\n");
            out.write("						<input style=\"margin-left: 51%;\" type=\"text\" class=\"form-control\"\r\n");
            out.write("							id=\"validationCustom02\" placeholder=\"Last name\"\r\n");
            out.write("							required=\"required\" name=\"lname\">\r\n");
            out.write("						<div class=\"valid-feedback\" style=\"color: white;\">Looks\r\n");
            out.write("							good!</div>\r\n");
            out.write("					</div>\r\n");
            out.write("\r\n");
            out.write("					<div class=\"form-group col-md-6\">\r\n");
            out.write("						<input type=\"email\" style=\"width: 66%; margin-left: 32.5%;\"\r\n");
            out.write("							class=\"form-control\" id=\"inputEmail4\"\r\n");
            out.write("							placeholder=\"Enter Email Address\" name=\"email\"\r\n");
            out.write("							required=\"required\">\r\n");
            out.write("					</div>\r\n");
            out.write("					<div class=\"form-group col-md-6\">\r\n");
            out.write("						<input style=\"width: 66%; margin-right: 40%;\" type=\"text\"\r\n");
            out.write("							class=\"form-control\" id=\"inputPassword4\"\r\n");
            out.write("							placeholder=\"Enter Mobile Number\" name=\"phone\"\r\n");
            out.write("							required=\"required\">\r\n");
            out.write("					</div>\r\n");
            out.write("\r\n");
            out.write("					<div class=\"form-group\">\r\n");
            out.write("						<input style=\"margin-left: 125%; width: 495%;\" type=\"text\"\r\n");
            out.write("							class=\"form-control\" id=\"inputAddress\" placeholder=\"Address\"\r\n");
            out.write("							name=\"address\">\r\n");
            out.write("					</div>\r\n");
            out.write("\r\n");
            out.write("					<div class=\"form-group\">\r\n");
            out.write("						<input style=\"margin-left: 25%; width: 495%; margin-top: 26.5%;\"\r\n");
            out.write("							type=\"text\" class=\"form-control\" id=\"inputAddress\"\r\n");
            out.write("							placeholder=\"Message\" name=\"message\">\r\n");
            out.write("					</div>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("				<button type=\"submit\" class=\"btn btn-danger\">Submit</button>\r\n");
            out.write("\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }
}
