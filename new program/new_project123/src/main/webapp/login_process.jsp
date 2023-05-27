<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Shreya
  Date: 20-03-2023
  Time: 14:19
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
//    int a= Integer.parseInt(n);
    System.out.println(n);
    String n1= request.getParameter("epass");
    System.out.println(n1);
    String n2= request.getParameter("role");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.print("driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_project123", "root", "123");
        System.out.print("database connected successfully");

        PreparedStatement ps = con.prepareStatement("select Email,Password from user where Email=? and Password=? ");
        ps.setString(1, n);
        ps.setString(2, n1);

        ResultSet res =ps.executeQuery();
        if (res.next()){

            response.sendRedirect("AdminDashboard.html");
        }else {
            response.sendRedirect("Error.html");


        }

    }catch(Exception e) {
        System.out.print(e);
    }


    /*System.out.println(eid);
    System.out.println(epass);*/


%>


</body>
</html>
