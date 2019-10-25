package cn.zjj;

import java.util.Scanner;
//Myjava 类名标识符  单词首字母必须大写
public class Dey02 {

		//类的成员变量   对象的变量  全局变量
		public String name = "王伟峰";
		/*
		*  main   方法标识符 首字母小写
		*/
		public static void main(String[] args) {
			
			//局部变量
			String name01 = "王伟峰";
			System.out.println("请选择：1 - 2 - 3:");
			Scanner sa = new Scanner(System.in);
			
			//str  变量标识符首字母小写	
			String str  = sa.next();
			System.out.println("您已选择");
		}
		
		//常量标识符  全部大写
		double PI = 3.1415;
		
		/*
		 * textName  方法标识符首字母小写
		 * 类的成员方法  对象的方法 
		 * 成员方法，它是用来操作类的成员属性
		 * */
		public void textName(){
			
			//  对象首字母小写
			Dey02 stuName = new Dey02();
			
			//局部变量
			String name02 = "王伟峰";
		} 
	}

