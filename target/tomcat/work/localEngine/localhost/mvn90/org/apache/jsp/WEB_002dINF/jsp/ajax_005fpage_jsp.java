package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajax_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\tid <input id=\"person_id\" type=\"text\" name=\"id\">\r\n");
      out.write("\tusername : <input id=\"username\" type=\"text\" name=\"username\" />\r\n");
      out.write("\tpassword : <input id=\"password\" type=\"password\" name>\r\n");
      out.write("\t<input type=\"submit\" value=\"submit\" id=\"submit\" />\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar elemenSubmit = $('#submit');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\telemenSubmit.click(function(){\r\n");
      out.write("\t\tvar personId = $('#person_id').val();\r\n");
      out.write("\t\tvar username = $('#username').val();\r\n");
      out.write("\t\tvar password = $('#password').val();\r\n");
      out.write("\t\tvar person  = {\r\n");
      out.write("\t\t\t\tid : personId,\r\n");
      out.write("\t\t\t\tusername : username,\r\n");
      out.write("\t\t\t\tpassword : password\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t//console.log(person);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\tdata : JSON.stringify(person), //send data\r\n");
      out.write("\t\t\t\tcontentType: 'application/json',\r\n");
      out.write("\t\t\t\turl:\"http://localhost:8080/mvn90/pengembalian/data\",\r\n");
      out.write("\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType:'json'\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t \tvar element = $('#loadAjax');\r\n");
      out.write("\t \tvar pengembalian = {\r\n");
      out.write("\t \t\tnoRegistrasi : \"123456\"\r\n");
      out.write("\t \t};\r\n");
      out.write("\t \t\r\n");
      out.write("\t\t\telement.click(function(){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\t\tdata : JSON.stringify(pengembalian),\r\n");
      out.write("\t\t\t\t\tcontentType: 'application/json',\r\n");
      out.write("\t\t\t\t\turl:\"http://localhost:8080/mvn90/restpengembalian/getall\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"name \"+ data.anggota.name);\r\n");
      out.write("\t\t\t\t\t\t$('#result').html(\"name : \"+ data.anggota.name);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tdataType: 'json'\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\thalaman jsp\r\n");
      out.write("\t<a href=\"#\" id=\"loadAjax\">loading</a>\r\n");
      out.write("\t<div id=\"result\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
