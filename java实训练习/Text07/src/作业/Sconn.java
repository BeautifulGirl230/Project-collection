package ��ҵ;

import java.util.Scanner;

public class Sconn {
	
	public static void main(String[] args) {
		GetSet getset = new Dog();
		//Dog2 dog2 = new Dog2();
		run();
	}
	
	public static void run() {
		Scanner sr = new Scanner(System.in);
		System.out.println("��ѡ��  1-��ţȮ    2-���è    3-��è�͹�������Ȥ���Ĵ����");
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
		System.out.println("����ѡ��ţȮ��");
		while (true) {
			Scanner sr1 = new Scanner(System.in);
			System.out.println("��ѡ��1-�������к���  2-�������Ĺ�ͷ��  3-�Ż����� 4-����ѡ���  0-�˳���");
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
				System.out.println("�ݰݣ�����");
				System.exit(0);	//exit(0) ��ֹѭ��
			} else {
				System.out.println("������������������ѡ��\n");
			}
		}
	}
	
	public void turCat(){
		GetSet getset = new Dog();
		Sconn sn = new Sconn();
		System.out.println("����ѡ�����è��");
		while (true) {
			Scanner sr1 = new Scanner(System.in);
			System.out.println("��ѡ��1-�������к���  2-��������  3-�Ż����� 4-����ѡ���  0-�˳���");
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
				System.out.println("�ݰݣ�����");
				System.exit(0);	//exit(0) ��ֹѭ��
			} else {
				System.out.println("������������������ѡ��\n");
			}
		}
		
	}
	
	public void qingwa(){
		GetSet getset = new Dog();
		Sconn sn = new Sconn();
		System.out.println("����ѡ������");
		while (true) {
			Scanner sr1 = new Scanner(System.in);
			System.out.println("��ѡ��1-�ƺ�����ʲô������  2-���������Ż���������  3-�ܹ�ȥ�� 4-�߳�����  0-�ؼҡ�");
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
				System.out.println("�ݰݣ�����");
				System.exit(0);	//exit(0) ��ֹѭ��
			} else {
				System.out.println("������������������ѡ��\n");
			}
		}
	}
}
