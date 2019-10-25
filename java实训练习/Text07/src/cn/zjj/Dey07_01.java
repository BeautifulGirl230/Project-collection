package cn.zjj;

public class Dey07_01 {
	static String name;
	int age;
	static final  String buru="哺乳";	//final的值，设置之后不可以在修改
	
	static {
		 //buru = "哺乳";
		 name = "张胜男";
	}
	
	static {
		System.out.println("它在类加载时调用");
	}
	
	public Dey07_01(){
		this.age = 18;
	}
	
	public void show(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(buru);
	}
	public static void StudentStatic(){
		System.out.println(name);
		System.out.println(Dey07_01.buru);
	}
}
