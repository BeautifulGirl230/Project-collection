package mejshukeji.com.biz.imp;

import meishukeji.com.dao.IUsersDao;
import meishukeji.com.pojo.Users;
import mejshukeji.com.biz.IUsersBiz;

public class UsersBiz implements IUsersBiz {
	private IUsersDao dao;
	
	public UsersBiz() {
		super();
	}
	
	public IUsersDao getDao() {
		return dao;
	}

	public void setDao(IUsersDao dao) {
		this.dao = dao;
	}

	public UsersBiz(IUsersDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean reg(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(Users users) {
		boolean b = false;
		Users users1 = this.dao.getUserByUsersName(users.getUserName());
		if(users!=null){
			b = users.equals(users1);
		}
		return b;
	}

}
