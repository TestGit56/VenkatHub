package com.org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmpDao {
	
	SessionFactory sf=HBUtil.getSessionFactory();
	
	public void saveOrUpdate(Employee employee) {
		
		Session session=sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(employee);
		session.getTransaction().commit();
		session.close();
	}

	
	public Employee get(Integer empId) {
		
		return sf.openSession().get(Employee.class,empId);
	}
	
	public void delete(Integer empId) {
		
		Session session=sf.openSession();
		session.beginTransaction();
		Employee emp=session.get(Employee.class, empId);
		if(emp != null)
			session.delete(emp);
		session.getTransaction().commit();
		session.close();
	}
}
