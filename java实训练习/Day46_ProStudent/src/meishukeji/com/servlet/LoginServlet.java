package meishukeji.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.jms.Session;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import meishukeji.com.biz.IUsersBiz;
import meishukeji.com.biz.imp.UsersBiz;
import meishukeji.com.common.ManagerConnection;
import meishukeji.com.dao.IUsersDao;
import meishukeji.com.dao.imp.UsersDao;
import meishukeji.com.pojo.Users;

public class LoginServlet extends HttpServlet {
           private IUsersBiz biz;
           
           
	@Override
		public void init() throws ServletException {
		Connection conn = ManagerConnection.getConn();
		IUsersDao dao=new UsersDao(conn);
    biz=new UsersBiz(dao);
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

		doPost( request,  response);
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
    String url="login.jsp";
		//得到用户名密码和是保存cookie
		
	String userName=	request.getParameter("userName");
	String userPwd=	request.getParameter("userPwd");
	String setCookie=	request.getParameter("setCookie");
	
	if(userName!=null&&userPwd!=null)
	{
		Users user=new Users(userName,userPwd);
		//从数据库得到用户信息，完成验 证
		boolean b=biz.login(user);
		  if(b)  //正常登录
		  {
			  
			  url="StudentServlet?op=getAll"; 
			  //写到会话范围
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		//判断写入cookie
		   if(setCookie!=null&&setCookie.equals("yes"))
		   {
			   Cookie cookie=new Cookie("userName", userName);
			
			   cookie.setMaxAge(60*60*24*7);
			   
			   Cookie pwd=new Cookie("userPwd", userPwd);
				
			   pwd.setMaxAge(60*60*24*7);
			   
			   response.addCookie(pwd);
			   response.addCookie(cookie);
			   
		   }
			  
		  }
		  else  //用户名密码不对
		  {
			 
			  request.setAttribute("errorMsg", "用户名密码不对");
			  
		  }
		
	}
		

	
	
	request.getRequestDispatcher(url).forward(request, response);

	
}
	
	
}
