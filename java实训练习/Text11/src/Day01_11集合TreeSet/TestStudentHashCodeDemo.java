package Day01_11����TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TestStudentHashCodeDemo {

	public static void main(String[] args) {
		Student stu5 = new Student("sdf",16);
		Student stu1 = new Student("a",12);
		Student stu2 = new Student("b",13);
		Student stu3 = new Student("c",14);
		Student stu4 = new Student("d",15);
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(stu1);
		treeSet.add(stu2);
		treeSet.add(stu3);
		treeSet.add(stu4);
		treeSet.add(stu5);
		
		System.out.println(treeSet.size());
		
		for(Student student:treeSet){
			System.out.println(student);
		}
		//ʹ�õ��������set�ı���
		Iterator<Student> it = treeSet.iterator();
		//�Ƿ���Ԫ�أ����з���true  ,û�з���false
		while(it.hasNext()){
			//ȡ����ǰָ��ָ���Ԫ��
			Student stu = it.next();
			System.out.println(stu);
		}
	}

}
