package Day01_11����Set�ӿ�;

import java.util.HashSet;
import java.util.Set;

public class StuSet02 {
	
	public static void main(String[] args) {
		Student s1=new Student("");
		Student s2=new Student("");
		Student s3 = new Student("�Ǻǹ���");
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set.size());
		set.remove(s1);
		System.out.println(set.size());
		System.out.println(set.contains(s3));
		
	}
}
