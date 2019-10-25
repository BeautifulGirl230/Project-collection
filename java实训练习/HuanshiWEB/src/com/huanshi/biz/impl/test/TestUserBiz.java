package com.huanshi.biz.impl.test;

import java.sql.Connection;

import com.huanshi.biz.impl.UserBiz;
import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IUserDao;
import com.huanshi.dao.impl.UserDaoImpl;
import com.huanshi.pojo.UserBean;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestUserBiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = HuanConnection.getConn();
		IUserDao dao = new UserDaoImpl(conn);
		UserBiz biz = new UserBiz(dao);
		
		UserBean userBean = new UserBean("cdd", "123123");
		
		
		boolean b = biz.login(userBean);
		
		System.out.println(b);
	}

}
