package sr.zjj;

public class Student extends Person {
	private String course;

	public void info() {
		super.info();	//���ø�����е�info����
		System.out.println(course);
	}
}
