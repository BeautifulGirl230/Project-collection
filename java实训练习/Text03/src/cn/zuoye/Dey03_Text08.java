package cn.zuoye;

import java.util.Calendar;
import java.util.Scanner;

public class Dey03_Text08 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("���������:");
		int year = sr.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}

}
