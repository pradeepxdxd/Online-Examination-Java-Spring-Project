/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-07-22 04:57:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class javaTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/JavaEclipseProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OnlineQuiz/WEB-INF/lib/spring-webmvc-5.2.4.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1582628626000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.2.4.RELEASE.jar", Long.valueOf(1650369292790L));
    _jspx_dependants.put("/WEB-INF/views/base.jsp", Long.valueOf(1654250721237L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;

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
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
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
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("	\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("	label{\r\n");
      out.write("		color: white;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.onlyQuiz{\r\n");
      out.write("		background-color: #919eb3;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<title>Java Quiz!</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- https://www.sanfoundry.com/java-questions-answers-concepts-oops/ -->\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div align=\"center\" class = \"onlyQuiz\">\r\n");
      out.write("	<br><br>\r\n");
      out.write("		<h2 align=\"center\" style=\"color: white;\">java Quiz</h2>\r\n");
      out.write("		");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
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
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/javaTest.jsp(44,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("quizAnswerHandler");
      // /WEB-INF/views/javaTest.jsp(44,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/views/javaTest.jsp(44,2) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("quizHandler");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("			<!-- First Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-right: 8.5%; margin-top: 2%;\">\r\n");
            out.write("					<label>1. Can we have two main methods in a java class?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"Yes\" id=\"defaultCheck1\" name=\"q1\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"defaultCheck1\">Yes</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"No\"\r\n");
            out.write("						id=\"defaultCheck4\" name=\"q1\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"defaultCheck4\">No</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- Second Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-left: 8%;\">\r\n");
            out.write("					<label>2. Which data type is used to create a variable that\r\n");
            out.write("						should store text?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"Character\"\r\n");
            out.write("						id=\"s1\" name=\"q2\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"s1\">Character</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"String\"\r\n");
            out.write("						id=\"s2\" name=\"q2\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"s2\">String</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"Boolean\"\r\n");
            out.write("						id=\"s3\" name=\"q2\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"s3\">Boolean</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"ArrayList\"\r\n");
            out.write("						id=\"s4\" name=\"q2\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"s4\">ArrayList</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- third Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3>\r\n");
            out.write("					<label>3. Which method can be used to find the length of a\r\n");
            out.write("						string?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"len()\"\r\n");
            out.write("						id=\"t1\" name=\"q3\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"t1\">len()</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"sizeOf()\"\r\n");
            out.write("						id=\"t2\" name=\"q3\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"t2\">sizeOf()</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"lenght()\"\r\n");
            out.write("						id=\"t3\" name=\"q3\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"t3\">lenght()</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"lenght\"\r\n");
            out.write("						id=\"t4\" name=\"q3\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"t4\">lenght</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- forth Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-right: 4%;\">\r\n");
            out.write("					<label>4. Which of the following is not OOPS concept in\r\n");
            out.write("						Java?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Polymorphism\" id=\"f1\" name=\"q4\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"f1\">Polymorphism</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"Compilation\"\r\n");
            out.write("						id=\"f2\" name=\"q4\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"f2\">Compilation</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Encapsulation\" id=\"f3\" name=\"q4\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"f3\">Encapsulation</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"Inheritance\"\r\n");
            out.write("						id=\"f4\" name=\"q4\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"f4\">Inheritance</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- fifth Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-left: 20%;\">\r\n");
            out.write("					<label>5. Which concept of Java is a way of converting real\r\n");
            out.write("						world objects in terms of class?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Polymorphism\" id=\"ff1\" name=\"q5\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"ff1\">Polymorphism</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"Abstraction\"\r\n");
            out.write("						id=\"ff2\" name=\"q5\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"ff2\">Abstraction</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Encapsulation\" id=\"ff3\" name=\"q5\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"ff3\">Encapsulation</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"Inheritance\"\r\n");
            out.write("						id=\"ff4\" name=\"q5\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"ff4\">Inheritance</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- sixth Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-right: 35%;\">\r\n");
            out.write("					<label>6. Array can hold?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Only Primitive values\" id=\"sx1\" name=\"q6\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sx1\">Only Primitive\r\n");
            out.write("							values</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Only Object type values\" id=\"sx2\" name=\"q6\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sx2\">Only Object type\r\n");
            out.write("							values</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Both Primitive & Objects type values\" id=\"sx3\" name=\"q6\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sx3\">Both Primitive &\r\n");
            out.write("							Objects type values</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"None of these\" id=\"sx4\" name=\"q6\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sx4\">None of these</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- seventh Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-right: 14%;\">\r\n");
            out.write("					<label>7. Map(I) and its subclasses are meant for?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Represent a group of individual objects.\" id=\"sv1\"\r\n");
            out.write("						name=\"q7\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sv1\">Represent a\r\n");
            out.write("							group of individual objects.</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Represent a group of objects as key-value pairs\" id=\"sv2\"\r\n");
            out.write("						name=\"q7\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sv2\">Represent a\r\n");
            out.write("							group of objects as key-value pairs.</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Both (a) and (b)\" id=\"sv3\" name=\"q7\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sv3\">Both (a) and (b)</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"None of these\" id=\"sv4\" name=\"q7\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"sv4\">None of these</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- eight Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-right: 3.5%;\">\r\n");
            out.write("					<label>8. What is the default relation b/w Thread &\r\n");
            out.write("						Runnable?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Thread extends Runnable\" id=\"e1\" name=\"q8\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"e1\">Thread extends\r\n");
            out.write("							Runnable</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Thread implements Runnable\" id=\"e2\" name=\"q8\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"e2\">Thread implements\r\n");
            out.write("							Runnable</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"They are not related\" id=\"e3\" name=\"q8\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"e3\">They are not\r\n");
            out.write("							related</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Runnable extends Thread\" id=\"e4\" name=\"q8\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"e4\">Runnable extends\r\n");
            out.write("							Thread</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- ninth Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-right: 14.5%;\">\r\n");
            out.write("					<label>9. What is the default priority of a thread?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"5\" id=\"n1\"\r\n");
            out.write("						name=\"q9\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"n1\">5</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"2\" id=\"n2\"\r\n");
            out.write("						name=\"q9\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"n2\">2</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"4\" id=\"n3\"\r\n");
            out.write("						name=\"q9\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"n3\">4</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\" value=\"1\" id=\"n4\"\r\n");
            out.write("						name=\"q9\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"n4\">1</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<!-- tenth Question -->\r\n");
            out.write("\r\n");
            out.write("			<div class=\"form-check\">\r\n");
            out.write("				<h3 style=\"margin-right: 14.5%;\">\r\n");
            out.write("					<label>10. Quick sort algorithm is an example of ?</label>\r\n");
            out.write("				</h3>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Divide and conquer\" id=\"tt1\" name=\"q10\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"tt1\">Divide and\r\n");
            out.write("							conquer</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Dynamic Programming\" id=\"tt2\" name=\"q10\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"tt2\">Dynamic\r\n");
            out.write("							Programming</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Improved binary search\" id=\"tt3\" name=\"q10\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"tt3\">Improved binary\r\n");
            out.write("							search</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div align=\"left\" style=\"margin-left: 27%;\">\r\n");
            out.write("					<input class=\"form-check-input\" type=\"radio\"\r\n");
            out.write("						value=\"Greedy approach\" id=\"tt4\" name=\"q10\">\r\n");
            out.write("					<h5>\r\n");
            out.write("						<label class=\"form-check-label\" for=\"tt4\">Greedy approach</label>\r\n");
            out.write("					</h5>\r\n");
            out.write("				</div>\r\n");
            out.write("\r\n");
            out.write("			</div>\r\n");
            out.write("			<br>\r\n");
            out.write("\r\n");
            out.write("			<button type=\"submit\" class=\"btn btn-outline-warning\"\r\n");
            out.write("				style=\"margin-bottom: 1%;\">Submit</button>\r\n");
            out.write("\r\n");
            out.write("		");
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
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }
}