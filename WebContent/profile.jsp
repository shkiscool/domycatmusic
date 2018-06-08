<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="app">
<head>  
  <meta charset="utf-8" />
  <title>Musik | Web Application</title>
  <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
  <link rel="stylesheet" href="js/jPlayer/jplayer.flat.css" type="text/css" />
  <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
  <link rel="stylesheet" href="css/animate.css" type="text/css" />
  <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
  <link rel="stylesheet" href="css/simple-line-icons.css" type="text/css" />
  <link rel="stylesheet" href="css/font.css" type="text/css" />
  <link rel="stylesheet" href="css/app.css" type="text/css" />  
  <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
  <!--[if lt IE 9]>
    <script src="js/ie/html5shiv.js"></script>
    <script src="js/ie/respond.min.js"></script>
    <script src="js/ie/excanvas.js"></script>
  <![endif]-->
</head>
<body class="">
  <section class="vbox">
   <!--顶部部分开始-->
    <header class="bg-white-only header header-md navbar navbar-fixed-top-xs">
      <div class="navbar-header aside bg-info nav-xs">
        <a class="btn btn-link visible-xs" data-toggle="class:nav-off-screen,open" data-target="#nav,html">
          <i class="icon-list"></i>
        </a>
        <a href="index.html" class="navbar-brand text-lt">
          <i class="icon-earphones"></i>
          <img src="images/logo.png" alt="." class="hide">
          <span class="hidden-nav-xs m-l-sm">Musik</span>
        </a>
        <a class="btn btn-link visible-xs" data-toggle="dropdown" data-target=".user">
          <i class="icon-settings"></i>
        </a>
      </div>      <ul class="nav navbar-nav hidden-xs">
        <li>
          <a href="#nav,.navbar-header" data-toggle="class:nav-xs,nav-xs" class="text-muted">
            <i class="fa fa-indent text"></i>
            <i class="fa fa-dedent text-active"></i>
          </a>
        </li>
      </ul>
      <form class="navbar-form navbar-left input-s-lg m-t m-l-n-xs hidden-xs" role="search">
        <div class="form-group">
          <div class="input-group">
            <span class="input-group-btn">
              <button type="submit" class="btn btn-sm bg-white btn-icon rounded"><i class="fa fa-search"></i></button>
            </span>
            <input type="text" class="form-control input-sm no-border rounded" placeholder="搜索 歌曲 歌手。。。">
          </div>
        </div>
      </form>
      <div class="navbar-right ">
        <ul class="nav navbar-nav m-n hidden-xs nav-user user">
        
          <li class="dropdown">
            <a href="#" class="dropdown-toggle bg clear" data-toggle="dropdown">
              <span class="thumb-sm avatar pull-right m-t-n-sm m-b-n-sm m-l-sm">
                <img src="images/a0.png" alt="...">
              </span>
              John.Smith <b class="caret"></b>
            </a>
            <ul class="dropdown-menu animated fadeInRight">            
              <li>
                <span class="arrow top"></span>
                <a href="#">设置</a>
              </li>
              <li>
                <a href="profile.html">用户信息</a>
              </li>
              <li>
                <a href="docs.html">帮助</a>
              </li>
              <li class="divider"></li>
              <li>
                <a href="modal.lockme.html" data-toggle="ajaxModal" >退出</a>
              </li>
            </ul>
          </li>
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
              <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0" data-size="10px" data-railOpacity="0.2">
                


                <!-- nav -->                 
                <nav class="nav-primary hidden-xs">
                  <ul class="nav bg clearfix">
                    <li class="hidden-nav-xs padder m-t m-b-sm text-xs text-muted">
                      	在线音乐
                    </li>
                    <li>
                      <a href="index.html">
                        <i class="icon-disc icon text-success"></i>
                        <span class="font-bold">音乐馆</span>
                      </a>
                    </li>
                    <li>
                      <a href="genres.html">
                        <i class="icon-music-tone-alt icon text-info"></i>
                        <span class="font-bold">音乐库</span>
                      </a>
                    </li>
              
                    <li class="m-b hidden-nav-xs"></li>
                  </ul>
                  <ul class="nav" data-ride="collapse">
                    <li class="hidden-nav-xs padder m-t m-b-sm text-xs text-muted">
                                             我的音乐
                    </li>
                    <li>
                      <a href="listen.html">
                        <i class="icon-list icon  text-info-dker"></i>
                        <span class="font-bold">用户歌单</span>
                      </a>
                    </li>
                    
                    
                    
                    
                    
             
                  </ul>
                
                </nav>
                <!-- / nav -->
              </div>
            </section>
            
          
          </section>
        </aside>
        <!-- /.aside -->
        <section id="content">
          <section class="vbox">
            <section class="scrollable">
              <section class="hbox stretch">
                <aside class="aside-lg bg-light lter b-r">
                  <section class="vbox">
                    <section class="scrollable">
                      <div class="wrapper">
                        <div class="text-center m-b m-t">
                          <a href="#" class="thumb-lg">
                            <img src="images/a0.png" class="img-circle">
                          </a>
                          <div>
                            <div class="h3 m-t-xs m-b-xs">John.Smith</div>
                            
                          </div>                
                        </div>
                      
                              </a>
                            </div>
                          </div>
                        </div>
                        <div class="btn-group btn-group-justified m-b">
                       
                            </span>

                          </a>
                          <a class="btn btn-dark btn-rounded btn-group-justified">
                            <i class="fa fa-comment-o"></i> 编辑头像
                          </a>
                        </div>
                       
                      </div>
                    </section>
                  </section>
                </aside>
                <aside class="bg-white">
                  <section class="vbox">
                    <header class="header bg-light lt">
                      <ul class="nav nav-tabs nav-white">
                        <li class="active"><a href="#activity" data-toggle="tab">编辑个人信息</a></li>
                        <!--<li class=""><a href="#events" data-toggle="tab">Events</a></li>
                        <li class=""><a href="#interaction" data-toggle="tab">Interaction</a></li>-->
                      </ul>
                      <form>    
                      	
                      </form>
                    </header>
                                           
                    <section class="scrollable">
                      <div class="tab-content">
                        <div class="tab-pane active" id="activity">
                       
                        	<head>
<script>
    //检查用户名
    function checkName(){
        //获取输入框的内容
        var content = document.getElementById("uesrName").value;
        //获取span标签的节点
        var spanNode = document.getElementById("userId");
        //定义用户名的规则:： 六位的英文与数字组成。数字不能开头
        var reg = /^[a-z][a-z0-9]{5}$/i;
        //判断是否符合规则
        if(reg.test(content)){
            //符合规则，返回true
            spanNode.innerHTML = "正确".fontcolor("grean");    
            return true;
        }else{
            //不符合规则，返回false
            spanNode.innerHTML = "错误".fontcolor("red");
            return false;    
        }
    }
    //检查密码
    function checkpwd(){
        //获取密码框的内容
        var password = document.getElementById("password").value;
        //获取span标签的节点    
        var spanNode = document.getElementById("pwdId");
        //定义密码的规则六个英文
        var reg = /^[a-z]{6,12}$/i
        //判断是否符合规则
        if(reg.test(password)){
            //符合规则，返回true
            spanNode.innerHTML = "正确".fontcolor("grean");
            return true;    
        }else{
            //不符合规则，返回false
            spanNode.innerHTML = "错误".fontcolor("red");
            return false;    
        }
    }
    //检查确认密码
    function ensurepass(){
        //获取密码框的内容
        var password = document.getElementById("password").value;
        //获取确认密码框的内容
        var ensurepwd = document.getElementById("ensurepwd").value;
        //获取span标签的节点
        var spanNode = document.getElementById("ensureId");    
        //判断两个密码是否相等
        if(password != ""){
            if(password == ensurepwd){
                //相等，返回true
                spanNode.innerHTML = "正确".fontcolor("grean");    
                return true;
            }
            else{
            //不相等，返回false
                spanNode.innerHTML = "错误".fontcolor("red");
            return false;    
        }
        }
    }
    //检查邮箱
    function checkEmail(){
        var email = document.getElementById("email").value;
        //获取span标签的节点
        var spanNode = document.getElementById("emailId");
        var reg = /^[a-z0-9]\w+@[a-z0-9]+(\.[a-z]{2,3}){1,2}$/i    
        //判断是否符合规则
        if(reg.test(email)){
            //符合规则，返回true
            spanNode.innerHTML = "正确".fontcolor("grean");
            return true;        
        }else{
            //不符合规则，返回false
            spanNode.innerHTML = "错误".fontcolor("red");
            return false;    
        }
    }
    //检查表单是否能提交
    function checkAll(){
        /*获取用户名，密码，确认密码以及邮箱的返回值并判断是否都为真，都为真返回true，否则返回false*/
        var userName = checkName();
        var password = checkpwd();
        var ensurepwd = ensurepass();
        var email =    checkEmail();
        if(userName&&password&&ensurepwd&&email){
            return true;    
        }else{
            return false;    
        }
    }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
</head>

<body>
<!--表单提交的时候是会触发onsubmit事件的，如果onsubmit事件的方法返回是true，那么该表单允许提交，如果返回的是false，该表单不允许提交。-->
    <form action="index.html" method="get" onsubmit="return checkAll()">
        <table align="center" width="400px" height="400px">
            <tr>
                <td>姓名:</td>
                <td>
                    <input type="text" name="userName" id="uesrName" onblur="checkName()" /><span id="userId"></span>
                </td>
            </tr>
            <tr>
                <td>密码:</td>
                <td>
                    <input type="password" name="password" id="password" onblur="checkpwd()" /><span id="pwdId"></span>
                </td>
            </tr>
            <tr>
                <td>确认密码:</td>
                <td>
                    <input type="password" name="ensurepwd" id="ensurepwd" onblur="ensurepass()" /><span id="ensureId"></span>
                   </td>
            </tr>
               <tr>
                <td>邮箱：</td>
                <td>
                    <input type="text" name="email" id="email" onblur="checkEmail()" /><span id="emailId"></span>
                </td>
            </tr>
            <tr>
                <td>性别：</td>
                <td>
                    <input type="radio" checked="true" value="man" name="sex" />男
                    &nbsp;&nbsp;&nbsp;
                    <input type="radio" value="womam" name="sex" />女
                </td>
            </tr>
           
        
            <tr>
                <td colspan="2" align="center">
                   <a href="index.html#refresh"> <input type="submit"  /></a>
                </td>
            </tr>
    </table>
</form>
</body>
                
                       </div>
                        <div class="tab-pane" id="events">
                          <div class="text-center wrapper">
                            <i class="fa fa-spinner fa fa-spin fa fa-large"></i>
                          </div>
                        </div>
                        <div class="tab-pane" id="interaction">
                          <div class="text-center wrapper">
                            <i class="fa fa-spinner fa fa-spin fa fa-large"></i>
                          </div>
                        </div>
                      </div>
                    </section>
                  </section>
                </aside>
                <aside class="col-lg-3 b-l">
                  <section class="vbox">
                    <section class="scrollable padder-v">
                      <div class="panel">
                        <h4 class="font-thin padder">HELLO</h4>
                        <<ul class="list-group">
                          <li class="list-group-item">
                              <p>Wellcome to<a href="#" class="text-info">DMC音乐</a> </p>
                              
                          </li>
                          <li class="list-group-item">
                              <p>Hello，<a href="#" class="text-info"></a>在这里请你尽情的聆听美妙的音乐，当你带上耳机的那一刹那，外面的世界已经与你无关。</p>
                             
                          </li>
                          <li class="list-group-item">                     
                              <p><a href="#" class="text-info"></a> 因为有你，我每天都在“绚丽多姿”的绕梁余音中度过。 人们常说音乐是听觉的艺术。我说，音乐还是视觉的艺术。 </p>
                              
                          </li>
                        </ul>
                      </div>
<!--            
-->                    </section>
                  </section>              
                </aside>
              </section>
            </section>
          </section>
          <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen,open" data-target="#nav,html"></a>
        </section>
      </section>
    </section>    
  </section>
  <script src="js/jquery.min.js"></script>
  <!-- Bootstrap -->
  <script src="js/bootstrap.js"></script>
  <!-- App -->
  <script src="js/app.js"></script>  
  <script src="js/slimscroll/jquery.slimscroll.min.js"></script>
  <script src="js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
  <script src="js/app.plugin.js"></script>
  <script type="text/javascript" src="js/jPlayer/jquery.jplayer.min.js"></script>
  <script type="text/javascript" src="js/jPlayer/add-on/jplayer.playlist.min.js"></script>
  <script type="text/javascript" src="js/jPlayer/demo.js"></script>

</body>
</html>