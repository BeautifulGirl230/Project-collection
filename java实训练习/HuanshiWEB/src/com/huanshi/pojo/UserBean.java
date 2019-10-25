package com.huanshi.pojo;

import java.util.Date;

public class UserBean {
//	user_id number(10) not null,
//	  username nvarchar2(30) primary key,
//	  password nvarchar2(20) not null,
//	  user_age number(3) not null,
//	  user_sex nchar(1) default '鐢�' ,
//	  user_email nvarchar2(50) not null,
//	  user_address nvarchar2(50),
//	  user_birthday date,
//	  islock nchar(1) default 0
	private int user_id;
	private String username;
	private String password;
	private int user_age;
	private String user_sex;
	private String user_email;
	private String user_address;//鍦板潃
	private java.util.Date user_birthday;
	private String islock;//鏄惁鍋滃皝
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public java.util.Date getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(java.util.Date user_birthday) {
		this.user_birthday = user_birthday;
	}
	public String getIslock() {
		return islock;
	}
	public void setIslock(String islock) {
		this.islock = islock;
	}
	
	public UserBean(int user_id, String username, String password, int user_age, String user_sex, String user_email,
			String user_address, Date user_birthday, String islock) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.user_age = user_age;
		this.user_sex = user_sex;
		this.user_email = user_email;
		this.user_address = user_address;
		this.user_birthday = user_birthday;
		this.islock = islock;
	}
	
	public UserBean(String username, String password, int user_age, String user_sex, String user_email,
			String user_address, java.util.Date user_birthday) {
		super();
		this.username = username;
		this.password = password;
		this.user_age = user_age;
		this.user_sex = user_sex;
		this.user_email = user_email;
		this.user_address = user_address;
		this.user_birthday = user_birthday;
	}
	
	public UserBean(String username, String password, String user_sex, String user_email, String user_address,
			Date user_birthday) {
		super();
		this.username = username;
		this.password = password;
		this.user_sex = user_sex;
		this.user_email = user_email;
		this.user_address = user_address;
		this.user_birthday = user_birthday;
	}
	public UserBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public UserBean() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((islock == null) ? 0 : islock.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user_address == null) ? 0 : user_address.hashCode());
		result = prime * result + user_age;
		result = prime * result + ((user_birthday == null) ? 0 : user_birthday.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + user_id;
		result = prime * result + ((user_sex == null) ? 0 : user_sex.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserBean other = (UserBean) obj;
		if (islock == null) {
			if (other.islock != null)
				return false;
		} else if (!islock.equals(other.islock))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user_address == null) {
			if (other.user_address != null)
				return false;
		} else if (!user_address.equals(other.user_address))
			return false;
		if (user_age != other.user_age)
			return false;
		if (user_birthday == null) {
			if (other.user_birthday != null)
				return false;
		} else if (!user_birthday.equals(other.user_birthday))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_id != other.user_id)
			return false;
		if (user_sex == null) {
			if (other.user_sex != null)
				return false;
		} else if (!user_sex.equals(other.user_sex))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserBean [user_id=" + user_id + ", username=" + username + ", password=" + password + ", user_age="
				+ user_age + ", user_sex=" + user_sex + ", user_email=" + user_email + ", user_address=" + user_address
				+ ", user_birthday=" + user_birthday + ", islock=" + islock + "]";
	}
	
	
}
