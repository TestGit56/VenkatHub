package com.org;

import java.util.List;

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
    
	System.out.println(" getAll() => "+ dao.getAll()+"\n\n");
	
	System.out.println(" pagination() => "+ dao.pagination()+"\n\n");
	
	System.out.println(" search('mahesh') => "+ dao.search("mahesh")+"\n\n");
	
	System.out.println(" getProductNames() "+dao.getEmpNames()+"\n\n");
	
	System.out.println("\n\n getProductIDNames() !!! List<Object[]> ");
	
		List<Object[]> objArrayList = dao.getIdNames();
		for(Object[] objArray :objArrayList)
		{
			for(Object element: objArray)
			{
				System.out.print(element + " \t ");
				
			}
			System.out.println();
		}
	
		System.out.println("\n\n getIdNamesRelaTimeUseCase() !!!  List<SearchCriteriaBean> ");
		System.out.println(dao.getIdNamesRealTimeUsecase()+"\n\n");
		
		
		
		System.out.println("  MAXPRICE :: "+dao.getMaxSal()+"\n\n");
		System.out.println(" getById() "+dao.getById(1)+"\n\n");
		
		System.out.println("Non select query :: updatePrice()  updatedCount = "+dao.updateSal());
		
		System.out.println(" demoOnNamedQuery() => "+ dao.demoOnNamedQuery()+"\n\n");
}
}
