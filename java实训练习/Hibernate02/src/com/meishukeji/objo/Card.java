package com.meishukeji.objo;

public class Card {
	//作者类
	private Teacher teacher;
	 
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	public Card(Teacher teacher, int cardid, String name) {
		super();
		this.teacher = teacher;
		this.cardid = cardid;
		this.name = name;
	}

	private int cardid;
	private String name;

	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Card() {
		super();
	}
	public Card(int cardid, String name) {
		super();
		this.cardid = cardid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Card [teacher=" + teacher + ", cardid=" + cardid + ", name=" + name + "]";
	}
	
}
