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

	<s:actionerror/>

	<s:form action="login">
	
		<s:textfield name="userName" label="用户名"/>
		<s:submit value="提交"/>
	
	</s:form>

	<s:form action="regist">
	
		<s:textfield name="userName" label="用户名"/>
		<s:submit value="提交"/>
	
	</s:form>

</body>
</html>