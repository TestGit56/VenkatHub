package com.org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDao {
	
	SessionFactory sessionfactory=HButil.getSessionFactory();
	
	public void sessionLevelCache()
	{
		Session session=sessionfactory.openSession();
		System.out.println("requst first time");
		ProductBean productBean1=session.get(ProductBean.class, 111);
		System.out.println(productBean1);
		
		System.out.println("request second time");
		ProductBean productBean2=session.get(ProductBean.class, 111);
		System.out.println(productBean2);
		
		System.out.println("productBean1 hashcode" +productBean1.hashCode());
		System.out.println("productBean2 hashcode" +productBean2.hashCode());
		
		session.close();
		
	}
	
	public void sessionLevelCache2()
	{
		Session session=sessionfactory.openSession();
		System.out.println("requst first time");
		ProductBean productBean1=session.get(ProductBean.class, 111);
		System.out.println(productBean1);
		
		System.out.println("request second time");
		ProductBean productBean2=session.get(ProductBean.class, 111);
		System.out.println(productBean2);
		
		System.out.println("productBean1 hashcode" +productBean1.hashCode());
		System.out.println("productBean2 hashcode" +productBean2.hashCode());

		
		Session session2=sessionfactory.openSession();
		System.out.println("request third time");
		ProductBean productBean3=session.get(ProductBean.class, 111);
		System.out.println(productBean3);
		System.out.println("productBean3 hashcode" +productBean3.hashCode());
	}

}
