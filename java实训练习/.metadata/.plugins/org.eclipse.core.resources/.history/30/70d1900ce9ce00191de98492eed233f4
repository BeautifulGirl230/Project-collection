package Connection.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class MyCOnnection {
	/**
	 * 得到链接对象的方法
	 * @return 链接对象，如果连接对为null表示没有链接成功，否则链接成功
	 */
	public static java.sql.Connection getConn(){
		Connection conn = null;
		try {
			//通过反射技术，将数据库驱动加载到内存中
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "Snake";
			String password = "snake";
			//使用驱动管理类，得到链接对象
			conn = java.sql.DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("创建链接对象时，找不到类");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("链接对你创建异常");
			e.printStackTrace();
		}
		return conn;
		
	}
	/**
	 * 将传入的连接对像进行关闭
	 * @param conn  连接对像
	 */
	public static void closeConn(Connection conn) {
		try {
			if(conn!=null&&conn.isClosed()==false){
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("链接对关闭异常");
			e.printStackTrace();
		}
	}
}
