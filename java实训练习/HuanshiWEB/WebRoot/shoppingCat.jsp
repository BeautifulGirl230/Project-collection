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
				left: -40px;
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
			.Middle_Link a{
				text-decoration: none;
				font-size: 16px;
				color: #999;
			}
			.process{
				width: 500px;
				height: 60px;
			}
			.process_a{
				width: 60px;
				height: 60px;
				text-align: center;
				
			}
			.process_b{
				width: 98px;
				height: 60px;
				margin-left:138px ;
				text-align: center;
				
			}
			.process_c{
				width: 98px;
				height: 60px;
				text-align: center;
				
			}
			.process_a_img{
				width: 35px;
				height: 35px;
				background:url(img/process1.png)no-repeat;
				background-size: 35px 35px;
				margin: 0px auto;
				color: white;
				font-size: 16px;
				line-height: 35px;
				
			}
			.process_b_img{
				width: 35px;
				height: 35px;
				background:url(img/process2.png)no-repeat;
				background-size: 35px 35px;
				margin: 0px auto;
				color: white;
				font-size: 16px;
				line-height: 35px;
				
			}
			.process_a_text{
				font-size: 12px;
				line-height: 20px;
				color: #333;
			}
			.henxian{
				width: 450px;
				height: 5px;
				background-color: #ddd;
				position: relative;
				top: 15px;
				left: 20px;
				z-index: -1;
			}
			.Shopping_table{
				width: 1200px;
				height: auto;
				
			}
			.Shopping_tb{
				width: 1200px;
				background-color:#e6f5ff;
				text-align: center;
			}
			.Shopping_table_yc{
				width: 1200px;
				height: 200px;
				background-color: #fffbef;
				border: 1px solid #ddd;
				text-align: center;
				margin-top: 20px;
			}
			.Shopping_table_yc p{
				font-size: 28px;
				line-height: 80px;
			}
			.Shopping_table_yc input{
				 width: 120px;
				 height: 40px;
				 border: none;
				 background-color: red;
				 font-size: 18px;
				 color: white;
			}
		</style>
	
		<div class="content">
			<div style="width: 1200px;height: 100px;">
			<p><div class="Middle_Link">当前位置：
									<a class="Middle_a HomePage" href="index.jsp">首页</a> &nbsp;>
									<a class="Middle_a Login_Middle" href="镜片.jsp">镜片</a>
								</div></p>
			<div class="process fr">
				<div class="process_a fl">
					<div class="process_a_img">1</div>
					<div class="process_a_text">我的购物车</div>
				</div>
				<div class="process_b fl">
					<div class="process_b_img">2</div>
					<div class="process_a_text">填写核对订单信息</div>
				</div>
				<div class="process_c fr">
					<div class="process_b_img">3</div>
					<div class="process_a_text">订单提交成功</div>
				</div>
				<div class="henxian"></div>
			</div>
			</div>
			
			
			<div class="Shopping_table">
				<table border="0" class="Shopping_tb">
					<tr>
						<td>
							<input type="checkbox" name="shopping_ck"  onclick="changeSelect(this)"/>全选
						</td>
						<td>
							商品
						</td>
						<td>
							单价
						</td>
						<td>
							数量
						</td>
						<td>
							小计（元）
						</td>
						<td>
							操作
						</td>
					</tr>
					
				</table>
				<div class="Shopping_table_yc">
					<p>您的购物车暂时没有商品，赶紧行动吧！您可以:</p>
					<a href="index.jsp"><input type="button" value="挑选商品" /></a>
				</div>
				
			</div>
			<script>
				function changeSelect(obj){
					var v=document.getElementsByTagName("input"); //g根据标签来获得所有元素
					
					for (var i = 0; i < v.length; i++) {
						if(v[i].name=="shopping_ck")//判断input元素name是否为no
						v[i].checked=obj.checked;
					}
				}
				
			</script>
			<script>
				if ($('table tr').length > 1) {
					$('.Shopping_table_yc').hide();
				} else {
					$('.Shopping_table_yc').show();
				}
			</script>
			
			
			
			
			
			
			
			
			
			
			
			
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