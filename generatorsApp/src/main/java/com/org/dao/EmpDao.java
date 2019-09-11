package com.org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmpDao {
	
	private SessionFactory sf=HBUtil.getSessionFactory();
	
	public void save(EmpBean emp) {
		
		Session session=sf.openSession();
		session.beginTransaction();
		Integer id=(Integer)session.save(emp);
		session.getTransaction().commit();
		session.close();
		
		System.out.println(id+ "insertion successfull");
		
	}

}
