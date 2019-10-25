package Connectio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) {
		try {
			// 1.先要在项目中添加 驱动包
			// 2.通过反射技术，将数据库驱动 加载到内存中
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "Snake";
			String password = "snake";
			// 3,使用驱动管理类，得到连接对像
			Connection conn = DriverManager.getConnection(url, user, password);
			// 4 通过连接对像，得到处理器对像，处理器对像用来发送insert update delete select等sql语句
			Statement state = conn.createStatement();
			// 5用处理器处理sql语句 executeQuery方法用来发送select语句
			// "STUID",
			// "STUNAME",
			// "STUBIRTHDAY",
			// "STUSEX",
			// "STUEMAIL",
			// "STUADDRESS"
			String stuid = "00005";
			String sql = "select STUID,STUNAME,STUBIRTHDAY,STUSEX,STUEMAIL,STUADDRESS from student where stuid='"
					+ stuid + "'";
			// 得取结果集
			ResultSet rs = state.executeQuery(sql);
			// 结果集列头
			ResultSetMetaData md = rs.getMetaData();
			System.out.println(md.getColumnName(1)); // 得到第一列的列名
			System.out.println(md.getColumnCount()); // 共有多少列
			while (rs.next()) {
				Date date = rs.getDate("STUBIRTHDAY"); // ?java.sql.Date如何转
				// java.util.Date
				// System.out.println( rs.getString("STUID")+"
				// "+date.toString());
				System.out.println(rs.getString(1) + "   " + date.toString());
			}
			// 关闭处理器对像和连接对像
			state.close();
			if (conn != null && conn.isClosed() == false) {
				conn.close();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
