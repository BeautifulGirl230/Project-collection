package Connectio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Student> list = Test2.getStudentAll();
		for(Student student:list){
		System.out.println(student);
		}
		}
	/**
	 * 
	 * @return  返回学生表中所有的学生信息
	 */
		public static ArrayList<Student>getStudentAll(){
			ArrayList<Student>list = new ArrayList<Student>();
			
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Snake","snake");
			PreparedStatement pre = conn.prepareStatement("select STUID,STUNAME,STUBIRTHDAY,STUSEX,STUEMAIL,STUADDRESS from student");
			ResultSet rs = pre.executeQuery();
			while(rs.next())
			{
				java.util.Date bir=new java.util.Date(rs.getDate("STUBIRTHDAY").getTime());
				Student stu=new Student(rs.getString("STUID"), rs.getString("STUNAME"), bir,  rs.getString("STUSEX"), rs.getString("STUEMAIL"), rs.getString("STUADDRESS"));
				list.add(stu);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
