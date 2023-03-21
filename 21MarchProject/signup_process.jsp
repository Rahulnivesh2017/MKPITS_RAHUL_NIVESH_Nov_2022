<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 21-03-2023
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String n= request.getParameter("ename");
    String n1= request.getParameter("epass");
    String role="Admin";




    try {
        Class.forName("com.mysql.jdbc.Driver");
        out.print("driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_project11", "root", "123");
        out.print("database connected successfully");

        PreparedStatement ps= con.prepareStatement("INSERT INTO  loginpage(Emp_name,Emp_pass,role)  VALUES (?,?,?) ");
        ps.setString(1, n);
        ps.setString(2, n1);
        ps.setString(3, role);
        ps.executeUpdate();

    }catch(Exception e) {
        System.out.print(e);
    }


    System.out.println(n);
    System.out.println(n1);
    response.sendRedirect("login_page.html");






%>


</body>
</html>
