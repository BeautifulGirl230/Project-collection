<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
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
		<!-- ----------------------------------------------------页眉--------------------------------------------- -->
		<div class="content">
			<style type="text/css">
									body{margin: 0px;padding: 0px;}
									.Middle{width:1240px; height: 500px; margin: 0 auto; padding: 20px 0px 60px 0px; /* background-color: #46AD38; */}
									.Middle_a{font-size: 15px;}
									.Middle_Link{width: 1200px;}
									.HomePage{padding-left: 50px; color: #000000; text-decoration: none;}
									.Login_Middle{color: #A7A7A7; text-decoration: none;}
									.Middle_color{width: 1000px; height: 450px; background-color: #ECECEC; margin: 0 auto;padding-top: 10px;}
									.Middle_login{width: 980px; height: 440px; background-color: #FEFEFE; margin: 0 auto;}
									#Login{padding-top: 45px;margin-left: 160px;}
									#Login_Text{font-family: "微软雅黑";}
									#Middle_Name_password{margin-left: 80px; float: left;}
									#Name{padding: 5px 5px 5px 5px;width: 250px;height: 25px;}
									#Pwd{padding: 5px 5px 5px 5px;width: 250px;height: 25px;}
									.mouse-cursor-gradient-tracking {
										position: relative;
										background: red;
										padding: 0.5rem 1rem;
										font-size: 1rem;
										border: none;
										color: white;
										cursor: pointer;
										outline: none;
										overflow: hidden;
										margin-left: 55px;
										width: 250px;
										border-radius: 25px;
									}
									.mouse-cursor-gradient-tracking span {position: relative;}
									.mouse-cursor-gradient-tracking::before {
										--size: 0;
										content: '';
										position: absolute;
										left: var(--x);
										top: var(--y);
										width: var(--size);
										height: var(--size);
										background: radial-gradient(circle closest-side, pink, transparent);
										transform: translate(-50%, -50%);
										/* transition: width 0.2s ease, height 0.2s ease;    延迟 */ 
									}
									.mouse-cursor-gradient-tracking:hover::before {--size: 150px;}
									#Middle_Hui{color: #A7A7A7;font-size: 12px;margin-left: 80px;}
									#Middle_Register{text-decoration: none;color: red;font-size: 12px;}
									#ForgetPassword{text-decoration: none;color: #02639A;font-size: 12px;margin-left: 55px;}
									.Middle_Name_Text{font-size: 14px;}
									.Middle_Tips{font-size: 13px;margin-left: 50px;color: red;height: 6px;}
									#Middle_Login_Left{width: 400px;float: left;}
									#Middle_Img{float: right; width: 468px;}
									.Middle_Name_div{height: 25px;}
									#Middle_Login_div{margin-top: 25px;}
									.Middle_Top{margin-top: 25px;}
									.Black{border: 2px solid #000000;padding: 5px 5px 5px 5px;width: 250px;height: 25px;}
									.Black2{border: 2px solid #CCCCCC;padding: 5px 5px 5px 5px;width: 250px;height: 25px;}
									.Middle_checkbox{margin-left: 55px;border-radius: 100%;background: #ddd;position: relative;-webkit-box-shadow: 0px 1px 2px rgba(0,0,0,0.2);-moz-box-shadow: 0px 1px 2px rgba(0,0,0,0.2);box-shadow: 0px 1px 2px rgba(0,0,0,0.2);}
								</style>
							</head>
							<body>
								<div class="Middle">
									<div class="Middle_Link">
										<a class="Middle_a HomePage" href="#">首页 &nbsp;></a>
										<a class="Middle_a Login_Middle" href="login.jsp">登录</a>
									</div>
									<div class="Middle">
										<div class="Middle_color">
											<div class="Middle_login">
												<div id="Middle_Login_Left">
													<div id="Login">
														<h2 id="Login_Text">欢迎登录goe视界</h2>
													</div>
													
													<!-- form 表单 -->
													<form action="LoginServlet" method="post">
													<div id="Middle_Name_password">
														<p>
															<div class="Middle_Name_div">
																<span class="Middle_Name_Text">账号：</span>
																<input type="text" class="userName" name="userName" id="Name" placeholder="请输入账号" onfocus="AccountName(this)" onblur="AccountName2(this)" onmousemove="this.className='Black'" onmouseout="this.className='Black2'" />
															</div>
														</p>
														<p>
															<div class="Middle_Tips">
																<span id="USER">
																	
																</span>
															</div>
														</p>
														<p>
															<div class="Middle_Name_div">
																<span class="Middle_Name_Text">密码：</span>
																<input type="password" class="password" name="password" id="Pwd" placeholder="6-16个英文字母或数字" onfocus="AccountPwd(this)" onblur="AccountPwd2(this)" onmousemove="this.className='Black'" onmouseout="this.className='Black2'" />								
															</div>
														</p>
														<p>
															<div class="Middle_Tips">
																<span id="PASSWORD">
																	
																</span>
															</div>
														</p>
														<p>
															<div class="Middle_Login_div Middle_Top">
																<samp>
																	<button class="mouse-cursor-gradient-tracking" onclick="sNameCheck()">
																		<span>登录</span>
																	</button>
																</samp>
															</div>
														</p>
														<p>
															<div class="Middle_checkbox_div Middle_Top">
																<input type="checkbox" class="Middle_checkbox" />
																<span>一天内免登录</span>
															</div>
														</p>
														<p>
															<div class="Middle_Text Middle_Top">
																<span>
																	<a id="ForgetPassword" href="#">忘记密码？</a>
																</span>
																<span>
																	<a id="Middle_Hui">还不是会员？</a><a id="Middle_Register" href="#">去注册</a>
																</span>
															</div>
														</p>
													</div>
													<!-- form 表单  结束 -->
													</form>
												</div>
												<img id="Middle_Img" src="img/GBEUMHLJLI20160405221020.png" />
											</div>
										</div>
									</div>
								</div>
								
								<script type="text/javascript">
									function AccountName(zh){
										if(zh.id == "Name"){
											if (zh.placeholder == '请输入账号'){
												zh.placeholder="";
												zh.className = 'userName';
											}else{
												zh.className = 'userName';
											}
										}
									}
									function AccountName2(zh){
										if(zh.id == "Name"){
											if(zh.placeholder == ""){
												zh.placeholder = "请输入账号"
												zh.className = 'userName';
											}else if(zh.className != '请输入账号'){
												zh.className = 'userName'
											}
										}
									}
									function AccountPwd(mm){
										if(mm.id == "Pwd"){
											if (mm.placeholder == '6-16个英文字母或数字'){
												mm.placeholder = "";
												mm.className = 'password';
											}else{
												mm.className = 'password';
											}
										}
									}
									function AccountPwd2(mm){
										if(mm.id == "Pwd"){
											if (mm.placeholder == ''){
												mm.placeholder = "6-16个英文字母或数字";
												mm.className = 'password';
											}else if(mm.password != '6-16个英文字母或数字'){
												mm.className = 'password';
											}
										}
									}
									function sNameCheck(){
										var userName = document.getElementById("Name").value;
										var password = document.getElementById("Pwd").value;
										var Text1 = document.getElementById("USER");
										var Text2 = document.getElementById("PASSWORD");
										if(userName == ""){
											Text1.innerHTML = "<a>账号的输入不正确，请重新输入；</a>"
										}
										if(password == ""){
											Text2.innerHTML = "<a>密码的输入不正确，请重新输入；</a>"
										}
									}
								</script>
								<script type="text/javascript">
									var btn = document.querySelector('.mouse-cursor-gradient-tracking')
									btn.onmousemove = function(e) {
										var x = e.pageX - btn.offsetLeft - btn.offsetParent.offsetLeft
										var y = e.pageY - btn.offsetTop - btn.offsetParent.offsetTop
										btn.style.setProperty('--x', x + 'px')
										btn.style.setProperty('--y', y + 'px')
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