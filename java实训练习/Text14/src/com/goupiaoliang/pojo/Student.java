package com.goupiaoliang.pojo;

public class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	public String info() {
		return "info() Student [name=" + name + ", age=" + age + "]";
	}
	

}
