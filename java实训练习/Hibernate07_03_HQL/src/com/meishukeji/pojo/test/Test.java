package com.meishukeji.pojo.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.meishukeji.pojo.Card;
import com.meishukeji.pojo.Teacher;

public class Test {

	public static void main(String[] args) {
		
		//得到实体管理类工厂，等同于HibernateSessionFactory;
		EntityManagerFactory entityManagerFactory = javax.persistence.Persistence.createEntityManagerFactory("Hibernate07_03_HQL");
		
		//得到实体管理类，等同与session
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//得到事物管理器
		EntityTransaction tr = entityManager.getTransaction();
		tr.begin();

		Teacher t1 = new Teacher(6,"王伟峰","男",new Date());
		Teacher t2 = new Teacher(7,"王峰","女",new Date());
		
		Card c1 = new Card(1,"电话卡","");
		c1.setTeacher(t1);
		
		Card c2 = new Card(2,"电卡","");
		c1.setTeacher(t1);
		
		Card c3 = new Card(3,"水卡","");
		c1.setTeacher(t1);
		
		entityManager.persist(t1);
		entityManager.persist(t2);
		
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		
		tr.commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
