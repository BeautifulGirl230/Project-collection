package meishukeji.com.biz.imp;

import java.util.List;

import meishukeji.com.biz.IStudentBiz;
import meishukeji.com.dao.IStudentDao;
import meishukeji.com.pojo.Student;

public class StudentBiz implements IStudentBiz {
      private IStudentDao  dao;
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
		return  dao.getStudentAll();
	}

	@Override
	public boolean add(Student stu) {
		// TODO Auto-generated method stub
		return dao.insertStudent(stu);
	}

	@Override
	public Student getStuById(String stuId) {
		// TODO Auto-generated method stub
		return dao.getStudentByStudentId(stuId);
	}

	@Override
	public boolean udpate(Student stu) {
		// TODO Auto-generated method stub
		return dao.updateStudentByStudent(stu);
	}

	@Override
	public boolean delete(String stuId) {
		// TODO Auto-generated method stub
		return dao.deleteStudentByStuid(stuId);
	}

}
