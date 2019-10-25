package mejshukeji.com.servlet02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

public class LoginCheckServlet extends HttpServlet {
	
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

		// 解决中文乱码的三句话
		// 请求对像的字符集编码
		request.setCharacterEncoding("utf-8");
		// 响应对像的字符集编码
		response.setCharacterEncoding("utf-8");
		// 设置响应对像响应到客户端浏览器，浏 览器选择以哪种编码来显示
		response.setContentType(" text/html;charset=UTF-8");
		
		//	if(用户名正确，从数据库存查询用户是否存在，密码是否正确)
		//	{
		//			ok，转到MainServlett
		//	}else{
		//			用户名密码不正确，跳到login.html
		//	}
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if(session.getAttribute("userName")!=null){
			//用户名密码不正确，跳到login.html
			request.getRequestDispatcher("MainServlet").forward(request, response);
		}else 
			if(login!=null && login.trim().equals("Snake") && password!=null && password.trim().equals("123")){
			//用户名密码正确 用户名为BeautifulGirl 密码为123才为正确，正确跳转到MainServlet
			//得到一个会话对像，如果请求中有sessoin对像（其实就是reqeust中有sessionID），那么就用已存在的那个session对像，
			//得到一个会话对象，如果请求中没有session对象（其实就是reqeust中没有sessionID），那么就创建一个session对象
//			HttpSession session = request.getSession();
			//在会话中输入一个值
			session.setAttribute("userName", login);
			//完成跳转到MainServlet
			request.getRequestDispatcher("MainServlet").forward(request, response);
		}else{
			//用户名密码不正确，跳到login.html
			response.sendRedirect("../login.html");
		}
	}


}
