package com.org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDao {
	
	private SessionFactory sessionfactory=HButil.getSessionFactory();
	
	public ProductBean getById(Integer productId) {
		
		ProductBean productBean=null;
		Session session=sessionfactory.openSession();
		productBean =session.get(ProductBean.class,productId);
		
		if(productBean != null) {
			
			session.beginTransaction();
			
			productBean.setProductName("pulsar");
			
			session.getTransaction().commit();
		}
		
		session.close();
		return productBean;
		
		
	}

}
