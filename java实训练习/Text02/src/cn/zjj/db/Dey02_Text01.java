package cn.zjj.db;

import java.util.Scanner;

public class Dey02_Text01 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("输入这个月的利润：");
		double lirun = sr.nextDouble();
		double sum = 0;
		if(lirun<=100000){
			sum=lirun*0.1;
			System.out.println("总金额为："+sum);
		}else{
			if(lirun<=200000){
				sum=(lirun-100000)*0.075;
				System.out.println("总金额为："+sum);
			}else{
				if(lirun<=400000){
					sum = (lirun-200000)*0.05;
					System.out.println("总金额为："+sum);
				}else{
					if(lirun<=600000){
						sum=(lirun-400000)*0.03;
						System.out.println("总金额为："+sum);
					}else{
						if(lirun<=1000000){
							sum=(lirun-600000)*0.15;
							System.out.println("总金额为："+sum);
						}else{
							if(lirun<=1000000){
								sum=lirun*0.1;
								System.out.println("总金额为："+sum);
							}
						}
					}
				}
			}
		}
	}
}
