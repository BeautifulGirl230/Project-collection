package cn.zuoye;

import java.util.Scanner;

public class Dey03_Text09 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("������0~100����:");
		int fs = sr.nextInt();
		if(fs<39&&fs>0){
			System.out.println("���ķ���ΪE��");
		}else if(fs<=59&&fs>=39){
			System.out.println("���ķ���ΪD��");
		}else if(fs<=69&&fs>=59){
			System.out.println("���ķ���ΪC��");
		}else if(fs<=79&&fs>=69){
			System.out.println("���ķ���ΪB��");
		}else if(fs<=100&&fs>=79){
			System.out.println("���ķ���ΪA��");
		}else{
			System.out.println("������ķ�����Ч");
		}
	}

}
