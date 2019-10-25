package com.huanshi.biz.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.huanshi.biz.IUserBiz;
import com.huanshi.dao.IUserDao;
import com.huanshi.pojo.UserBean;

public class UserBiz implements IUserBiz{
	private IUserDao dao;
	

	public IUserDao getDao() {
		return dao;
	}

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	public UserBiz() {
		super();
	}

	public UserBiz(IUserDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean reg(UserBean userBean) {
		
		return dao.getInsertUser(userBean);
	}

	@Override
	public boolean login(UserBean userBean) {
		// TODO Auto-generated method stub
		boolean log = false;
		UserBean userBean2 = this.dao.getNameByUser(userBean.getUsername());
	if(userBean !=null){
		log = userBean.equals(userBean2);
	}
		return log;
	}

}
