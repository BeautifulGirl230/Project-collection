package cn.zjj;

public class Dey07_01 {
	static String name;
	int age;
	static final  String buru="����";	//final��ֵ������֮�󲻿������޸�
	
	static {
		 //buru = "����";
		 name = "��ʤ��";
	}
	
	static {
		System.out.println("���������ʱ����");
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
