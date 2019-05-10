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
			#sty a:hover{
				color: #0091EA;
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
				<div class="mdui-collapse-item mdui-collapse-item-open">
					<div class="mdui-collapse-item-header mdui-list-item mdui-ripple">
						<i class="mdui-list-item-icon mdui-icon material-icons mdui-text-color-blue-500">account_circle</i>
						<div style="font-size: 17px; font-family: 'Arial','Microsoft YaHei','黑体','宋体',sans-serif;" class="mdui-list-item-content mdui-drawer-open">账号信息</div>
							<i class="mdui-collapse-item-arrow mdui-icon material-icons">keyboard_arrow_down </i>
						</div>
				
						<div class="mdui-collapse-item-body mdui-list " style="">
							<a style="font-size: 15px;" href="messageShow" class="mdui-list-item mdui-ripple ">账号信息修改</a>
							<a style="font-size: 15px; background-color: rgba(0, 0, 0, .1);" href="#" class="mdui-list-item mdui-ripple ">信用等级查询</a>
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
		<h2 style="text-align: center; margin-top: 3%;">标书历史记录</h2>
		
		<div class="mdui-container" style="margin-top: 3%; width: 90%;">
			
			<!-- 标题 -->
			<div class="mdui-panel" mdui-panel>
				<div class="mdui-panel-item">
				    <div class="mdui-panel-item-header">
						<div style="width: 25%; min-width: 25%; font-weight: 700;" class="mdui-panel-item-title">标书名称</div>
						<div style="width: 25%; min-width: 25%; font-weight: 700;" class="mdui-panel-item-title">完成团队</div>
						<div style="width: 25%; min-width: 25%; font-weight: 700;" class="mdui-panel-item-title">完成情况</div>
						<div style="width: 25%; min-width: 25%; font-weight: 700;" class="mdui-panel-item-title">信用评价</div>
				    </div>
				</div>
			</div>
			
			<!-- 模板一 -->
		    <div class="mdui-panel" mdui-panel>
				<div class="mdui-panel-item">
				    <div class="mdui-panel-item-header">
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title">企业招标系统制作</div>
						<div id="sty" mdui-tooltip="{content: '查看团队'}" style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-text-color-blue-500 mdui-panel-item-title"><a href="#" style="text-decoration: none;font-size: 110%;">标书收割者</a></div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title ">完成</div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title ">良好</div>
						<i class="mdui-panel-item-arrow mdui-icon material-icons">keyboard_arrow_down</i>
				    </div>
				    <div class="mdui-panel-item-body">
						<div class="mdui-panel-item-actions">
							<p style="text-align:left;">主要内容：</p>
							<p style="text-align:left;">本公司需要做一个人才外包与项目外包的微信服务平台，让一些学生创办的初创型公司能接到业务，而有项目开发任务的公司能很便捷地找到合适的项目开发团队。</p>
							<br>
							<button class="mdui-btn mdui-ripple mdui-color-pink-accent">详情查看</button>
						</div>
				    </div>
				</div>
				
				<!-- 模板二 -->
				<div class="mdui-panel-item">
				    <div class="mdui-panel-item-header">
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title">农场品管理系统制作</div>
						<div id="sty" mdui-tooltip="{content: '查看团队'}" style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-text-color-blue-500 mdui-panel-item-title"><a href="#" style="text-decoration: none;font-size: 110%;">东湖神兽</a></div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title ">完成</div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title ">极好</div>
						<i class="mdui-panel-item-arrow mdui-icon material-icons">keyboard_arrow_down</i>
				    </div>
				    <div class="mdui-panel-item-body">
						<div class="mdui-panel-item-actions">
							<p style="text-align:left;">主要内容：</p>
							<p style="text-align:left;">本公司需要做一个农业的农产品管理服务平台，实现农产品的良好的分类和管理，更好的完成农产品交易。</p>
							<br>
							<button class="mdui-btn mdui-ripple mdui-color-pink-accent">详情查看</button>
						</div>
				    </div>
				</div>
				
				<!-- 模板三 -->
				<div class="mdui-panel-item">
				    <div class="mdui-panel-item-header">
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title">图书馆占位管理</div>
						<div id="sty" mdui-tooltip="{content: '查看团队'}" style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-text-color-blue-500 mdui-panel-item-title"><a href="#" style="text-decoration: none;font-size: 110%;">一群狼</a></div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title ">未完成</div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title ">差</div>
						<i class="mdui-panel-item-arrow mdui-icon material-icons">keyboard_arrow_down</i>
				    </div>
				    <div class="mdui-panel-item-body">
						<div class="mdui-panel-item-actions">
							<p style="text-align:left;">主要内容：</p>
							<p style="text-align:left;">本公司需要做一个图书座位管理系统，让学生可以良好的利用图书馆的座位，不出现座位空占的情况。</p>
							<br>
							<button class="mdui-btn mdui-ripple mdui-color-pink-accent">详情查看</button>
						</div>
				    </div>
				</div>
		    </div>
			<div class="mdui-panel mdui-center" mdui-panel style="margin-top: 8%;">
				<div class="mdui-panel-item">
				    <div class="mdui-panel-item-header">
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title">您的综合评价:</div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title">良好</div>
						<div style="width: 25%; min-width: 25%; font-weight: 500;" class="mdui-panel-item-title">
							<i class="mdui-icon material-icons">star</i>
							<i class="mdui-icon material-icons">star</i>
							<i class="mdui-icon material-icons">star</i>
							<i class="mdui-icon material-icons">star_half</i>
							<i class="mdui-icon material-icons">star_border</i>
						</div>
						<button class="mdui-btn mdui-ripple mdui-color-pink-accent">信用提升申请</button>
				    </div>
				</div>
			</div>
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
			<br>
			<br>
		</div>
		
		
	</body>
</html>
