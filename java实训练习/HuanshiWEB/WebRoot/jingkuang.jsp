<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<script type="text/javascript" src='js/jquery-3.4.1.min.js'></script>
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
				cursor: pointer;
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
			.content{
				width: 1200px;
				height:auto;
				margin: 0px auto;
				
			
			
			
			
			
			/* ------------------------------------------页脚----------------------------------- */
		</style>
		
	</head>
	<body>
		<div class="up">
			<div class="up_top">
				<ul>
					<li class="fl top"><a href="login.html">登录</a>|<a href="register.html">注册</a>|<a href="#">帮助中心</a></li>
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
					<a href="#"><div class="Shopping_cat fr">
					<p><span class="icon"></span>我的购物车</p>
					</div>
					<div class="Shopping_cat_number fr">
						0
					</div></a>
				</div>
			</div>
	
		</div>
		<div class="up_navigation">
			
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience">
				<div class="up_navigation_css">
				<p><img src="img/goe_logo.png"></p>
				<p>体验店</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>首页</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>太阳镜</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>试戴</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>镜框</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>镜片</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>视光产品</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>特卖会</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>品牌馆</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>私人定制</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.html">
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
				<a href="index.html"><li></li></a>
				<a href="index.html"><li></li></a>
				<a href="index.html"><li></li></a>
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
		<!-- ----------------------------------------------------页眉--------------------------------------------- -->
		<style type="text/css">
			.remai{
				width: 200px;
				height: 1000px;
				text-align: center;
			}
			.remai a{
				text-decoration: none;
			}
			.remai_div{
				border-bottom: 1px dashed #999;
				margin-bottom: 20px;
			}
			.remai_a{
				width: 180px;
				height: 200px;
				margin: 0px auto;
				text-align: left;
				
			}
			.remai_a img{
				width: 180px;
				height: 130px;
			}
			.remai_a p{
				font-size: 12px;
				color:#333333;
				margin-bottom: 7px;
			}
			.remai_a b{
				color: red;
				font-size: 14px;
			}
			.remai_a em{
				text-decoration: line-through;
				font-size: 12px;
				color:#999;
			}
			.content_shopping{
				width: 950px;
				height:auto;
			}
			.content_shopping p{
				text-align: left;
				font-size: 14px;
			}
			.Middle_Link a{
				text-decoration: none;
				font-size: 16px;
				color: #000;
			}
			.content_shopping_navigation{
				
			}
			.content_shopping_ul_a{
				font-size: 12px;
				margin-bottom: 1px;
				 clear:left;
			}
			.content_shopping_ul_a a{
				text-decoration: none;
				color: #666;
			}
			.content_shopping_ul_a a:hover{
				color: red;
			}
			.content_shopping_ul_a li{
				margin-left: 5px;
				margin-right: 5px;
			}
			.content_shopping_ul_a img{
				width: 114px;
				height: 46px;
				border: 1px solid #ccc;
			}
			.content_input{
				border: 1px solid #CCCCCC;
				position: relative;
				right: -470px;
			}
			.content_selest{
				height: 30px;
				width: 200px;
				border: none;
				outline:none;
				font-size: 16px;
			}
			.content_selest_btn{
				height:35px;
				width: 50px;
				border: none;
				cursor: pointer;
				color: white;
				background-color: black;
			}
			.content_shopping_img{
				width: 950px;
				height: auto;
				margin-top: 40px;
			}
			.content_shopping_img a{
				text-decoration: none;
				}
			.content_shopping_img_a{
				width:220px ;
				height: 300px;
			}
			.img_d{
				width:200px ;
				height: 150px;
				margin-left: 10px;
			}
			.img_x{
				width:40px ;
				height: 30px;
				margin-top: 5px;
			}
			.content_shopping_img_a p{
				width: 50px;
				height: 40px;
				text-align: center;
				border: 1px solid #000000;
			}
			.content_shopping_img_a span{
				font-size: 14px;
				color: #666;
			}
			.content_shopping_img_a  b{
				color: red;
			}
			.content_shopping_img_a em{
				text-decoration: line-through;
				color: #666;
			}
			.content_btn{
				width: 950px;
				height: 60px;
				clear:both;
				position: relative;
				top:30px;
				margin-left: 40%;
			}
			.yema{
				padding: 3px 10px;
				border: 1px solid #D8D8D8;
				text-decoration: none;
				color: #333;
				margin-right: 5px;
			}
		</style>
		<div class="content">
			<div class="remai fl">
				<p>——— 热卖产品 ———</p>
				<div class="remai_div">
				<div class="remai_a">
				<a href="index.html"><img src="img/product/KFIFIR8RA820160612161930.JPG" />
				<p>Levis利惠时尚通用款全框板材镜框LS06258</p>
				</a>
				<b>￥598.00</b><em>￥598.00</em>
				</div>
				</div>
				
				<div class="remai_div">
				<div class="remai_a">
				<a href="index.html"><img src="img/product/SKLLU3RQUD20160612162659.JPG" />
				<p>Levis利惠时尚通用款全框板材镜框LS06378</p>
				</a>
				<b>￥199.00</b><em>￥199.00</em>
				</div>
				</div>
				
				<div class="remai_div">
				<div class="remai_a">
				<a href="index.html"><img src="img/product/2X4NDNH2AX20160622103151.jpg" />
				<p>RARIM派丽蒙时尚通用款圆形偏光太阳镜PR7920</p>
				</a>
				<b>￥598.00</b><em>￥598.00</em>
				</div>
				</div>
				<br />
				<br />
				<p>——— 新品上市 ———</p>
				<div class="remai_div">
				<div class="remai_a">
				<a href="index.html"><img src="img/product/KFIFIR8RA820160612161930.JPG" />
				<p>Levis利惠时尚通用款全框板材镜框LS06258</p>
				</a>
				<b>￥798.00</b><em>￥1099.00</em>
				</div>
				</div>
				</div>
				
				
				
				<div class="content_shopping fr">
					<div style="width: 950px;height: 450px;" >
					
					<p><div class="Middle_Link">当前位置：
											<a class="Middle_a HomePage" href="index.html">首页 &nbsp;></a>
											<a class="Middle_a Login_Middle" href="镜片.html">镜片</a>
										</div></p>
					<div class="content_shopping_navigation">
						<p>已选：</p>
						<hr />
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">价格</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">99以下</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">100—199元</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">200-299元</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">300-399元</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">400-599元</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">600-1000元</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">1000元以上</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">款式</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">男款</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">女款</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">通用款</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">儿童款</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">材质</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">金属</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">混合</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">板材</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">框型</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">圆形</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">椭圆形</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">方形</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">方圆</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">多边形</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">内三角(蛤蟆)</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">外三角(蝶形)</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">边框</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">全框</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">半框</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">无框</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">鼻梁</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">单梁</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">双梁</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">产品功能</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">偏光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">非偏光</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">鼻托</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">有</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">无</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">品牌</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl"><a href="#"><img src="img/brand/TZWT22VNV820180614111421.png"></a></li>
							<li class="fl"><a href="#"><img src="img/brand/H2Y6AAHXIX20160801110154.png"></a></li>
							<li class="fl"><a href="#"><img src="img/brand/KL8QENQRKQ20160801110916.png"></a></li>
							<li class="fl"><a href="#"><img src="img/brand/F3GB2MAHAA20160801105857.png"></a></li>
							<li class="fl" style="border: 1px solid #CCCCCC;"><a href="#" style="position: relative;top: -2px;">更多<span style="font-size: 18px;position: relative;top: 4px;"></span> </a></li>
							<li class="fl" style="height: 20px;width: 40px; border: 1px solid #CCCCCC;"><a href="#">+多选</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl" style="margin-top: 40px;">
							<li class="fl ul_top" style="margin-right: 20px;">默认顺序</li>
							
							<li class="fl"><a href="#">价格</a></li>
							
							<li class="fl"><a href="#">销量</a></li>
							
							<li class="fl"><a href="#">好评数</a></li>
							<li class="fr content_input">
								<input type="text" name="sousuo" class="content_selest" id="content_selest" value="输入商品关键词进行搜索" onfocus="if(value=='输入商品关键词进行搜索'){value=''}" onblur="if(value==''){value='输入商品关键词进行搜索'}" />
								<input type="button" name="select" class="content_selest_btn" id="content_selest_btn" value="搜索" />
							</li>
						</ul>
					</div>
					</div>
					
					<div class="content_shopping_img">
						

						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/JMNLLQHN6220160406093703.JPG" >
							<p><img class="img_x" src="img/sku/JMNLLQHN6220160406093703.JPG" ></p>
							<span>巴西队时尚通用款全框TR90镜框B-99019</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥299.00</b> <em class="fr">￥299.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/K9BW24CAHU20160401182938.JPG" >
							<p><img class="img_x" src="img/sku/K9BW24CAHU20160401182938.JPG" ></p>
							<span >巴西队时尚通用款全框TR90镜框B-99006</span>
							<div style="height: 50px;line-height: 50px;"><b>￥299.00</b> <em class="fr">￥299.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/Q6NJY6UIY920160406094446.JPG" >
							<p><img class="img_x" src="img/sku/Q6NJY6UIY920160406094446.JPG" ></p>
							<span>巴西队时尚通用款全框TR90镜框B-99026</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥299.00</b> <em class="fr">￥299.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/VSTPF2JAY620160401180346.JPG" >
							<p><img class="img_x" src="img/sku/VSTPF2JAY620160401180346.JPG" ></p>
							<span>巴西队时尚通用款全框TR90镜框B-99001</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥299.00</b> <em class="fr">￥299.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/AR6F92GFIV20180514112605.JPG" >
							<p><img class="img_x" src="img/sku/AR6F92GFIV20180514112605.JPG" ></p>
							<span>金狐狸金属时尚通用款全框金属镜框5606</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥399.00</b> <em class="fr">￥399.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/N9GJGCTUF420181107102953.JPG" >
							<p><img class="img_x" src="img/sku/N9GJGCTUF420181107102953.JPG" ></p>
							<span>金狐狸金属时尚通用款全框金属镜框5006</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥399.00</b> <em class="fr">￥399.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/LC6IN8S8MY20180514110741.JPG" >
							<p><img class="img_x" src="img/sku/LC6IN8S8MY20180514110741.JPG" ></p>
							<span>金狐狸复古时尚通用款半框金属镜框2117</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥399.00</b> <em class="fr">￥399.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/Z9SGJJWD4D20180514111053.JPG" >
							<p><img class="img_x" src="img/sku/Z9SGJJWD4D20180514111053.JPG" ></p>
							<span>金狐狸复古时尚通用款半框金属镜框2106</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥399.00</b> <em class="fr">￥399.00</em></div>
							</div>
						</a>
						
						<a href="#"class="fl" style="margin-left: 30px; margin-right: 30px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="img/sku/S42S2QPUGW20180724093226.JPG" >
							<p><img class="img_x" src="img/sku/S42S2QPUGW20180724093226.JPG" ></p>
							<span>偶像时尚通用款全框板材镜框1387</span><br />
							<div style="height: 50px;line-height: 50px;"><b>￥499.00</b> <em class="fr">￥499.00</em></div>
							</div>
						</a>
						
						
					</div>
				</div>
		</div>
		<div class="content_btn">
		<a href="#" class="yema"> 上一页</a>
		<a href="#" class="yema"> 1</a>
		<a href="#" class="yema"> 2</a>
		<a href="#" class="yema"> 3</a>
		<a href="#" class="yema"> 4</a>
		<a href="#" class="yema"> 5</a>
		<a href="#" class="yema"> 下一页</a>
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
