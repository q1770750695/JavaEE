<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:debug />

	<center>
	
		<s:form action="/test08">
		
			<!-- 假设：用户名必须等于Tom2015 -->
			<s:textfield name="userName" label="用户名" />
			
			<s:submit value="提交" />
		
		</s:form>
		
	</center>

</body>
</html>