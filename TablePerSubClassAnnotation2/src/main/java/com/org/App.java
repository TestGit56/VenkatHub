package com.org;

import com.org.dao.NonRegularSaleProducts;
import com.org.dao.ProductBean;
import com.org.dao.ProductDao;
import com.org.dao.RegularSaleProducts;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ProductDao dao=new ProductDao();
    	
    	ProductBean product=new ProductBean(1,"santhoor");
    	RegularSaleProducts reg=new RegularSaleProducts(2,"medimix",50f,500);
    	NonRegularSaleProducts nonreg=new NonRegularSaleProducts(3,"Dove", 70f,"One month");
    	
    	dao.saveOrUpdate(product);
    	dao.saveOrUpdate(reg);
    	dao.saveOrUpdate(nonreg);
    	
    }
}
