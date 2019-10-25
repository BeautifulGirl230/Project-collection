package 封装;

//封装  属性私有化
public class Student {


	 		String stuNo;
	private String stuName;		//private 封装 隐藏  私有化
	private int age;		//private 封装 隐藏  私有化
	private char sex;		//private 封装 隐藏  私有化
	
	

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


	// 方法 //成员方法 //对像的方法，它是可以操作对像的属性的
	// 对像的方法 其目的就是用来操作成员属性
	public void showStudentInfo() {

		System.out.println("学号：" + stuNo + ";" + "姓名：" + stuName + ";" + "年龄：" + age + ";" + "性别:" + sex);
	}
}
