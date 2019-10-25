package com.meishukeji.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Card {
	//教师类
	@ManyToOne(optional=false,fetch=FetchType.LAZY)//多对一 optional=false 非空
	@JoinColumn(name="t_id",nullable=false)//在card类对应的表中，产生一个外键列，列名为t_id,不为空，自动唯一
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Id
	private int cardId;
	@Column
	private String name;
	@Column
	private String address;
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Card() {
		super();
	}
	public Card(int cardId, String name, String address) {
		super();
		this.cardId = cardId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
