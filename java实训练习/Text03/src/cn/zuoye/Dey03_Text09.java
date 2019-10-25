package cn.zuoye;

import java.util.Scanner;

public class Dey03_Text09 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("请输入0~100的数:");
		int fs = sr.nextInt();
		if(fs<39&&fs>0){
			System.out.println("您的分数为E！");
		}else if(fs<=59&&fs>=39){
			System.out.println("您的分数为D！");
		}else if(fs<=69&&fs>=59){
			System.out.println("您的分数为C！");
		}else if(fs<=79&&fs>=69){
			System.out.println("您的分数为B！");
		}else if(fs<=100&&fs>=79){
			System.out.println("您的分数为A！");
		}else{
			System.out.println("您输入的分数无效");
		}
	}

}
