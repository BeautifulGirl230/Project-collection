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
  	request.setAttribute("score", 30);
   %>
  
  <body>
    <c:choose>
    	<c:when test="${score>=90 }">A</c:when>
    	<c:when test="${score<90&&score>=80 }">B</c:when>
    	<c:when test="${score<80&&score>=60 }">C</c:when>
    	<c:when test="${score<60 }">D</c:when>
    	<c:otherwise>以上都不满足显示这里</c:otherwise>
    </c:choose>
  </body>
</html>
