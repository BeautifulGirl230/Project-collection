package mejshukeji.com.biz;

import java.util.List;

import meishukeji.com.pojo.Student;

public interface IStudnetBiz {
	
	public List<Student> getAll();
	
	public boolean add(Student stu);
	
	public Student getStuBStudent(String stuId);
	
	public boolean udpate(Student stu);
	
	public boolean delete(String stuId);
}
