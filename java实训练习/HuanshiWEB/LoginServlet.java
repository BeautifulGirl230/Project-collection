package com.huanshi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.SetContextPropertiesRule;
import org.apache.tomcat.util.http.parser.Cookie;

import com.huanshi.biz.IUserBiz;
import com.huanshi.biz.impl.UserBiz;
import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IUserDao;
import com.huanshi.dao.impl.UserDaoImpl;
import com.huanshi.pojo.UserBean;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class LoginServlet extends HttpServlet {

	private IUserBiz biz ;
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
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		Connection conn= HuanConnection.getConn();
		IUserDao dao = new  UserDaoImpl(conn);
		biz = new UserBiz(dao);
		super.init();
	}
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

		//跳转信息
		String url="login.jsp";
		//用户名
		String username = request.getParameter("userName");
		//用户密码
		String password = request.getParameter("password");
		//Cookie设置   (未配置)
		String setCookie = request.getParameter("setCookie");
		
		//用户密码的验证
		if(username!=null&&password!=null){
			UserBean user = new UserBean(username, password);
			boolean log = biz.login(user);
			if(log){
				
				url="indexServlet";
				HttpSession session = request.getSession();
				session.setAttribute("user",user);
				
				if(setCookie!=null&&setCookie.equals("yes"));
				{
					javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("userName", username);
					cookie.setMaxAge(60*5);
					javax.servlet.http.Cookie Pwd = new javax.servlet.http.Cookie("password", password);
					Pwd.setMaxAge(60*5);
				}
				
			}else{ //用户名密码不对
				request.setAttribute("erroMsg", "用户名密码不对");
			}
		}
		//服务器跳转
		request.getRequestDispatcher(url).forward(request, response);
	}

}
