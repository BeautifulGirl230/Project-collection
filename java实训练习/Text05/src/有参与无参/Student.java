package 有参与无参;

public class Student {

	String stuNo;
	String stuName;
	int age;
	char sex;

	// 系统自己加一个无参的构造方法
	// 构造方法怎么写？
	// 1.方法名和类同名
	// 2.方法没有返回值 ，也没有void修饰
	// 为什么要有构造方法,构造方法是用来做什么的？
	// 它是用来对属性再一次赋值
	// 无参的构造方法,系统自己加，什么时候 系统不会帮我加呢？
	// 当你写了有参数的构造方法时，系统不会在帮你加无参构造方法。
	// 无参的构造方法，很多时候都会用来，尤其是后边的框架技术，会大量调用无参构造
	// 当你写了有参构造方法时，你最好自己在添加一个无参构造
	public Student() {

	}

	/**
	 * 
	 * @param id
	 *            学号
	 * @param name
	 *            姓名
	 * @param a
	 *            年龄
	 * @param s
	 *            性别
	 */
	public Student(String id, String name, int a, char s) {
		this.stuNo = id;
		this.stuName = name;
		this.age = a;
		this.sex = s;
	}

	// 方法 //成员方法 //对象方法，用来操作对象属性
	public void Student() {

	}

	// 方法 //成员方法 //对像的方法，它是可以操作对像的属性的
	// 对像的方法 其目的就是用来操作成员属性
	public void showStudentInfo() {

		System.out.println("学号：" + stuNo + ";" + "姓名：" + stuName + ";" + "年龄：" + age + ";" + "性别:" + sex);
	}
}
