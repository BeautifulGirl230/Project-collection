package com.huanshi.text;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import com.huanshi.biz.IGoodsBiz;
import com.huanshi.biz.impl.GoodsBizImpl;
import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IGoodsDao;
import com.huanshi.dao.IUserDao;
import com.huanshi.dao.impl.GoodsDaoImpl;
import com.huanshi.dao.impl.UserDaoImpl;
import com.huanshi.pojo.GoodsBean;
import com.huanshi.pojo.UserBean;

public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = HuanConnection.getConn();
		IUserDao userDao = new UserDaoImpl(conn);
		IGoodsDao goodsDao = new GoodsDaoImpl(conn);
		IGoodsBiz biz = new GoodsBizImpl(goodsDao);

		
//	   int user_id = 8;
//	UserBean a = userDao.getUserID(user_id);
//	System.out.println(a);
//		UserBean bb = new UserBean("sssszzzzss", "1z",  "男", "sdasdasd@qqq.com", "sdsdasawwea", new Date());
//		userDao.getInsertUser(bb);
//		List<UserBean> list =userDao.getUserAll();
//		for (UserBean userBean : list) {
//			System.out.println(userBean);
//		}
		GoodsBean g = biz.getById(1);
		System.out.println(g);
	}

}
