package com.test.EmployeeApp;

import com.test.EmployeeApp.dao.ProductBean;
import com.test.EmployeeApp.dao.ProductDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductDao dao=new ProductDao();
        
        ProductBean product=dao.getById(111);
        
        if(product == null) {
        	
        	System.out.println("invalid id");
        }else {
        	
        	System.out.println(product);
        }
        
        
    }
}
