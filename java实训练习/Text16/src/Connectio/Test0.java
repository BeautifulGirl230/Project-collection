package Connectio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test0 {
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
			// 5用处理器处理sql语句 executeUpdate方法用来发送insert update
			// delete,不发送查询语句，返回影响的行数
			//int i = state.executeUpdate("insert into STUDENT(STUID,STUNAME, STUBIRTHDAY,STUSEX,STUEMAIL,STUADDRESS) values('00025','wan','02-5月-00','男','adsf1@df.com','苏州')");
			int i = state.executeUpdate("delete from STUDENT where stuId= 00025");
			if(i>0){
				System.out.println("insert ok");
			}else{
				System.out.println("insert ng");
			}
			// 关闭处理器对像和连接对像
			state.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
