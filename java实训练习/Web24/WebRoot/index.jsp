<%@ page import="pojo.User" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
  
  <%
  String abc  = null;
  //先从页面范围找，找不到，再找请求范围，找不到，在会话范围，找不到，在去application里找，找不到不显示
  request.setAttribute("abc", "request");	//请求范围	
  session.setAttribute("abc", "session");	//会话范围
  pageContext.setAttribute("abc", "sdfasd");	//页面范围
  application.setAttribute("abc", "application");	//上下文范围
  
  //请求里写入一个User对象
  User user = new User();
  user.setName("Snake");
  user.setPwd("123");
  request.setAttribute("userkey", user);//请求范围
   %>
  
  
  <body>
  	<a href="MyJsp.jsp?method=del&stuId=001">MyJsp.jsp</a>
    ${empty abc}<br>
    ${true && false }<br>
    <br>
        表示从会话范围找abc:${sessionScope.abc }<br>
  	表示从页面范围找abc:${pageScope.abc }<br>
  	表示从请求范围找abc:${requestScope.abc }<br>
  	表示从上下文范围找abc:${applicationScope.abc }<br>
  	
  	${userkey.name }<br>
  	${userkey.pwd }<br>
  	${userkey["name"] }<br>
  	${userkey["pwd"] }<br>
  	
  	${1+2 }<br>
  	${"abc" }<br>abc<br>
  	${abc }<br>
  	${asdfasdfa }<br>
  	<%=abc %><br>
  </body>
</html>
