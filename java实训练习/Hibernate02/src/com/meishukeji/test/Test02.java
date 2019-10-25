package com.meishukeji.test;

import org.hibernate.Session;

import com.meishukeji.HibernateSessionFactory;
import com.meishukeji.objo.Card;
import com.meishukeji.objo.Teacher;

public class Test02 {

	public static void main(String[] args) {
		//得到一个session对象，可以理解为jdbc的链接对象
		Session session = HibernateSessionFactory.getSession();
		
		Teacher t = (Teacher)session.get(Teacher.class, 4);
		System.out.println(t.getCard());
		
		
		Card c = (Card)session.get(Card.class, 4);
		System.out.println(c.getTeacher().getName());
		//关闭session
		session.close();
	}

}
