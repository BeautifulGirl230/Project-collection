package cn.zjj.db;

import java.util.Scanner;

public class Dey02_Text05 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		double i = sr.nextDouble();
		if (i % 2 == 0) {
			System.out.println(i + "为偶数");
		} else {
			System.out.println(i + "为奇数");
		}
	}
}
