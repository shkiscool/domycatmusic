<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 用户查询界面（用户列表） -->

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="xxxxx">
<meta name="author" content="xxxxx">
<meta name="keyword" content="xxxxx">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>DMC音乐后台管理</title>
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
				<a href="mvc/Behinddesk.jsp" class="navbar-brand"> <b>DMC音乐后台管理</b>
				</a>
				<ul class="nav navbar-nav navbar-right user-nav">
					<li class="user-name"><span>${sessionScope.users.USERNAME}</span></li>
					<li class="dropdown avatar-dropdown"><img
						src="${pageContext.request.contextPath}/asset/img/avatar.jpg"
						class="img-circle avatar" alt="user name" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="true" />
						<ul class="dropdown-menu user-dropdown">
							<li><a href="login.jsp"><span class="fa fa-power-off"></span>
									退出登录</a></li>
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
					<li class="ripple active"><a class="tree-toggle nav-header"
						id="left-menu-2"> <span class="fa-diamond fa"></span> 用户管理 <span
							class="fa-angle-right fa right-arrow text-right"></span>
					</a>
						<ul class="nav nav-list tree">
							<li class="active"><a
								href="${pageContext.request.contextPath}/UsersController?op=list">用户列表</a></li>
							<li><a
								href="${pageContext.request.contextPath}/mvc/editUser.jsp">用户编辑</a></li>
						</ul></li>
					<li class="ripple"><a class="tree-toggle nav-header"
						id="left-menu-3"><span class="fa fa-check-square-o"></span>
							音乐管理 <span class="fa-angle-right fa right-arrow text-right"></span>
					</a>
						<ul class="nav nav-list tree">
							<li class="active"><a href="${pageContext.request.contextPath}/BackMusicController?op=list"">音乐列表</a></li>
							<li><a href="${pageContext.request.contextPath}/music/EditMusic.jsp">音乐编辑</a></li>
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
						<h3 class="animated fadeInLeft">曲库管理</h3>
						<p class="animated fadeInDown">
							业务 <span class="fa-angle-right fa"></span> 歌曲列表
						</p>
					</div>
				</div>
			</div>
			<div class="panel">
				<div class="col-md-3" style="float:left; padding:10px 15px;">
						<input type="text" name="musicNameLike" id="musicNameLike"
							class="form-control" placeholder="Search...">
				</div>
				<div style="float:right; padding:10px 15px;">
				     <p>每页<select id="sel">
				     <option value="5">5</option>
				     <option value="10">10</option>
				     <option value="20">20</option>
				     <option value="40">40</option>
				     <option value="80">80</option>
				     </select>条记录</p>
				</div>
				<div class="panel-body">
					<div class="responsive-table">
						<div id="datatables-example_wrapper"
							class="dataTables_wrapper form-inline dt-bootstrap no-footer">
							<div class="row">
								<div class="col-sm-12">
									<table
										class="table table-striped table-bordered dataTable no-footer"
										width="100%" cellspacing="0" style="width: 100%;">
										<thead>
											<tr role="row">
												<th class="sorting_asc" style="width: 60px;">编号</th>
												<th class="sorting" style="width: 60px;">类型编号</th>
												<th class="sorting" style="width: 60px;">歌手编号</th>
												<th class="sorting" style="width: 60px;">歌曲名</th>
												<th class="sorting" style="width: 60px;">链接地址</th>
												<th class="sorting" style="width: 60px;">播放次数</th>
												<th class="sorting" style="width: 60px;">歌词</th>
												<th class="sorting" style="width: 60px;">收录时间</th>
												<th class="sorting" style="width: 61px;">歌曲图片</th>
												<th class="sorting" style="width: 61px;">歌手</th>
												<th class="sorting" style="width: 60px;">时长</th>
																	
											</tr>
										</thead>
										<tbody id="listtbody">
											
										</tbody>
									</table>
									<div class="col-md-12 column text-center">
									<label id="pagela" style="float:left; padding-top:20px;"></label>
										<ul class="pagination" id="pul" style="float:right">
											
										</ul>
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
<!--弹出复选-->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog form-element">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">修改歌名</h4>
				</div>
				<div class="modal-body form-element-padding">
					<form class="form-horizontal" role="form" onsubmit="return send()"
						id="forms"
						action="${pageContext.request.contextPath}/UsersController?op=upd"
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
							<label for="userLove" class="col-sm-2 control-label">音乐偏好:</label>
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
						<input class="userId" type=hidden name="userId"></input>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10" style="float: right;">
								<button type="submit" class="btn btn-primary">提交更改</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<!--弹出复选 end-->
	

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
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	<script>
	
	window.onload = function(){//页面加载时显示第1页
		pages(1);
	}
	
	$(document.body).on("click",".pageNo",function(){
		var page = $(this).text();
		pages(page);
	});
	
	$("#musicNameLike").keyup(function(){
		pages(1);
	});
	
	$("#sel").change(function(){
		pages(1);
	});
	
	//用于分页，显示数据的通用方法
	function pages(page){	
		 $.post("${pageContext.request.contextPath}/BackMusicController",{"op":"ajax","ap":"list","musicpage":page,"pageSize":$("#sel").val(),"musicNameLike":$("#musicNameLike").val()},function(data,status){
				array = JSON.parse(data);
				var nextpages = array.page + 1;
				var prepages = array.page - 1;
				
				$("#listtbody").html("");
				$(".pageNo").remove();
				$("#nextPage").remove();
				$("#prePage").remove();
			    $.each(array.data,function(index,type){
			    	var musicClass = type.mId%2 == 0 ? "even" : "odd";
			    	$("#listtbody").append("<tr role='row' class='"+musicClass+"'>");
			    	$("#listtbody").append("<td>"+type.mId+"</td>");
			    	$("#listtbody").append("<td>"+type.tId+"</td>");
			    	$("#listtbody").append("<td>"+type.singerId+"</td>");
			    	$("#listtbody").append("<td>"+type.mName+"</td>");
			    	$("#listtbody").append("<td>"+type.mUrl+"</td>");
			    	$("#listtbody").append("<td>"+type.mCount+"</td>");
			    	$("#listtbody").append("<td>"+type.mLyric+"</td>");
			    	$("#listtbody").append("<td>"+type.mDate+"</td>");
			    	$("#listtbody").append("<td><img id='Image' src="+type.mImg+"width='20' height='20' style='border-radius:10px'></td>");
			    	$("#listtbody").append("<td>"+type.singerName+"</td>");
			    	$("#listtbody").append("<td>"+type.mTime+"</td>");
			    	
			    	$("#listtbody").append("<td><button class='btn btn-primary' data-toggle='modal' data-target='#myModal' onclick='save("+type.mId+")'>修改</button><a href='javascript:delFunction("+type.mId+")'><button class='btn btn-danger'>删除</button></a></td></tr>");
			    });
			    
			    
			    //下列是进行选择页码
			    $("#pul").append("<li><a href='javascript:void(0)' id='prePage' onclick='pages("+prepages+")'>上一页</a></li>");
			    for(var i=(array.totalpage < 5 ? 1 : (array.page+2 >= array.totalpage ? array.totalpage-4 : (array.page-1 >= 3 ? array.page-2 : 1))); i<=(array.totalpage < 5 ? array.totalpage : (array.page-2 <= 1 ? 5 :(array.page+2 <= array.totalpage ? array.page+2 : array.totalpage))); i++){
			    	$("#pagela").html("第"+array.page+"页(总共"+array.totalpage+"页)")
			    	if(array.page == i){
			    		$("#pul").append("<li class='active'><a href='javascript:void(0)' class='pageNo'>"+i+"</a></li>");
			    	}else{
			    		$("#pul").append("<li><a href='javascript:void(0)' class='pageNo'>"+i+"</a></li>");
			    	}
			    }
			    $("#pul").append("<li><a href='javascript:void(0)' id='nextPage' onclick='pages("+nextpages+")'>下一页</a></li>");
               if(array.page >= array.totalpage){
			    	
					//下一页 样式设置
					$("#nextPage").css("color","gray");
					   //pointer-events 不能点击了 ,没有测试所有的浏览器
					$("#nextPage").css("pointer-events","none");
				}
			    if(array.page <= 1){
					     //上一页 样式设置
				   $("#prePage").css("color","gray");
				   $("#prePage").css("pointer-events","none");
				}
		});
	}
	
	/* //用于修改的方法
	var flag = false;
    function send(forms) {
        	$.post("${pageContext.request.contextPath}/UsersController",{
        	op:"udp",
        	userName:$("#userName").val(),
        	userId:$(".userId").val(),
        	userPwd:$("#userPwd").val(),
        	userEmail:$("#userEmail").val(),
        	userLove:$("#userLove").val(),
        	userPhoto:$("#userPhoto").val(),
        	userLevel:$("#userLevel").val()
        	},
        	function(data,status){
        	    if("true" == data){
        	    	layer.msg('修改成功！',{icon: 1},function(){
        	    		page(1);
        	    	});
        	    	return flag;
        	    }else{
        	    	layer.msg('修改失败！',{icon: 1});
        	    }
        	});
    	return flag;
    }
	   
	//用于修改和删除的通用方法
	function save(userId){
		$(".userId").val(userId);
	}
	
	//用于删除的方法
	function delFunction(userId) {
		layer.confirm('是否确定删除该用户？', {btn: ['确定','取消']}, function(){
			$.post("${pageContext.request.contextPath}/UsersController?op=del","userId="+userId,
			function(data,status){
				if("true" == data){
				 layer.msg('删除成功!',{icon: 1},function(){
					 page(1);
				 });
				}else{
				 layer.msg('删除失败!',{icon: 1});
				}
			});
		});
	}
	*/
	//用于按钮的点击
	$("#left-menu-3").click();
	$("#left-menu-1").click(function() {
		location.href = "${pageContext.request.contextPath}/mvc/Behinddesk.jsp";
	}) 
		
	</script>
</body>
</html>