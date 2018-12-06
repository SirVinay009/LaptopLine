package com.LaptopLine.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.LaptopLine.dao.PurchaseDAO;
import com.LaptopLine.model.PurchaseDetails;

public class PurchaseDAOTest {

	static PurchaseDAO purchaseDAO;
	
	@BeforeClass
	public static void initialize()
	{
		
		try
		{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.LaptopLine");
		context.refresh();
	    purchaseDAO = (PurchaseDAO)context.getBean("purchaseDAO");
		}
		catch(Exception e)
		{
			
			System.out.println("display" + e.getMessage());
			
		}
	}
	
	@Test
	public void insertPurchaseTest()
	{
		PurchaseDetails purchasedetails = new PurchaseDetails();
		purchasedetails.setUsername("Vivek");
		purchasedetails.setTotalshoppingamount(51000);
		purchasedetails.setPmode("NP");
		
//          assertTrue("Problem in adding Order to menu", purchaseDAO.insertPurchaseDetails(purchasedetails));
	}



	
}
