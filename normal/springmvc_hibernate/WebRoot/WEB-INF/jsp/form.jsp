<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
//http://localhost:8080/springmvc-1/
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<!-- 在所有请求前边加上basePath   http://localhost:8080/springmvc-1/-->
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
  	<form action="person/useraddsubmit.action" method="post" >
  		ID：<input type="text" name="id"><br>
  		姓名：<input type="text" name="name"><br>
  		性别：<input type="text" name="gender"><br>
  		地址：<input type="text" name="address"><br>
  		生日：<input type="text" name="birthday"><br>
  		<input type="submit" value="提交"><br>
  	</form>
  </body>
</html>
