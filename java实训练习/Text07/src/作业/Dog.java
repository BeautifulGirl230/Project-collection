package ��ҵ;

import cn.db.PCI;

public class Dog extends GetSet implements PCIGetSet {
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void foot() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void sayHello(int mood) {
		System.out.println("��ʾ:	��ţȮ����ҡ��ҡβ��\n");

	}

	@Override
	public void setMood(int mood2) {
		System.out.println("��ʾ:	��������ţȮ�����ĵĶ��������У�ֻ��չ���ҧ��һ�ڣ���\n");
		
	}
	
	@Override
	public void foot(int mood3) {
		System.out.println("��ʾ:	��Ѷ�ţȮ��ס�˷������ص�������������˵��զ���ñ���������\n");
		
	}
	
	@Override
	public void sayHello2(int mood) {
		System.out.println("��ʾ:	���è��������~�Ľ�������\n");

	}

	@Override
	public void setMood2(int mood2) {
		System.out.println("��ʾ:	���������è�������˹��๾��������\n");
		
	}
	
	@Override
	public void foot2(int mood3) {
		System.out.println("��ʾ:	������è��ס�˷���˻˻�����������ƺ���ʱ׼����������צ��������\n");
		
	}
	
	@Override
	public void sayHello3(int mood) {
		System.out.println("��ʾ:	�����ڰ������ɵĽ�.......\n");

	}

	@Override
	public void setMood3(int mood2) {
		System.out.println("��ʾ:	û�з�Ӧ�����ƺ���������.......\n");
		
	}
	
	@Override
	public void foot3(int mood3) {
		System.out.println("��ʾ:	��ͨ��������������ܸ����ˡ�����������\n");
		
	}
	
}
