package mejshukeji.com.servlet02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.glass.ui.Application;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;

public class One extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public One() {
		super();
	}

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=UTF-8");
		
		//两种跳转，三种传值
		
		//三种传值
		//1.请求传值
		request.setAttribute("nameRequest","Snake");
		//2.会话传值
		HttpSession session = request.getSession();
		session.setAttribute("pwdSession", "123");
		//3.上下文对象传值
		ServletContext application = this.getServletContext();
		application.setAttribute("sexApplication", "男");
		
		//第一种跳传
		//response.sendRedirect("servlet/Two");
		//第二种跳转
		request.getRequestDispatcher("servlet/Two").forward(request, response);
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the POST method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//		out.flush();
//		out.close();
	}

	/**
		 * Returns information about the servlet, such as 
		 * author, version, and copyright. 
		 *
		 * @return String information about this servlet
		 */
	public String getServletInfo() {
		return "This is my default servlet created by Eclipse";
	}

}
