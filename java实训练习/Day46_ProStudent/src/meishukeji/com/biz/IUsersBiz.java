package meishukeji.com.biz;

import meishukeji.com.pojo.Users;

public interface IUsersBiz {

	
	/**
	 *  传入用户对像  完成注册功能
	 * @param users  
	 * @return
	 */
	public boolean reg(Users users);
	
	/**
	 * 用户注册
	 * @param userName
	 * @return
	 */
	public boolean login(Users users);
}
