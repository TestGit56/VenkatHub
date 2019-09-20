package com.org;

import com.org.dao.Department;
import com.org.dao.DepartmentDao;
import com.org.dao.Employee;
import com.org.dao.EmployeeDao;

public class EmployeeAppManyToOne {
	
    public static void main( String[] args )
    {

	
	DepartmentDao deptDao=new DepartmentDao();
	
	EmployeeDao empDao=new EmployeeDao();
	
	Employee emp=new Employee(1254,"Tirumal","acc dept");
	
	Department department=deptDao.get(2);
	
	emp.setDepartment(department);

	empDao.saveOrUpdate(emp);
	
	Employee emp1=empDao.get(1242);
	
	System.out.println(emp1.getEmpId()+ ":" +emp1.getEmpName()+ ":" +emp1.getEmpDesg());
	System.out.println(emp1.getDepartment().getDeptId()+ ":" +emp1.getDepartment().getDeptName());
}

}

