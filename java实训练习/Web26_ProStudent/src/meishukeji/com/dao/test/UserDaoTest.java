package meishukeji.com.dao.test;

import meishukeji.com.common.ManagerConnection;
import meishukeji.com.dao.IUsersDao;
import meishukeji.com.dao.imp.UsersDao;
import meishukeji.com.pojo.Users;

public class UserDaoTest {

	public static void main(String[] args) {
		IUsersDao dao = new UsersDao(ManagerConnection.getConn());
		
		Users users = dao.getUserByUsersName("Snake");
		
		System.out.println(users);

	}

}
