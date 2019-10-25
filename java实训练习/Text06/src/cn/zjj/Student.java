package cn.zjj;

public class Student extends Person{
	private String course;	// ¿Î³Ì

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(String name,int age,String course){
		super(name,age);
		this.course = course;
	}

	public Student(String name,int age) {
		super(name,age);
	}
	


	@Override
	public String toString() {
		return super.toString()+"Student [course=" + course + "]";
	}
	
}
