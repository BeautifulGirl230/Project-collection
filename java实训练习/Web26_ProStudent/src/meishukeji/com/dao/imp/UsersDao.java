package meishukeji.com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import meishukeji.com.dao.IUsersDao;
import meishukeji.com.pojo.Users;

public class UsersDao implements IUsersDao {
	//链接对象
	private Connection conn = null;

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public UsersDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public UsersDao() {
		super();
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUserByUsersName(String userName) {
		Users users = null;
		try {
			PreparedStatement pre = conn.prepareStatement("select userPwd from users where userName=?");
			pre.setString(1, userName);
			ResultSet rs = pre.executeQuery();
			
			if(rs.next()){
				users = new Users();
				users.setUserName(userName);
				users.setUserPwd(rs.getString("userPwd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public boolean insertUsers(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUsers(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUsers(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

}
