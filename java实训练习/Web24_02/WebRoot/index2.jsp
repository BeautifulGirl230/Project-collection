<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pojo.User" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index2.jsp' starting page</title>
    
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
  	pageContext.setAttribute("abc", "Snake");
  	User user = new User();
  	pageContext.setAttribute("user", user);
  	
   %>
  
  <body>
    <c:set var="abc" value="Snake2222" scope="request"></c:set>
    ${abc }<br>
    <c:set target="${user }" property="name" value="SnakeSthil&lt;f&gt;eng"></c:set>
    <c:set target="${user }" property="pwd" value="123"></c:set>
    ${empty user1111?"没有找到":user.name }<br>
    ${user.pwd }<br>
    <c:remove var="abc" scope="request"/>
    <%
    	pageContext.removeAttribute("abc");
     %>
     <hr>
     ${abc }
  </body>
</html>
