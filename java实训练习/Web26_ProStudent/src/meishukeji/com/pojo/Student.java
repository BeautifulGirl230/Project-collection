package meishukeji.com.pojo;

import java.util.Date;

public class Student implements java.io.Serializable,java.lang.Comparable{
//	 "STUID",
	private String stuId;
	
////    "STUNAME",
	private String stuName;
////    "STUBIRTHDAY",
	private java.util.Date stuBirthday;
////    "STUSEX",
	private String stuSex;
////    "STUEMAIL",
	private String stuEmail;
////    "STUADDRESS" 
	private String stuAddress;
	
	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public java.util.Date getStuBirthday() {
		return stuBirthday;
	}

	public void setStuBirthday(java.util.Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	
	public Student() {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuBirthday = stuBirthday;
		this.stuSex = stuSex;
		this.stuEmail = stuEmail;
		this.stuAddress = stuAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stuAddress == null) ? 0 : stuAddress.hashCode());
		result = prime * result + ((stuBirthday == null) ? 0 : stuBirthday.hashCode());
		result = prime * result + ((stuEmail == null) ? 0 : stuEmail.hashCode());
		result = prime * result + ((stuId == null) ? 0 : stuId.hashCode());
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		result = prime * result + ((stuSex == null) ? 0 : stuSex.hashCode());
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
		Student other = (Student) obj;
		if (stuAddress == null) {
			if (other.stuAddress != null)
				return false;
		} else if (!stuAddress.equals(other.stuAddress))
			return false;
		if (stuBirthday == null) {
			if (other.stuBirthday != null)
				return false;
		} else if (!stuBirthday.equals(other.stuBirthday))
			return false;
		if (stuEmail == null) {
			if (other.stuEmail != null)
				return false;
		} else if (!stuEmail.equals(other.stuEmail))
			return false;
		if (stuId == null) {
			if (other.stuId != null)
				return false;
		} else if (!stuId.equals(other.stuId))
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		if (stuSex == null) {
			if (other.stuSex != null)
				return false;
		} else if (!stuSex.equals(other.stuSex))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuBirthday=" + stuBirthday + ", stuSex="
				+ stuSex + ", stuEmail=" + stuEmail + ", stuAddress=" + stuAddress + "]";
	}

}
