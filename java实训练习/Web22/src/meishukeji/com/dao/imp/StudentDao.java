package meishukeji.com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import meishukeji.com.dao.IStudentDao;
import meishukeji.com.dao.pojo.Student;

public class StudentDao implements IStudentDao {
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public StudentDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public StudentDao() {
		super();
	}

	/**
	 * 定义一个链接对象
	 */
	private Connection conn;

	@Override
	public List<Student> getStudenAll() {
		List<Student> list = new ArrayList<Student>();
			try {
				PreparedStatement pre = conn
						.prepareStatement("select  STUID,STUNAME,STUBIRTHDAY,STUSEX,STUEMAIL,STUADDRESS  from student");
				ResultSet rs = pre.executeQuery();
				while (rs.next()) {
					// 创建一个学生对像
					Student stu = new Student();
					// 将指针指的结果集中的那个记录值 ，取出来，装到stu对像中
					stu.setStuId(rs.getString("STUID"));
					stu.setStuName(rs.getString("STUNAME"));
					stu.setStuAddress(rs.getString("STUADDRESS"));
					java.sql.Date sqlDate = rs.getDate("STUBIRTHDAY");
					java.util.Date utilDate = new Date(sqlDate.getTime());
					stu.setStuBirthday(utilDate);
					stu.setStuEmail(rs.getString("STUEMAIL"));
					stu.setStuSex(rs.getString("STUSEX"));
					// 将学生像添加到集合
					list.add(stu);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}

	@Override
	public Student getStudentByStudentId(String stuid) {
		Student stu = null;
		try {
			PreparedStatement pre = conn
					.prepareStatement("select  STUID,STUNAME,STUBIRTHDAY,STUSEX,STUEMAIL,STUADDRESS  from student where STUID=?");
			pre.setString(1, stuid);
			ResultSet rs = pre.executeQuery();
			if(rs.next()){
				stu = new Student();
				// 将指针指的结果集中的那个记录值 ，取出来，装到stu对像中
				stu.setStuId(rs.getString("STUID"));
				stu.setStuName(rs.getString("STUNAME"));
				stu.setStuAddress(rs.getString("STUADDRESS"));
				java.sql.Date sqlDate = rs.getDate("STUBIRTHDAY");
				java.util.Date utilDate = new Date(sqlDate.getTime());
				stu.setStuBirthday(utilDate);
				stu.setStuEmail(rs.getString("STUEMAIL"));
				stu.setStuSex(rs.getString("STUSEX"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	public List<Student> getStudentBySql(String sql) {
		List<Student>list = new ArrayList<Student>();
		try {
			PreparedStatement pre = conn
					.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			
			while (rs.next()) {
				// 创建一个学生对像
				Student stu = new Student();
				// 将指针指的结果集中的那个记录值 ，取出来，装到stu对像中
				stu.setStuId(rs.getString("STUID"));
				stu.setStuName(rs.getString("STUNAME"));
				stu.setStuAddress(rs.getString("STUADDRESS"));
				java.sql.Date sqlDate = rs.getDate("STUBIRTHDAY");
				java.util.Date utilDate = new Date(sqlDate.getTime());
				stu.setStuBirthday(utilDate);
				stu.setStuEmail(rs.getString("STUEMAIL"));
				stu.setStuSex(rs.getString("STUSEX"));
				// 将学生像添加到集合
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insertStudent(Student stu) {
		boolean b = false;
		try {
			String sql = "insert into STUDENT(STUID,STUNAME, STUBIRTHDAY,STUSEX,STUEMAIL,STUADDRESS) values(?,?,?,?,?,?)";
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, stu.getStuId());
			pre.setString(2, stu.getStuName());
			pre.setDate(3, new java.sql.Date(stu.getStuBirthday().getTime()));
			pre.setString(4, stu.getStuSex());
			pre.setString(5, stu.getStuEmail());
			pre.setString(6, stu.getStuAddress());
			b = pre.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean deleteStudentByStuid(String stuid) {
		boolean b = false;
		String sql = "delete from student where stuid=?";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, stuid);
			b = pre.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean updateStudentByStudent(Student stu) {
		boolean b = false;
		String sql = "update student set STUNAME=?,STUBIRTHDAY=?,STUSEX=?,STUEMAIL=?,STUADDRESS=? where STUID=?";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, stu.getStuName());
			pre.setDate(2, new java.sql.Date(stu.getStuBirthday().getTime()));
			pre.setString(3, stu.getStuSex());
			pre.setString(4, stu.getStuEmail());
			pre.setString(5, stu.getStuAddress());
			pre.setString(6, stu.getStuId());
			b = pre.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

}
