package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import db.DBcollector;
import java.sql.Statement;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home Page</title> \n");
      out.write("        ");
  String username = "", password = "", GmailId = "", Address = "";

            Statement st = DBcollector.getStatement();
            try {
                String query = "SELECT * from emp where username="+username+"";
                ResultSet rs = st.executeQuery(query);

                if (rs.next()) {
                    username = rs.getString("username");
                    password = rs.getString("password");
                    GmailId = rs.getString(" GmailId");
                    Address = rs.getString("Address");

                    session.setAttribute("username", username);
                    session.setAttribute("password", password);
                    session.setAttribute(" GmailId", GmailId);
                    session.setAttribute(" Address", Address);

                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            /* String contact = (String) session.getAttribute("contact"); 
                  if(username==null)
                     {
                         response.sendRedirect("login.html");
                     }*/
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"000000\">   \n");
      out.write("        <div style=\"background:#00DBFF;width:90%;max-width:600px;margin: 100px auto 0;border-radius: 10px;padding: 60px;\">\n");
      out.write("\n");
      out.write("            <a href=\"Logout.jsp\">Sing Out</a> \n");
      out.write("\n");
      out.write("            <H1>");
      out.print(username);
      out.write(" Your Profile</H1>\n");
      out.write("\n");
      out.write("            <form action=\"\" method=\"post\" >\n");
      out.write("                <table >  \n");
      out.write("                    <tr> \n");
      out.write("\n");
      out.write("                        <td><Strong>Name:&nbsp;   <textarea name=\"username\"row=\"1\"   width:=\"50%\">");
      out.print(username);
      out.write("</textarea></Strong></td> \n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td><Strong>Password:&nbsp;   <textarea name=\"password\"row=\"1\">");
      out.print(password);
      out.write("</textarea></Strong></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr> \n");
      out.write("                        <td><Strong>Gmail I'D:&nbsp;  <textarea name=\"GmailID\"row=\"1\">");
      out.print(GmailId);
      out.write("</textarea></Strong></td> \n");
      out.write("                    </tr> \n");
      out.write("                    <tr> \n");
      out.write("                        <td><Strong>Address:&nbsp;   <textarea name=\"Address\"row=\"1\">");
      out.print(Address);
      out.write("</textarea></Strong></td> \n");
      out.write("                    </tr>  \n");
      out.write("                    <tr>\n");
      out.write("                        <td><Strong></Strong></td>\n");
      out.write("                        <td><Strong> <div style=\" background: #001e4d; color: #fff;font-weight: 500; width: 60px;  border:0;  padding: 10px; margin: 10px auto 0; display: block;border-radius: 2px;cursor: pointer; \n");
      out.write("                           transition: all 0.3s;\"><INPUT type = \"submit\" value=\"Update\"/> </div>\n");
      out.write("                            </Strong></td> \n");
      out.write("                    </tr>\n");
      out.write("                </table> \n");
      out.write("            </form> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
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
