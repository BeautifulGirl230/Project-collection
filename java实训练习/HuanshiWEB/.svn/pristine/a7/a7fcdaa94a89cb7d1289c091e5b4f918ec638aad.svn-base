package com.huanshi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.huanshi.dao.IUserDao;
import com.huanshi.pojo.UserBean;

public class UserDaoImpl implements IUserDao {
	private Connection conn=null;
	
	public UserDaoImpl() {
		super();
	}

	public UserDaoImpl(Connection conn) {
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
	public List<UserBean> getUserAll() {
		List<UserBean> list= new ArrayList<UserBean>();
		try {
			String sql = "select USER_ID,USERNAME,PASSWORD,USER_AGE,USER_SEX,USER_EMAIL,USER_ADDRESS,"
							+ "	USER_BIRTHDAY,ISLOCK from USER_DETAILS";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				UserBean userBean =new UserBean();
				userBean.setUser_id(rs.getInt("USER_ID"));
				userBean.setUsername(rs.getString("USERNAME"));
				userBean.setPassword(rs.getString("password"));
				userBean.setUser_age(rs.getInt("USER_AGE"));
				userBean.setUser_sex(rs.getString("USER_SEX"));
				userBean.setUser_email(rs.getString("USER_EMAIL"));
				userBean.setUser_address(rs.getString("USER_ADDRESS"));
//				java.sql.Date sqlDate=rs.getDate("USER_BIRTHDAY");
//				java.util.Date utilDate=new Date(sqlDate.getTime());
				userBean.setUser_birthday(rs.getDate("USER_BIRTHDAY"));
				userBean.setIslock(rs.getString("ISLOCK"));
				list.add(userBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public UserBean getUserID(int user_id) {
		UserBean userBean = null;
		try {
			String sql = "select USER_ID,USERNAME,PASSWORD,USER_AGE,USER_SEX,USER_EMAIL,USER_ADDRESS,"
					+ "	USER_BIRTHDAY,ISLOCK from USER_DETAILS where USER_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,user_id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				userBean=new UserBean();
				userBean.setUser_id(rs.getInt("USER_ID"));
				userBean.setUsername(rs.getString("USERNAME"));
				userBean.setPassword(rs.getString("password"));
				userBean.setUser_age(rs.getInt("USER_AGE"));
				userBean.setUser_sex(rs.getString("USER_SEX"));
				userBean.setUser_email(rs.getString("USER_EMAIL"));
				userBean.setUser_address(rs.getString("USER_ADDRESS"));
//			java.sql.Date sqlDate=rs.getDate("USER_BIRTHDAY");
//			java.util.Date utilDate=new Date(sqlDate.getTime());
				userBean.setUser_birthday(rs.getDate("USER_BIRTHDAY"));
				userBean.setIslock(rs.getString("ISLOCK"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userBean;
	}

	@Override
	public boolean getUpdateUser(UserBean user) {
		boolean b= false;
		String sql="update User_details set USERNAME=?,PASSWORD=?,USER_AGE=?"
				 + ",USER_SEX=?,USER_EMAIL=?,USER_ADDRESS=?,USER_BIRTHDAY=?,ISLOCK=? where USER_ID=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setInt(3, user.getUser_age());
			pstmt.setString(4, user.getUser_sex());
			pstmt.setString(5, user.getUser_email());
			pstmt.setString(6, user.getUser_address());
			pstmt.setDate(7, new java.sql.Date(user.getUser_birthday().getTime()));
			pstmt.setString(8, user.getIslock());
			b=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean getInsertUser(UserBean user) {
		boolean b= false;
			String sql= "insert into User_details values(user_idzz.nextval,?,?,default,?,?,?,?,0)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getUsername());
				pstmt.setString(2, user.getPassword());
				pstmt.setString(3, user.getUser_sex());
				pstmt.setString(4, user.getUser_email());
				pstmt.setString(5, user.getUser_address());
				pstmt.setDate(6, new java.sql.Date(user.getUser_birthday().getTime()));
				b=pstmt.executeUpdate()>0?true:false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return b;
	}

	@Override
	public boolean getDeleteUser(int user_id) {
		boolean b= false;
		try {
			String sql = "delete from User_details where USER_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, user_id);
			b=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}

	@Override
	public UserBean getNameByUser(String username) {
		// TODO Auto-generated method stub\
		
		UserBean user = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select USERNAME,PASSWORD from USER_DETAILS where USERNAME=?");
			pstmt.setString(1,username);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				user =new UserBean();
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
