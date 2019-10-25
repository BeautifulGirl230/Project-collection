package Day01_11¼¯ºÏHashSet;

import java.util.HashSet;


public class TestStudentHashCodeDemo {

	public static void main(String[] args) {
		Student stu5 = new Student("abc",15);
		Student stu1 = new Student("a",12);
		Student stu2 = new Student("b",13);
		Student stu3 = new Student("c",14);
		Student stu4 = new Student("d",15);
		HashSet<Student> set = new HashSet<Student>();
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		System.out.println(set.size());
		
	}

}
