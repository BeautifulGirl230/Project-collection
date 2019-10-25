package cn.zjj;

public class TestInstanceof {
	public static void main(String[] args) {
		Student stu = new Student("张三", 19, "java");
		Person p = new Person();
		TestInstanceof test = new TestInstanceof();
		if(p instanceof Person){
			System.out.println("p对象是Person类的对象");
		}
		if(stu instanceof Person){
			System.out.println("stu对象是Person类的对象");
			test.method(stu);
			Teacher t = new Teacher();
			test.method(t);
		}
	}
	public void method(Person p){	//方法的参数，在定义的时，能父类就 父类，开闭原则
		
	}

}
