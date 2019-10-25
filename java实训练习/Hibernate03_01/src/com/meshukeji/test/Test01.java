package com.meshukeji.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.meshukeji.HibernateSessionFactory;
import com.meshukeji.pojo.Teacher;

public class Test01 {
	
	public static void main(String[] args) {
		//得到会话对象Session可以理解为jdbc中的链接对象
		Session session = HibernateSessionFactory.getSession();
		
		
		Teacher t = new Teacher(1,"wang","男",new Date());
		System.out.println(t);
//		Transaction tr = session.beginTransaction();
//		tr.commit();
		session.close();
	}

}
