package �в����޲�;

public class Student {

	String stuNo;
	String stuName;
	int age;
	char sex;

	// ϵͳ�Լ���һ���޲εĹ��췽��
	// ���췽����ôд��
	// 1.����������ͬ��
	// 2.����û�з���ֵ ��Ҳû��void����
	// ΪʲôҪ�й��췽��,���췽����������ʲô�ģ�
	// ����������������һ�θ�ֵ
	// �޲εĹ��췽��,ϵͳ�Լ��ӣ�ʲôʱ�� ϵͳ������Ҽ��أ�
	// ����д���в����Ĺ��췽��ʱ��ϵͳ�����ڰ�����޲ι��췽����
	// �޲εĹ��췽�����ܶ�ʱ�򶼻������������Ǻ�ߵĿ�ܼ���������������޲ι���
	// ����д���вι��췽��ʱ��������Լ������һ���޲ι���
	public Student() {

	}

	/**
	 * 
	 * @param id
	 *            ѧ��
	 * @param name
	 *            ����
	 * @param a
	 *            ����
	 * @param s
	 *            �Ա�
	 */
	public Student(String id, String name, int a, char s) {
		this.stuNo = id;
		this.stuName = name;
		this.age = a;
		this.sex = s;
	}

	// ���� //��Ա���� //���󷽷�������������������
	public void Student() {

	}

	// ���� //��Ա���� //����ķ��������ǿ��Բ�����������Ե�
	// ����ķ��� ��Ŀ�ľ�������������Ա����
	public void showStudentInfo() {

		System.out.println("ѧ�ţ�" + stuNo + ";" + "������" + stuName + ";" + "���䣺" + age + ";" + "�Ա�:" + sex);
	}
}
