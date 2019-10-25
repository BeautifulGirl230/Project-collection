package meishukeji.com.biz.test;

import java.sql.Connection;

import meishukeji.com.biz.imp.UsersBiz;
import meishukeji.com.common.ManagerConnection;
import meishukeji.com.dao.IUsersDao;
import meishukeji.com.dao.imp.UsersDao;
import meishukeji.com.dao.test.UserDaoTest;
import meishukeji.com.pojo.Users;

public class UserBizTest {

	public static void main(String[] args) {

		Connection conn = ManagerConnection.getConn();
		IUsersDao dao=new UsersDao(conn);
   UsersBiz usersBiz=new UsersBiz(dao);
   
   
       Users u=new Users("wangx", "wangx");
       
     boolean b = usersBiz.login(u);
     
     System.out.println(b);
		
	}

}
