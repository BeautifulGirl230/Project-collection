package ��װ;

//��װ  ����˽�л�
public class Student {


	 		String stuNo;
	private String stuName;		//private ��װ ����  ˽�л�
	private int age;		//private ��װ ����  ˽�л�
	private char sex;		//private ��װ ����  ˽�л�
	
	

	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	// ���� //��Ա���� //����ķ��������ǿ��Բ�����������Ե�
	// ����ķ��� ��Ŀ�ľ�������������Ա����
	public void showStudentInfo() {

		System.out.println("ѧ�ţ�" + stuNo + ";" + "������" + stuName + ";" + "���䣺" + age + ";" + "�Ա�:" + sex);
	}
}
