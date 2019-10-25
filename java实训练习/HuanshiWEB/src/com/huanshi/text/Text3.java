package com.huanshi.text;

import java.sql.Connection;

import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IUserDao;
import com.huanshi.dao.impl.UserDaoImpl;
import com.huanshi.pojo.UserBean;

public class Text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = HuanConnection.getConn();
		IUserDao dao = new UserDaoImpl(conn);
		
		UserBean a = dao.getNameByUser("cdd");
		System.out.println(a);
	}

}
