<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!--  首页 -->
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="12">
<meta name="author" content="12">
<meta name="keyword" content="12">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>DMC音乐后台管理</title>
<!-- start: Css -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/asset/css/bootstrap.min.css">
<!-- plugins -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/asset/css/plugins/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/asset/css/plugins/simple-line-icons.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/asset/css/plugins/animate.min.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/asset/css/plugins/fullcalendar.min.css"/>
<link href="${pageContext.request.contextPath}/asset/css/style.css" rel="stylesheet">
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
    <div class="navbar-header" style="width:100%;">
      <div class="opener-left-menu is-open"> <span class="top"></span> <span class="middle"></span> <span class="bottom"></span> </div>
      <a href="mvc/Behinddesk.jsp" class="navbar-brand"> <b>DMC音乐后台管理</b> </a>
      <ul class="nav navbar-nav navbar-right user-nav">
        <li class="user-name"><span>${sessionScope.users.USERNAME}</span></li>
        <li class="dropdown avatar-dropdown"> <img src="${pageContext.request.contextPath}/asset/img/avatar.jpg" class="img-circle avatar" alt="user name" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"/>
          <ul class="dropdown-menu user-dropdown">
            <li><a href="#"><span class="fa fa-power-off"></span> 退出登录</a></li>
          </ul>
        </li>
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
        <li class="active ripple"> <a class="tree-toggle nav-header"><span class="fa-home fa"></span> 首页 <span class="fa-angle-right fa right-arrow text-right"></span> </a> </li>
        <li class="ripple"> <a class="tree-toggle nav-header"> <span class="fa-diamond fa"></span> 用户管理 <span class="fa-angle-right fa right-arrow text-right"></span> </a>
          <ul class="nav nav-list tree">
            <li><a href="${pageContext.request.contextPath}/UsersController?op=list">用户列表</a></li>
            <li><a href="${pageContext.request.contextPath}/mvc/editUser.jsp">用户编辑</a></li>
          </ul>
        </li>
        <li class=" ripple"> <a class="tree-toggle nav-header"  id="left-menu-3"><span class="fa fa-check-square-o"></span> 音乐管理 <span class="fa-angle-right fa right-arrow text-right"></span> </a>
          <ul class="nav nav-list tree" >
            <li><a href="${pageContext.request.contextPath}/music/MusicList.jsp">音乐列表</a></li>
            <li><a href="#s">音乐编辑</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
  <!-- end: Left Menu --> 
  
  <!-- start: content -->
  <div id="content">
    <div class="panel">
      <div class="panel-body">
        <div class="col-md-6 col-sm-12">
          <h3 class="animated fadeInLeft">欢迎您：${sessionScope.users.USERNAME}</h3>
          <p class="animated fadeInDown"><span class="fa  fa-map-marker"></span> 开发部</p>
        </div>
      </div>
    </div>
    <div class="col-md-12" style="padding:20px;">
      <div class="col-md-12 padding-0">
        <div class="col-md-8 padding-0">
          <div class="col-md-12 padding-0">
            <div class="col-md-6">
              <div class="panel box-v1">
                <div class="panel-heading bg-white border-none">
                  <div class="col-md-6 col-sm-6 col-xs-6 text-left padding-0">
                    <h4 class="text-left">待办事项</h4>
                  </div>
                  <div class="col-md-6 col-sm-6 col-xs-6 text-right">
                    <h4> <span class="icon-user icons icon text-right"></span> </h4>
                  </div>
                </div>
                <div class="panel-body text-center">
                  <ul class="normal-list">
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                  </ul>
                  <p><a href="#">更多信息</a></p>
                  <hr/>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="panel box-v1">
                <div class="panel-heading bg-white border-none">
                  <div class="col-md-6 col-sm-6 col-xs-6 text-left padding-0">
                    <h4 class="text-left">通知公告</h4>
                  </div>
                  <div class="col-md-6 col-sm-6 col-xs-6 text-right">
                    <h4> <span class="icon-check icons icon text-right"></span> </h4>
                  </div>
                </div>
                <div class="panel-body text-center">
                  <ul class="normal-list">
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span>通知公告列表文字</a></li>
                    <li class="text-left"><span class="right">2017-11-18</span><a href="#"><span class="fa fa-angle-right"></span> 通知公告列表文字</a></li>
                  </ul>
                  <p><a href="#">更多信息</a></p>
                  <hr/>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="col-md-12 padding-0">
            <div class="panel box-v2">
              <div class="panel-heading padding-0"> <img src="${pageContext.request.contextPath}/asset/img/bg2.jpg" class="box-v2-cover img-responsive"/>
                <div class="box-v2-detail"> <img src="${pageContext.request.contextPath}/asset/img/avatar.jpg" class="img-responsive"/>
                  <h4>xxxxx</h4>
                </div>
              </div>
              <div class="panel-body">
                <div class="col-md-12 padding-0 text-center">
                  <div class="col-md-4 col-sm-4 col-xs-6 padding-0">
                    <h3>2000</h3>
                    <p>待处理</p>
                  </div>
                  <div class="col-md-4 col-sm-4 col-xs-6 padding-0">
                    <h3>1000</h3>
                    <p>已处理</p>
                  </div>
                  <div class="col-md-4 col-sm-4 col-xs-6 padding-0">
                    <h3>1000</h3>
                    <p>已过期</p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- end: content --> 
  
</div>

<!-- start: Javascript --> 
<script src="${pageContext.request.contextPath}/asset/js/jquery.min.js"></script> 
<script src="${pageContext.request.contextPath}/asset/js/jquery.ui.min.js"></script> 
<script src="${pageContext.request.contextPath}/asset/js/bootstrap.min.js"></script> 
<!-- plugins --> 
<script src="${pageContext.request.contextPath}/asset/js/plugins/jquery.nicescroll.js"></script> 
<!-- custom --> 
<script src="${pageContext.request.contextPath}/asset/js/main.js"></script> 
<!-- end: Javascript -->
<script>
$("#left-menu-1").click(function(){
	location.href="${pageContext.request.contextPath}/mvc/Behinddesk.jsp";
})
</script>
<div style="text-align:center;">
</div>
</body>
</html>