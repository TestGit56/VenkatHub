package com.org.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HButil {
	
	private static final SessionFactory SESSION_FACTORY;
	
	static {
		synchronized(HButil.class){

			Configuration cfg=new Configuration();
			cfg.configure("oracle.cfg.xml");
			SESSION_FACTORY=cfg.buildSessionFactory();
		}
		
	}
	
	public static SessionFactory getSessionFactory()
	{
		return SESSION_FACTORY;
	}

}
