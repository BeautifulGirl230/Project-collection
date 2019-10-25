package meishukeji.com.pojo.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import meishukeji.com.common.MyCOnnection;
import meishukeji.com.common.Tools;
import meishukeji.com.dao.IStudentDao;
import meishukeji.com.dao.imp.StudentDao;
import meishukeji.com.dao.pojo.Student;

public class StudentServlet extends HttpServlet {

	private IStudentDao stuDao;// 学生数据库表的操作
	Connection conn = null; // 得到链接对象

	public StudentServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
		MyCOnnection.closeConn(conn);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String method = request.getParameter("method");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");

		if(method!=null && method.equals("selectAll")){
			
			printlnStudentAll(out);
		}else if(method!=null&&method.equals("del")){
			
			String stuId = request.getParameter("stuId");
			boolean b = del(stuId);
			if(b){
				
				out.println("<script>alert('删除成功1');location.href='http://localhost:8000/Web22/'</script>");
			}else{
				
				out.println("<script>alert('删除不成功2');location.href='http://localhost:8000/Web22/'</script>");
			}
		}
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	public boolean del(String stuId){
		
		return stuDao.deleteStudentByStuid(stuId);
	}
	
	
	private void printlnStudentAll(PrintWriter out) {
		List<Student> list = stuDao.getStudenAll();
		out.print("<table border=1>");
		for(Student student : list){
			out.println("<tr>");
			out.println("<td>"+student.getStuId()+"</td>");
			out.println("<td>"+student.getStuName()+"</td>");
			out.println("<td>"+student.getStuSex()+"</td>");
			out.println("<td>"+student.getStuEmail()+"</td>");
			out.println("<td>"+student.getStuAddress()+"</td>");
			out.println("<td>"+Tools.dateChanageString(student.getStuBirthday())+"</td>");
			out.println("<td><a href='StudentServlet?method=del&stuId="+student.getStuId()+"'>删除</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
	}

	public void init() throws ServletException {
		// 得到链接对象
		conn = MyCOnnection.getConn();
		// 学生数据库表的操作类的对象，设置链接对像给stuDao
		stuDao = new StudentDao(conn);

	}

}
