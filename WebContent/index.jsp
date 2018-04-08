<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<title>某某科技</title>
		<meta name="keywords" content="某某科技" />
		<meta name="description" content="某某科技" />
	</head>
	<body class="login-bg">
			<!--登录-->
					<form action="login.do" method="post" >
						username:<input type="text" name="username">
						<br>
						<br>
						password:<input type="password" name="password">
						<br>					
						<br>					
						<input type="submit" class="btn text-center login-btn" value="立即登录">
					</form>
					<a href="register.jsp">注册</a>${pageContext.request.contextPath}/
	</body>
</html>