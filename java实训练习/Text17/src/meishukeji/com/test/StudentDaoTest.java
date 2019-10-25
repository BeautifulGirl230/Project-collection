package meishukeji.com.test;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import dao.IStudentDao;
import meishukeji.com.common.MyCOnnection;
import meishukeji.com.dao.imp.StudentDao;
import meishukeji.com.dao.pojo.Student;

public class StudentDaoTest {
	public static void main(String[] args) {
		Connection conn = MyCOnnection.getConn();
		IStudentDao dao = new StudentDao(conn);
		
		
		
		List<Student>list = dao.getStudenAll();
		for(Student student:list){
			System.out.println(student);
		}
//------------------------查询---------------------------
//		Student stu = dao.getStudentByStudentId("00006");
//		if(stu!=null){
//			System.out.println(stu.toString());
//		}else{
//			System.out.println("查不到");
//		}
//----------------------------------------------------	
//		List<Student>list = dao.getStudentBySql("select STUID from student");
//		for(Student student:list){
//			System.out.println(student);
//		}
//--------------------添加--------------------------------
//		Student stu = new Student("00007", "发的说法", new Date(), "女", "sdfd@d.com", "苏州");
//		if(dao.insertStudent(stu)){
//			System.out.println("insert ok");
//		}else{
//			System.out.println("insert ng");
//		}
//---------------------删除-------------------------------
//		if(dao.deleteStudentByStuid("00007")){
//			System.out.println("insert ok");
//		}else{
//				System.out.println("insert ng");
//			}
//----------------------修改------------------------------
//		Student stu = dao.getStudentByStudentId("00004");
//		if(stu!=null){
//			System.out.println(stu.toString());
//			stu.setStuName("艾薇贝尔");
//			stu.setStuSex("女");
//			dao.updateStudentByStudent(stu);
//			stu = dao.getStudentByStudentId("00004");
//			System.out.println(stu.toString());
//		}else{
//			System.out.println("查不到");
//		}
		
		
		
		MyCOnnection.closeConn(conn);
	}

}
