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
				<p style=" margin-right: 20px;"><span style="font-size: 130%; margin-left: 3px;">工 作 室 用 户： </span> 特立独行</p>
				<a href="login" style="margin-right: 0px;" class="mdui-btn mdui-color-light-blue-accent mdui-ripple">退出登录</a>
			</div>
		</div>

		<!-- 侧栏 --> 
		<div class="mdui-drawer mdui-drawer-open mdui-shadow-2" id="main-drawer" >
			<div class="mdui-list" mdui-collapse="{accordion: true}" style="margin-bottom: 76px;">

				<!-- 账号信息 -->
				<div class="mdui-collapse-item ">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-blue-500">account_circle</i>
						<div style="font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content mdui-drawer-open">账号信息</div>
							<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
						</div>
				
						<div class="mdui-collapse-item-body mdui-list" style="">
							<a style="font-size: 15px;" href="messageShow" class="mdui-list-item mdui-ripple ">账号信息修改</a>
							<a style="font-size: 15px;" href="tenderRecord" class="mdui-list-item mdui-ripple ">能力等级查询</a>
						</div>
				</div>
				
				<!-- 招标书列表 -->
				<div class="mdui-collapse-item ">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-deep-orange">event_note</i>
						<div style="font-size: 16px; " class="mdui-list-item-content mdui-drawer-open">招标书列表</div>
							<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
						</div>

						<div class="mdui-collapse-item-body mdui-list" style="">
							<a style="font-size: 15px;" href="allTender" class="mdui-list-item mdui-ripple ">市场招标书</a>
							<a style="font-size: 15px;" href="myTender" class="mdui-list-item mdui-ripple ">我的投标书</a>
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
						<a style="font-size: 15px;" href="workProgress" class="mdui-list-item mdui-ripple ">工作进度提交</a>
						<a style="font-size: 15px;" href="payProgress" class="mdui-list-item mdui-ripple ">报酬进度查看</a>
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
					<div class="mdui-collapse-item-body mdui-list">
						<a style="font-size: 15px;" href="advertisementList" class="mdui-list-item mdui-ripple ">购买广告位</a>
						<a style="font-size: 15px;" href="editAdvertisement" class="mdui-list-item mdui-ripple ">发布广告信息</a>
						<a style="font-size: 15px;" href="myAdvertisement" class="mdui-list-item mdui-ripple ">我的广告位</a>
					</div>
				</div>
				
				<!-- 信息管理 -->
				<div class="mdui-collapse-item mdui-collapse-item-open" >
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons" style="color: #4CAF50;">email</i>
						<div style="font-size: 16px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content">邮箱信息</div>
						<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
					</div>
					<div class="mdui-collapse-item-body mdui-list">
						<a style="font-size: 15px;" href="email" class=" mdui-list-item mdui-ripple "><span style=" position: absolute; left: 14%; background: #FF0000; color: #FFFFFF; border-radius: 25px; width: 22px; height: 22px; text-align: center; margin-right: 1.25rem; text-align: center;display: flex; align-items: center;justify-content: center;">3</span>收到的邮箱</a>
						<a style="font-size: 15px; background-color: rgba(0, 0, 0, .1);" href="#" class="mdui-list-item mdui-ripple "><span style="position: absolute; left: 14%; background: #FF0000; color: #FFFFFF; border-radius: 25px; width: 22px; height: 22px; text-align: center; margin-right: 1.25rem; text-align: center;display: flex; align-items: center;justify-content: center;">1</span>系统公告</a>
					</div>
				</div>

			</div>			
		</div>
		<!-- 页面内容 -->
		<div class="mdui-container-fluid" style="height: 100%; width:100%; ">
			<h2 style="margin-top:3%; text-align: center;">系统公告</h2>
			<div class="mdui-container" style="margin-top: 4%;">
				<div class="mdui-table-fluid">
					<table class="mdui-table mdui-table-hoverable">
						<tr>
							<th>主题</th>
							<th>时间</th>
							<th>详情</th>
						</tr>
							
						<!-- 模板一 -->
						<tr>
 					    	<td>系统维护通知</td>
							<td>2019-4-25</td>
							<td><button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">查看</button> </td>
						</tr>
							
						<!-- 模板二 -->
						<tr>
							<td>广告位购买功能开放</td>
							<td>2019-5-4</td>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">查看</button> </td>
						</tr>
						
					</table>
				</div>
				<p></p>
				<div align="center">
					<input type="button" class="mdui-btn mdui-btn-raised mdui-color-blue-a200 mdui-ripple" value="上一页" onclick="PageFront()"/>
					<a> 1/1 </a>
					<input type="button" class="mdui-btn mdui-btn-raised mdui-color-blue-a200 mdui-ripple" value="下一页" onclick="PageNext()"/>
				</div>
			</div>
		</div>
	</body>
</html>
