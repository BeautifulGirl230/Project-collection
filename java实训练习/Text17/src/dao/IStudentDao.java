package dao;

import java.util.List;

import meishukeji.com.dao.pojo.Student;

/**
 * 这是用来定义学生操作的所有方法
 * @author Snake
 *
 */
public interface IStudentDao {
	/**
	 *@return 得到所有的学生
	 */
	public List<Student> getStudenAll();
	/**
	 * 根据传入的对象，得到一个学生对象
	 * @param stuid 传入的学号
	 * @return 学生对象
	 */
	public Student getStudentByStudentId(String stuid);
	/**
	 * 根据传入的sql语句，得到所有学生对象
	 * @param Sql 查询的sql语句
	 * @return 根据传入的sql语句，得到所有学生对象
	 */
	public List<Student> getStudentBySql(String sql);
	/**
	 * 将传入的学生对象，添加到数据库
	 * @param stu 学生对象
	 * @return true 表示添加成功， false 表示添加失败
	 */
	public boolean insertStudent(Student stu);
	/**
	 *  完成对传入学号的学生进行删除
	 * @param stuid  传入学号
	 * @return   true 表示添加成功，false表示添加失败
	 */
	public boolean deleteStudentByStuid(String stuid);
	/**
	 * 将传入的学生对像进行更新  ，它根据传入对像的id主健来，也就是stuid
	 * @param stu 学生对像
	 * @return
	 */
	public boolean updateStudentByStudent(Student stu);
}
