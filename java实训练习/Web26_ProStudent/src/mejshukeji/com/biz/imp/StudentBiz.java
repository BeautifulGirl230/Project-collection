package mejshukeji.com.biz.imp;

import java.util.List;

import meishukeji.com.dao.IStudentDao;
import meishukeji.com.pojo.Student;
import mejshukeji.com.biz.IStudnetBiz;

public class StudentBiz implements IStudnetBiz {
	private IStudentDao dao;
	
	public StudentBiz() {
		super();
	}

	public StudentBiz(IStudentDao dao) {
		super();
		this.dao = dao;
	}

	public IStudentDao getDao() {
		return dao;
	}

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Student stu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStuBStudent(String stuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean udpate(Student stu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String stuId) {
		// TODO Auto-generated method stub
		return false;
	}

}
