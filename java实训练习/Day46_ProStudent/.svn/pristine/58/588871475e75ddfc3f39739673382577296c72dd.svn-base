package meishukeji.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import meishukeji.com.biz.IStudentBiz;
import meishukeji.com.biz.imp.StudentBiz;
import meishukeji.com.biz.imp.UsersBiz;
import meishukeji.com.common.ManagerConnection;
import meishukeji.com.common.Tools;
import meishukeji.com.dao.IStudentDao;
import meishukeji.com.dao.IUsersDao;
import meishukeji.com.dao.imp.StudentDao;
import meishukeji.com.dao.imp.UsersDao;
import meishukeji.com.pojo.Student;

public class StudentServlet extends HttpServlet {
	private IStudentBiz biz;

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	@Override
	public void init() throws ServletException {
		Connection conn = ManagerConnection.getConn();
		IStudentDao dao = new StudentDao(conn);
		biz = new StudentBiz(dao);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "login.jsp";
		// 完成对student的相关操作
		String op = request.getParameter("op");
		if (op != null && op.equals("getAll")) {
			// 得到全部学生
			url = getAllStudent(request, response);

		} else if (op != null && op.equals("del")) {
			// 完成删除功能

		} else if (op != null && op.equals("update")) {
			String stuId = request.getParameter("stuId");
			// 完成修改功能
			Student stu = biz.getStuById(stuId);

			request.setAttribute("stu", stu);
			request.setAttribute("method", "update");
			url = "add_update.jsp";
		} else if (op != null && op.equals("saveUpdate")) {

			String stuAddress = request.getParameter("stuAddress");
			String stuBirthday = request.getParameter("stuBirthday");
			String stuEmail = request.getParameter("stuEmail");
			String stuId = request.getParameter("stuId");
			String stuName = request.getParameter("stuName");
			String stuSex = request.getParameter("stuSex");
			Date date = new Date();
			try {
				date = Tools.StringToDate(stuBirthday);
			} catch (Exception e) {
				// 完成修改功能
				Student stu1 = biz.getStuById(stuId);

				request.setAttribute("stu", stu1);
				request.setAttribute("method", "update");
				url = "add_update.jsp";
				request.getRequestDispatcher(url).forward(request, response);
			}

			Student stu = new Student(stuId, stuName, date, stuSex, stuEmail, stuAddress);

			boolean b = biz.udpate(stu);
			if (b) {
				// 更新成功 跳回主页
				url = getAllStudent(request, response);

			} else {

				// 完成修改功能
				Student stu1 = biz.getStuById(stuId);

				request.setAttribute("stu", stu1);
				request.setAttribute("method", "update");
				url = "add_update.jsp";

			}
		}else if((op!=null&&op.equals("add")))
				{
			  request.setAttribute("method", "add");
			  url="add_update.jsp";
				}
		
		
		else if((op!=null&&op.equals("saveAdd")))
		{

// 完成学生的添加
			String stuAddress = request.getParameter("stuAddress");
			String stuBirthday = request.getParameter("stuBirthday");
			String stuEmail = request.getParameter("stuEmail");
			String stuId = request.getParameter("stuId");
			String stuName = request.getParameter("stuName");
			String stuSex = request.getParameter("stuSex");
			Date date = new Date();
			try {
				date = Tools.StringToDate(stuBirthday);
			} catch (Exception e) {
				// 完成修改功能
				Student stu1 = biz.getStuById(stuId);

				request.setAttribute("stu", stu1);
				request.setAttribute("method", "update");
				url = "add_update.jsp";
				request.getRequestDispatcher(url).forward(request, response);
			}
			
			Student stu = new Student(stuId, stuName, date, stuSex, stuEmail, stuAddress);
              boolean b= biz.add(stu);
			   if(b)  //添加成功
			   {
				   
				 
				   url = getAllStudent(request, response);  
				   
			   }
			   else
			   {//添加不成功
				    request.setAttribute("stu", stu);
				    request.setAttribute("method", "add");
				   url = "add_update.jsp";   
			   }
			
		}

		request.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @return 跳转到main.jsp
	 * @throws ServletException
	 * @throws IOException
	 */
	public String getAllStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Student> list = biz.getAll();

		request.setAttribute("stuList", list);
		return "main.jsp";
	}

}
