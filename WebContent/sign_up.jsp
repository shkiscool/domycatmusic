<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>注册</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	

  

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body class="style-2">

		<div class="container">
			<div class="row">
				<div class="col-md-4">
					

					<!-- Start Sign In Form -->
					<form action="${pageContext.request.contextPath}/UsersController?op=sign" method="post" class="fh5co-form animate-box" 
					data-animate-effect="fadeInLeft" onsubmit="return checkForm();" id="frm">
						<h2>用户注册</h2>
						<div class="form-group">
						    <label id="user" style="display:none"></label>
							<label for="name" class="sr-only">Name</label>
							<input type="text" class="form-control" id="name" name="userName" placeholder="用户名" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="email" class="sr-only">Email</label>
							<input type="email" class="form-control" id="email" name="userEmail" placeholder="邮箱" autocomplete="off">
						</div>
						<div class="form-group">
						    <label id="pwd" style="display:none"></label>
							<label for="password" class="sr-only">Password</label>
							<input type="password" class="form-control" id="password" name="userPwd" placeholder="用户密码" autocomplete="off">
						</div>
						<div class="form-group">
							<label id="rep" style="display:none"></label>
							<label for="re-password" class="sr-only">Re-type Password</label>
							<input type="password" class="form-control" id="re-password" name="re-password" placeholder="二次输入密码" autocomplete="off">
						</div>
						<div class="form-group">
							<p>已经注册? <a href="login.jsp">登录</a></p>
						</div>
						<div class="form-group">
							<input type="submit" value="注     册" class="btn btn-primary">
						</div>
					</form>
					<!-- END Sign In Form -->


				</div>
			</div>
			<div class="row" style="padding-top: 60px; clear: both;">
				<div class="col-md-12 text-center"><p><small>&copy; All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></small></p></div>
			</div>
		</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>
	<script>
	var flag = true;
    function checkForm(frm) {
        if($.trim($("#name").val()) == "") {
        	$("#user").html("<font color='red'>用户名不能为空!</font>");
        	$("#user")[0].style.display="block";
            flag = false;
            return false;
        }else if($("#password").val() == ""){
        	$("#pwd").html("<font color='red'>密码不能为空!</font>");
        	$("#pwd")[0].style.display="block";
            flag = false;
            return false;
        }else if($("#re-password").val() == ""){
        	$("#rep").html("<font color='red'>二次密码不能为空!</font>");
        	$("#rep")[0].style.display="block";
            flag = false;
            return false;
        } 
        return flag;
    }
	$(function(){
	$("#re-password").blur(function(){
		$.post("UsersController","op=ajax&ap=aw&repassword="+$("#re-password").val()+"&password="+$("#password").val(),
			function(data,status){
			$("#rep").html("<font color='red'>"+data+"</font>");
			$("#rep")[0].style.display="block";
		});
	});
	$("#password").blur(function(){
		if($("#password").val() != ""){
			$("#pwd").html();
			$("#pwd")[0].style.display="none";
		}
	});
	$("#name").blur(function(){
		$.post("UsersController","op=ajax&ap=au&username="+$("#name").val(),function(data,status){
			$("#user").html("<font color='red'>"+data+"</font>");
			$("#user")[0].style.display="block";
		});
	});
	});
	</script>
	</body>
</html>

