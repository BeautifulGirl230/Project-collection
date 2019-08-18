function lintName(){
	document.getElementById("point").style.display="none";
	document.getElementById("point1").style.display="none";
	document.getElementById("game2").style.display="none";
}
function TncherName(show,hidden){
	document.getElementById(show).style.display="block";
	document.getElementById(hidden).style.display="none";
	
	document.getElementById(show+"1").style.display="block";
	document.getElementById(show+"2").style.display="none";
	
	document.getElementById(hidden+"1").style.display="none";
	document.getElementById(hidden+"2").style.display="block";
}