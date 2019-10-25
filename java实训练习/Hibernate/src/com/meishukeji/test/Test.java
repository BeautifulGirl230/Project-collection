package com.meishukeji.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.meishukeji.HibernateSessionFactory;
import com.meishukeji.objo.Teacher;

public class Test {
	public static void main(String[] args) {
		//得到会话对象，session 可以理解为jdbc中的链接对象
		Session session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		
		//瞬时状态: 一种新的持久性实例，被 Hibernate 认为是瞬时的，它不与 Session 相关联，在数据库中没有与之关联的记录且无标识符值。
		Teacher t1 =new Teacher(1,"wang","男",new Date());
		
		//可以将一个瞬时状态实例通过与一个 Session 关联的方式将其转化为持久状态实例。
		//托管态,持久状态实例在数据库中有与之关联的记录，有标识符值，并与一个 Session 关联。
//		t1 = (Teacher)session.get(Teacher.class, 2);
		t1.setName("王为峰");
		
		tr.commit();
		//关闭session
		session.close();
		
		//脱管 游离状态：一旦关闭 Hibernate Session，持久状态实例将会成为脱管状态实例。
		t1.setName("柯南道尔");
		session = HibernateSessionFactory.getSession();
		tr = session.beginTransaction();
		session.saveOrUpdate(t1);
		
		tr.commit();
		session.close();
	}

}
