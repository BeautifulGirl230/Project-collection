function stuRegister(){
	var a = /^[a-zA-Z0-9_-]+$/i;
	var re = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/i; 
	var name = document.getElementById("name").value;
	var stuName = document.getElementById("stuName").value;
	var userName = document.getElementById("userName").value;
	var passWord= document.getElementById("password").value;
	var passWord2= document.getElementById("password2").value;
	var Emali= document.getElementById("emali").value;
	
	if(name==""){
		alert("请在文本框输入您的名字！");
		return false;
	}else if(stuName==""){
		alert("请在文本框输入您的姓氏！");
		return false;
	}else if(a.test(userName) == false){
		alert("您输入的登录名有误，请重新输入！");
		return false;
	}else if (passWord.length == "") {
		alert("密码不能为空!");
		return false;
	}else if (passWord.length < 6) {
		alert("密码至少包含 6 个字符!");
		return false;
	}else if (passWord2.length == "") {
		alert("密码不能为空!");
		return false;
	}else if(passWord2!==passWord){
		alert("您的两次密码不相同!");
		return false;
	}else if (Emali.length == "") {
		alert("邮箱不能为空!");
		return false;
	}else if(re.test(Emali) == false){
		alert("您输入的邮箱格式有误！");
		return false;
	}else{
		return true;
	}
}