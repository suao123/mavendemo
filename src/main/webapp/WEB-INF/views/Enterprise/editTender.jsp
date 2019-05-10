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
	</head>
	
    <body class="mdui-appbar-with-toolbar mdui-drawer-body-left">
		<!-- 头部导航栏 -->
		<div class=" mdui-toolbar mdui-appbar mdui-appbar-fixed mdui-color-indigo ">
			<div class="mdui-toolbar mdui-color-theme">
				<span class="mdui-btn mdui-btn-icon mdui-ripple mdui-ripple-white" mdui-drawer="{target: '#main-drawer', swipe: true}"><i class="mdui-icon material-icons">menu</i></span>
				<a href="javascript:;" class="mdui-typo-headline">企业招标系统</a>
				<div class="mdui-toolbar-spacer"></div>
				<p style=" margin-right: 20px;"><span style="font-size: 130%; margin-left: 3px;">企 业 用 户：</span> 夜间会下雨</p>
				<a href="login" style="margin-right: 0px;" class="mdui-btn mdui-color-light-blue-accent mdui-ripple">退出登录</a>
			</div>
		</div>

		<!-- 侧栏 --> 
		<div style="width: 19%;" class="mdui-drawer mdui-drawer-open mdui-shadow-2" id="main-drawer" >
			<div class="mdui-list" mdui-collapse="{accordion: true}" style="margin-bottom: 76px;">

				<!-- 账号信息 -->
				<div class="mdui-collapse-item">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-blue-500">account_circle</i>
						<div style="font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content mdui-drawer-open">账号信息</div>
							<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
						</div>
				
						<div class="mdui-collapse-item-body mdui-list " style="">
							<a style="font-size: 15px;" href="messageShow" class="mdui-list-item mdui-ripple ">账号信息修改</a>
							<a style="font-size: 15px;" href="tenderRecord" class="mdui-list-item mdui-ripple ">信用等级查询</a>
						</div>
				</div>
				
				<!-- 招标书列表 -->
				<div class="mdui-collapse-item mdui-collapse-item-open">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-deep-orange">event_note</i>
						<div style="font-size: 16px; " class="mdui-list-item-content mdui-drawer-open">招标书列表</div>
							<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
						</div>

						<div class="mdui-collapse-item-body mdui-list" style="">
							<a style="font-size: 15px; background-color: rgba(0, 0, 0, .1);" href="#" class="mdui-list-item mdui-ripple ">发布招标</a>
							<a style="font-size: 15px;" href="myTender" class="mdui-list-item mdui-ripple ">我的招标书</a>
							<a style="font-size: 15px;" href="allTender" class="mdui-list-item mdui-ripple ">市场招标书</a>
						</div>
				</div>

				<!-- 费用管理 -->
				<div class="mdui-collapse-item">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-amber">monetization_on</i>
						<div style="font-size: 16px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content">费用管理</div>
						<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
					</div>
					<div class="mdui-collapse-item-body mdui-list" style="">
						<a style="font-size: 15px;" href="tenderPay" class="mdui-list-item mdui-ripple ">招标书支付</a>
					</div>
				</div>


				<!-- 进度查看 -->
				<div class="mdui-collapse-item">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-teal">subject</i>
						<div style="font-size: 16px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content">进度查看</div>
						<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
					</div>
					<div class="mdui-collapse-item-body mdui-list" style="">
						<a style="font-size: 15px;" href="workProgress" class="mdui-list-item mdui-ripple ">工作进度查看</a>
						<a style="font-size: 15px;" href="payProgress" class="mdui-list-item mdui-ripple ">支付进度查看</a>
					</div>
				</div>
				
				<!-- 工作室 -->
				<div class="mdui-collapse-item">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-deep-purple-500">group</i>
						<div style="font-size: 16px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content">工作室列表</div>
						<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
					</div>
					<div class="mdui-collapse-item-body mdui-list" style="">
						<a style="font-size: 15px;" href="teamRanking" class="mdui-list-item mdui-ripple ">能力排行榜</a>
						<a style="font-size: 15px;" href="teamSearch" class="mdui-list-item mdui-ripple ">工作室搜索</a>
					</div>
				</div>
				
				<!-- 广告管理 -->
				<div class="mdui-collapse-item">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-brown">dvr</i>
						<div style="font-size: 16px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content">广告管理</div>
						<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
					</div>
					<div class="mdui-collapse-item-body mdui-list" style="">
						<a style="font-size: 15px;" href="advertisementList" class="mdui-list-item mdui-ripple ">购买广告位</a>
						<a style="font-size: 15px;" href="editAdvertisement" class="mdui-list-item mdui-ripple ">发布广告信息</a>
						<a style="font-size: 15px;" href="myAdvertisement" class="mdui-list-item mdui-ripple ">我的广告位</a>
					</div>
				</div>
				
			</div>
		</div>
		
		<!-- 页面内容 -->
		<div style="margin-top: 3%;">
			
			<h2 style="text-align: center; margin-bottom: 3%;">发布招标书</h2>
			<!-- 招标名称 -->
			<div class="mdui-textfield mdui-textfield-floating-label" style="clear: left;">
				<i class="mdui-icon material-icons" style="font-size: 18px; color: black; margin-left: 19%;"><span style="color: red">*</span>招标名称:</i>
				<input id="userName" name="userName" onchange="userCheck()" class="mdui-textfield-input" style="width:38% ;margin-left: 32%; font-size: 15px; border-shadow: 0 2px 0 0 green;" placeholder="请输入用户名称" ></input>
			</div>
			<br>
			
			<!-- 联系人姓名 -->
			<div class="mdui-textfield mdui-textfield-floating-label">
				<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 19%; color: black;"><span style="color: red;">*</span>联系人姓名:</i>
				<input id="name" name="name" onchange="nameCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 15px;" placeholder="请填写相关负责人姓名"></input>
			</div>
			<br>
			
			<!-- 联系电话 -->
			<div class="mdui-textfield mdui-textfield-floating-label">
				<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 19%; color: black;"><span style="color: red;">*</span>联系电话:</i>
				<input id="telephone" name="telephone" onchange="teleCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 15px;" placeholder="请输入联系人的电话" ></input>
				<p id="telInfo" style="color: red; position: absolute; left: 74%;bottom: 0px; margin: 0px ;padding: 6px; font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" ></p>
			</div>
			<br>
			
			<!-- 联系邮箱 -->
			<div class="mdui-textfield mdui-textfield-floating-label">
				<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 19%;color: black;"><span style="color: red;">*</span>联系邮箱:</i>
				<input id="email" name="email" onchange="emailCheck()" class="mdui-textfield-input" style="width:38% ; margin-left: 32%; font-size: 15px;" placeholder="请输入邮箱地址" ></input>
				<p id="emailInfo" style="color: red; position: absolute; left: 74%;bottom: 0px; margin: 0px ;padding: 6px; font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" ></p>
			</div>
			<br>
			
			<!-- 开标时间 -->
			<div class="mdui-textfield mdui-textfield-floating-label">
				<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 19%;color: black;"><span style="color: red;">*</span>招标期限:</i>
				<input type="text" id="time" name="time" style="display: inline; width:38% ; margin-left: 32%; font-size: 15px;" class="mdui-textfield-input" placeholder="请输入开标时间, 列如2019-5-1"></input>
			
			</div>
			<br>
			
			<!-- 详情文件 -->
			<div class="mdui-textfield mdui-textfield-floating-label">
				<i class="mdui-icon material-icons" style="font-size: 18px; margin-left: 19%;color: black;"><span style="color: red;">*</span>详情文件:</i>
				<input type="file" style="width:38% ; margin-left: 32%; font-size: 15px;" clas></input>
			</div>
			<br>
			<br>
			
			<!-- 项目简介 -->
			<div>
				<i class="mdui-icon material-icons" style="padding:6px; font-size: 18px; margin-left: 19%;color: black;"><span style="color: red;">*</span>招标简介:</i>
			</div>
			<div>
				<textarea rows="10" cols="50" style="border:1px solid rgba(0, 0, 0, .42); margin-left: 32%;margin-top:-2%; width: 38%;" placeholder="请对项目进行简单的介绍";>
					
				</textarea>
			</div>
			
			<!-- 提交按键 -->
			<div style="clear:both; margin-top: 5%;">
				<input type="submit" onclick="toLogin()" class="mdui-btn mdui-btn-raised mdui-color-pink-accent mdui-ripple mdui-center" style="width:200px; font-size: 17px" value="确认发布" id = "registerButton" />
			</div>
			<br>
			<br>
			<br>
			<br>
		</div>
	</body>
</html>
