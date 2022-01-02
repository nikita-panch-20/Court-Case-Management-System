<%-- 
    Document   : cp
    Created on : 19 Jan, 2020, 1:53:33 PM
    Author     : nikit
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
   <%! Connection conn;%>
<%
String id=request.getParameter("un");
String o=request.getParameter("op");
String x=request.getParameter("np");
String y=request.getParameter("cp");
if(x.equals(y)){


try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
Statement st=conn.createStatement();

     ResultSet rs=st.executeQuery("select user_name,pass,agen from users where user_name='"+id+"' ");
           if(rs.next())
               {
               String u=rs.getString(1);
               String p=rs.getString(2);
      if(u.equals(id)&&p.equals(o))      
      {   
                            
PreparedStatement ps=conn.prepareStatement("UPDATE users SET pass=? where user_name= '"+id+"'");
ps.setString(1, x);
int i=ps.executeUpdate();

if(i>0){  %>
           <script>
           window.alert("Data is entered succesfully!........");
           window.alert("Login with new password!.....");
           window.location("login.html");
            </script>
        <% } 
   else{
       %>
           <script>
           window.alert("Data cant be added..");
           window.location("cp.html");
            </script>
        <% }
}
      else{
                  %>
           <script>
           window.alert("Passwords are not matching!........");
           window.location("cp.html");
            </script>
        <%
        }
               }
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();                                                                                                                                                                                                                                                                           
}
}
else
{
    %>
<script>
window.alert("Passwords are not matching!........");
window.location("cp.html");
</script>
<%
}
%>
