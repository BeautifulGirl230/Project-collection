<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index3.jsp' starting page</title>
    
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
  	String names[] = {"Snake","张","李","黄"};
  	request.setAttribute("names", names);
   %>
  
  <body>
    <c:param name="nethod"></c:param>
    <hr>
    <c:forTokens items="goo#gle,w3cs*chool,tao8bao" delims=",#*8" var="name">
    	<c:out value="${name }"></c:out><p>
    </c:forTokens>
    <hr>
    <c:forEach items="${requestScope.names }" var="abc" varStatus="sta">
    	${abc }-----${sta.index }<br>
    </c:forEach>
  </body>
</html>
