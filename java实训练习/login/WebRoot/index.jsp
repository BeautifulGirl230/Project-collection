<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<%
		String username = "";
		String password = "";
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "Snake";
		String pwd = "snake";
		
		String sql = "select username from login where username = '"+username+"'";
		String sql1 = "select password from login where password = '"+password+"'";
		
		Connection conn = DriverManager.getConnection(url, user, pwd);
		Class.forName("oracle.jdbc.OracleDriver");
		Statement stmt1 = conn.createStatement();
		Statement stmt2 = conn.createStatement();
		ResultSet rs = stmt1.executeQuery(sql);
		ResultSet rs2 = stmt2.executeQuery(sql1);
		
		if(rs.next()&&rs2.next()){
			request.getRequestDispatcher("false.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("true.jsp").forward(request, response);
		}
	%>
</body>
</html>
