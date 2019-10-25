package meishukeji.com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManagerConnection {

	/**
	 * 得到连接对像的方法
	 * @return  连接对像， 如果连接对为null表示没有连接成功，否则连接成功
	 */
	public static java.sql.Connection getConn()
	{
		Connection conn=null;
		try {
			// 2.通过反射技术，将数据库驱动 加载到内存中
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "wx";
			String password = "wx";
			// 3,使用驱动管理类，得到连接对像
			 conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("创建连接对像时，类找不到");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("连接对你创建异常");
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
/**
 * 将传入的连接对像进行关闭
 * @param conn  连接对像
 */
	public static void closeConn(java.sql.Connection conn)
	{
		
		try {
			if(conn!=null&&conn.isClosed()==false)
			{
				
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("连接对关闭异常");
			e.printStackTrace();
		}
	}
}
