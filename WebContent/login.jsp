<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 用户的登录界面 -->

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>用户登录</title>
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
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">


	<!-- Modernizr JS -->
	<script src="${pageContext.request.contextPath}/js/modernizr-2.6.2.min.js"></script>
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
					<form class="fh5co-form animate-box" data-animate-effect="fadeInLeft">
						<h2>用户登录</h2>
						<div class="form-group">
						    <label id="name" style="display:none"></label>
							<label for="username" class="sr-only">Username</label>
							<input type="text" class="form-control" id="username" name="userName" placeholder="用户名" autocomplete="off">
						</div>
						<div class="form-group">
						    <label id="pwd" style="display:none"></label>
							<label for="password" class="sr-only">Password</label>
							<input type="password" class="form-control" id="password" name="userPwd" placeholder="密码" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="remember"><input type="checkbox" id="remember"> 记住我</label>
						</div>
						<div class="form-group">
							<p>没有注册? <a href="sign_up.jsp">注册</a> | <a href="forgot.jsp">忘记密码?</a></p>
						</div>
						<div class="form-group">
							<input type="button" onclick="send();" value="登     录" class="btn btn-primary"/>
						</div>
					</form>
					<!-- END Sign In Form -->

				</div>
			</div>
		</div>
	
	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="${pageContext.request.contextPath}/js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="${pageContext.request.contextPath}/js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="${pageContext.request.contextPath}/js/main.js"></script>
	<script>
	
    function send() {
    	if($("#username").val() == ""){
        	$("#name").html("<font color='red'>用户名不能为空!</font>");
        	$("#name")[0].style.display="block";
        }else if($("#password").val() == ""){
        	$("#pwd").html("<font color='red'>密码不能为空!</font>");
        	$("#pwd")[0].style.display="block";
        }else{
        	$.post("UsersController",{"op":"ajax","ap":"login","userName":$("#username").val(),"userPwd":$("#password").val()},
        		function(data,status){
        		if("true" != data){
        		    $("#name").html("<font color='red'>"+data+"</font>");
        		    $("#name")[0].style.display="block";
        		}else{
        			location.href="UsersController?op=login&userName="+$("#username").val();
        		}
        	});		
        }
    }
    $(function(){
    	$("#username").blur(function(){
    		if($("#username").val() != ""){
    			$("#name").html();
    			$("#name")[0].style.display="none";
    		}
    	});
    	$("#password").blur(function(){
    		if($("#password").val() != ""){
    			$("#pwd").html();
    			$("#pwd")[0].style.display="none";
    		}
    	});
    });
	</script>
	</body>
</html>

    