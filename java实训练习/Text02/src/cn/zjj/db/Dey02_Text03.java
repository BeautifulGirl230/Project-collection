package cn.zjj.db;

import java.util.Scanner;

public class Dey02_Text03 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("Ոݔ��X:");
		int x = sr.nextInt();
		System.out.print("Ոݔ��y:");
		int y = sr.nextInt();
		if(x>y){
			System.out.println(x+"����"+y);
		}else{
			System.out.println(y+"����"+x);
		}
	}
}
