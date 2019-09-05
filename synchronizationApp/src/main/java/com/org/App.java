package com.org;

import com.org.dao.ProductBean;
import com.org.dao.ProductDao;

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
    		
    		System.out.println("invalid Id");
    	}else {
    		
    		System.out.println(product);
    	}
    }
}
