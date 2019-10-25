<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add_update.jsp' starting page</title>
    
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
    <form action="StudentServlet" method="post">
         <c:if test="${method=='add' }">
         学号  <input type="text" name="stuId"><br>
         </c:if>
          <c:if test="${method=='update' }">
         <input type="text" name="stuId" style="display:none; " value="${stu.stuId }"><br>
         </c:if>
<!--          stuAddress : String -->
stuAddress<input name="stuAddress" value="${stu.stuAddress }" ><br>
<!-- stuBirthday : Date -->
<fmt:formatDate value="${stu.stuBirthday }" pattern="yyyy-MM-dd" var="bir"/>
stuBirthday<input name="stuBirthday" value="${bir }" ><br>
<!-- stuEmail : String -->
stuEmail<input name="stuEmail" value="${stu.stuEmail }" ><br>
<!-- stuId : String -->
<!-- stuName : String -->
stuName<input name="stuName" value="${stu.stuName }" ><br>
<!-- stuSex : String -->
<c:choose>
  <c:when test="stu.stuSex=='男'">
  性别<input type="radio" name="stuSex" value="男" checked="checked">男
 <input type="radio" name="stuSex"  value="女">  女  <br> 
  </c:when>
  <c:when test="stu.stuSex=='女'">
  性别<input type="radio" name="stuSex" value="男">男
 <input type="radio" name="stuSex"  value="女"  checked="checked">  女  <br> 
  </c:when>
  <c:otherwise>
  性别<input type="radio" name="stuSex" value="男">男
 <input type="radio" name="stuSex"  value="女"  checked="checked">  女  <br> 
  </c:otherwise>
</c:choose>
<c:if test="${method=='update' }">
 <input type="hidden" name="op" value="saveUpdate">
</c:if>
<c:if test="${method=='add' }">
 <input type="hidden" name="op" value="saveAdd">
</c:if>
<input type="submit">
    </form>
  </body>
</html>
