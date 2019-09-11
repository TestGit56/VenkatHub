package com.org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDao {
	
	SessionFactory sf=HBUtil.getSessionFactory();
	
	
	public void saveOrUpdate(ProductBean product) {
		
		Session session=sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(product);
		session.getTransaction().commit();
		session.close();
	}
	
	public ProductBean getById(Integer productId) {
		
		return sf.openSession().get(ProductBean.class, productId);
	}
   public void delete(Integer productId) {
	   
	   Session session=sf.openSession();
	   session.beginTransaction();
	   ProductBean product=session.get(ProductBean.class, productId);
	   if(product != null)
		   session.delete(product);
	   session.getTransaction().commit();
	   session.close();
   }
}
