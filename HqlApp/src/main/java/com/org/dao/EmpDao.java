package com.org.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmpDao {
	
	SessionFactory sf=HBUtil.getSessionFactory();
	
	public List<EmpBean> getAll()
	{
		List<EmpBean> empList=null;
		
		String hql="select e from EmpBean as e";
		
		Session session=sf.openSession();
		
		TypedQuery<EmpBean> query=session.createQuery(hql,EmpBean.class);
		
		empList=query.getResultList();
		
		return empList;
	}
	
	public List<EmpBean> pagination()
	{
		List<EmpBean> empList=null;
		
		String hql="select e from EmpBean as e";
		
		Session session=sf.openSession();
		
		TypedQuery<EmpBean> query=session.createQuery(hql,EmpBean.class);
		
		query.setFirstResult(0);
		query.setMaxResults(4);
		
		empList=query.getResultList();
		
		return empList;
	}
	
	public List<EmpBean> search(String empName){
		
		List<EmpBean> empList=null;
		
		String hql="select e from EmpBean as e where upper(e.empName) like :name";
		
		Session session=sf.openSession();
		
		TypedQuery<EmpBean> query=session.createQuery(hql,EmpBean.class);
		
		query.setParameter("name", "%" +empName.trim().toUpperCase()+ "%");
		
		empList=query.getResultList();
		
		return empList;
		
	}
	
	public List<String> getEmpNames(){
		
		List<String> empNamesList=null;
		
		String hql="select e.empName from EmpBean as e";
		
		Session session=sf.openSession();
		
		TypedQuery<String> query=session.createQuery(hql,String.class);
		
		empNamesList=query.getResultList();
		
		return empNamesList;
		
	}
	
	public List<Object[]> getIdNames()
	{
		List<Object[]> IdNamesList=null;
		
		String hql="select e.empId, e.empName from EmpBean as e";
		
		Session session=sf.openSession();
		
		TypedQuery<Object[]> query=session.createQuery(hql,Object[].class);
		
		IdNamesList=query.getResultList();
		
		return IdNamesList;
		
		
	}

	public List<SearchCriteriaBean> getIdNamesRealTimeUsecase(){
		
		List<SearchCriteriaBean> searchList=new ArrayList<SearchCriteriaBean>();
		
		List<Object[]> objArrayList=null;
		
		String hql="select e.empId, e.empName from EmpBean as e";
		
		Session session=sf.openSession();
		
		TypedQuery<Object[]> query=session.createQuery(hql,Object[].class);
		
		objArrayList=query.getResultList();
		
		for(Object[] objArray : objArrayList) {
			
			SearchCriteriaBean searchBean=new SearchCriteriaBean();
			searchBean.setEmpId((Integer) objArray[0]);
			searchBean.setEmpName((String) objArray[1]);
			
			searchList.add(searchBean);
			
			
		}
		return searchList;

	}
	
	public Float getMaxSal() {
		
		Float maxSal=null;
		
		String hql="select max(e.empSal) from EmpBean as e";
		
		Session session=sf.openSession();
		
		TypedQuery<Float> query=session.createQuery(hql,Float.class);
		
		maxSal=query.getSingleResult();
		
		return maxSal;
	}
	
	public EmpBean getById(Integer empId) {
		
		EmpBean empBean=null;
		
		String hql="select e from EmpBean as e where e.empId= :Id";
		
		Session session=sf.openSession();
		
		TypedQuery<EmpBean> query=session.createQuery(hql,EmpBean.class);
		
		query.setParameter("Id",empId);
		
		empBean=query.getSingleResult();
		
		return empBean;
		
	}
	
	public Integer updateSal()
	{
		Integer count=0;
		
		String hql="update EmpBean as e set e.empSal=e.empSal + :increment"+" where e.empSal <= :minimum";
		
		Session session=sf.openSession();
		
		session.beginTransaction();
		
		Query query=session.createQuery(hql);
		
		query.setParameter("increment", 5000f);
		query.setParameter("minimum",6000f);
		
		
		count=query.executeUpdate();
		session.getTransaction().commit();
		return count;
		
		
	}
	
	public List<EmpBean> demoOnNamedQuery(){
		List<EmpBean> empList=null;
		
		Session session=sf.openSession();
		
		TypedQuery<EmpBean> query=session.getNamedQuery("findEmployees");
		
		empList=query.getResultList();
		
		return empList;
		
	}
}
