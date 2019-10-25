package cn.duixing;

public class Dey04_01 {

	public static void main(String[] args) {
		Student stu = new Student();
		Student stu1 = new Student();
		Student stu2 = new Student();

		stu.stuName = "ÕÅÈı";
		stu.stuNo = "001";
		stu.age = 18;
		stu.sex = 'ÄĞ';
		stu.showStudentInfo();
		
		stu1.showStudentInfo();
	}

}
