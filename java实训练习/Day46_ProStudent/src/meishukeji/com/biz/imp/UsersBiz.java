package meishukeji.com.biz.imp;

import meishukeji.com.biz.IUsersBiz;
import meishukeji.com.dao.IUsersDao;
import meishukeji.com.pojo.Users;

public class UsersBiz implements IUsersBiz {
	private IUsersDao dao;
	

	public UsersBiz() {
		super();
	}

	public UsersBiz(IUsersDao dao) {
		super();
		this.dao = dao;
	}

	public IUsersDao getDao() {
		return dao;
	}

	public void setDao(IUsersDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean reg(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(Users users) {
		boolean b=false;
		// TODO Auto-generated method stub
		Users users1= this.dao.getUserByUserName(users.getUserName());
		
	    if(users!=null)
	    {
	    
	    	b=users.equals(users1);
	    	
	    }
	    
	    return b;
	}

}
