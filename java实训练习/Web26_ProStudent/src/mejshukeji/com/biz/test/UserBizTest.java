package mejshukeji.com.biz.test;

import java.sql.Connection;

import meishukeji.com.common.ManagerConnection;
import meishukeji.com.dao.IUsersDao;
import meishukeji.com.dao.imp.UsersDao;
import meishukeji.com.pojo.Users;
import mejshukeji.com.biz.imp.UsersBiz;

public class UserBizTest {
	
	public static void main(String[] args){
		
		Connection conn = ManagerConnection.getConn();
		
		IUsersDao dao = new UsersDao();
		
		UsersBiz usersBiz = new UsersBiz();
		
		Users u = new Users("Snake","Snake");
		
		boolean b = usersBiz.login(u);
		
		System.out.println(b);
	}
}
