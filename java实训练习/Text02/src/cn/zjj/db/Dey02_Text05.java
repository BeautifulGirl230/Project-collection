package cn.zjj.db;

import java.util.Scanner;

public class Dey02_Text05 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("������һ��������");
		double i = sr.nextDouble();
		if (i % 2 == 0) {
			System.out.println(i + "Ϊż��");
		} else {
			System.out.println(i + "Ϊ����");
		}
	}
}
