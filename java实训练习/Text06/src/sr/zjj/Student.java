package sr.zjj;

public class Student extends Person {
	private String course;

	public void info() {
		super.info();	//调用父类的中的info方法
		System.out.println(course);
	}
}
