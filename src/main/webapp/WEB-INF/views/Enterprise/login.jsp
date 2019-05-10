<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
	<meta charset="utf-8">
	<title>企业招标系统</title>
	<script src="/static/js/jquery.min.js"></script>
	<script src="/static/js/mdui.min.js"></script>
	<script src="/static/js/mdui.js"></script>
	<link rel="stylesheet" type="text/css" href="/static/css/mdui.css"/>
	<link rel="stylesheet" type="text/css" href="/static/css/mdui.min.css"/>
	<script type="text/javascript">
		function go(){
			window.location = "/Group/login"
		}
	</script>
</head>
<body style="background-image:url(/static/img/card.jpg); background-size: 100%;">
<!-- 标题 -->
<div class="mdui-appbar">
	<div class="mdui-toolbar mdui-color-indigo">
		<a  class="mdui-typo-headline">企业招标系统</a>
		<a  class="mdui-typo-title">企业用户登录</a>
		<div class="mdui-toolbar-spacer"></div>
		<a href="javascript:;" class="mdui-btn mdui-btn-icon"><i class="mdui-icon material-icons">star</i></a>
		<a href="${pageContext.request.contextPath}/Selleradmin/register" title="刷新页面" class="mdui-btn mdui-btn-icon"><i class="mdui-icon material-icons">refresh</i></a>
		<a href="http://www.baidu.com" title="访问百度" class="mdui-btn mdui-btn-icon"><i class="mdui-icon material-icons">pets</i></a>
	</div>
</div>

<div class="mdui-shadow-11 mdui-color-white mdui-center" style="width: 55%;margin-top: 3%;">
	<div class="mdui-container">
		<div class="mdui-tab mdui-tab-full-width" mdui-tab>
			<a href="#" class="mdui-ripple mdui-tab-active">企业用户登录</a>
			<a class="mdui-ripple" onclick="go()">工作室用户登录</a>
			<a href="#" class="mdui-ripple">管理员登录</a>
		</div>
	</div>

	<div class="mdui-container-fluid" style="margin-top: 4%;">
		<div class="mdui-textfield mdui-textfield-floating-label">
			<label class="mdui-textfield-label mdui-center" style="width: 40%">手机号</label>
			<input id="telephone" name="telephone" onchange="teleCheck()" type="text" class="mdui-textfield-input mdui-center" style="width: 40%">
		</div>
	</div>
	<div class="mdui-container-fluid" style="margin-top: 4%;">
		<div class="mdui-textfield mdui-textfield-floating-label">
			<label class="mdui-textfield-label mdui-center" style="width: 40%">密码</label>
			<input id="password" name="password" onchange="pwdCheck()" type="password" class="mdui-textfield-input mdui-center" style="width: 40%">
		</div>
	</div>
	<div style="margin-top:11%">
		<input type="submit" onclick="getValue()" class="mdui-btn mdui-btn-raised mdui-color-pink-accent mdui-ripple mdui-center" style="width:200px; font-size: 17px" value="登录" id = "submit"/>
		<br>
		<br>
		<a href="Enterprise/register" class="mdui-btn mdui-btn-raised mdui-color-light-blue-a700 mdui-ripple mdui-center" style="width:200px; font-size: 17px">前往注册</a>
	</div>
	<br>
	<br>
	<br>
</div>

<script>
	function teleCheck(){
		var value = document.getElementById("telephone").value;
		if(value.length == 0){
			$("#telephone").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
		}
		else{
			$("#telephone").css("border-bottom", "2px solid #F44336");
		}
	}
	function pwdCheck(){
		var value = document.getElementById("password").value;
		if(value.length == 0){
			$("#password").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
		}
		else{
			$("#password").css("border-bottom", "2px solid #F44336");
		}
	}
	function getValue(){
		var tele = document.getElementById("telephone").value;
		var pwd = document.getElementById("password").value;
		$.get("Enterprise/loginCheck",
				{
					e_phone:tele,
					password:pwd
				}, function(data){
					if(data.stateCode === "2"){
						mdui.snackbar({message: '登录成功',position: 'top', timeout: 1500});
						window.location.href ="Enterprise/index";
					}
					else{
						mdui.snackbar({message: '登录失败',position: 'top', timeout: 1500});
					}
				}
		)
	}
</script>
</body>
