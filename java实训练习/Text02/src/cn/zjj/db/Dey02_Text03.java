package cn.zjj.db;

import java.util.Scanner;

public class Dey02_Text03 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("請輸入X:");
		int x = sr.nextInt();
		System.out.print("請輸入y:");
		int y = sr.nextInt();
		if(x>y){
			System.out.println(x+"大于"+y);
		}else{
			System.out.println(y+"大于"+x);
		}
	}
}
