<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				height:1200px;
				margin: 0 auto;
			
			
			
			
			
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
		
		<a href="index.jsp">
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
		
		<a href="index.jsp">
			<div class="up_navigation_a  fl">
			<div class="up_navigation_experience1 fl">
				<div class="up_navigation_css">
				<p class="icon"></p>
				<p>镜框</p>
				</div>
			</div>
			</div>
		</a>
		
		<a href="index.jsp">
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
				height: 1000px;
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
				height: 720px;
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
				margin-left: 25%;
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
				<a href="index.jsp"><img src="img/product/ZJMSSL3KYF20160831090929.jpg" />
				<p>好视力1.553球面单光绿晶膜树脂镜片2267</p>
				</a>
				<b>￥99.00</b><em>￥199.00</em>
				</div>
				</div>
				
				<div class="remai_div">
				<div class="remai_a">
				<a href="index.jsp"><img src="img/product/BKX3IJ2N8V20170320105620.jpg" />
				<p>RAISE锐视1.555非球面单光绿钻膜树脂镜片2284</p>
				</a>
				<b>￥99.00</b><em>￥199.00</em>
				</div>
				</div>
				
				<div class="remai_div">
				<div class="remai_a">
				<a href="index.jsp"><img src="img/product/5Z777RRGRT20160831090825.jpg" />
				<p>好视力1.553非球面单光绿晶膜树脂镜片2270</p>
				</a>
				<b>￥149.00</b><em>￥199.00</em>
				</div>
				</div>
				<br />
				<br />
				<p>——— 热卖产品 ———</p>
				<div class="remai_div">
				<div class="remai_a">
				<a href="index.jsp"><img src="img/product/KFIFIR8RA820160612161930.JPG" />
				<p>Levis利惠时尚通用款全框板材镜框LS06258</p>
				</a>
				<b>￥798.00</b><em>￥1099.00</em>
				</div>
				</div>
				</div>
				
				
				
				<div class="content_shopping fr">
					<div style="width: 950px;height: 330px;" >
					
					<p><div class="Middle_Link">当前位置：
											<a class="Middle_a HomePage" href="index.jsp">首页 &nbsp;></a>
											<a class="Middle_a Login_Middle" href="镜片.jsp">镜片</a>
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
							<li class="fl ul_top" style="margin-right: 20px;">功能</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">染色</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">变色</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">抗蓝光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">抗疲劳</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">渐进</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">偏光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">非球面单光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">球面单光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">青少年渐进</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">内渐进</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">类型</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">球面单光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">双光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">渐进</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">抗疲劳镜片</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">防蓝光镜片</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">变色镜片</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">非球面单光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">双非球面单光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">底非球面单光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">单光</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">渐进</a></li>
						</ul>
						 
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">材质</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">树脂</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">玻璃</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">PC</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">宇宙PC</a></li>
						</ul>

						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">颜色</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">染色</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">变色</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">透明</a></li>
							<li class="fl">|</li>
							<li class="fl"><a href="#">单色</a></li>
						</ul>
						
						<ul class="content_shopping_ul_a fl">
							<li class="fl ul_top" style="margin-right: 20px;">品牌</li>
							<li class="fl">>&nbsp;<a href="#" style="color: red;">全部</a></li>
							<li class="fl"><img src="img/brand/EQRJKP7IJE20160811143217.png"></li>
							<li class="fl"><img src="img/brand/DR58KXC34M20160801111003.png"></li>
							<li class="fl"><img src="img/brand/L6G2VUY56N20160826144504.png"></li>
							<li class="fl"><img src="img/brand/RUFMA5L3ZA20161020101626.png"></li>
							<li class="fl"><img src="img/brand/R9KIVLP7W620170930162615.jpg"></li>
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
					
					
				
			<!-- 以下是数据库的展示部分 -->
			<div class="content_shopping_img">
				<c:forEach items="${Goodslist }" var="goods"> 
					<div class="fl" style="height:300px;width: 220px;">	
						<a href="DetailsServlet?goods_id=${goods.goods_id }" style="margin-left:7px; margin_right:7px;">
							<div class="content_shopping_img_a">
							<img class="img_d" src="${ goods.imgurl}" >
							<p><img class="img_x" src="${ goods.imgurl}" ></p>
							<span>${goods.goods_name}</span><br />
							<b>${goods.price}</b> <em class="fr">${goods.price}</em>
							</div>
							</div>	
							
						</a>
						</c:forEach>
			
						<!-- img/product/YJNV3QEFHG20170601112250.jpg 地址格式 -->
					
			    	</div>
					<div class="content_btn">
					<a href="" class="yema"> 上一页</a>
					<a href="GoodsServlet?pageNo=1" class="yema"> 1</a>
					<a href="GoodsServlet?pageNo=2" class="yema"> 2</a>
					<a href="#" class="yema"> 3</a>
					<a href="#" class="yema"> 4</a>
					<a href="#" class="yema"> 5</a>
					<a href="#" class="yema"> 下一页</a>
					
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
				margin-left: -40px;
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
		
		
	</body>
</html>