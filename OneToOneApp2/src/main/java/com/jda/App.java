package com.jda;

import com.jda.dao.BillDetails;
import com.jda.dao.Customer;
import com.jda.dao.CustomerDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	CustomerDao dao=new CustomerDao();
    	
    	Customer customer=new Customer(121,"srinu");
    	
    	BillDetails bill=new BillDetails(786,"19.09.19",500.50f);
    	
    	customer.setBilldetails(bill);
    	
    	dao.saveOrUpdate(customer);
    }
}
