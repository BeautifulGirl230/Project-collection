package com.meishukeji.test;

import java.util.Date;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.meishukeji.HibernateSessionFactory;
import com.meishukeji.objo.Card;
import com.meishukeji.objo.Teacher;

public class Test {
	public static void main(String[] args) {
		//得到一个session对象，可以理解为jdbc的链接对象
		Session session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		
		Teacher t1 = new Teacher(4, "松本清张", "男",new Date());
		Teacher t2 = (Teacher)session.get(Teacher.class, 1);
		session.saveOrUpdate(t1);
		System.out.println(t1);
		session.save(t1);
		Card card = new Card(t1, 1, "《点与线》");
		session.save(card);
		
		tr.commit();
		session.close();
		
		session = HibernateSessionFactory.getSession();
		tr = session.beginTransaction();
		
		t2.setName("阿瑟.柯南.道尔");
		session.saveOrUpdate(t2);
		System.out.println(t2);
		
		tr.commit();
		session.close();
	}
}
