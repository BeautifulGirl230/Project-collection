package cn.zjj;

public class Dey02_01 {
	//����һ��ȫ�ֱ���
	public	String name01 = "ŷ��";
	
	public static void main(String[] args) {
		
		//����һ������
		Dey02_01 dey01 = new Dey02_01();
		//����һ������
		Dey02 dey = new Dey02();
		dey.name = "ŷ��";
		dey01.holleWord();
		System.out.println(dey.name);
	}
	//����һ������ ����ĸСд
	public void holleWord(){
		
		//����һ���ֲ�����
		String name02 = "����";
		System.out.println("Holle"+name02);
	}
}
