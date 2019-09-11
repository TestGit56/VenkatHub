package com.org;

import com.org.dao.ContractEmployee;
import com.org.dao.EmpDao;
import com.org.dao.Employee;
import com.org.dao.RegularEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EmpDao dao=new EmpDao();
    	
    	
    	Employee emp=new Employee(1208,"venkatesh");
    	RegularEmployee regemp=new RegularEmployee(1219,"santhosh",5000f,500f);
    	ContractEmployee contemp=new ContractEmployee(1236,"sindhusha", "one year", 300f);
    	
    	dao.saveOrUpdate(emp);
    	dao.saveOrUpdate(regemp);
    	dao.saveOrUpdate(contemp);
    }
}
