package mejshukeji.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		// 解决中文乱码的三句话
		// 请求对像的字符集编码
		request.setCharacterEncoding("utf-8");
		// 响应对像的字符集编码
		response.setCharacterEncoding("utf-8");
		// 设置响应对像响应到客户端浏览器，浏 览器选择以哪种编码来显示
		response.setContentType(" text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		
		//从请求中取cookie信息
		Cookie[] cookies = request.getCookies();
		String name="";
		String pwd="";
		if(cookies!=null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("name")){
					name = cookie.getValue();
				}
				if(cookie.getName().equals("pwd")){
					pwd = cookie.getValue();
				}
			}
		}
		if(name.equals("Snake")&&pwd.equals("123")){
			// 在会话对像中写入一个值
			//	session.setAttribute("userName", name);
				// 完成跳转到MainServlet
			//	request.getRequestDispatcher("MainServlet").forward(request, response);
		}
		if (session.getAttribute("userName") != null) {
			request.getRequestDispatcher("MainServlet").forward(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.println("<form name='f1' id='f1' action='LoginCheckServlet' method='post'>"
					+ " <table>			        " + "<tr>			          " + "<td>Login:</td>"
					+ " <td><input type='text' name='login' id='login'><input type='checkbox' value='on' name='setOn'>一个星期免登录</td>"
					+ "</tr>			        "
					+ "<tr>			          <td>Password:</td>			          <td><input type='password' name='password'></td>		        </tr>			        <tr>			          <td colspan='2'><input type='submit'></td>       </tr>	    </table>			    </form>			");
			out.flush();
			out.close();
		}
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

		// if(用户名正确，从数据库存查询用户是否存在，密码是否正确)
		// {
		// ok，转到MainServlett
		// }else{
		// 用户名密码不正确，跳到login.html
		// }

		HttpSession session = request.getSession();
		if (session.getAttribute("userName") != null) {
			// 用户名密码不正确，跳到login.html
			request.getRequestDispatcher("MainServlet").forward(request, response);
		} else {
			String login = request.getParameter("login");
			String password = request.getParameter("password");
			if (login != null && login.trim().equals("Snake") && password != null && password.trim().equals("123")) {

				// 在会话中输入一个值
				session.setAttribute("userName", login);

				String setOn = request.getParameter("setOn");
				if (setOn != null) {	//表示用户同意一个星期免登录
					// 在它的本地保存它的用户名密码
					// 创建一个cookie对像，
					Cookie cookie = new Cookie("name", "Snake");
					cookie.setMaxAge(60 * 60 * 24 * 7);
					Cookie cookie1 = new Cookie("pwd", "123");
					cookie1.setMaxAge(60 * 60 * 24 * 7);
					response.addCookie(cookie1);
					response.addCookie(cookie);
				}
				// 完成跳转到MainServlet
				request.getRequestDispatcher("MainServlet").forward(request, response);
			} else {
				// 用户名密码不正确，跳到login.html
				response.sendRedirect("../login.html");
			}
		}
	}
}
