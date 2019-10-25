package meishukeji.com.dao;

import java.util.List;

import meishukeji.com.pojo.Users;

public interface IUsersDao {

	/**
	 * 
	 * @return  所有用户对像
	 */
	public List<Users> getAllUsers();
	
	/**
	 * 
	 * @param userName  用户名
	 * @return   用户对像， 用户对像为空表示没有查到，
	 */
	public Users getUserByUserName(String userName);
	/**
	 * 
	 * @param users
	 * @return  完成添加功能
	 */
	public boolean insertUsers(Users users);
	/**
	 *   根据 主键完成删除功以
	 * @param userName
	 * @return  true ok,false ng
	 */
	public boolean deleteUsers(String userName);
	/**
	 * 根据 主键完成更新功能
	 * @param users
	 * @return
	 */
	public boolean updateUsers(Users users);
	
	
}
