<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<title></title>
		<link rel="stylesheet" href="css/style.css" />
		<style type="text/css">
			body{
				width: 100%;
				margin: 0;
				padding: 0;
				font-family: 'icomoon';
			}
			body ul{
				list-style: none;
				padding: 0px;
				
			}
			@font-face {
			  font-family: 'icomoon';
			  src:  url('fonts/icomoon.eot?fcb9nu');
			  src:  url('fonts/icomoon.eot?fcb9nu#iefix') format('embedded-opentype'),
			    url('fonts/icomoon.ttf?fcb9nu') format('truetype'),
			    url('fonts/icomoon.woff?fcb9nu') format('woff'),
			    url('fonts/icomoon.svg?fcb9nu#icomoon') format('svg');
			  font-weight: normal;
			  font-style: normal;
			  font-display: block;
			}
			.up {
				width: 100%;
				height: 160px;
				background-color: #333;
				margin:0;
				padding:0;
				overflow:hidden
			}
			.up li{
				color: white;
				
			}
			.top a{
				color: white;
				text-decoration: none;
				margin-left: 20px;
				margin-right: 20px;
			}
			.top a:hover{
				color: red;
			}
			.top span:hover{
				color: red;
			}
			.top{
				margin-left: -50px;
			}
			.fl{
				float: left;
				
			}
			.fr{
				float: right;
			}
			.up_top{
				width: 1200px;
				height: 40px;
				margin: -10px auto;
			}
			.up_top a{
				font-size: 12px;
			}
			.up_top span{
				position: relative;
				top: 3px;
			}
			.icon{
				font-family: 'icomoon';
				font-size: 17px;
				color: darkgray;
			}
			.login{
				width: 1200px;
				height: 120px;
				margin: 0 auto;
				
			}
			.login_city{
				background-color: #333;
				width: 100px;
				height: 50px;
				color: white;
				border: 1px solid white ;
				margin-left: 60px;
				margin-top: 60px;
				
			}
			.login_select{
				height: 40px;
				width: 450px;
				background-color:red ;
				margin-top: 60px;
				margin-left: 100px;
				border: 1px solid #333;
			}
			.login_icon{
				height: 40px;
				width: 50px;
				background-color: white;
				text-align: center;
				
			}
			.login_icon span{
				text-align: center;
				color: #A9A9A9;
				font-size: 20px;
				position: relative;
				top: 10px;
			}
			.login_input input {
				height: 38px;
				width: 350px;
				border: none;
				outline:none;
				resize:none;
			} 
			.login_btn input{
				height: 40px;
				width: 50px;
				border: none;
				color: white;
				background-color: black;
			}
			.login_Popular{
				font-size: 14px;
				position: relative;
				top: -13px;
			}
			.login_Popular a{
				text-decoration: none;
				color: white;
				margin-right: 20px;
				font-size: 13px;
			}
			.login_Popular a:hover{
				color: red;
			}
			.Shopping{
				height: 60px;
				width: 200px;
				margin-top: 20px;
			}
			.Shopping_p{
				height: 50px;
				width: 80px;
				font-size: 14px;
				color: white;
				border: none;
				margin-top: 10px;
				text-align: center;
				line-height:25px;
				background-color: red;
			}
			.Shopping_cat{
				height: 60px;
				width: 120px;
				font-size: 14px;
				color: #333333;
				border: none;
				text-align: center;
				line-height:20px;
				background-color: white;
			}
			.Shopping_cat span{
				font-size: 24px;
			}
			.Shopping_cat_number{
				width: 16px;
				height: 16px;
				color: white;
				text-align: center;
				line-height: 15px;
				font-size: 14px;
				background-color: red;
				border-radius:7px 7px 7px 0;
				position: relative;
				left: -68px;
				top: -60px;
			}
			.up_navigation{
				width: 1130px;
				height: 80px;
				margin: 0px auto;
			}
			.up_navigation_a{
				width: 100px;
				height: 80px;
			}
			.up_navigation_css:hover{
				color: white;
				background-color: red;
			}
			.up_navigation_css:hover p{
				color: white;
			}
			.up_navigation_experience{
				width: 100px;
				height: 60px;
				border-left:2px solid black ;
				border-right:2px solid black ;
				
				position: relative;
				top:10px;
			}
			.up_navigation_experience1{
				width: 100px;
				height: 60px;
				border-left:0px solid black ;
				border-right:2px solid black ;
				display: block;
				position: relative;
				top: 10px;
			}
			.up_navigation_css{
				width: 95px;
				height: 80px;
				margin: 0 auto;
				position: relative;
				left: 2.2px;
				
				color: #000000;
				top: -10px;
				text-align: center;
				
				
			}
			.up_navigation_css .icon{
				width: 80px;
				font-size: 26px;
				color: #000000;
				text-align: center;
			}
			.up_navigation_css p{
				height:30px;
				width: 80px;
				position: relative;
				top: 10px;
				margin: 0 auto;
				
			}
			.up_navigation_css p img{
				height:30px;
				width: 80px;
			}
			.roll{
				width: 50px;
				height: 200px;
				z-index: 99999;
				position: fixed;
				top: 35%;
				right:0px;
				transition: all 0.6s;
			}
			.roll a{
				text-decoration: none;
				color: #000000;
			}
			.roll li{
				width: 50px;
				height: 50px;
				font-size: 26px;
				text-align: center;
				line-height: 50px;
				background-color: #CCCCCC;
				border: 1px solid white;
				padding-left:-40px;
			
			}
			.roll li:hover{
				background-color: red;
				color: white;
			}
			/* ----------------------------------------页眉---------------------------------- */
			
			
			
			
			/* ------------------------------------------页脚----------------------------------- */
		</style>
		
	</head>
	<body>
		<div class="up">
			<div class="up_top">
				<ul>
					<li class="fl top"><a href="login.jsp">登录</a>|<a href="register.jsp">注册</a>|<a href="#">帮助中心</a></li>
					<li class="fr top"><a>您好，欢迎来到幻视</a><a>客服热线: 8888-8888-8888</a><a href="#">在线客服<span class="icon"></span></a></li>
				</ul>
			</div>
			<div class="login">
				<div class="login_img fl">
				<img  src="img/goe_logo.png" />
				</div>
				<div>
				<select name="login_city" class="login_city fl">
					<option>请选择城市</option>
					<option>湖南</option>
					<option>湖北</option>
					<option>江苏</option>
					<option>上海</option>
				</select>
				</div>
				<div class="login_select fl">
					<div class="login_icon fl">
					<span class="icon"></span>
					</div>
					<div class="login_input fl" >
						<input type="text" name="select" id="login_text" value="输入商品关键词进行搜索" onfocus="if(value=='输入商品关键词进行搜索'){value=''}" onblur="if(value==''){value='输入商品关键词进行搜索'}" />
					</div>
					<div class="login_btn">
						<input type="button" name="select" id="login_btn" value="搜索" />
					</div>
					<div class="login_Popular">
						<ul>
							<li>
								热门搜索：<a href="#">镜框</a><a href="#">镜片</a><a href="#">太阳镜</a>
							</li>
						</ul>
					</div>
				</div>
				
				<div class="Shopping fr">
					<a href="#"><div class="Shopping_p fl">
						<p>体验店</p>
					</div></a>
					<a href="shoppingCat.jsp"><div class="Shopping_cat fr">
					<p><span class="icon"></span>我的购物车</p>
					</div>
					<div class="Shopping_cat_number fr">
						0
					</div></a>
				</div>
			</div>
	
		</div>
		<div class="up_navigation">
			
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience">
				<div class="up_navigation_css">
				<p><img src="img/goe_logo.png"></p>
				<p>体验店</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>首页</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="taiyangjing.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>太阳镜</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>试戴</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="jingkuang.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>镜框</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="jingpian.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>镜片</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>视光产品</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>特卖会</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>品牌馆</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>私人定制</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>资讯</p>
				</div>
			</div>
			</div>
		</a>
		</div>
		<div class="roll">
			<ul>
				<a href="index.jsp"><li></li></a>
				<a href="index.jsp"><li></li></a>
				<a href="index.jsp"><li></li></a>
				<a href="#"><li id="top"></li></a>
			</ul>
		</div>
		<script type="text/javascript">
			 $(function(){
			  $("#top").click(function() {
			    $("html,body").animate({scrollTop:0}, 500);
			  }); 
			  });
		</script>
		<div class="c-banner">
			<div class="banner">
				<ul>
					<li><img class="MiddleIMG" src="img/lunbo1.jpg"></li>
					<li><img class="MiddleIMG" src="img/lunbo2.jpg"></li>
					<li><img class="MiddleIMG" src="img/lunbo3.jpg"></li>
				</ul>
				<div class="nexImg ButtonHiding">
					<img src="img/nexImg.png" />
				</div>
				<div class="preImg ButtonHiding">
					<img src="img/preImg.png" />
				</div>
			</div>
			<div class="jumpBtn">
				<ul>
					<li jumpImg="0"></li>
					<li jumpImg="1"></li>
					<li jumpImg="2"></li>
				</ul>
			</div>
		</div>
		<!-- <script type="text/javascript">
			// $(".ButtonHiding").hide();
			// 		$(function(){
			// 			$(".banner").mouseover(function(){
			// 				$(".ButtonHiding").show(100);
			// 			}).mouseout(function(){
			// 				$(".ButtonHiding").hide(100);
			// 			});
			// 		});
		</script> -->
		
		<script type="text/javascript">
		//定时器返回值
		var time=null;
		//记录当前位子
		var nexImg = 0;
		//用于获取轮播图图片个数
		var imgLength = $(".c-banner .banner ul li").length;
		//当时动态数据的时候使用,上面那个删除
		// var imgLength =0;
		//设置底部第一个按钮样式
		$(".c-banner .jumpBtn ul li[jumpImg="+nexImg+"]").css("background-color","black");
		
		//页面加载
		$(document).ready(function(){
			// dynamicData();
			//启动定时器,设置时间为3秒一次
			time =setInterval(intervalImg,3000);
		});
		
		//点击上一张
		$(".preImg").click(function(){
			//清楚定时器
			clearInterval(time);
			var nowImg = nexImg;
			nexImg = nexImg-1;
			console.log(nexImg);
			if(nexImg<0){
				nexImg=imgLength-1;
			}
			//底部按钮样式设置
			$(".c-banner .jumpBtn ul li").css("background-color","white");
			$(".c-banner .jumpBtn ul li[jumpImg="+nexImg+"]").css("background-color","black");
			
			//将当前图片试用绝对定位,下一张图片试用相对定位
			$(".c-banner .banner ul img").eq(nowImg).css("position","absolute");
			$(".c-banner .banner ul img").eq(nexImg).css("position","relative");
			
			//轮播淡入淡出
			$(".c-banner .banner ul li").eq(nexImg).css("display","block");
			$(".c-banner .banner ul li").eq(nexImg).stop().animate({"opacity":1},1000);
			$(".c-banner .banner ul li").eq(nowImg).stop().animate({"opacity":0},1000,function(){
				$(".c-banner ul li").eq(nowImg).css("display","none");
			});
			
			//启动定时器,设置时间为3秒一次
			time =setInterval(intervalImg,3000);
		})
		
		//点击下一张
		$(".nexImg").click(function(){
			clearInterval(time);
			intervalImg();
			time =setInterval(intervalImg,3000);
		})
		
		//轮播图
		function intervalImg(){
			if(nexImg<imgLength-1){
				nexImg++;
			}else{
				nexImg=0;
			}
			//将当前图片试用绝对定位,下一张图片试用相对定位
			$(".c-banner .banner ul img").eq(nexImg-1).css("position","absolute");
			// $(".c-banner .banner ul img").eq(nexImg).css("position","relative");
			
			$(".c-banner .banner ul li").eq(nexImg).css("display","block");
			$(".c-banner .banner ul li").eq(nexImg).stop().animate({"opacity":1},1000);
			$(".c-banner .banner ul li").eq(nexImg-1).stop().animate({"opacity":0},1000,function(){
				$(".c-banner .banner ul li").eq(nexImg-1).css("display","none");
			});
			$(".c-banner .jumpBtn ul li").css("background-color","white");
			$(".c-banner .jumpBtn ul li[jumpImg="+nexImg+"]").css("background-color","black");
		}
		
		//轮播图底下按钮
		//动态数据加载的试用应放在请求成功后执行该代码,否则按钮无法使用
		$(".c-banner .jumpBtn ul li").each(function(){
			//为每个按钮定义点击事件
			$(this).click(function(){
				clearInterval(time);
				$(".c-banner .jumpBtn ul li").css("background-color","white");
				jumpImg = $(this).attr("jumpImg");
				if(jumpImg!=nexImg){
					var after =$(".c-banner .banner ul li").eq(jumpImg);
					var befor =$(".c-banner .banner ul li").eq(nexImg);
					
					//将当前图片试用绝对定位,下一张图片试用相对定位
					$(".c-banner .banner ul img").eq(nexImg).css("position","absolute");
					$(".c-banner .banner ul img").eq(jumpImg).css("position","relative");
					
					after.css("display","block");
					after.stop().animate({"opacity":1},1000);
					befor.stop().animate({"opacity":0},1000,function(){
						befor.css("display","none");
					});
					nexImg=jumpImg;
				}
				$(this).css("background-color","black");
				time =setInterval(intervalImg,3000);
			});
		});

		// 动态数据轮播图
		// 动态数据加载的时候不要直接点击demo.html运行否则可能请求不到本地json数据
		// function dynamicData(){
		// 	$.ajax({
		// 		url:"js/test.json",
		// 		type:"get",
		// 		dataType:"json",
		// 		success:function(data){
		// 			if(data.code==1){
		// 				var data = data.data;
		// 				$.each(data,function(i){
		// 					$(".c-banner .banner ul").append('<li><img src="'+this.img+'"></li>');
		// 					$(".c-banner .jumpBtn ul").append('<li jumpImg="'+i+'"></li>')
		// 				})
		// 			}
		// 			//获取图片总数量
		// 			imgLength = $(".c-banner .banner ul li").length;
		// 			//为底部按钮定义单击事件
		// 			$(".c-banner .jumpBtn ul li").each(function(){
		// 				//为每个按钮定义点击事件
		// 				$(this).click(function(){
		// 					clearInterval(time);
		// 					$(".c-banner .jumpBtn ul li").css("background-color","white");
		// 					jumpImg = $(this).attr("jumpImg");
		// 					if(jumpImg!=nexImg){
		// 						var after =$(".c-banner .banner ul li").eq(jumpImg);
		// 						var befor =$(".c-banner .banner ul li").eq(nexImg);
		// 						
		// 						//将当前图片试用绝对定位,下一张图片试用相对定位
		// 						$(".c-banner .banner ul img").eq(nexImg).css("position","absolute");
		// 						$(".c-banner .banner ul img").eq(jumpImg).css("position","relative");
		// 						
		// 						after.css("display","block");
		// 						after.stop().animate({"opacity":1},1000);
		// 						befor.stop().animate({"opacity":0},1000,function(){
		// 							befor.css("display","none");
		// 						});
		// 						nexImg=jumpImg;
		// 					}
		// 					$(this).css("background-color","black");
		// 					time =setInterval(intervalImg,3000);
		// 				});
		// 			});
		// 		}
		// 	})
		// }
		</script>
		
		<!-- ----------------------------------------------------页眉--------------------------------------------- -->
		<style type="text/css">
			.content{
				width: 1200px;
				height:auto;
				margin: 0 auto;
				}
			.content_exhibition{
				width: 1200px;
				height: 470px;
				margin: 25px auto;
			}
			.content_navigation{
				width: 1200px;
				height: 50px;
				background-color: #333;
			}
			.content_navigation_c1{
				height: 50px;
				width: 80px;
				background-color: white;
				color: #000000;
				margin-left: -40px;
				text-align: center;
				line-height: 50px;
			}
			.content_navigation_c1 span{
				color: #000000;
				font-size: 22px;
			}
			.content_navigation_c2{
				height: 50px;
				width: 70px;
				text-align: center;
				line-height: 50px;
			}
			.content_navigation li a{
				font-size: 14px;
				color: white;
				text-decoration: none;
			}
			.content_navigation_c2 a:hover{
				color: red;
				
			}
			
			.content_img_Small{
				overflow: hidden;
				border: none;
			}
			.navigation_img{
				transition: all 0.4s;
			}
			.navigation_img:hover{
				transform: scale(1.05);
				}
		</style>
		
		
		
		
		<div class="content">
			<div class="content_exhibition">
				<div class="content_navigation">
					<ul >
						<li class="content_navigation_c1 fl"><a href="#"><span class="content_navigation_span"> 太阳镜</span></a></li>
						<li class="content_navigation_c2 fl"><a href="#">男款</a></li>
						<li class="content_navigation_c2 fl"><a href="#">女款</a></li>
						<li class="content_navigation_c2 fl"><a href="#">通用款</a></li>
						<li class="content_navigation_c2 fl"><a href="#">儿童款</a></li>
					</ul>
				</div>
				<div class="content_img" >
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/T9LY4DNELD20180517095330.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/S8Y2CR8T5520180517095744.jpg"/>
					</div>
					<div class="content_img_Small">
						<img class="navigation_img" src="img/banner/HCQVTUCHXK20180517095911.jpg" style="height: 205px;width: 330px;"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/U9NA597TIJ20180517100239.jpg"/>
					</div>
					
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/KIQ2GCKSBU20180517100250.jpg" style="width: 280px;height: 205px;"/>
					</div>
					
					<div class="content_img_Small">
						<img class="navigation_img" src="img/banner/ET42C4HXQP20180517100259.JPG"/>
					</div>
				</div>
			</div>
			
			<div> <img src="img/banner/8XPM6L46YW20171107093953.jpg" ></div>
			<div class="content_exhibition">
				<div class="content_navigation">
					<ul >
						<li class="content_navigation_c1 fl"><a href="#"><span class="content_navigation_span"> 镜片</span></a></li>
						<li class="content_navigation_c2 fl"><a href="#">好视力</a></li>
						<li class="content_navigation_c2 fl"><a href="#">RAISE锐视</a></li>
						<li class="content_navigation_c2 fl"><a href="#">凯米</a></li>
						<li class="content_navigation_c2 fl"><a href="#">蔡司</a></li>
						<li class="content_navigation_c2 fl"><a href="#">舒曼</a></li>
					</ul>
				</div>
				<div class="content_img" >
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/UMNIA9J24B20160111170249.jpg"/>
						<div style="background-color: #333; height: 127px;">
							<table border="0" cellspacing="" cellpadding="4" style="margin: 0 auto;">
								<tr>
									<td><img src="img/banner/6SQQT86UAP20160111170918.jpg" /></td>
									<td><img src="img/banner/9L6Y4ZSV9A20160111170844.jpg" /></td>
								</tr>
								<tr>
									<td><img src="img/banner/CJUIVEPKM220160111170909.jpg" /></td>
									<td><img src="img/banner/ZQIQEGAJYZ20160111170855.jpg" /></td>
								</tr>
							</table>
							</div>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/QK77S2MB4B20160111170310.jpg" style="height: 428px;"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/img_zheshe.jpg"/>
					</div>
				</div>
			</div>
			
			<div class="content_exhibition">
				<div class="content_navigation">
					<ul >
						<li class="content_navigation_c1 fl"><a href="#"><span class="content_navigation_span"> 镜框</span></a></li>
						<li class="content_navigation_c2 fl"><a href="#">有</a></li>
						<li class="content_navigation_c2 fl"><a href="#">无</a></li>
					</ul>
				</div>
				<div class="content_img" >
					<div class="content_img_Small fr">
						<img class="navigation_img" src="img/banner/42Z65QRSLX20180517095014.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/NPHRHU7VQG20180517135244.jpg"/>
					</div>
					<div class="content_img_Small">
						<img class="navigation_img" src="img/banner/RW8GTVEMZN20180517135211.jpg" style="height: 205px;width: 530px;"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/DQUKMB2ASJ20180517135715.jpg"/>
					</div>
					
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/F8UC7VBRLE20180517135726.jpg" style="width: 280px;height: 205px;"/>
					</div>
					
					<div class="content_img_Small">
						<img class="navigation_img" src="img/banner/XEJ9TL6ME920180517135738.jpg"/>
					</div>
				</div>
			</div>
			<div><img src="img/banner/SKH3B86TEL20171107093837.jpg"></div>
			<div class="content_exhibition">
				<div class="content_navigation">
					<ul >
						<li class="content_navigation_c1 fl"><a href="#"><span class="content_navigation_span"> 雷朋眼镜</span></a></li>
						<li class="content_navigation_c2 fl"><a href="#">男款</a></li>
						<li class="content_navigation_c2 fl"><a href="#">女款</a></li>
						<li class="content_navigation_c2 fl"><a href="#">通用款</a></li>
					</ul>
				</div>
				<div class="content_img" >
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/LXNBABPTEC20161110162528.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/BVDZLGN6A820161110162554.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/UJ4NNM8U6G20161110162652.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/HBTHFJM97Y20161110162703.jpg"/>
					</div>
					
					<div class="content_img_Small ">
						<img class="navigation_img" src="img/banner/EICPRQN8YR20161110162710.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/XBHBU8LLF820161110162720.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/7XTEDWYT2J20161110162727.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/EUGV4E6X2X20161110162734.jpg"/>
					</div>
				</div>
			</div>
			
			<div class="content_exhibition">
				<div class="content_navigation">
					<ul >
						<li class="content_navigation_c1 fl" style="width: 140px;"><a href="#"><span class="content_navigation_span">大嘴猴眼镜</span></a></li>
						<li class="content_navigation_c2 fl"><a href="#">男款</a></li>
						<li class="content_navigation_c2 fl"><a href="#">女款</a></li>
						<li class="content_navigation_c2 fl"><a href="#">通用款</a></li>
					</ul>
				</div>
				<div class="content_img" >
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/X9Q93WMLNE20161110162853.jpg"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/DWTYKHZZ3P20161110162938.jpg"/>
					</div>
					<div class="content_img_Small">
						<img class="navigation_img" src="img/banner/DAHU55PF3G20161110162955.jpg" style="height: 205px;width: 330px;"/>
					</div>
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/DCY4732YT720161110163026.jpg"/>
					</div>
					
					<div class="content_img_Small fl">
						<img class="navigation_img" src="img/banner/J2SI5JX3LU20161110163033.jpg" style="width: 280px;height: 205px;"/>
					</div>
					
					<div class="content_img_Small">
						<img class="navigation_img" src="img/banner/XS6UEWWSM920161110163040.jpg"/>
					</div>
				</div>
			</div>

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		</div>


		<!-- ----------------------------------------------------------------------页脚--------------------- -->
		<style type="text/css">
			.footer{
				width: 1200px;
				height: 350px;
				margin: 0 auto;
			}
			.footer_Label{
				width: 1200px;
				height: 330px;
				margin: 0 auto;
			}
			.label_1{
				margin-top: 40px;
				width: 200px;
				height: 80px;
				border: 1px solid #A9A9A9;
			}
			.label{
				margin-left: 40px;
			}
			 .label_1 .icon{
				width: 55px;
				height: 80px;
				font-size: 34px;
				text-align: center;
				line-height: 80px;
				color: black;
			}
			.label_1 p{
				
			}
			.label_1 a{
				font-size: 12px;
			}
			.introduce{
				width: 200px;
			}
			.introduce ul{
				margin-top: 40px;
			}
			.introduce a{
				text-decoration: none;
				color: #333;
				font-size: 14px;
				line-height: 30px;
			}
			.introduce a:hover{
				color: red;
			}
			.footer_bottom{
				width: 100%;
				height: 100px;
				background-color: #000000;
			}
			.footer_bottom_a{
				text-align: center;
				color: white;
				line-height: 100px;
			}
			.footer_bottom_a a{
				text-decoration: none;
				color: white;
			}
		</style>
		<div style="clear:both;margin-top: 50px;">
		<hr />
		<div class="footer">
			<div class="footer_Label">
				<div class="fl">
				<div class="label_1 ">
					<div class="icon fl"></div>
					<p>正品保证</p>
					<a>正品真货,质量有保障</a>
				</div>
				<div class="introduce">
				<ul>
					<li>
						<p>售后服务</p>
						<hr />
					</li>
					<li><a href="#" >退换货说明</a></li>
					<li><a href="#" >投诉建议</a></li>
				</ul>
				</div>
				</div>
				
				
				<div class="fl label">
				<div class="label_1">
					<div class="icon fl"></div>
					<p>闪电发货</p>
					<a>急速物流，急速送达</a>
				</div>
				<div class="introduce">
				<ul>
					<li>
						<p>关于Vision</p>
						<hr />
					</li>
					<li><a href="#" >公司简介</a></li>
					<li><a href="#" >联系客服</a></li>
					<li><a href="#" >免责申明</a></li>
				</ul>
				</div>
				</div>
				
				<div class="fl label">
				<div class="label_1">
					<div class="icon fl"></div>
					<p>优惠不断</p>
					<a>天天低价畅选无忧</a>
				</div>
				<div class="introduce">
				<ul>
					<li>
						<p>新手指南</p>
						<hr />
					</li>
					<li><a href="#" >购物流程</a></li>
					<li><a href="#" >会员特权</a></li>
					<li><a href="#" >常见问题</a></li>
					<li><a href="#" >Vision返卷说明</a></li>
				</ul>
				</div>
				</div>
				
				<div class="fl label">
				<div class="label_1">
					<div class="icon fl"></div>
					<p>售后无忧</p>
					<a>30天随心退换货服务</a>
				</div>
				<div class="introduce">
				<ul>
					<li>
						<p>配镜指南</p>
						<hr />
					</li>
					<li><a href="#" >读懂验光单</a></li>
					<li><a href="#" >眼镜学堂</a></li>
					<li><a href="#" >配镜流程</a></li>
				</ul>
				</div>
				</div>
				
				<div class="fl label">
				<div class="label_1">
					<div class="icon fl"></div>
					<p>门店体验</p>
					<a>多家体验门店为您贴心服务</a>
				</div>
				<div class="introduce">
				<ul>
					<li>
						<p>支付与配送</p>
						<hr />
					</li>
					<li><a href="#" >支付方式</a></li>
					<li><a href="#" >配送时效</a></li>
				</ul>
				</div>
				</div>				
			</div>
		</div>
		<div class="footer_bottom">
			<div class="footer_bottom_a">
				<p>
				Copyright © 2019 某科技公司 All Rights Reserved.<a href="#">粤ICP备15082294号-1</a>
				</p>
			</div>
			
			
		</div>
		</div>
		
	</body>
</html>