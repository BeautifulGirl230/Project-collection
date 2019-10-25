package mejshukeji.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class One extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public One() {
		super();
		System.out.println("构造方法，servlet对象的创建是由web容器（tomcat）来创建的");
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		System.out.println("destroy()方法当对象在销毁时，调用，一般用来完成资源的释放");
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");

		// 请求对象里放了三种值
		// 第一种，请求头信息
		// 第二种，表单数据
		String uerName = request.getParameter("login");
		String userPwd = request.getParameter("password");
		String userSex = request.getParameter("sex");
		String usercity = request.getParameter("City");
		String userId = request.getParameter("id");
		String[] likes = request.getParameterValues("likes");

		// 第三种cookie信息
		out.println("用户名为：" + uerName + "<br/>密码为：" + userPwd + "<br/>");
		out.println("性别：" + userSex + "<br/>");
		if (usercity != null) {
			out.println("城市：" + usercity + "<br/>");
		}
		out.println("Id:" + userId + "<br/>");
		out.println("爱好：");
		for (String string : likes) {
			out.println(string + "&nbsp;&nbsp;&nbsp;");
		}

		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		System.out.println("当对象创建完成之后，来调用init方法，完成对当前的servlet进行初始化设置");
	}

}
