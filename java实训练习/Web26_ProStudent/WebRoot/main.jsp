<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
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
    <table border="1">
  		<c:forEach items="${stuList }" var="stu">
  			<tr>
  				<td>${stu.stuId }</td>
  				<td>${stu.stuName }</td>
  				<td>${stu.stuSex }</td>
  				<td>${stu.stuEmail }</td>
  				<td>${stu.stuBirthday }</td>
  				<td>${stu.stuAddress }</td>
  				<td>
  					<a href="StudentServlet?op=del&stuId=${stu.stuId }">删除</a>
  					<a href="StudentServlet?op=update&stuId=${stu.stuId }">更新</a>
  				</td>
  			</tr>
  		</c:forEach>
	</table>

  </body>
</html>
