<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HelloView</h1>
	<form action="/index.html" method="post" enctype="multipart/form-data">
		File: <input type="file" name="file" id="file" /> <br /> khoản cách:
		<input type="text" value="/tmp" name="destination" /> </br> <input
			type="submit" value="Upload" name="upload" id="upload" />
	</form>
	<a href="/register">Trương hiếu nghĩa </a>
</body>
</html>