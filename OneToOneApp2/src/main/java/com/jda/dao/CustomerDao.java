package com.jda.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CustomerDao {
	
	private SessionFactory sf=HBUtil.getSessionFactory();
	
	
	
	public void saveOrUpdate(Customer customer) {
		
		Session session=sf.openSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(customer);
		
		session.getTransaction().commit();
		
		session.close();
	}
	
	public Customer get(Integer customerId) {
		
		return sf.openSession().get(Customer.class, customerId);
	}
	
	public List<Customer> getAll(){
		
		List<Customer> customerList= sf.openSession().createQuery("select cus from Customer as cus").getResultList();
		
		return customerList;
			
	}
	
	public void delete(Integer customerId) {
		
		Session session = sf.openSession();
		
		Customer customer=session.get(Customer.class, customerId);
		
		if(customer != null) {
			
			session.beginTransaction();
			
			session.delete(customerId);
			
			session.getTransaction().commit();
			
			session.close();
		}
	}

}
