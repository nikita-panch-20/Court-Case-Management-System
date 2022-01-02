<%-- 
    Document   : invoice
    Created on : 18 Jan, 2020, 7:01:51 PM
    Author     : nikit
--%>

<%@include file="invoice.html" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML >

<html>
    <head><style>
table, td, th {  
  border: 1px solid #ddd;
  text-align: left;
}

table {
  border-collapse: collapse;
  width: 50%;
}

th, td {
  padding: 15px;
}
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="${pageContext.request.contextPath}/main.css" />
        <title>JSP Page</title>
    </head>
    <body>
      <%! Connection con;%>
         <% 
       try
       {
           String LawyerId=request.getParameter("LawyerId");
          Class.forName("com.mysql.jdbc.Driver").newInstance();
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
           Statement st=con.createStatement(); 
           ResultSet rs =st.executeQuery("select * from invoice") ;
           %>
           <center>
    <h1> Drop down box or select element</h1>
        <select>
        <%  if(rs.next()){ %>
            <option><%= rs.getString(1)%></option>
        <% 
        %>
        </select>
      </center>
           
              
          %>
           <h1>INVOICE</h1>
<table bgcolor="white">
           <tr><th>Lawyer Name</th><td><%=rs.getString(2) %></td></tr>
           <tr><th>Rate</th><td><%=rs.getString(3) %></td></tr>
           <tr><th>No. of working hours</th><td><%=rs.getString(4) %></td></tr>
           <tr><th>Last payment made</th><td><%=rs.getString(5) %></td></tr>
           <tr><th>Due payment</th><td><%=rs.getString(6) %></td></tr>
</table>
           <button type="submit" name="save">Convert To PDF</button>
           <%   
       }
             else 
               {
                  %>
              <script>
           window.alert("Recheck the LawyerId!");
           window.location("invoice.html");
            </script>
                  <%
               }
                  }
       catch(Exception e)
                  {
           out.println("Exception");
            e.getMessage();
       }
       
       %>
       

                   
     </body>
</html>

