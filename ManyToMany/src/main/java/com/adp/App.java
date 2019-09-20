package com.adp;

import java.util.HashSet;
import java.util.Set;

import com.adp.dao.Customers;
import com.adp.dao.CustomersDao;
import com.adp.dao.Network;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	CustomersDao dao=new CustomersDao();
    	
Network JIO=new Network(01,"JIO");
Network AIRTEL=new Network(02,"AIRTEL");

Network IDEA=new Network(03,"IDEA");
Network VODAFONE=new Network(04,"VODAFONE");


Set<Network> link1=new HashSet<Network>();
link1.add(JIO);
link1.add(AIRTEL);
    	
Set<Network> link2=new HashSet<Network>();
link2.add(JIO);
link2.add(IDEA);

Set<Network> link3=new HashSet<Network>();
link3.add(VODAFONE);

Customers customer1=new Customers(111,"VENKAT");
customer1.setNetworkSet(link1);

Customers customer2=new Customers(222,"SRINU");
customer2.setNetworkSet(link2);

Customers customer3=new Customers(333,"SANTHOSH");
customer3.setNetworkSet(link3);

dao.saveOrUpdate(customer1);
dao.saveOrUpdate(customer2);
dao.saveOrUpdate(customer3);


    	
    }
}
