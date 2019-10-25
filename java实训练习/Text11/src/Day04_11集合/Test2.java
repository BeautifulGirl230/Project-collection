package Day04_11¼¯ºÏ;

import java.util.List;
import java.util.Vector;

public class Test2 {
	public static void main(String[] args) {
		List<Student> list = getStudentAll();
		method(list);
	}
	
	public static List<Student> getStudentAll() {
		Student stu1 = new Student("a",12);
		Student stu2 = new Student("b",13);
		Student stu3 = new Student("c",14);
		Student stu4 = new Student("d",15);
		Student stu5 = new Student("e",16);
		
		Vector<Student> arrayList = new Vector<Student>();
		arrayList.add(stu1);
		arrayList.add(stu2);
		arrayList.add(stu3);
		arrayList.add(stu4);
		arrayList.add(stu5);
		return arrayList;
	}
	
	public static void method(List<Student> list){
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
