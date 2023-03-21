<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="javax.xml.transform.Result" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 20-03-2023
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String n= request.getParameter("eid");
    String n1= request.getParameter("epass");
    String n2= request.getParameter("role");




    try {
        Class.forName("com.mysql.jdbc.Driver");
        out.print("driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_project11", "root", "123");
        out.print("database connected successfully");

        PreparedStatement ps = con.prepareStatement("INSERT INTO  inventory(name,pass,role) VALUES (?,?,?) ");
        ps.setString(1, n);
        ps.setString(2, n1);
        ps.setString(3, n2);
        ps.executeUpdate();

    }catch(Exception e) {
        System.out.print(e);
    }

    /*System.out.println(eid);
    System.out.println(epass);*/

    response.sendRedirect("success.html");






%>


</body>
</html>
