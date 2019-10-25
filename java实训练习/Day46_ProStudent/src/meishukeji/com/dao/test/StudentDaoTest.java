package meishukeji.com.dao.test;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import meishukeji.com.common.ManagerConnection;
import meishukeji.com.dao.IStudentDao;
import meishukeji.com.dao.imp.StudentDao;
import meishukeji.com.pojo.Student;

public class StudentDaoTest {

	public static void main(String[] args) {
		
		Connection conn=ManagerConnection.getConn();
        IStudentDao dao=new StudentDao(conn);
      
        
        //得到学生的测试
       List<Student> list = dao.getStudentAll();
       for (Student student : list) {
		System.out.println(student);
	}
 //-------------------------
//     Student stu=  dao.getStudentByStudentId("00009");
//     if(stu!=null)
//     {
//     System.out.println(stu.toString());
//     }else
//     {
//    	 System.out.println("查不到");
//     }
//________________________________________________________       
       
//        List<Student> list = dao.getStudentBySql("select stuid from student");
//      for (Student student : list) {
//		System.out.println(student);
//	}
     
  //-----------------------------------------------------------
//      Student stu=new Student("00009", "wx", new Date(), "男", "sdf@d.com", "苏州");
//     if( dao.insertStudent(stu))
//     {
//    	 System.out.println("insert ok");
//     }else
//     {
//    	 
//    	 System.out.println("insert ng");
//     }
//      
//    
  //------------------------------------------------------------------------
//      if(  dao.deleteStudentByStuid("00009"))
//      { System.out.println("delete ok");
//    }else
//    {
//   	 
//   	 System.out.println("delete ng");
//    }
//   
        
        //---------------------------------------------
        
        Student stu=  dao.getStudentByStudentId("00004");
      if(stu!=null)
      {
      System.out.println(stu.toString());
            stu.setStuName("feng");
            stu.setStuSex("女");
            dao.updateStudentByStudent(stu);
            stu=  dao.getStudentByStudentId("00004");   
            System.out.println(stu.toString());
      }else
      {
     	 System.out.println("查不到");
      }
//        
        
        
        ManagerConnection.closeConn(conn);
 
	}

}
