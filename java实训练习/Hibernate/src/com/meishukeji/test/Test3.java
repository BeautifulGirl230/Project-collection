package com.meishukeji.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.meishukeji.HibernateSessionFactory;
import com.meishukeji.objo.Teacher;

public class Test3 {

	public static void main(String[] args) {
		//得到一个session对象，可以理解为jdbc的链接对象
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tr = session.beginTransaction();
		
		Teacher t1 = new Teacher(2,"江户川","男",new Date());
		session.delete(t1);
		System.out.println(t1);
		
		tr.commit();
		//关闭session
		session.close();
		
		session = HibernateSessionFactory.getSession();
		tr = session.beginTransaction();
		Teacher t2 = new Teacher(2,"阿加莎.克里斯蒂","女",new Date());
		session.saveOrUpdate(t2);
		System.out.println(t2);
		
		t1.setId(3);
		t1.setName("江户川乱步");
		t1.setSex("男");
		System.out.println(t1);
		session.saveOrUpdate(t1);
		
		tr.commit();
		//关闭session
		session.close();
	}

}
