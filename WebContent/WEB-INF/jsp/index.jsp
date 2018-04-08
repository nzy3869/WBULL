<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>控制台</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/identify.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/layout.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/account.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/style.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/control_index.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/Js/layer/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/Js/haidao.offcial.general.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/Js/select.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/Js/haidao.validate.js"></script>
	</head>

	<body>
		<div class="view-topbar">
			<div class="topbar-console">
				<div class="tobar-head fl">
					<a href="#" class="topbar-logo fl">
					<span><img src="${pageContext.request.contextPath}/Images/logo.png" width="20" height="20"/></span>
					</a>
					
					<a href="#" class="topbar-home-link topbar-btn text-center fl"><span>管理控制台</span></a>
				</div>
			</div>
			<div class="topbar-info">
				<ul class="fr">
					<!-- 	<span class="icon-notice"></span>
					<span class="topbar-num have">0</span>
					have表示有消息，没有消息去掉have-
					</a>
					</li>
									<li class="fl topbar-info-item strong">
					<div class="dropdown">
						<a href="#" class="dropdown-toggle topbar-btn">
						<span class="fl">工单服务</span>
						<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="#">我的工单</a></li>
							<li><a href="#">提交工单</a></li>
						</ul>
					</div>
					</li>
					 -->
				<!--	<li class="fl topbar-info-item">
					<div class="dropdown">
						<a href="#" class="topbar-btn">
						<span class="fl text-normal">帮助与文档</span>
						<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="#">模板开发手册</a></li>
							<li><a href="#">某某数据字典</a></li>
						</ul>
					</div>
					</li>-->
					<li class="fl topbar-info-item">
					<div class="dropdown">
						<a href="#" class="topbar-btn">
						<span class="fl text-normal"><shiro:principal property="uname"></shiro:principal></span>
						<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="shiro/logout.do">退出</a></li>
						</ul>
					</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="view-body">
			<div class="view-sidebar">
				<div class="sidebar-content">
					<!--<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">产品与服务</span>
							</a>
						</div>
						<ul class="sidebar-trans">
							<li>
								<a href="webSet.html">
									<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
									<span class="text-normal">站点管理</span>
								</a>
							</li>
							<li>
								<a href="smsInfo.html">
									<b class="sidebar-icon"><img src="Images/icon_message.png" width="16" height="16" /></b>
									<span class="text-normal">短信</span>
								</a>
							</li>
							<!-- <li>
								<a href="#">
									<b class="sidebar-icon"><img src="Images/icon_market.png" width="16" height="16" /></b>
									<span class="text-normal">云市场</span>
								</a>
							</li> 
						</ul>
					</div>-->
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">用户中心</span>
							</a>
						</div>
						<ul class="sidebar-trans">
							<li>
								<a href="#">
									<b class="sidebar-icon"><img src="${pageContext.request.contextPath}/Images/icon_cost.png" width="16" height="16" /></b>
									<span class="text-normal">用户管理</span>
								</a>
							</li>
							<li>
								<a href="#">
									<b class="sidebar-icon"><img src="${pageContext.request.contextPath}/Images/icon_order.png" width="16" height="16" /></b>
									<span class="text-normal">资源管理</span>
								</a>
							</li>
							<li>
								<a href="#">
									<b class="sidebar-icon"><img src="${pageContext.request.contextPath}/Images/icon_news.png" width="16" height="16" /></b>
									<span class="text-normal">角色管理</span>
								</a>
							</li>
						<!--	<li>
								<a href="money.html">
									<b class="sidebar-icon"><img src="Images/icon_gold.png" width="16" height="16" /></b>
									<span class="text-normal">金币管理</span>
								</a>
							</li>
							<li>
								<a href="order.html">
									<b class="sidebar-icon"><img src="Images/icon_order.png" width="16" height="16" /></b>
									<span class="text-normal">订单管理</span>
								</a>
							</li>-->
						</ul>
					</div>
				</div>
			</div>
			<div class="view-product background-color">
				<div class="padding-big background-color">
					<iframe  style="width: 100%;height: 70%;"></iframe>
				</div>
			</div>
		</div>

		<script>
			$(".sidebar-title").live('click', function() {
				if ($(this).parent(".sidebar-nav").hasClass("sidebar-nav-fold")) {
					$(this).next().slideDown(200);
					$(this).parent(".sidebar-nav").removeClass("sidebar-nav-fold");
				} else {
					$(this).next().slideUp(200);
					$(this).parent(".sidebar-nav").addClass("sidebar-nav-fold");
				}
			});
		</script>
	</body>

</html>