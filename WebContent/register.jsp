<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
 <div>
 	<form action="register.do" method="post">
 		<table>
 			<tr>用户名：<input type="text" name="uid"/></tr>
 			<tr>中文名：<input type="text" name="uname"/></tr>
 			<tr>密码：<input type="text" name="password"/></tr>
 			<tr><input type="submit" value="register"/></tr>
 		</table>
 	</form>
 </div>
</body>
</html>