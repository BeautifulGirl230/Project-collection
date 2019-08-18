function sNameCheck(){
	var oUname = document.getElementById("sname").value;
	var oPass = document.getElementById("password").value;
	var a = /^[a-zA-Z0-9_-]+$/i;
	var oError = document.getElementById("error_box");
	var oError1 = document.getElementById("error_box1");
	// if(a.test(oUname)){
	// 	
	// }else{
	// 	 oError.innerHTML = "<a style='color: red;'>您输入的用户名有误！</a>"
	// }
	// if(oPass.length==0){
	// 	oError1.innerHTML = "<a style='color: red;'>密码不能为空！</a>"
	// }else if(oPass.length < 6){
	// 	oError1.innerHTML = "<a style='color: red;'>密码至少6位。</a>"
	// }
	if(oUname=="Snake" && oPass=="123456"){
	alert("登录成功！");
	window.document.userlogin.action="index.html";
	window.document.userlogin.submit();
	} 
	if(oUname!=="Snake"){
		alert("您输入的用户名无效！");
		oError.innerHTML = "<a style='color: red;'>您输入的用户名有误！</a>"		 
	}
	if(oPass.length==0){
		oError1.innerHTML = "<a style='color: red;'>密码不能为空！</a>"
	}else if(oPass.length < 6){
		oError1.innerHTML = "<a style='color: red;'>密码至少6位。</a>"
	}else if(oPass!=="123456"){
		alert("您输入的密码有误请重新输入！");
		oError1.innerHTML = "<a style='color: red;'>密码错误！</a>"
	}
}
