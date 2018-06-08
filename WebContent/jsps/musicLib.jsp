<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html lang="en" class="app">
<head>
<meta charset="utf-8" />
<title>DMC音乐-除了远方还有DMC音乐</title>
<meta name="description"
	content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet" href="js/jPlayer/jplayer.flat.css"
	type="text/css" />
<link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
<link rel="stylesheet" href="css/animate.css" type="text/css" />
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
<link rel="stylesheet" href="css/simple-line-icons.css" type="text/css" />
<link rel="stylesheet" href="css/font.css" type="text/css" />
<link rel="stylesheet" href="css/app.css" type="text/css" />
<!--[if lt IE 9]>
    <script src="js/ie/html5shiv.js"></script>
    <script src="js/ie/respond.min.js"></script>
    <script src="js/ie/excanvas.js"></script>
  <![endif]-->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.js"></script>
</head>
<body class="">
	<section class="vbox">
		<!--顶部部分开始-->
		<header
			class="bg-white-only header header-md navbar navbar-fixed-top-xs">
			<div class="navbar-header aside bg-info nav-xs">
				<a class="btn btn-link visible-xs"
					data-toggle="class:nav-off-screen,open" data-target="#nav,html">
					<i class="icon-list"></i>
				</a> <a href="index.html" class="navbar-brand text-lt"> <i
					class="icon-earphones"></i> <img src="images/logo.png" alt="."
					class="hide"> <span class="hidden-nav-xs m-l-sm">Musik</span>
				</a> <a class="btn btn-link visible-xs" data-toggle="dropdown"
					data-target=".user"> <i class="icon-settings"></i>
				</a>
			</div>
			<ul class="nav navbar-nav hidden-xs">
				<li><a href="#nav,.navbar-header"
					data-toggle="class:nav-xs,nav-xs" class="text-muted"> <i
						class="fa fa-indent text"></i> <i class="fa fa-dedent text-active"></i>
				</a></li>
			</ul>
			<form
				class="navbar-form navbar-left input-s-lg m-t m-l-n-xs hidden-xs"
				role="search">
				<div class="form-group">
					<div class="input-group">
						<span class="input-group-btn">
							<button type="button" id="btnSearch"
								class="btn btn-sm bg-white btn-icon rounded">
								<i class="fa fa-search"></i>
							</button>
						</span> <input type="text" id="txtSearch"
							class="form-control input-sm no-border rounded"
							placeholder="搜索 歌曲 歌手。。。">
					</div>
				</div>
			</form>
			<div class="navbar-right ">
				<ul class="nav navbar-nav m-n hidden-xs nav-user user">
					<!-- <li class="hidden-xs">
            <a href="#" class="dropdown-toggle lt" data-toggle="dropdown">
              <i class="icon-bell"></i>
              <span class="badge badge-sm up bg-danger count">2</span>
            </a>
            <section class="dropdown-menu aside-xl animated fadeInUp">
              <section class="panel bg-white">
                <div class="panel-heading b-light bg-light">
                  <strong>You have <span class="count">2</span> notifications</strong>
                </div>
                <div class="list-group list-group-alt">
                  <a href="#" class="media list-group-item">
                    <span class="pull-left thumb-sm">
                      <img src="images/a0.png" alt="..." class="img-circle">
                    </span>
                    <span class="media-body block m-b-none">
                      Use awesome animate.css<br>
                      <small class="text-muted">10 minutes ago</small>
                    </span>
                  </a>
                  <a href="#" class="media list-group-item">
                    <span class="media-body block m-b-none">
                      1.0 initial released<br>
                      <small class="text-muted">1 hour ago</small>
                    </span>
                  </a>
                </div>
                <div class="panel-footer text-sm">
                  <a href="#" class="pull-right"><i class="fa fa-cog"></i></a>
                  <a href="#notes" data-toggle="class:show animated fadeInRight">See all the notifications</a>
                </div>
              </section>
            </section>
          </li>-->
					<li class="dropdown"><a href="#"
						class="dropdown-toggle bg clear" data-toggle="dropdown"> <span
							class="thumb-sm avatar pull-right m-t-n-sm m-b-n-sm m-l-sm">
								<img src="images/a0.png" alt="...">
						</span> John.Smith <b class="caret"></b>
					</a>
						<ul class="dropdown-menu animated fadeInRight">
							<li><span class="arrow top"></span> <a href="#">设置</a></li>
							<li><a href="profile.html">用户信息</a></li>
							<li><a href="docs.html">帮助</a></li>
							<li class="divider"></li>
							<li><a href="modal.lockme.html" data-toggle="ajaxModal">退出</a>
							</li>
						</ul></li>
				</ul>
			</div>
		</header>
		<!--顶部部分结束-->
		<section>
			<section class="hbox stretch">
				<!-- .aside -->
				<aside class="bg-black dk nav-xs aside hidden-print" id="nav">
					<section class="vbox">
						<section class="w-f-md scrollable">
							<div class="slim-scroll" data-height="auto"
								data-disable-fade-out="true" data-distance="0" data-size="10px"
								data-railOpacity="0.2">



								<!-- nav -->
								<nav class="nav-primary hidden-xs">
									<ul class="nav bg clearfix">
										<li class="hidden-nav-xs padder m-t m-b-sm text-xs text-muted">
											在线音乐</li>
										<li><a href="${pageContext.request.contextPath}/MusicController"> <i
												class="icon-disc icon text-success"></i> <span
												class="font-bold">音乐馆</span>
										</a></li>
										<li><a href="musicLib.jsp"> <i
												class="icon-music-tone-alt icon text-info"></i> <span
												class="font-bold">音乐库</span>
										</a></li>

										<li class="m-b hidden-nav-xs"></li>
									</ul>
									<ul class="nav" data-ride="collapse">
										<li class="hidden-nav-xs padder m-t m-b-sm text-xs text-muted">
											我的音乐</li>
										<li><a href="listen.jsp"> <i
												class="icon-list icon  text-info-dker"></i> <span
												class="font-bold">用户歌单</span>
										</a></li>

									</ul>

								</nav>

							</div>
						</section>

					</section>
				</aside>
				<!-- /.aside -->
				<section id="content">
					<section class="vbox">
						<section class="w-f-md" id="bjax-target">
							<section class="hbox stretch">
								<!-- side content -->
								<aside class="aside bg-light dk" id="sidebar">
									<section class="vbox animated fadeInUp">
											<div
												class="list-group no-radius no-border no-bg m-t-n-xxs m-b-none">
												<a href="#" class="list-group-item active" > 热门歌手 </a> 
											</div>
										<section class="scrollable hover">
											
											<div
												class="list-group no-radius no-border no-bg m-t-n-xxs m-b-none auto" id="singerList">
											</div>
										</section>
									</section>
								</aside>
								<!-- / side content -->
								<section>
									<section class="vbox">
										<section class="scrollable padder-lg">
											<h2 class="font-thin m-b">搜索结果</h2>
											<div class="row row-sm" id="showList">

												<!-- 搜索结果列表div -->
												<!-- <div class="col-xs-6 col-sm-4 col-md-3 col-lg-2">
													<div class="item">
														<div class="pos-rlt">
															<div class="item-overlay opacity r r-2x bg-black">
																<div class="center text-center m-t-n">
																	<a href="#"><i class="fa fa-play-circle i-2x"></i></a>
																</div>
															</div>
															<a href="track-detail.html"><img src="images/m1.jpg"
																alt="" class="r r-2x img-full"></a>
														</div>
														<div class="padder-v">
															<a href="track-detail.html" data-bjax
																data-target="#bjax-target" data-el="#bjax-el"
																data-replace="true" class="text-ellipsis">Tempered
																Song</a> <a href="track-detail.html" data-bjax
																data-target="#bjax-target" data-el="#bjax-el"
																data-replace="true"
																class="text-ellipsis text-xs text-muted">Miaow</a>
														</div>
													</div>
												</div> -->
												
											</div>
											
											<!-- 显示分页标签 -->
											<div class="row row-sm" id="pageList" >
					
											</div>
											<!-- 显示分页 -->
											<!-- <ul class="pagination pagination" id="pageList">
												
												
												<li><a href="javascript:void(0);"><i class="fa fa-chevron-left" id="lastPage"></i></a></li>
												
												<li><a href="javascript:void(0);">1</a></li>
												<li><a href="javascript:void(0);">2</a></li>
												<li><a href="javascript:void(0);">3</a></li>
												<li><a href="javascript:void(0);">4</a></li>
												<li><a href="javascript:void(0);">5</a></li>
								
												<li><a href="javascript:void(0);" id="nextPage"><i class="fa fa-chevron-right"></i></a></li>
											</ul>	 -->			
										</section>
									</section>
								</section>
							</section>
						</section>
						<footer class="footer bg-info dker">
							<div id="jp_container_N">
								<div class="jp-type-playlist">
									<div id="jplayer_N" class="jp-jplayer hide"></div>
									<div class="jp-gui">
										<div class="jp-video-play hide">
											<a class="jp-video-play-icon">play</a>
										</div>
										<div class="jp-interface">
											<div class="jp-controls">
												<div>
													<a class="jp-previous"><i
														class="icon-control-rewind i-lg"></i></a>
												</div>
												<div>
													<a class="jp-play"><i class="icon-control-play i-2x"></i></a>
													<a class="jp-pause hid"><i
														class="icon-control-pause i-2x"></i></a>
												</div>
												<div>
													<a class="jp-next"><i class="icon-control-forward i-lg"></i></a>
												</div>
												<div class="hide">
													<a class="jp-stop"><i class="fa fa-stop"></i></a>
												</div>
												<div>
													<a class="" data-toggle="dropdown" data-target="#playlist"><i
														class="icon-list"></i></a>
												</div>
												<div class="jp-progress hidden-xs">
													<div class="jp-seek-bar dk">
														<div class="jp-play-bar bg-info"></div>
														<div class="jp-title text-lt">
															<ul>
																<li></li>
															</ul>
														</div>
													</div>
												</div>
												<div
													class="hidden-xs hidden-sm jp-current-time text-xs text-muted"></div>
												<div
													class="hidden-xs hidden-sm jp-duration text-xs text-muted"></div>
												<div class="hidden-xs hidden-sm">
													<a class="jp-mute" title="mute"><i
														class="icon-volume-2"></i></a> <a class="jp-unmute hid"
														title="unmute"><i class="icon-volume-off"></i></a>
												</div>
												<div class="hidden-xs hidden-sm jp-volume">
													<div class="jp-volume-bar dk">
														<div class="jp-volume-bar-value lter"></div>
													</div>
												</div>
												<div>
													<a class="jp-shuffle" title="shuffle"><i
														class="icon-shuffle text-muted"></i></a> <a
														class="jp-shuffle-off hid" title="shuffle off"><i
														class="icon-shuffle text-lt"></i></a>
												</div>
												<div>
													<a class="jp-repeat" title="repeat"><i
														class="icon-loop text-muted"></i></a> <a
														class="jp-repeat-off hid" title="repeat off"><i
														class="icon-loop text-lt"></i></a>
												</div>
												<div class="hide">
													<a class="jp-full-screen" title="full screen"><i
														class="fa fa-expand"></i></a> <a class="jp-restore-screen"
														title="restore screen"><i
														class="fa fa-compress text-lt"></i></a>
												</div>
											</div>
										</div>
									</div>
									<div class="jp-playlist dropup" id="playlist">
										<ul class="dropdown-menu aside-xl dker">
											<!-- The method Playlist.displayPlaylist() uses this unordered list -->
											<li class="list-group-item"></li>
										</ul>
									</div>
									<div class="jp-no-solution hide">
										<span>Update Required</span> To play the media you will need
										to either update your browser to a recent version or update
										your <a href="http://get.adobe.com/flashplayer/"
											target="_blank">Flash plugin</a>.
									</div>
								</div>
							</div>
						</footer>
					</section>
					<a href="#" class="hide nav-off-screen-block"
						data-toggle="class:nav-off-screen,open" data-target="#nav,html"></a>
				</section>
			</section>
		</section>
	</section>



	
	<!-- 自动加载所有歌曲和歌手列表事件 -->
<script type="text/javascript">
$(function(){
	//定义分页查询所有歌曲，定义关键词为空；
	var keyword = {
			"op":"search",
		 	"keyword":"",
		 }
	
	//执行根据关键词查询单词的方法
	ajax(keyword);
	console.log("加载歌手列表");
	ajaxGetSingerList();
	
})
</script>

<!-- 执行搜索歌曲事件 -->
<script type="text/javascript">
$(function(){
  //歌曲搜索的点击事件，ajax向控制器发送请求，获取分页数据；
  $("#btnSearch").click(function(){
	 var keyword = {
		"op":"search",
	 	"keyword":$("#txtSearch").val(),
	 }
	 ajax(keyword);
	 
  });
});
</script>

<!-- 获取唯一歌手列表事件 -->
<script type="text/javascript">
	function ajaxGetSingerList(){
		$.ajax({
			url:"${pageContext.request.contextPath}/MusicController",
			data:{
				"op":"showSinger"
			},
			success:function(data){
				data = JSON.parse(data);
				$("#singerList").empty();
				$("#singerList").append('<a href="javascript:void(0)" class="list-group-item" >热门歌手</a> ');
				for(var index in data){
					
					$("#singerList").append('<a href="javascript:void(0)" class="list-group-item" onclick=showBySinger("'
							+data[index].singerName+'")> '+data[index].singerName+' </a> ');
				}
			}
		});
	}
</script>

<!-- 翻页事件和点击歌手名字方法 -->
<script type="text/javascript">
function toPage(page, totalPage){
	  if(page>0&&page<=totalPage){
		  var keyword = {
				  "op":"search",
				  "keyword":$("#txtSearch").val(),
				  "page":page,
				  }
		  ajax(keyword);
	  }
}
</script>

<script type="text/javascript">
 function showBySinger(singerName){
	 var keyword = {
			  "op":"search",
			  "keyword":singerName,
			  }
	 $("#txtSearch").val(singerName);
	 ajax(keyword);
};	  
</script>

<!-- 定义根据关键词查询歌曲的请求 --> 
<script type="text/javascript">
  	function ajax(json){
  		$.ajax({
			 url:"${pageContext.request.contextPath}/MusicController",
			 data: json,
			 success: function(data){
				 
				 //将控制器返回的string转换为json格式以便解析
				 data = JSON.parse(data);
				 var songsArray = data.data;
				 
				 //遍历歌曲列表，遍历前清空显示列表的div;
				 $("#showList").empty();
				 for(var json in songsArray){
					 //进行遍历，append添加div标签，显示分页搜索到的歌单；
					 //每个图片链接标签的id即为歌曲的id值；
					 $("#showList").append('<div class="col-xs-6 col-sm-4 col-md-3 col-lg-2">'+
							 '<div class="item\">'+
							 '<div class="pos-rlt">'+
							 '<div class="item-overlay opacity r r-2x bg-black">'+
							 '<div class="center text-center m-t-n">'+
							 '<a href="#"><i class="fa fa-play-circle i-2x"></i></a>'+
							 '</div>'+
							 '</div>'+
							 '<a href="#" id="'+songsArray[json]["mId"]+'"><img src="'+songsArray[json]["mImg"]+'" alt="" class="r r-2x img-full"></a>'+
							 '</div>'+
							 '<div class="padder-v">'+
							 '<a href="#" data-bjax data-target="#bjax-target" data-el="#bjax-el" data-replace="true" class="text-ellipsis">'
							 +songsArray[json]["mName"]+'</a>'+
							 '<a href="#" data-bjax data-target="#bjax-target" data-el="#bjax-el" data-replace="true" class="text-ellipsis text-xs text-muted">'
							 +songsArray[json]["singerName"]+'</a>'+
							 '</div></div></div>');
					 
				 } 
				 //得到总页数
				 var totalPage=Math.ceil(data.total/data.pageSize);
				//根据总页数显示分页：
				console.log(totalPage);
				console.log(data.page);
				$("#pageList").empty();
				$("#pageList").append('<a id="down" href="javascript:void(0)" onClick="toPage('+(data.page-1)+','+totalPage+')">上一页</a>'
						 +'<span id="a3">  </span><a id="up" href="javascript:void(0)" onClick="toPage('+(data.page+1)+','+totalPage+')">下一页</a>'
						 +'<span class="ho">  第<span id="a2">'+data.page+'</span>/<span id="a1">'+totalPage+'</span>页</span></span></div></div>');
				
			 }
		 });
  	}
  
  </script>

	<!-- App -->
	<script src="js/app.js"></script>
	<script src="js/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="js/app.plugin.js"></script>
	<script type="text/javascript" src="js/jPlayer/jquery.jplayer.min.js"></script>
	<script type="text/javascript"
		src="js/jPlayer/add-on/jplayer.playlist.min.js"></script>
	<script type="text/javascript" src="js/jPlayer/demo.js"></script>

</body>
</html>