package com.huanshi.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HuanConnection {
	public static java.sql.Connection getConn(){
		Connection conn =null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String uri= "jdbc:oracle:thin:@192.168.1.158:1521:xe";
			String user = "huanshi";
			String password = "147";
			conn=DriverManager.getConnection(uri, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void closeConn(java.sql.Connection conn) {
		try {
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
