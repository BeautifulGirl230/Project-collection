package com.huanshi.biz;

import com.huanshi.pojo.UserBean;

public interface IUserBiz {
	public boolean reg(UserBean userBean);
	
	public boolean login(UserBean userBean);
}
