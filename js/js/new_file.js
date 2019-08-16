for(var i = 1; i<=9; i++){
		for(var j=1; j<=i; j++){
			document.write(i+"*"+j+"="+(i*j)+"&nbsp;&nbsp;");
		}
		document.write("<br/>");
	}
	
	function lintlmage(){
		document.getElementById("mobile").style.display="none";
		document.getElementById("mobile2").style.display="none";
		document.getElementById("game1").style.display="none";
	}
	function TabChange(show,hidden){
		document.getElementById(show).style.display="block";
		document.getElementById(hidden).style.display="none";
		
		document.getElementById(show+"1").style.display="none";
		document.getElementById(show+"2").style.display="block";
		
		document.getElementById(hidden+"1").style.display="block";
		document.getElementById(hidden+"2").style.display="none";
	}