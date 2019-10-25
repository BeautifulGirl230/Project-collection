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
  	request.setAttribute("age", 19);
  	request.setAttribute("sex", "男生");
  	request.setAttribute("sex2", "女生");
  	 %>
  
  <body>
<!--     这个客户端跳转或者叫重定向 -->
<%-- 	<c:redirect url="index2.jsp"></c:redirect> --%>
<!-- 这个服务器端跳转，地址栏不变 -->
<%-- 	<jsp:forward page="index2.jsp"></jsp:forward> --%>
	
	<c:url var="myURL" value="index3.jsp">
		<c:param name="method" value="del"></c:param>
		<c:param name="stuId" value="001"></c:param>
	</c:url>
	<a href="1">index3.jsp</a>
	
	<c:if test="${age>18 }" var="test" scope="page">结果为true显示这里</c:if>
	${test }
	<br>
	<c:if test="${age<19 }" var="test2" scope="page">结果为true显示这里</c:if>
	${test2 }
	<br>
	<c:if test="${sex=='男生' }" var="test" scope="page">显示${sex }</c:if><br>
	<c:if test="${sex!='男生' }" var="test" scope="page">显示${sex2 }</c:if>
  </body>
</html>
