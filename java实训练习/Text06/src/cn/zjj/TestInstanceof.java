package cn.zjj;

public class TestInstanceof {
	public static void main(String[] args) {
		Student stu = new Student("����", 19, "java");
		Person p = new Person();
		TestInstanceof test = new TestInstanceof();
		if(p instanceof Person){
			System.out.println("p������Person��Ķ���");
		}
		if(stu instanceof Person){
			System.out.println("stu������Person��Ķ���");
			test.method(stu);
			Teacher t = new Teacher();
			test.method(t);
		}
	}
	public void method(Person p){	//�����Ĳ������ڶ����ʱ���ܸ���� ���࣬����ԭ��
		
	}

}
