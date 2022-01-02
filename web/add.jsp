<%-- 
    Document   : add
    Created on : 23 Jan, 2020, 10:05:11 PM
    Author     : nikit
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
    String LawyerId=request.getParameter("LawyerId");
String Lawyer_name=request.getParameter("Lawyer_name");
String Rate=request.getParameter("Rate");
String work_hours=request.getParameter("work_hours");
String last_pay =request.getParameter("last_pay");
String due_pay=request.getParameter("due_pay");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into invoice(LawyerId,Lawyer_name,Rate,work_hours,last_pay,due_pay)values('"+LawyerId+"','"+Lawyer_name+"','"+Rate+"','"+work_hours+"','"+last_pay+"','"+due_pay+"')");
        if(i>0){  %>
           <script>
           window.alert("Data is entered succesfully!........");
           window.location("admin.html");
            </script>
        <% } 
   else{
       %>
           <script>
           window.alert("Data cant be added..");
           window.location("add.html");
            </script>
        <% 
   }


}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();                                                                                                                                                                                                                                                                           
}
%>