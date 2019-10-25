package com.huanshi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huanshi.dao.IAdminsDao;
import com.huanshi.pojo.AdminBean;

public class AdminDaoImpl implements IAdminsDao {
	private Connection conn=null;
	
	public AdminDaoImpl() {
		super();
	}

	public AdminDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	@Override
	public List<AdminBean> getAdminAll() {
		List<AdminBean> list = new ArrayList<AdminBean>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select admins_id,adminsname,a_password,administratorsd from Admins");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				AdminBean adminBean = new AdminBean();
				adminBean.setAdmins_Id(rs.getInt("admins_Id"));
				adminBean.setAdminsName(rs.getString("adminsName"));
				adminBean.setA_password(rs.getString("a_password"));
				adminBean.setAdministratorsd(rs.getString("administratorsd"));
				list.add(adminBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public AdminBean getAdminByID(int admins_Id) {
		AdminBean adminBean = null;
		try {
			PreparedStatement pstmt = conn
					.prepareStatement("select admins_id,adminsname,a_password,administratorsd from Admins where admins_id=?");
			pstmt.setInt(1, admins_Id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				adminBean=new AdminBean();
				adminBean.setAdmins_Id(rs.getInt("admins_Id"));
				adminBean.setAdminsName(rs.getString("adminsName"));
				adminBean.setA_password(rs.getString("a_password"));
				adminBean.setAdministratorsd(rs.getString("admin"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return adminBean;
	}

	@Override
	public boolean insertAdmin(AdminBean admin) {
		// TODO Auto-generated method stub
		boolean b = false;
		//�Զ����� (��д)��user_idzz.nextval
		try {
			PreparedStatement pstmt = conn
					.prepareStatement("INSERT into Admins(ADMINS_ID,ADMINSNAME,A_PASSWORD,ADMINISTRATORSD) values(?,?,?,?)");

			pstmt.setInt   (1,admin.getAdmins_Id());
			pstmt.setString(2, admin.getAdminsName());
			pstmt.setString(3, admin.getA_password());
			pstmt.setString(4, admin.getAdministratorsd());
			
			b = pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

}
