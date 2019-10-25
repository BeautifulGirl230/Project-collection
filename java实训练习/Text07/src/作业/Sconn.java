package 作业;

import java.util.Scanner;

public class Sconn {
	
	public static void main(String[] args) {
		GetSet getset = new Dog();
		//Dog2 dog2 = new Dog2();
		run();
	}
	
	public static void run() {
		Scanner sr = new Scanner(System.in);
		System.out.println("请选择：  1-斗牛犬    2-缅甸猫    3-对猫和狗不敢兴趣，四处逛逛");
		int a = sr.nextInt();
		if (a == 1 && a == 2 && a == 3) {
		} else if (a == 1) {
			Sconn sn = new Sconn();
			sn.turSing();
		} else if (a == 2) {
			Sconn sn2 = new Sconn();
			sn2.turCat();
		} else if (a == 3) {
			Sconn sn3 = new Sconn();
			sn3.qingwa();
		}
	}
	
	
	public void turSing() {
		GetSet getset = new Dog();
		Sconn sn = new Sconn();
		System.out.println("您已选择斗牛犬：");
		while (true) {
			Scanner sr1 = new Scanner(System.in);
			System.out.println("请选择：1-跟它打招呼。  2-抚摸它的狗头。  3-吓唬它。 4-重新选择动物。  0-退出。");
			int gou = sr1.nextInt();
			if (gou == 1) {
				getset.sayHello(gou);
			} else if (gou == 2) {
				getset.setMood(gou);
			} else if (gou == 3) {
				getset.foot(gou);
			} else if (gou == 4) {
				sn.run();
			}else if(gou == 0){
				System.out.println("拜拜！！！");
				System.exit(0);	//exit(0) 终止循环
			} else {
				System.out.println("您的输入有误请重新选择：\n");
			}
		}
	}
	
	public void turCat(){
		GetSet getset = new Dog();
		Sconn sn = new Sconn();
		System.out.println("您已选择缅甸猫：");
		while (true) {
			Scanner sr1 = new Scanner(System.in);
			System.out.println("请选择：1-跟它打招呼。  2-抚摸它。  3-吓唬它。 4-重新选择动物。  0-退出。");
			int Cat = sr1.nextInt();
			if (Cat == 1) {
				getset.sayHello2(Cat);
			} else if (Cat == 2) {
				getset.setMood2(Cat);
			} else if (Cat == 3) {
				getset.foot2(Cat);
			} else if (Cat == 4) {
				sn.run();
			}else if(Cat == 0){
				System.out.println("拜拜！！！");
				System.exit(0);	//exit(0) 终止循环
			} else {
				System.out.println("您的输入有误请重新选择：\n");
			}
		}
		
	}
	
	public void qingwa(){
		GetSet getset = new Dog();
		Sconn sn = new Sconn();
		System.out.println("您已选择沼泽：");
		while (true) {
			Scanner sr1 = new Scanner(System.in);
			System.out.println("请选择：1-似乎听见什么？？？  2-大声喊叫吓唬它！！！  3-跑过去。 4-走出沼泽。  0-回家。");
			int Cat = sr1.nextInt();
			if (Cat == 1) {
				getset.sayHello3(Cat);
			} else if (Cat == 2) {
				getset.setMood3(Cat);
			} else if (Cat == 3) {
				getset.foot3(Cat);
			} else if (Cat == 4) {
				sn.run();
			}else if(Cat == 0){
				System.out.println("拜拜！！！");
				System.exit(0);	//exit(0) 终止循环
			} else {
				System.out.println("您的输入有误请重新选择：\n");
			}
		}
	}
}
