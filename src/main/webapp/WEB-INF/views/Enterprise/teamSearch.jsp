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
		</style>
		
		<style type="text/css">
			*{
				padding: 0px;
				margin: 0px;
			}
			.box{
			    width: 800px;
				height: 150px;
				border: 10px solid #eeeeee;
				margin: 0px auto;
				padding: 5px;
			}
			.inner{
				width: 800px;
				height: 150px;
				position: relative;
				overflow: hidden;
			}
			.inner img{
				width: 800px;
				height: 150px;
				vertical-align: top;
			}
			
			ul{
				width: 600%;
				list-style: none;
				position: absolute;
				left: 0px;
				top: 0px;
			}
			.inner li{
				float: left;
			}
			ol{
				position: absolute;
				height: 20px;
				right: 20px;
				bottom: 20px;
				text-align: center;
				padding: 5px;
			}
			
			ol li{
				display: inline-block;
				width: 20px;
				height: 20px;
				background-color: #fff;
				margin: 5px;
				cursor: pointer;
				border: 2px solid #eee;
			}
			ol .current{
			    background-color: #BDBDBD;
			}
			.arr{
				display: none;
			}
			.arr span{
				width: 40px;
				height: 68px;
				position: absolute;
				left: 5px;
				top: 50%;
				margin-top: -34px;
				background-color: #eee;
				cursor: pointer;
				line-height: 68px;
				text-align: center;
				font-weight: bold;
				font-family: '黑体';
				font-size: 30px;
				color: #000;
				opacity: 0.5;
				border: 1px solid #fff;
				}
			#right{
				right: 5px;
				left: auto;
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
							<a style="font-size: 15px;" href="tenderRecord" class="mdui-list-item mdui-ripple ">信用等级查询</a>
						</div>
				</div>
				
				<!-- 招标书列表 -->
				<div class="mdui-collapse-item">
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
				<div class="mdui-collapse-item mdui-collapse-item-open">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-deep-purple-500">group</i>
						<div style="font-size: 16px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content">工作室列表</div>
						<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
					</div>
					<div class="mdui-collapse-item-body mdui-list" style="">
						<a style="font-size: 15px; " href="teamRanking" class="mdui-list-item mdui-ripple ">能力排行榜</a>
						<a style="font-size: 15px; background-color: rgba(0, 0, 0, .1);" href="#" class="mdui-list-item mdui-ripple ">工作室搜索</a>
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
		<div id="" style="margin-left: 3%;">
			<div class="mdui-textfield" style="margin-left:25%; margin-top: 3%;">
				<input id="search" style="width: 50%; display: inline-block;" class="mdui-textfield-input" type="text" placeholder="搜索团队的名字"/>
				<button id="go"  class="mdui-textfield-icon mdui-btn mdui-btn-icon"><i class="mdui-icon material-icons">search</i></button>
			</div>
			<!-- 推荐内容 -->
			<div style="margin-left: 10%; margin-top: 3%;">
				<span style="font-weight: 500; font-size: 120%;">你是否在找：</span>
			</div>
			
			<div id="recommend" class="mdui-container" style="margin-top: 3%;">
			    <div class="mdui-chip" style="margin-left: 5%;">
					<i class="mdui-icon material-icons" >group</i>
				    <span class="mdui-chip-title">心细则成</span>
				    <span class="mdui-chip-delete"><i class="mdui-icon material-icons">cancel</i></span>
			    </div>
				<div class="mdui-chip" style="margin-left: 5%;">
					<i class="mdui-icon material-icons" >group</i>
				    <span class="mdui-chip-title">接接接标书</span>
				    <span class="mdui-chip-delete"><i class="mdui-icon material-icons">cancel</i></span>
				</div>
				<div class="mdui-chip" style="margin-left: 5%;">
					<i class="mdui-icon material-icons" >group</i>
				    <span class="mdui-chip-title">东湖神兽</span>
				    <span class="mdui-chip-delete"><i class="mdui-icon material-icons">cancel</i></span>
				</div>
				<div class="mdui-chip" style="margin-left: 5%;">
					<i class="mdui-icon material-icons" >group</i>
				    <span class="mdui-chip-title">标书终结者</span>
				    <span class="mdui-chip-delete"><i class="mdui-icon material-icons">cancel</i></span>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			var recom = document.getElementById("recommend");
			var search = document.getElementById("search");
			var go = document.getElementById("go");
			var len = recom.children.length;
			for(var i = 0; i < len; i++){
				recom.children[i].onclick = function(){
					for(var j = 0; j < len; j++){
						recom.children[j].style.backgroundColor = "#e0e0e0"
						recom.children[j].children[0].style.color = "black"
						
					}
					var t = this.children[1].innerText;
					this.style.backgroundColor = "#03A9F4"
					this.children[0].style.color = "blue"
					search.value = t;
				}
			}
			
			go.onclick = function(){
				var t = recom.children[0].children[1].innerText;
				alert(recom.children.length);
			}
		</script>
	</body>
</html>
