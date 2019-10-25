package com.huanshi.text;

import java.sql.Connection;
import java.util.List;

import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IAdminsDao;
import com.huanshi.dao.impl.AdminDaoImpl;
import com.huanshi.pojo.AdminBean;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = HuanConnection.getConn();
		IAdminsDao iad = new AdminDaoImpl(conn);
		
		AdminBean admin = new AdminBean(5, "wxsl","wx","1");
	   iad.insertAdmin(admin);
	   List<AdminBean> list = iad.getAdminAll();
		for (AdminBean adminBean : list) {
			System.out.println(adminBean);
		}
	}

}
