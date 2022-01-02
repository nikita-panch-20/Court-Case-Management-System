package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/invoice.html");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("<!--\r\n");
      out.write("To change this template, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head><script src=\"https://kit.fontawesome.com/69b74d2d9e.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"invoice.css\" href=\"admin.html\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body> <header>\r\n");
      out.write("         <div class=\"navbar\">\r\n");
      out.write("  <a href=\"admin.html\"><i class=\"fas fa-home\"></i> Home</a>\r\n");
      out.write("  <div class=\"dropdown\"> \r\n");
      out.write("    <button class=\"dropbtn\"><i class=\"fas fa-plus\"></i> Add Details \r\n");
      out.write("      <i class=\"fas fa-caret-down\"></i>\r\n");
      out.write("    </button> \r\n");
      out.write("    </div>\r\n");
      out.write("                          <div class=\"dropdown1\">\r\n");
      out.write("                              <button class=\"dropbtn1\"><i class=\"fas fa-info\"></i> Retrive Details\r\n");
      out.write("                                  <i class=\"fas fa-caret-down\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"dropdown-content1\">\r\n");
      out.write("                             <a href=\"invoice.html\">Invoice</a>\r\n");
      out.write("                             \r\n");
      out.write("                             </div> \r\n");
      out.write("                          </div>\r\n");
      out.write("  \r\n");
      out.write("                                                               <div class=\"dropdown2\">\r\n");
      out.write("                                                           <button class=\"dropbtn2\"><i class=\"fas fa-cogs\"></i> Settings\r\n");
      out.write("                                                           <i class=\"fas fa-caret-down\"></i>\r\n");
      out.write("                                                          </button>\r\n");
      out.write("                            \r\n");
      out.write("                                                          <div class=\"dropdown-content2\">\r\n");
      out.write("                                                           <a href=\"cp.html\">Change Password</a>\r\n");
      out.write("                                                          <a href=\"login.html\">Logout</a>\r\n");
      out.write("                                                         </div> \r\n");
      out.write("                                                          </div>\r\n");
      out.write("         </div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<form class=\"form-inline\" method=\"post\" action=\"invoice.jsp\">\r\n");
      out.write("    <br><input type=\"text\" name=\"LawyerId\" class=\"form-control\" placeholder=\"Search LawyerId..\">\r\n");
      out.write("<button type=\"submit\" name=\"save\">Search</button>\r\n");
      out.write("</form>\r\n");
      out.write("</div></header>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML >\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head><style>\n");
      out.write("table, td, th {  \n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("  padding: 15px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/main.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
      out.write("\n");
      out.write("         ");
 
       try
       {
           String LawyerId=request.getParameter("LawyerId");
          Class.forName("com.mysql.jdbc.Driver").newInstance();
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
           Statement st=con.createStatement(); 
           ResultSet rs =st.executeQuery("select * from invoice") ;
           
      out.write("\n");
      out.write("           <center>\n");
      out.write("    <h1> Drop down box or select element</h1>\n");
      out.write("        <select>\n");
      out.write("        ");
  if(rs.next()){ 
      out.write("\n");
      out.write("            <option>");
      out.print( rs.getString(2));
      out.write("</option>\n");
      out.write("        ");
 
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("      </center>\n");
      out.write("           \n");
      out.write("              \n");
      out.write("           %>\n");
      out.write("           <h1>INVOICE</h1>\n");
      out.write("<table bgcolor=\"white\">\n");
      out.write("           <tr><th>Lawyer Name</th><td>");
      out.print(rs.getString(1) );
      out.write("</td></tr>\n");
      out.write("           <tr><th>Rate</th><td>");
      out.print(rs.getString(2) );
      out.write("</td></tr>\n");
      out.write("           <tr><th>No. of working hours</th><td>");
      out.print(rs.getString(3) );
      out.write("</td></tr>\n");
      out.write("           <tr><th>Last payment made</th><td>");
      out.print(rs.getString(4) );
      out.write("</td></tr>\n");
      out.write("           <tr><th>Due payment</th><td>");
      out.print(rs.getString(5) );
      out.write("</td></tr>\n");
      out.write("</table>\n");
      out.write("           <button type=\"submit\" name=\"save\">Convert To PDF</button>\n");
      out.write("           ");
   
       }
             else 
               {
                  
      out.write("\n");
      out.write("              <script>\n");
      out.write("           window.alert(\"Recheck the LawyerId!\");\n");
      out.write("           window.location(\"invoice.html\");\n");
      out.write("            </script>\n");
      out.write("                  ");

               }
                  }
       catch(Exception e)
                  {
           out.println("Exception");
            e.getMessage();
       }
       
       
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("                   \n");
      out.write("     </body>\n");
      out.write("</html>\n");
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
}
