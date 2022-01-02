<%-- 
    Document   : process
    Created on : Jun 16, 2019, 3:20:22 PM
    Author     : Tummala
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String first_name=request.getParameter("fname");
String last_name=request.getParameter("lname");
String email=request.getParameter("email");
String agen=request.getParameter("agency");
String user_name=request.getParameter("userid");
String pass=request.getParameter("password");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into users(first_name,last_name,email,agen,user_name,pass)values('"+first_name+"','"+last_name+"','"+email+"','"+agen+"','"+user_name+"','"+pass+"')");
if(i>0){  %>
           <script>
           window.alert("Data is entered succesfully!........");
           window.location("login.html");
            </script>
        <% } 
   else{
       %>
           <script>
           window.alert("Data cant be added..");
           window.location("register.html");
            </script>
        <% }
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();                                                                                                                                                                                                                                                                           
}
%>