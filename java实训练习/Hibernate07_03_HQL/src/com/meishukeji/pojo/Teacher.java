package com.meishukeji.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@javax.persistence.Entity(name="Teacher")
@Table(name="teacher")
public class Teacher {
	
	//卡类
	// mappedBy="Card表中的Teacher类型的属性名"// 设置Teacher表中mappedBy 表示关系的维护交个了Card类来维护，当前Teacher类对应的表不在产生外键列
	@OneToMany(mappedBy="teacher",cascade={CascadeType.ALL})
	private Set<Card> card = new HashSet<Card>();
	
	public Set<Card> getCard() {
		return card;
	}
	public void setCard(Set<Card> card) {
		this.card = card;
	}
	
	
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String sex;
	@Temporal(TemporalType.DATE)
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
