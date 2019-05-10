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
						<a style="font-size: 15px; background-color: rgba(0, 0, 0, .1);" href="#" class="mdui-list-item mdui-ripple ">能力排行榜</a>
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
		<h2 style="margin-bottom:1%; margin-top: 1%; text-align: center;">工作室能力排行榜</h2>
		<!-- 广告插入 -->
		<div class="box" id = "box">
			<div class="inner" id = "inner">
				<ul id="ul1">
					<li><a href="#"><img src="/static/img/6.jpg" alt=""></a></li>
					<li><a href="#"><img src="/static/img/7.jpg" alt=""></a></li>
					<li><a href="#"><img src="/static/img/8.jpg" alt=""></a></li>
					<li><a href="#"><img src="/static/img/5.jpg" alt=""></a></li>
					<li><a href="#"><img src="/static/img/2.jpg" alt=""></a></li>
				</ul>
				<ol class="bar">
					
				</ol>
				<div class="arr" id="arr">
					<span id="left"><</span>
					<span id="right">></span>
				</div>
				
			</div>
		</div>
		<!-- 页面内容 -->
		<div class="mdui-container-fluid" style="height: 100%; width:95%; ">
			<div class="mdui-container" style="margin-top: 2%;">
				<div class="mdui-table-fluid">
					<table class="mdui-table mdui-table-hoverable">
						<tr>
							<th>团队名称</th>
							<th>团队人数</th>
							<th>标书完成数量</th>
							<th>能力星数</th>
							<th>详情查看</th>
						</tr>
							
						<!-- 模板一 -->
						<tr>
							<td>东湖神兽</td>

							<td><a mdui-tooltip="{content: '团队人数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">person</i>8</a></td>
							<td><a mdui-tooltip="{content: '标书完成数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">playlist_add_check</i>15</a></td>
							<th style="color: #000002;">
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
							</th>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">团队详情</button> </td>
						</tr>
							
						<!-- 模板二 -->
						<tr>
							<td>东湖神兽</td>
		
							<td><a mdui-tooltip="{content: '团队人数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">person</i>8</a></td>
							<td><a mdui-tooltip="{content: '标书完成数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">playlist_add_check</i>15</a></td>
							<th style="color: #000002;">
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star_half</i>
							</th>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">团队详情</button> </td>
						</tr>
						
						<tr>
							<td>东湖神兽</td>
				
							<td><a mdui-tooltip="{content: '团队人数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">person</i>8</a></td>
							<td><a mdui-tooltip="{content: '标书完成数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">playlist_add_check</i>15</a></td>
							<th style="color: #000002;">
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star_border</i>
							</th>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">团队详情</button> </td>
						</tr>
						
						<tr>
							<td>东湖神兽</td>
						
							<td><a mdui-tooltip="{content: '团队人数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">person</i>8</a></td>
							<td><a mdui-tooltip="{content: '标书完成数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">playlist_add_check</i>15</a></td>
							<th style="color: #000002;">
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star_half</i>
								<i class="mdui-icon material-icons">star_border</i>
							</th>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">团队详情</button> </td>
						</tr>
						
						<tr>
							<td>东湖神兽</td>
							
							<td><a mdui-tooltip="{content: '团队人数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">person</i>8</a></td>
							<td><a mdui-tooltip="{content: '标书完成数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">playlist_add_check</i>15</a></td>
							<th style="color: #000002;">
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star_half</i>
								<i class="mdui-icon material-icons">star_border</i>
							</th>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">团队详情</button> </td>
						</tr>
						
						<tr>
							<td>东湖神兽</td>
							
							<td><a mdui-tooltip="{content: '团队人数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">person</i>8</a></td>
							<td><a mdui-tooltip="{content: '标书完成数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">playlist_add_check</i>15</a></td>
							<th style="color: #000002;">
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star_half</i>
								<i class="mdui-icon material-icons">star_border</i>
							</th>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">团队详情</button> </td>
						</tr>
						
						<tr>
							<td>东湖神兽</td>
							
							<td><a mdui-tooltip="{content: '团队人数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">person</i>8</a></td>
							<td><a mdui-tooltip="{content: '标书完成数'}" style="text-decoration: none;" href="#"><i style="margin-right: 7px;" class="mdui-icon material-icons">playlist_add_check</i>15</a></td>
							<th style="color: #000002;">
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star</i>
								<i class="mdui-icon material-icons">star_half</i>
								<i class="mdui-icon material-icons">star_border</i>
							</th>
							<td> <button class="mdui-btn mdui-color-pink-400" onclick="details(${product.agId})">团队详情</button> </td>
						</tr>
						
					</table>
				</div>
				<p></p>
				<div align="center" style="margin-top: 3%;">
					<input type="button" class="mdui-btn mdui-btn-raised mdui-color-blue-a200 mdui-color-blue-a200 mdui-ripple" value="上一页" onclick="PageFront()"/>
					<a> 1/1 </a>
					<input type="button" class="mdui-btn mdui-btn-raised mdui-color-blue-a200 mdui-ripple" value="下一页" onclick="PageNext()"/>
				</div>
				<br>
				<br>
				<br>
				<br>
				<br>
			</div>
		</div>
		
		<script>
			//获取各个dom节点
			var box = document.getElementById("box");
			var inner = box.children[0];
			var ulObj = inner.children[0];
			var list = ulObj.children;
			var olObj = inner.children[1];
			var arr = document.getElementById("arr");
			var imgWidth = inner.offsetWidth;
			var right = document.getElementById("right");
			var left = document.getElementById("left");
			var pic = 0;
			var judge = 0;
			var test = document.getElementById("test");
			
			//自动生成按钮
			for(var i = 0; i < list.length; i++){
				//创建新的li元素
			    var newli = document.createElement("li");
				//插入到最后
			    olObj.appendChild(newli);
				//生成图片顺序
				newli.innerText = i + 1;
				newli.setAttribute("num", i);
				//按钮触碰的事件
				
			}
		
			//第一按钮设置颜色
			olObj.children[0].setAttribute("class", "current");
			
			ulObj.appendChild(ulObj.children[0].cloneNode(true));
			
			//向右播放
			function rightplay(){
				if(pic == ulObj.children.length - 1){
					pic = 0;
					ulObj.style.left = 0 + "px";
				}
				pic++;
				//到达最后一张时,图片接着到第一张进行播放
				animate(-pic*imgWidth);
				//清除所有按钮样式,当前按钮出现样式
				if(pic == list.length - 1){
					olObj.children[olObj.children.length - 1].className = "";
					//第一个按钮颜色设置上
					olObj.children[0].className = "current";
				}
				else{
					for(var j = 0; j < olObj.children.length; j++){
						olObj.children[j].removeAttribute("class");
					}
					olObj.children[pic].setAttribute("class", "current");
				}
				
			}
			
			//向左播放图片
			function leftplay(){
				if(pic == 0){
					pic = ulObj.children.length - 1;
					ulObj.style.left = -pic*imgWidth + "px";
				}
				pic--;
				console.log('pic: ' + pic);
				console.log('ul.length: ' + ulObj.children.length);
				//当图片到达第一张时在向左就是播放最后一张
				animate(-pic*imgWidth);
				
				//清除所有的样式
				for (var i = 0; i < olObj.children.length; i++) {
				    olObj.children[i].removeAttribute("class");
				}
				//当前的pic索引对应的按钮设置颜色
				olObj.children[pic].className = "current";
			}
			
			//正常情况下一直在轮播图片
			var timeId = setInterval(rightplay, 5200);
			
			//设置当鼠标触碰到inner时的事件
		
			inner.onmouseover = function(){
				//左右箭头出现
				arr.style.display = "block";
				//停止轮播
				clearInterval(timeId);
			}
			
			//设置当鼠标离开到inner时的事件
			inner.onmouseout = function(){
				//左右箭头消失
				arr.style.display = "none";
				//重新设置图片轮播
				timeId = setInterval(rightplay, 5200);
			}
			
			//右键向右播放图片
			right.onclick = function(){
				rightplay();
			}
			
			//左键向左播放图片
			left.onclick = function(){
				leftplay();
			}
			
			//图片轮播过度效果
			function animate(target){
				clearInterval(timeId2);
				var timeId2 = setInterval(function(){
					var current = ulObj.offsetLeft;
					var step = 10;
					step = current < target ? step : -step;
					current += step;
					// console.log('current: ' + current + 'target: ' + target);
					
					if(Math.abs(current - target) > Math.abs(step)){
						ulObj.style.left = current + "px";
					}
					else{
						clearInterval(timeId2);
						ulObj.style.left = target + "px";
					}
				}, 10);
			}
		</script>
		
	</body>
</html>
