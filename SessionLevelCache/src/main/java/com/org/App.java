package com.org;

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
    	
    	dao.sessionLevelCache2();
    }
}
