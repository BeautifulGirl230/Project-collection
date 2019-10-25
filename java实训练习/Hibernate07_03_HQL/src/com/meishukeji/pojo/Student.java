package com.meishukeji.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stuId;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private java.util.Date birthday;
	@Column
	private String address;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.util.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int stuId, String name, int age, Date birthday, String address) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.address = address;
	}

	public Student() {
		super();
	}

	public Student(String name, int age, Date birthday, String address) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.address = address;
	}

}
