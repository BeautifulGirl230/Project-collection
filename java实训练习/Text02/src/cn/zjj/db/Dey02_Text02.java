package cn.zjj.db;

import java.util.Scanner;

public class Dey02_Text02 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("����ɼ���");
		int j = 0;
		int i = sr.nextInt();
		if(i>=0&&i<=100){
		switch (j=i/10) {
			case 10:
			case 9:
				System.out.println("�ȼ�ΪA");
				break;
			case 8:
				System.out.println("�ȼ�ΪB");
				break;
			case 7:
				System.out.println("�ȼ�ΪC");
				break;
			case 6:
				System.out.println("�ȼ�ΪD");
				break;
			default:
				System.out.println("�ȼ�ΪE");
				break;
				}	
			}else{
			System.out.println("������ĳɼ���Ч�����������룡");
		}
	}

}
