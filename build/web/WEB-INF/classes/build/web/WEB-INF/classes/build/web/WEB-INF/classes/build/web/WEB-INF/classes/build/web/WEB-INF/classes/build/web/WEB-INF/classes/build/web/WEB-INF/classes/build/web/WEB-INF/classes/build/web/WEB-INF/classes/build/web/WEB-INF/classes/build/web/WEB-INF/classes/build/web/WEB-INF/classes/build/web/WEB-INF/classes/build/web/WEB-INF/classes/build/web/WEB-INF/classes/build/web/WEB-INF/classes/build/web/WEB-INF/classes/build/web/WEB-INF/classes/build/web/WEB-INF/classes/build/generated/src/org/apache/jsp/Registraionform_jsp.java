package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registraionform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"cyan\">\n");
      out.write("       <H1> Welcome User...</H1> \n");
      out.write("        <form >\n");
      out.write("        <table action=\"\" method=\"post\"  bgcolor=\"7FFFD4\" >  \n");
      out.write("            <tr> \n");
      out.write("                <td><Strong>User name</Strong></td>\n");
      out.write("                <td><Strong><INPUT type = \"text\" name=\"username\" placeholder=\"Enter your user name\"/></Strong></td> \n");
      out.write("            </tr> \n");
      out.write("            <tr>\n");
      out.write("                <td><Strong>Password</Strong></td>\n");
      out.write("                <td><Strong><INPUT type = \"password\" name=\"password\" placeholder=\"Enter your password\"/></Strong></td> \n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td><Strong> Confirm Password</Strong></td>\n");
      out.write("                <td><Strong><INPUT type = \"password\" name=\"confirm password\" placeholder=\"Enter your confirm password\" size=\"22\"/></Strong></td> \n");
      out.write("            </tr> \n");
      out.write("              \n");
      out.write("            <tr> \n");
      out.write("                <td><Strong> Gmail I'D</Strong></td>\n");
      out.write("                <td><Strong><INPUT type = \"text\" name=\"gmail I'd\" placeholder=\"Enter your Gmail I'd\"/></Strong></td> \n");
      out.write("            </tr> \n");
      out.write("             <tr> \n");
      out.write("                <td><Strong> Contract No.</Strong></td>\n");
      out.write("                <td><Strong><INPUT type = \"text\" name=\"Contract No.\"  value = \"+91\" size=\"15\"/></Strong></td> \n");
      out.write("            </tr>  \n");
      out.write("            <tr> \n");
      out.write("                <td><Strong> Address</Strong></td>\n");
      out.write("                <td><Strong><INPUT type = \"text\" name=\" Address\"/>  </Strong></td> \n");
      out.write("            </tr>  \n");
      out.write("            <tr>\n");
      out.write("                <td><Strong></Strong></td>\n");
      out.write("                <td><Strong><INPUT type = \"submit\" value=\"Register\"/>   <INPUT type = \"reset\" value=\"Reset\"/></Strong></td> \n");
      out.write("            </tr>\n");
      out.write("        </table> \n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
