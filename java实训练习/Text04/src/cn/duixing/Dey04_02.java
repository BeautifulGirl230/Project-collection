package cn.duixing;

public class Dey04_02 {

	public static void main(String[] args) {
		Student stu = null;
		stu = new Student();
		
		Student stu1 = new Student();
		stu1.stuNo = "002";
		stu1.stuName = "ÍõÎå";
		stu1.age = 19;
		stu1.sex = 'ÄĞ';
		
		stu.showStudentInfo();
		stu1.showStudentInfo();
	}

}
