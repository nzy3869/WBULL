<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考场考生名单</title>
</head>
<body>
	<div style="height: 600px;margin: 0 auto;">
	<!--startprint-->
		<table style="margin: 0 auto;">
			<tr>
				<th><h2>${af}</h2></th>
				<th><h2>第${room}考场</h2></th>
				<th><h2>第${turns}轮</h2></th>
			</tr>
			<br/>
			<tr>
				<th style="width: 150px;">学号</th>
				<th style="width: 150px;">姓名</th>
				<th style="width: 150px;">身份证号</th>
			</tr>
			<c:forEach var="stu" items="${stuList}">
				<tr>
					<th>${stu.testId}</th>
					<th>${stu.uname}</th>
					<th>${stu.uid}</th>
				</tr>
			</c:forEach>
		</table>
		<!--endprint-->
		
	</div>
	<div style="height:200px;margin-top: 50px;">
			<span style="margin-left: 49%"><a href="toClassStu.do">返回</a>	<a href="#" onclick="doPrint()">打印</a></span>
		</div>
	<script type="text/javascript">
	function doPrint() {   
	    bdhtml=window.document.body.innerHTML;   
	    sprnstr="<!--startprint-->";   
	    eprnstr="<!--endprint-->";   
	    prnhtml=bdhtml.substr(bdhtml.indexOf(sprnstr)+17);   
	    prnhtml=prnhtml.substring(0,prnhtml.indexOf(eprnstr));   
	    window.document.body.innerHTML=prnhtml;  
	    window.print();   
	    window.document.body.innerHTML=bdhtml;  
	}
	</script>
</body>
</html>