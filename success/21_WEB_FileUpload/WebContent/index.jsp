<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 style="color: red">${msg}</h3>
<h1>上传文件</h1>
<form action="UploadServlet" method="post" enctype="multipart/form-data"><input type="text" name="username"/><input type="file" name="photo1"/><input type="file" name="photo2"/><input type="submit" value="提交"/></form>
</body>
</html>