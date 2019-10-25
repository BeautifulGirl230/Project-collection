package com.meshukeji.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.meshukeji.HibernateSessionFactory;
import com.meshukeji.pojo.Address;
import com.meshukeji.pojo.Teacher;

public class Test01 {
	
	public static void main(String[] args) {
		//得到会话对象Session可以理解为jdbc中的链接对象
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tr = session.beginTransaction();
		Teacher t1 = new Teacher(5,"wang","男",new Date());
		session.save(t1);
		Address a = new Address();
		a.setAddress("武汉");
//		a.setTeacher(teacher);
		session.save(a);
		tr.commit();
		//关闭session
		session.close();
	}

}
