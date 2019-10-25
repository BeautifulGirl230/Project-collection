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
		
		// response 它是响应对象
		// sendRedirect(写要跳转的地址)
		// response.sendRedirect("Tom"); 客户端的跳转，客户端发送两次请求

		// 服务器端的跳转
		// 表示通过请求对象，得到请求对象分派对象（路径相同）.跳转（请求对象，响应对象）
		// request.getRequestDispatcher("Two").forward(request, response);
		// 表示通过上下文对象（上下文的意思就是当运行的环境），得到请求对象分派对象（需要从项目的根开始设置路径）.跳转（请求对象，响应对象）
		this.getServletContext().getRequestDispatcher("/servlet/Two").forward(request, response);
		
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
