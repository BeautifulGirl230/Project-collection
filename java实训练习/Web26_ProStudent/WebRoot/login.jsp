<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
	<form action="LoginServlet" method="post">
	用户名：<input type=" text" name="userName" value="${cookie.userName.value }"><br>
	密&nbsp;&nbsp;码：<input type="password" name=userPwd value="${cookie.userPwd.value }" ><br>
	<input type="chekbox" value="yes" name="setCookie">保存一周
	<input type="submit">
	msg:<div>${errorMsg }</div>
	</form>
  </body>
</html>
