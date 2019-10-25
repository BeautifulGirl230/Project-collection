package com.huanshi.dao;

import java.util.List;

import com.huanshi.pojo.UserBean;

public interface IUserDao {
	public List<UserBean> getUserAll();
	
	public UserBean getUserID(int user_id);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean getUpdateUser(UserBean user);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean getInsertUser(UserBean user);
	/**
	 * 
	 * @param user_id
	 * @return
	 */
	public boolean getDeleteUser(int user_id);
	
	public UserBean getNameByUser(String username);
}
