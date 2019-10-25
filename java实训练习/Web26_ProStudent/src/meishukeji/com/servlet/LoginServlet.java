package meishukeji.com.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import meishukeji.com.common.ManagerConnection;
import meishukeji.com.dao.IUsersDao;
import meishukeji.com.dao.imp.UsersDao;
import meishukeji.com.pojo.Users;
import mejshukeji.com.biz.IUsersBiz;
import mejshukeji.com.biz.imp.UsersBiz;

public class LoginServlet extends HttpServlet {

	private IUsersBiz biz;

	@Override
	public void init() throws ServletException {
		Connection conn = ManagerConnection.getConn();
		IUsersDao dao = new UsersDao(conn);
		biz = new UsersBiz(dao);
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
		//得到用户名密码与保存Cookie
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		String setCookie = request.getParameter("setCookie");
		
		if(userName!=null&&userPwd!=null){
			Users users = new Users(userName,userPwd);
			//从数据库得到用户信息，完成验证
			boolean b = biz.login(users);
			//判断登录
			if(b){
				url = "StudentServlet?op=getAll";
				//写到绘画范围
				HttpSession session = request.getSession();
				session.setAttribute("users", users);
				//判断写入Cookie
				if(setCookie!=null&&setCookie.equals("yes")){
					Cookie cookie = new Cookie("userName",userName);
					
					cookie.setMaxAge(60*60*24*7);
					
					Cookie pwd = new Cookie("userPwd",userPwd);
					
					pwd.setMaxAge(60*60*24*7);
					
					response.addCookie(pwd);
					response.addCookie(cookie);
				}
			}else{
				//用户名密码不对
				request.setAttribute("errorMsg", "用户名密码不对");
			}
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
