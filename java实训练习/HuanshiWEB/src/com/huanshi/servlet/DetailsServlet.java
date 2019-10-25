package com.huanshi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huanshi.biz.IGoodsBiz;
import com.huanshi.biz.impl.GoodsBizImpl;
import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IGoodsDao;
import com.huanshi.dao.impl.GoodsDaoImpl;
import com.huanshi.pojo.GoodsBean;

public class DetailsServlet extends HttpServlet {
	private IGoodsBiz goodsBiz;
	private IGoodsDao goodsDao;
	Connection conn =null;
	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		HuanConnection.closeConn(conn);
	}
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		conn=HuanConnection.getConn();
		goodsDao = new GoodsDaoImpl(conn);
		goodsBiz = new GoodsBizImpl(goodsDao);
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
		String url = "Details.jsp";
		int  goods_id= Integer.valueOf(request.getParameter("goods_id"));
		
		GoodsBean goodsBean = goodsBiz.getById(goods_id);
		request.setAttribute("goods", goodsBean);
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	

}
