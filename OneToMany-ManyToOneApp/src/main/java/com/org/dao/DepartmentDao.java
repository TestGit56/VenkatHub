package com.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DepartmentDao {

	private SessionFactory sf=HBUtil.getSessionFactory();
	
	public void saveOrUpdate(Department dept) {
		
		Session session=sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(dept);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void delete(Integer deptId) {
		
		Session session=sf.openSession();
		
		Department dept=session.get(Department.class, deptId);
		
		if(dept != null) {
			session.beginTransaction();
			session.delete(dept);
			session.getTransaction().commit();
			session.close();
		}
	}
		
		public  Department get(Integer deptId) {
			
			Session session=sf.openSession();
            Department dept=session.get(Department.class, deptId);
            session.close();
            
            return dept;
		}
		
		public List<Department> getAll(){
			
			Session session=sf.openSession();
			List<Department> deptList=session.createQuery("select dept from Department as dept", Department.class).getResultList();
			
			session.close();
			
			return deptList;
		}
	}

