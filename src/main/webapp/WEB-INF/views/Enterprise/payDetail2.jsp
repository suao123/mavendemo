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
		<style type="text/css">
			td a:hover{
				color: #0091EA;
			}
			label img:hover{
				border: 2px solid #0091EA;
			}
			label img{
				border: 2px solid #FFF;
			}
		</style>
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
							<a style="font-size: 15px;" href="#" class="mdui-list-item mdui-ripple ">信用等级查询</a>
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
							<a style="font-size: 15px;" href="editTender" class="mdui-list-item mdui-ripple ">发布招标</a>
							<a style="font-size: 15px;" href="myTender" class="mdui-list-item mdui-ripple ">我的招标书</a>
							<a style="font-size: 15px;" href="allTender" class="mdui-list-item mdui-ripple ">市场招标书</a>
						</div>
				</div>

				<!-- 费用管理 -->
				<div class="mdui-collapse-item mdui-collapse-item-open">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-amber">monetization_on</i>
						<div style="font-size: 16px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content">费用管理</div>
						<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
					</div>
					<div class="mdui-collapse-item-body mdui-list" style="">
						<a style="font-size: 15px; background-color: rgba(0, 0, 0, .1);" href="tenderPay" class="mdui-list-item mdui-ripple ">招标书支付</a>
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
	<div class="paying" style="margin-left: 3%; margin-right: 1%;">
		<p class="paytit" style="text-align: center;">
			<strong>您好，夜间会有雨！系统代理商</strong>
			<span>欢迎您登录广告购买系统</span>
		</p>
		<hr>
		<p style="margin-left: 10%;">选择您的支付方式：</p>
	</div>
	<div id="pay" >
		<!-- 支付宝 -->
		<div id="way" class="mdui-col" style="float: left; margin-left: 10%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
		        <input type="radio" name="group1"/>
		        <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
		        <img style="width: 140px; height: 70px; " src="/static/img/支付宝.jpg" >
		    </label>
		</div>
		
		<!-- 农业 -->
		<div id="way" class="mdui-col" style="float: left; margin-left: 10%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
		        <input type="radio" name="group1"/>
		        <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
		        <img style="width: 140px; height: 70px;" src="/static/img/农业.jpg" >
		    </label>
		 </div>
		 
		<!-- 工商 -->
		<div id="way" class="mdui-col" style="float: left; margin-left: 10%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
		        <input type="radio" name="group1"/>
		        <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
		        <img style="width: 140px; height: 70px;" src="/static/img/工商.jpg" >
		    </label>
		</div>
		 
		<!-- 微信 -->
		<div id="way" class="mdui-col" style="float: left;clear: left; margin-left:10%;margin-top: 4%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
		        <input type="radio" name="group1"/>
		        <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
		        <img style="width: 140px; height: 70px;" src="/static/img/微信.jpg" >
		    </label>
		</div>
		
		<!-- 银联 -->
		<div id="way" class="mdui-col" style="float: left; margin-left: 10%;margin-top: 4%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
		        <input type="radio" name="group1"/>
		        <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
		        <img style="width: 140px; height: 70px;" src="/static/img/银联.jpg" >
		    </label>
		</div>
		
		<!-- 邮政 -->
	    <div id="way" class="mdui-col" style="float: left; margin-left: 10%;margin-top: 4%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
			    <input type="radio" name="group1"/>
			    <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
			    <img style="width: 140px; height: 70px;" src="/static/img/邮政.jpg" >
		    </label>
		</div>
		
		<!-- 建设 -->
		<div id="way" class="mdui-col" style="float: left; clear: left; margin-left: 10%;margin-top: 4%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
			    <input type="radio" name="group1"/>
			    <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
			    <img style="width: 140px; height: 70px;" src="/static/img/建设.jpg" >
		    </label>
		</div>
		
		<!-- 招商 -->
		<div id="way" class="mdui-col" style="float: left; margin-left: 10%;margin-top: 4%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
			    <input type="radio" name="group1"/>
			    <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
			    <img style="width: 140px; height: 70px;" src="/static/img/招商.jpg" >
		    </label>
		</div>
		
		<!-- 交通 -->
		<div id="way" class="mdui-col" style="float: left; margin-left: 10%;margin-top: 4%; height: 70px;">
		    <label class="mdui-radio" style="margin-top: 4px">
			    <input type="radio" name="group1"/>
			    <i class="mdui-radio-icon" style="margin-top: 30px; top:0px"></i>
			    <img style="width: 140px; height: 70px;" src="/static/img/交通.jpg" >
		    </label>
		</div>
		
		
		<div id="way" style=" clear: left;float: left;margin-top: 5%; margin-left: 14%;">
			<p style="font-size: 120%;">订单编号：<span style="font-weight: 500;">10542585812</span></p>
			<div id="">
				<span style="font-size: 120%;">广告位购买： </span>
				<select style="text-align: center;" class="mdui-select" mdui-select="{position: 'bottom'}">
					<option value="1">一号</option>
					<option value="2">二号</option>
					<option value="5">三号</option>
					<option value="6">四号</option>
					<option value="6">五号</option>
				</select>
			</div>
			<br>
			
			<div>
				<span style="font-size: 120%; ">购买时间： </span>
				<select style="text-align: center;" class="mdui-select" mdui-select="{position: 'bottom'}">
					<option value="1">一个月</option>
					<option value="2">三个月</option>
					<option value="5">六个月</option>
					<option value="6">一年</option>
				</select>
			</div>
			<p style="font-size: 120%;">支付金额：<span style="font-weight: 500;">￥81291.00元</span></p>
			<p style="font-size: 120%;">支付方式：<span style="font-weight: 500;">支付宝</span></p>
		</div>
		
		<!-- 按钮 -->
		<div style=" clear: left;float: left;margin-top: 5%; margin-left: 14%;">
			<div>
				<button class="mdui-btn mdui-color-pink-a400">确认支付</button>
				<a class="mdui-btn mdui-color-light-blue-800" style="margin-left: 25px;" href="advertisementList">返回上层</a>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
			</div>
		</div>
	</div>
	</body>
</html>
