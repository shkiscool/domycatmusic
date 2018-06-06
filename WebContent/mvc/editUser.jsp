<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="xxxxx">
<meta name="author" content="xxxxx">
<meta name="keyword" content="xxxxx">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>云之家后台管理</title>
<!-- start: Css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/asset/css/bootstrap.min.css">
<!-- plugins -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/asset/css/plugins/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/asset/css/plugins/simple-line-icons.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/asset/css/plugins/animate.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/asset/css/plugins/fullcalendar.min.css" />
<link href="${pageContext.request.contextPath}/asset/css/style.css"
	rel="stylesheet">
<!-- end: Css -->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="asset/js/html5shiv.min.js"></script>
      <script src="asset/js/respond.min.js"></script>
    <![endif]-->
</head>

<body id="mimin" class="dashboard">
	<!-- start: Header -->
	<nav class="navbar navbar-default header navbar-fixed-top">
		<div class="col-md-12 nav-wrapper">
			<div class="navbar-header" style="width: 100%;">
				<div class="opener-left-menu is-open">
					<span class="top"></span> <span class="middle"></span> <span
						class="bottom"></span>
				</div>
				<a href="${pageContext.request.contextPath}/mvc/Behinddesk.jsp"
					class="navbar-brand"> <b>云之家后台管理</b>
				</a>
				<ul class="nav navbar-nav navbar-right user-nav">
					<li class="user-name"><span>${sessionScope.users.USERNAME}</span></li>
					<li class="dropdown avatar-dropdown"><img
						src="${pageContext.request.contextPath}/asset/img/avatar.jpg"
						class="img-circle avatar" alt="user name" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="true" />
						<ul class="dropdown-menu user-dropdown">
							<li><a href="${pageContext.request.contextPath}/login.jsp"><span
									class="fa fa-power-off"></span> 退出登录</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- end: Header -->
	<div class="container-fluid mimin-wrapper">
		<!-- start:Left Menu -->
		<div id="left-menu">
			<div class="sub-left-menu scroll">
				<ul class="nav nav-list">
					<li>
						<div class="left-bg"></div>
					</li>
					<li class="ripple"><a class="tree-toggle nav-header"
						id="left-menu-1"><span class="fa-home fa"></span> 首页 <span
							class="fa-angle-right fa right-arrow text-right"></span> </a></li>
					<li class="active ripple"><a class="tree-toggle nav-header"
						id="left-menu-2"> <span class="fa-diamond fa"></span> 用户管理 <span
							class="fa-angle-right fa right-arrow text-right"></span>
					</a>
						<ul class="nav nav-list tree">
							<li><a
								href="${pageContext.request.contextPath}/UsersController?op=list">用户列表</a></li>
							<li class="active"><a
								href="${pageContext.request.contextPath}/mvc/editUser.jsp">用户编辑</a></li>
						</ul></li>
					<li class="ripple"><a class="tree-toggle nav-header"
						id="left-menu-3"><span class="fa fa-check-square-o"></span>
							音乐管理 <span class="fa-angle-right fa right-arrow text-right"></span>
					</a>
						<ul class="nav nav-list tree">
							<li><a
								href="#">音乐列表</a></li>
							<li><a
								href="#">音乐编辑</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!-- end: Left Menu -->

		<!-- start: content -->
		<div id="content">
			<div class="panel">
				<div class="panel-body">
					<div class="col-md-12">
						<h3 class="animated fadeInLeft">用户管理</h3>
						<p class="animated fadeInDown">
							业务 <span class="fa-angle-right fa"></span> 新增用户
						</p>
					</div>
				</div>
			</div>
			<form class="form-horizontal" role="form" onsubmit="return send()"
				id="forms"
				action="${pageContext.request.contextPath}/UsersController?op=add"
				method="post">
				<div class="form-group">
					<label for="userName" class="col-sm-2 control-label">用户名:</label>
					<div class="col-sm-6">
						<input type="text" required="required" class="form-control"
							name="userName" id="userName" />
					</div>
				</div>
				<div class="form-group">
					<label for="userPwd" class="col-sm-2 control-label">密码:</label>
					<div class="col-sm-6">
						<input type="password" required="required" class="form-control"
							name="userPwd" id="userPwd" />
					</div>
				</div>
				<div class="form-group">
					<label for="userEmail" class="col-sm-2 control-label">Email:</label>
					<div class="col-sm-6">
						<input type="text" required="required" class="form-control"
							name="userEmail" id="userEmail" />
					</div>
				</div>
				<div class="form-group">
					<label for="userPhoto" class="col-sm-2 control-label">用户照片:</label>
					<div class="col-sm-6">
						<input type="text" required="required" class="form-control"
							name="userPhoto" id="userPhoto" />
					</div>
				</div>
				<div class="form-group">
					<label for="userLove" class="col-sm-2 control-label">用户音乐喜好:</label>
					<div class="col-sm-6">
						<input type="text" required="required" class="form-control"
							name="userLove" id="userLove" />
					</div>
				</div>
				<div class="form-group">
					<label for="userLevel" class="col-sm-2 control-label">用户权限:</label>
					<div class="col-sm-3">
						<select name="userLevel" id="userLevel" class="form-control">
							<option value="1">普通用户</option>
							<option value="2">管理员</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10" style="float: right;">
						<button type="submit" class="btn btn-danger">提交</button>
					</div>
				</div>
			</form>
		</div>
		<!-- end: content -->

	</div>

	<!-- start: Javascript -->
	<script src="${pageContext.request.contextPath}/asset/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/asset/js/jquery.ui.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/asset/js/bootstrap.min.js"></script>
	<!-- plugins -->
	<script
		src="${pageContext.request.contextPath}/asset/js/plugins/jquery.nicescroll.js"></script>
	<!-- custom -->
	<script src="${pageContext.request.contextPath}/asset/js/main.js"></script>
	<!-- end: Javascript -->
	<script src="${pageContext.request.contextPath}/layer/layer.js"></script>
	<script>
		var flag = false;
		function send(forms) {
			$.post("${pageContext.request.contextPath}/UsersController", {
				op : "add",
				userName : $("#userName").val(),
				userPwd : $("#userPwd").val(),
				userEmail : $("#userEmail").val(),
				userLove : $("#userLove").val(),
				userPhoto : $("#userPhoto").val(),
				userLevel : $("#userLevel").val()
			}, function(data, status) {
				if ("true" == data) {
					layer.msg('添加成功！', {icon : 1});
					document.getElementById("userName").value = "";
					document.getElementById("userPwd").value = "";
					document.getElementById("userEmail").value = "";
					document.getElementById("userLove").value = "";
					document.getElementById("userPhoto").value = "";
					return flag;
				} else {
					layer.msg('添加失败！', {icon : 1});
				}
			});
			return flag;
		}
	</script>
	<script>
		$("#left-menu-2").click();
		$("#left-menu-1").click(function() {
				location.href = "${pageContext.request.contextPath}/mvc/Behinddesk.jsp";
		})
	</script>
</body>
</html>