<%@ include file="lib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="mainview">
		<div id="frm_login">
			<form action="/register.html" method="post">				
				<div class="label">Tên đăng nhập</div><input type="text" name="username" value="${formdata.username}" class="input" style="width: 300px;"/>
				<div class="label">Email</div><input type="text" name="email" class="input" />
				<div class="label">Ho va ten</div><input type="text" name="fullname" class="input"/>
				<div class="label">mat khau</div><input type="password" name="password" class="input" />
				<div class="label">xac nhan mat khau</div><input type="password" name="repassword"class="input" />
				<div class="label">Ngay sinh</div><input type="text" name="birthday" class="input"/>
				<div class="label">Gioi tinh</div>
				<select name="gender" class="input">
						<option value="9999" selected="selected">chosse gender</option>
					<c:forEach var ="gender" items="${gender_list}">
						<option value="${gender.genderID}">${gender.genderName}</option>
					</c:forEach>						
				</select>
				<div class="label">Dia chi</div><input type="text" name="address" class="input"/>
				<div class="label">Thanh pho</div>
				<select name="location" class="input">
						<option value="9999" selected="selected">chosse location</option>
					<c:forEach var ="location" items="${location_list}">
						<option value="${location.locationID}">${location.locationName}</option>
					</c:forEach>
						<option value="999">Other</option>
				</select>
				<div style="width: 440px; clear: both; float: left;" ><input type= "submit" /></div>				
			</form>
		</div>
	</div>
</body>
</html>