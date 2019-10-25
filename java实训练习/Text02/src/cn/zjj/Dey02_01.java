package cn.zjj;

public class Dey02_01 {
	//定义一个全局变量
	public	String name01 = "欧阳";
	
	public static void main(String[] args) {
		
		//创建一个对象
		Dey02_01 dey01 = new Dey02_01();
		//创建一个对象
		Dey02 dey = new Dey02();
		dey.name = "欧阳";
		dey01.holleWord();
		System.out.println(dey.name);
	}
	//构建一个方法 首字母小写
	public void holleWord(){
		
		//定义一个局部变量
		String name02 = "世界";
		System.out.println("Holle"+name02);
	}
}
