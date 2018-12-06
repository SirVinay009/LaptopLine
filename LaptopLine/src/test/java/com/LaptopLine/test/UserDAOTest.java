package com.LaptopLine.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.LaptopLine.dao.UserDAO;
import com.LaptopLine.model.User;

public class UserDAOTest {

	static UserDAO userDAO;
	
	@BeforeClass
	public static void initialize()
	{
		try
		{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.LaptopLine");
		context.refresh();
		userDAO = (UserDAO)context.getBean("userDAO");
		}
		catch(Exception e)
		{
			
			System.out.println("Display" + e.getMessage());
			
		}
	}
	
	@Test
	public void registerUserTest()
	{
		User user = new User();
		user.setUsername("Ravi");
		user.setPassword("ravi99");
		user.setCustomerName("kishore");
		user.setEmailId("ravi87@gmail.com");
		user.setRole("specialist");
		user.setEnabled("NP");
		
	//	assertTrue("Problem in adding User", userDAO.registerUser(user));
	}
	
	
}
