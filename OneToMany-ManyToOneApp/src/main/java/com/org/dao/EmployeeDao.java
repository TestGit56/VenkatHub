package com.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDao {

	private SessionFactory sf=HBUtil.getSessionFactory();
	
	public void saveOrUpdate(Employee emp) {
		
		Session session=sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(emp);
		session.getTransaction().commit();
		session.close();
	}
	
	public void delete(Integer empId) {
		
		Session session=sf.openSession();
		Employee emp=session.get(Employee.class, empId);
		
		if(emp != null) {
			
			session.beginTransaction();
			session.delete(emp);
			session.getTransaction().commit();
			session.close();
		}
	}
	
	public Employee get(Integer empId) {
		
		Session session=sf.openSession();
		
		Employee emp=session.get(Employee.class,empId);
		session.close();
		
		return emp;
	}
	
	public List<Employee> getAll(){
		
		Session session=sf.openSession();
		
		List<Employee> empList=session.createQuery("select emp from Employee as emp",Employee.class).getResultList();
		
		session.close();
		
		return empList;
	}
}
