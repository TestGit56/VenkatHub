package com.adp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CustomersDao {
	
	private SessionFactory sf=HBUtil.getSessionFactory();
	
	public void saveOrUpdate(Customers customer) {
		
		Session session=sf.openSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(customer);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
