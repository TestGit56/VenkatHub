package com.org;

import java.util.LinkedHashSet;
import java.util.Set;

import com.org.dao.Department;
import com.org.dao.DepartmentDao;
import com.org.dao.Employee;

/**
 * Hello world!
 *
 */
public class DepartmentAppOneToMany 
{
    public static void main( String[] args )
    {
    	
    	DepartmentDao deptDao=new DepartmentDao();
    	
    	Department javadept=new Department();
    	
    	javadept.setDeptId(1);
    	javadept.setDeptName("java");
    	
    	
    	Employee emp1=new Employee(1201,"santhoshn1","s/w");
    	Employee emp2=new Employee(1202,"venkatesh 2", "s/w");
    	Employee emp3=new Employee(1203,"sateesh 3","s/w");
    	
    	Set<Employee> employeeSet=new LinkedHashSet<Employee>();
    	
    	employeeSet.add(emp1);
    	employeeSet.add(emp2);
    	employeeSet.add(emp3);
    	
    	javadept.setEmployeeSet(employeeSet);
    	
    	deptDao.saveOrUpdate(javadept);
    	
    	Department accdept=new Department();
    	
    	accdept.setDeptId(2);
    	accdept.setDeptName("Accounts");
    	
    	deptDao.saveOrUpdate(accdept);
    }
}
