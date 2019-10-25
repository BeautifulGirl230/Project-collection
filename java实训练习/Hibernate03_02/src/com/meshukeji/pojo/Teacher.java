package com.meshukeji.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Teacher {
	private int id;
	private String name;
	private String sex;
	private java.util.Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public java.util.Date getBirthday() {
		return birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	public Teacher() {
		super();
	}
	public Teacher(int id, String name, String sex, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + "]";
	}
	
}
