package xpoint.com.controll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneServlet extends HttpServlet {
	
	/**
	  * 这个方法用来处理  get方式的请求，地址栏直接访问是get方式
	  * @param HttpServletRequest  req  请求对像
	  * 
	  * 
	  * @param HttpServletResponse resp  响应对像
	  * 这两个对是tomcat，web容器创建
	  * 
	  */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 解决中文乱码的三句话
		// 请求对像的字符集编码
		req.setCharacterEncoding("utf-8");
		// 响应对像的字符集编码
		resp.setCharacterEncoding("utf-8");
		// 设置响应对像响应到客户端浏览器，浏 览器选择以哪种编码来显示
		resp.setContentType(" text/html;charset=UTF-8");
		// 通过响应对像 对像，得到输出流
		PrintWriter out = resp.getWriter();
		// 通过输出流 向客户端输出 信息
		out.print("中文");
		// 关闭输出流
		out.close();
	}
	
	 /**
	  * 这个方法用来处理 post方式的请求
	  * @param HttpServletRequest  req  请求对像
	  * 
	  * 
	  * @param HttpServletResponse resp  响应对像
	  * 这两个对是tomcat，web容器创建
	  * 
	  */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
