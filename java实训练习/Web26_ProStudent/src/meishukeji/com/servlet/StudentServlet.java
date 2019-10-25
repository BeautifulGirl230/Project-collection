package meishukeji.com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import meishukeji.com.common.ManagerConnection;
import meishukeji.com.dao.IStudentDao;
import meishukeji.com.dao.imp.StudentDao;
import meishukeji.com.pojo.Student;
import mejshukeji.com.biz.IStudnetBiz;
import mejshukeji.com.biz.imp.StudentBiz;

public class StudentServlet extends HttpServlet {
	private IStudnetBiz biz;

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		Connection conn = ManagerConnection.getConn();
		IStudentDao dao = new StudentDao(conn);
		biz = new StudentBiz(dao);
	}

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
		
		String op = request.getParameter("op");
		
		if(op!=null&&op.equals("getAll")){
			//得到全部学生
			List<Student> list = biz.getAll();
			url = "main.jsp";
			request.setAttribute("stuList", list);
		}else if(op!=null&&op.equals("del")){
			//完成删除功能
		}else if(op!=null&&op.equals("uodatet")){
			//完成修改功能
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
