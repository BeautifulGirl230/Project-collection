package com.meishukeji.test;

import org.hibernate.Session;

import com.meishukeji.HibernateSessionFactory;
import com.meishukeji.objo.Teacher;

public class Test2 {
	public static void main(String[] args) {
		//得到会话对像,session 可以理解为jdbc中的连接对像
		Session session = HibernateSessionFactory.getSession();
			
		//生成sql查出来，放到对象里去
//		Teacher t1 = (Teacher)session.get(Teacher.class, 1);
//		System.out.println(t1);
		
		//load方法，使用的懒加载，在第一次用到时，在去数据库中查，并且有确认数据库中存在这个主键时使用
		Teacher t2 = (Teacher)session.load(Teacher.class, 1);
		System.out.println(t2);
		
		session.close();
	}

}
