package com.LaptopLine.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.LaptopLine.dao.ItemDAO;
import com.LaptopLine.model.Item;

public class ItemDAOTest {

	static ItemDAO itemDAO;
	
	@BeforeClass
	public static void initialize()
	{
		try
		{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.LaptopLine");
		context.refresh();
		itemDAO = (ItemDAO)context.getBean("itemDAO");
		}
		catch(Exception e)
		{
			
			System.out.println("display" + e.getMessage());
			
		}
	}
	
	@Test
	public void addItemTest()
	{
		Item item = new Item();
		item.setItemnames("Dell");
		item.setItemdescs("A Laptop with Bluetooth");
		item.setQuantity(10);
		item.setPrice(34000);
		item.setDistributorids(2);
		item.setCategoryids(1);
		
		//assertTrue("Problem in adding Item", itemDAO.addItem(item));
	}
	
	@Ignore
	@Test
	public void updateItemTest()
	{
		Item item = itemDAO.getItem(3);
		item.setItemdescs("All the Lenovo Laptops");
		assertTrue("Problem in Updating the Item", itemDAO.updateItem(item));
	}
	
	@Ignore
	@Test
	public void deleteItemTest()
	{
		Item item = itemDAO.getItem(4);
		assertTrue("Problem in deleting Item", itemDAO.deleteItem(item));
	}
	

	@Ignore
	@Test
	public void listItemsTest()
	{
		
		try
		{
		List<Item> listItems = itemDAO.listItems();
		assertNotNull("Problem in Listing Items",listItems);
		
		for(Item item : listItems)
		{
			System.out.print(item.getItemids() + ":::");
			System.out.print(item.getItemnames() + ":::");
			System.out.println(item.getItemdescs());
		}
	}
	
	catch(Exception e)
	{
		
		System.out.println("display" + e.getMessage());
		
	}

	}
}