<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
				window.location = "/Enterprise/register";
				
			}
		</script>
	</head>
	<body style="background-image:url(/static/img/card.jpg); background-size: 100%;">
	<!-- 标题 -->
	<div class="mdui-appbar">
		<div class="mdui-toolbar mdui-color-indigo">
			<a  class="mdui-typo-headline">企业招标系统</a>
			<a  class="mdui-typo-title">工作室用户注册</a>
			<div class="mdui-toolbar-spacer"></div>
			<a href="javascript:;" class="mdui-btn mdui-btn-icon"><i class="mdui-icon material-icons">star</i></a>
			<a href="${pageContext.request.contextPath}/Selleradmin/register" title="刷新页面" class="mdui-btn mdui-btn-icon"><i class="mdui-icon material-icons">refresh</i></a>
			<a href="http://www.baidu.com" title="访问百度" class="mdui-btn mdui-btn-icon"><i class="mdui-icon material-icons">pets</i></a>
		</div>
	</div>
	<br>
	<!--  信息填写-->
	<div id="register" class="mdui-shadow-11 mdui-color-white mdui-center" style="width: 55%;">
		<div class="mdui-container">
			<div class="mdui-tab mdui-tab-full-width" mdui-tab>
			    <a class="mdui-ripple" onclick="go()">企业注册</a>
				<a href="#" class="mdui-ripple mdui-tab-active">工作室注册</a>
			</div>
		</div>
		<br>

		<!-- 第一部分 -->
		<div style="margin-left: 12%;">
			<div style="float: left;">
				<p style="font-size: 22px;font-weight: 400; border: 2px solid #E0E0E0; background-color: #0288D1; color: #FFFFFF; border-radius: 17px; width: 30px; height: 30px; text-align: center;display: flex; align-items: center;justify-content: center;">1</p>
			</div>
			<div style="float: left;">
				<p style="font-size: 22px;font-weight: 400; float: left; padding-top: 3.5%; padding-left: 4%; width: 140%;">负责人信息：</p>
			</div>
		</div>

		<!-- 工作室名称 -->
		<div class="mdui-textfield mdui-textfield-floating-label" style="clear: left;">
			<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 12%; color: black"><span style="color: red;">*</span>工作室名称:</i>
			<input id="companyName" name="companyName" onchange="comCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 14px;" placeholder="请填写工作室的名称" ></input>
        </div>
		<br>

		<!-- 联系人姓名 -->
		<div class="mdui-textfield mdui-textfield-floating-label">
			<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 12%; color: black;"><span style="color: red;">*</span>负责人姓名:</i>
			<input id="name" name="name" onchange="nameCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 14px;" placeholder="请填写相关负责人姓名" ></input>
		</div>
		<br>

		<!-- 电子邮箱 -->
		<div class="mdui-textfield mdui-textfield-floating-label">
			<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 12%;color: black;"><span style="color: red;">*</span>电子邮箱:</i>
			<input id="email" name="email" onchange="emailCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 14px;" placeholder="请输入负责人邮箱地址" ></input>
			<p id="emailInfo" style="color: red; position: absolute; left: 74%;bottom: 0px; margin: 0px ;padding: 6px; font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;"></p>
		</div>
		<br>

		<!-- 联系电话 -->
		<div class="mdui-textfield mdui-textfield-floating-label">
			<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 12%; color: black;"><span style="color: red;">*</span>联系电话:</i>
			<input id="telephone" name="telephone" onchange="teleCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 14px;" placeholder="请输入负责人的电话" ></input>
			<p id="telInfo" style="color: red; position: absolute; left: 74%;bottom: 0px; margin: 0px ;padding: 6px; font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;"></p>
		</div>

		<br>
		<br>
		<!-- 第二部分 -->
		<div style="margin-left: 12%;">
			<div style="float: left;">
				<p style="font-size: 22px;font-weight: 400; border: 2px solid #E0E0E0; background-color: #0288D1; color: #FFFFFF; border-radius: 17px; width: 30px; height: 30px; text-align: center;display: flex; align-items: center;justify-content: center;">2</p>
			</div>
			<div style="float: left;">
				<p style="font-size: 22px;font-weight: 400; float: left; padding-top: 3.5%; padding-left: 4%; width: 140%;">账号信息：</p>
			</div>
		</div>

		<!-- 用户名 -->
		<div class="mdui-textfield mdui-textfield-floating-label" style="clear: left;">
			<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 12%; color: black;"><span style="color: red">*</span>用户名:</i>
			<input id="userName" name="userName" onchange="userCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 14px; border-shadow: 0 2px 0 0 green;" placeholder="请输入用户名称" ></input>
		</div>
		<br>

		<!-- 输入密码 -->
		<div class="mdui-textfield mdui-textfield-floating-label" style="clear: left;">
			<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 12%; color:black;"><span style="color:red">*</span>密码:</i>
			<input type="password" id="password" name="password" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 14px;" placeholder="请输入您的密码" ></input>
			<p id="pwdInfo" style="color: red; position: absolute; left: 74%;bottom: 0px; margin: 0px ;padding: 6px; font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;"></p>
		</div>
		<br>

		<!-- 确认密码 -->
		<div class="mdui-textfield mdui-textfield-floating-label" style="clear: left;">
			<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 12%;color:black;"><span style="color:red">*</span>确认密码:</i>
			<input type="password" id="confirm" name="confirm" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 14px;" placeholder="请确认您的密码" ></input>
			<p id="conInfo" style="color: red; position: absolute; left: 74%;bottom: 0px; margin: 0px ;padding: 6px; font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;"></p>
		</div>
		<br>
		<br>

		<div >
			<div id="x" class="control-label col-md-2 " style=" float: left; margin-left: 14%; width:25%">
				<a title="看不清图片？点击换一个" onclick="reloadValidateCode();">
					<img id="captcha_img" class="mdui-center mdui-shadow-1 mdui-hoverable " style=" height: 50px;" alt="验证码">
				</a>
			</div>
			<div class="mdui-textfield mdui-textfield-floating-label" style="float: left;width: 25%; margin-left: 6%;">
				<input id="verification" name="verification" onchange="veriCheck()" type="text" class="mdui-textfield-input mdui-center" name="registerValidateCode" id="registerValidateCode" placeholder="输入验证码">
			</div>
		</div>
		<div style="clear:both; margin-top: 17%;">
			<input type="submit" onclick="toLogin()" class="mdui-btn mdui-btn-raised mdui-color-pink-accent mdui-ripple mdui-center" style="width:200px; font-size: 17px" value="确认注册" id = "registerButton" />
		</div>
		<br>
		<br>
		<a href="login" class="mdui-btn mdui-btn-raised mdui-color-light-blue-a700 mdui-ripple mdui-center" style="width:200px; font-size: 17px">前往登录</a>
		<br><br>
	</div>
	<br>

		<script>
			//静态提交
			var ch = new Array(0, 0, 0, 0, 0, 0, 0, 0)
			function toLogin(){
				var num = 0;
 				for(var i = 0; i < 8; i++){
	                if(ch[i] == 1)
					    num++;
				}
				if(num != 8){
					mdui.snackbar({message: '请填写完注册信息',position: 'top', timeout: 2000});

				}
				else{
					mdui.snackbar({message: '注册成功',position: 'top', timeout: 1000});
					mdui.snackbar({message: '正在跳转登录界面',position: 'top', timeout: 800});
					var tele = document.getElementById("telephone").value;
					var pwd = document.getElementById("password").value;
					var url = "login?telephone="+tele+"&pwd="+pwd;
					console.log(url);
					setTimeout(function(){window.location.href=url;}, 1800);
				}
				//var tele = document.getElementById("telephone").value;
				//var pwd = document.getElementById("password").value;
				//window.location.href = "login?telephone" +
			}
			//输入框下边样式
			function nameCheck(){
				var value = document.getElementById("name").value;
				if(value.length == 0){
					ch[0] = 0;
					$("#name").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
				}
				else{
					ch[0] = 1;
					$("#name").css("border-bottom", "2px solid #F44336");
				}
			}
			function comCheck(){
				var value = document.getElementById("companyName").value;
				if(value.length == 0){
					ch[1] = 0;
					$("#companyName").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
				}
				else{
					ch[1] = 1;
					$("#companyName").css("border-bottom", "2px solid #F44336");
				}
			}
			function userCheck(){
				var value = document.getElementById("userName").value;
				if(value.length == 0){
					ch[2] = 0;
					$("#userName").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
				}
				else{
					ch[2] = 1;
					$("#userName").css("border-bottom", "2px solid #F44336");
				}
			}
			function veriCheck(){
				var value = document.getElementById("verification").value;
				if(value.length == 0){
					ch[3] = 0;
					$("#verification").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
				}
				else{
					ch[3] = 1;
					$("#verification").css("border-bottom", "2px solid #F44336");
				}
			}

			// 电话格式审核
			$("#telephone").keyup(
				function () {
					var len = $("#telephone").val().length;
					if(isNaN($("#telephone").val())||len != 11){
						$("#telInfo").text("提示:手机号不存在");
						$("#telephone").css("border-bottom", "2px solid #F44336");
					}
					else {
						$("#telInfo").text("");
					}
				}
			);
			function teleCheck(){
				var value = document.getElementById("telephone").value;
				var text = document.getElementById("teleInfo");
				if(value.length == 0){
					ch[4] = 0;
					$("#telephone").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
					$("#telInfo").text("");
				}
				if(value.length == 11){
					ch[4] = 1;
 					$("#telephone").css("border-bottom", "2px solid black");
				}
			}

			//邮箱格式
			$("#email").keyup(
				function () {
					var check = $("#email").val();
					var length = check.length;
					ch1 = check.substring( length-7,length);
					ch2 = check.substring( length-8,length);
					if(ch1 != '@qq.com' && ch2 != '@163.com'){
						$("#emailInfo").text("提示:格式不正确");
						$("#email").css("border-bottom", "2px solid #F44336");
					}
					else {
						$("#emailInfo").text("");
						$("#email").css("border-bottom", "2px solid #F44336");
					}
				}
			);
			function emailCheck(){
				var check = $("#email").val();
				var length = check.length;
				ch1 = check.substring( length-7,length);
				ch2 = check.substring( length-8,length);
				var len = check.length;
				if(len == 0){
					ch[5] = 0;
					$("#email").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
					$("#emailInfo").text("");
				}
				if(ch1 == '@qq.com' || ch2 == '@163.com'){
					ch[5] = 1;
					$("#email").css("border-bottom", "2px solid #F44336");
					$("#emailInfo").text("");
				}
			}

			//密码验证
			$("#confirm").keyup(
				function () {
					var pwd = document.getElementById("password").value;
					var con = document.getElementById("confirm").value;
					var check1 = $("#password").val();
					var length1 = check1.length;
					var check2 = $("#confirm").val();
					var length2 = check2.length;
					if(con != pwd){
						ch[6] = 0;
						ch[7] = 0;
						$("#pwdInfo").text("提示:两次密码不一致");
						$("#conInfo").text("提示:两次密码不一致");
						$("#password").css("border-bottom", "2px solid #F44336");
						$("#confirm").css("border-bottom", "2px solid #F44336");
					}
					else {
						ch[6] = 1;
						ch[7] = 1;
						$("#pwdInfo").text("");
						$("#conInfo").text("");
					}
					if(length1 == 0||length2 == 0){
						ch[6] = 0;
						ch[7] = 0;
						$("#pwdInfo").text("");
						$("#conInfo").text("");
						$("#password").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
						$("#confirm").css("border-bottom", "1px solid rgba(0, 0, 0, .42)");
					}
				}
			);

		</script>
	</body>
</html>
