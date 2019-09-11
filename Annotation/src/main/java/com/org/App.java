package com.org;

import com.org.dao.EmpBean;
import com.org.dao.EmpDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmpDao dao=new EmpDao();
    	
    	EmpBean saveRecord=new EmpBean("ramesh",5000f);
    	
    	dao.save(saveRecord);
    }
}
