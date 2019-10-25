package meishukeji.com.dao;

import java.util.List;

import meishukeji.com.pojo.Users;

public interface IUsersDao {
	
	/**
	 * 
	 * @return  所有用户对象
	 */
	public List<Users> getAllUsers();
	
	/**
	 * 
	 * @param userName 用户名
	 * @return 用户对象，用户对象为空表示没有查到，
	 */
	public Users getUserByUsersName(String userName);
	
	/**
	 * 
	 * @param users
	 * @return  完成添加功能
	 */
	public boolean insertUsers(Users users);
	
	/**
	 * 	根据 主键完成删除功能
	 * @param userName
	 * @return  true ok,false ng
	 */
	public boolean deleteUsers(String userName);
	
	/**
	 * 根据主键完成更新功能
	 * @param users
	 * @return
	 */
	public boolean updateUsers(Users users);
}
