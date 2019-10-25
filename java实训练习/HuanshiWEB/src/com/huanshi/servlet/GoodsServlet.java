package com.huanshi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.huanshi.biz.IGoodsBiz;
import com.huanshi.biz.impl.GoodsBizImpl;
import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IGoodsDao;
import com.huanshi.dao.impl.GoodsDaoImpl;
import com.huanshi.pojo.GoodsBean;

public class GoodsServlet extends HttpServlet {
	private IGoodsDao goodsDao;
	Connection conn=null;
	private IGoodsBiz goodsBiz;
	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		conn=HuanConnection.getConn();
		goodsDao=new GoodsDaoImpl(conn);
		goodsBiz= new GoodsBizImpl(goodsDao);
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
		String url= "login.jsp";
		String pageNo = request.getParameter("pageNo");
		int min = 0;
		int max = 0;
		List<GoodsBean> list = null;
		HttpSession session = request.getSession();
		if(session!=null){
			url = "jingpian.jsp";
		
		
		if(pageNo!=null&&pageNo.equals("1")){
		 min = 1;
		 max = 8;
		 list = goodsBiz.getAll(min, max);
		}else if(pageNo!=null&&pageNo.equals("2")){
		 min = 9;
		 max = 16;
		 list = goodsBiz.getAll(min, max);
		}
		
		request.setAttribute("Goodslist", list);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

	public String getAllGoods(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		return null;
		
	}

}
