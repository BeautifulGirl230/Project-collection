package com.huanshi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huanshi.biz.IUserBiz;
import com.huanshi.biz.impl.UserBiz;
import com.huanshi.conn.HuanConnection;
import com.huanshi.conn.Tools;
import com.huanshi.dao.IUserDao;
import com.huanshi.dao.impl.UserDaoImpl;
import com.huanshi.pojo.UserBean;

public class RegServlet extends HttpServlet {
	private IUserBiz biz;
	Connection conn =  null;
	private IUserDao userDao;
	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
		HuanConnection.closeConn(conn);
	}
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		 conn = HuanConnection.getConn();
		 userDao = new UserDaoImpl(conn);
		biz = new UserBiz(userDao);
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
		String url = "login.jsp";
		//获取值
		String  username= request.getParameter("username");
		String password = request.getParameter("password");
		String user_email = request.getParameter("user_email");
		String user_sex = request.getParameter("user_sex");
		String user_address = request.getParameter("user_address");
		String user_birthday = request.getParameter("user_birthday");
		Date date =new Date();
		try {
			date=Tools.StringToDate(user_birthday);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserBean userBean = new UserBean(username, password, user_sex, user_email, user_address, date);
		boolean b = biz.reg(userBean);
//		if(b) {
//			System.out.println("ok");
//		}else {
//			System.out.println("no");
//		}
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	

}
