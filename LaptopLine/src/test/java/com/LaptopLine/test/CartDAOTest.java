package com.LaptopLine.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.LaptopLine.dao.CartDAO;
import com.LaptopLine.model.CartDetails;

public class CartDAOTest {

	static CartDAO cartDAO;
	
	@BeforeClass
	public static void initialize()
	{
		try
		{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.LaptopLine");
		context.refresh();
		cartDAO = (CartDAO)context.getBean("cartDAO");
		}
		catch(Exception e)
		{
			System.out.println("display" + e.getMessage());
		}
	}
	
	
	@Test
	public void addCartTest()
	{
		CartDetails cartDetails = new CartDetails();
		cartDetails.setItemids(13);
		cartDetails.setItemnames("Lenovo i5");
		cartDetails.setQuantity(10);
		cartDetails.setPrice(12000);
		cartDetails.setUsername("vinod");
		cartDetails.setPstatus("NP");
		
	//	assertTrue("Problem in Adding the Cart Item:", cartDAO.addCartDetails(cartDetails));
	}
	
	@Ignore
	@Test
	public void updateCartTest()
	{
		
		CartDetails cartDetails = cartDAO.getCartDetails(3);
		cartDetails.setItemnames("Lenovo Yoga");
		assertTrue("Problem in Updating Cart", cartDAO.updateCartDetails(cartDetails));
		
	}
	
	@Ignore
	@Test
	public void deleteCartTest()
	{
		
		CartDetails cartDetails = cartDAO.getCartDetails(4);
		assertTrue("Problem in removing from Cart", cartDAO.deleteCartDetails(cartDetails));
		
	}
	
	@Test
	public void retrieveCartTest()
	{
		try
		{
			
		List<CartDetails> listCartDetails = cartDAO.retrieveCartDetails("vinod");
		
		for(CartDetails cartDetails : listCartDetails)
		{
			System.out.print(cartDetails.getItemnames()+ ":::");
			System.out.print(cartDetails.getQuantity()+":::");
			System.out.println(cartDetails.getItemids());
		}
		
		}
		
		catch(Exception e)
		{
			
			System.out.println("display" + e.getMessage());
			
		}
		// assertTrue("Problem in Retrieving the Cart Items:", listCartDetails.size()>0);
		
}
}