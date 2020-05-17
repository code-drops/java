<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>]
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Validate</title>
	</head>
	<body><!-- values given at login page are taken here and checks if the valid details are not -->
	<%
		String user = "uzerjamal";
    String pass = "zxcvb321";   //TODO ask password at run time(in constructor) to increase security
	
    String dbDriver = "jdbc:mysql://db4free.net:3306/rfidproj";
    Connection conn = null;
    Statement stmt = null;
			String username=request.getParameter("username");
		String password=request.getParameter("password");
    
        try {
			conn = DriverManager.getConnection(dbDriver, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    
ResultSet rs=stmt.executeQuery("select * from test");
	while(rs.next())
	{
		if(username.equals(rs.getString(1)) && password.equals(rs.getInt(2))){
			//if the user is valid, then this block executes and WE ARE KEEPING THE USER IN A SESSION
			session.setAttribute("user", username);//THIS IS HOW WE DECLARE THE USER IN A SESSION
			response.sendRedirect("logged.jsp"); //AND WE REDIRECTED TO LOGIN PAGE
		}
	}
	response.sendRedirect("login.jsp");
		%>
	</body>
</html>