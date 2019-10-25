package cn.zjj.db;

import java.util.Scanner;

public class Dey02_Text02 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("输入成绩：");
		int j = 0;
		int i = sr.nextInt();
		if(i>=0&&i<=100){
		switch (j=i/10) {
			case 10:
			case 9:
				System.out.println("等级为A");
				break;
			case 8:
				System.out.println("等级为B");
				break;
			case 7:
				System.out.println("等级为C");
				break;
			case 6:
				System.out.println("等级为D");
				break;
			default:
				System.out.println("等级为E");
				break;
				}	
			}else{
			System.out.println("您输入的成绩无效，请重新输入！");
		}
	}

}
