package com.huanshi.pojo;

public class AdminBean {
//	 admins_id number(10) primary key,
//	  adminsname nvarchar2(30) not null ,
//	  a_password nvarchar2(30) not null,
//	  administratorsd number(1)  default 0
	private int admins_Id;
	private String adminsName;
	private String a_password;
	private String administratorsd;
	public int getAdmins_Id() {
		return admins_Id;
	}
	public void setAdmins_Id(int admins_Id) {
		this.admins_Id = admins_Id;
	}
	public String getAdminsName() {
		return adminsName;
	}
	public void setAdminsName(String adminsName) {
		this.adminsName = adminsName;
	}
	public String getA_password() {
		return a_password;
	}
	public void setA_password(String a_password) {
		this.a_password = a_password;
	}
	public String getAdministratorsd() {
		return administratorsd;
	}
	public void setAdministratorsd(String administratorsd) {
		this.administratorsd = administratorsd;
	}
	public AdminBean(int admins_Id, String adminsName, String a_password, String administratorsd) {
		super();
		this.admins_Id = admins_Id;
		this.adminsName = adminsName;
		this.a_password = a_password;
		this.administratorsd = administratorsd;
	}
	public AdminBean() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a_password == null) ? 0 : a_password.hashCode());
		result = prime * result + ((administratorsd == null) ? 0 : administratorsd.hashCode());
		result = prime * result + ((adminsName == null) ? 0 : adminsName.hashCode());
		result = prime * result + admins_Id;
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
		AdminBean other = (AdminBean) obj;
		if (a_password == null) {
			if (other.a_password != null)
				return false;
		} else if (!a_password.equals(other.a_password))
			return false;
		if (administratorsd == null) {
			if (other.administratorsd != null)
				return false;
		} else if (!administratorsd.equals(other.administratorsd))
			return false;
		if (adminsName == null) {
			if (other.adminsName != null)
				return false;
		} else if (!adminsName.equals(other.adminsName))
			return false;
		if (admins_Id != other.admins_Id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AdminBean [admins_Id=" + admins_Id + ", adminsName=" + adminsName + ", a_password=" + a_password
				+ ", administratorsd=" + administratorsd + "]";
	}
	
	
}
