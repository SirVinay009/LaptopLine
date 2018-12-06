package com.LaptopLine.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.LaptopLine.dao.CategoryDAO;
import com.LaptopLine.model.Category;

public class CategoryDAOTest {

static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void initialize()
	{
		try
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.LaptopLine");
			context.refresh();
			categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		}
		
	catch(Exception e)
		{
		
		System.out.println("display" + e.getMessage());
		
		}
	}
	
	//@Ignore
	@Test
	public void addCategoryTest()
	{
		Category category = new Category();
		category.setCategorynames("Lenovo");
		category.setCategorydescs("powerful i3 Processor");
//		assertTrue("Problem in Adding Category:",categoryDAO.addCategory(category));
	}
	
	@Ignore
	@Test
	public void updateCategoryTest()
	{
		Category category = categoryDAO.getCategory(3);
		category.setCategorydescs("All the Lenovo Laptops");
		assertTrue("Problem in Updating the Category", categoryDAO.updateCategory(category));
	}
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category = categoryDAO.getCategory(4);
		assertTrue("Problem in deleting the Category", categoryDAO.deleteCategory(category));
	}

	@Ignore
	@Test
	public void listCategoriesTest()
	{
		List<Category> listCategories = categoryDAO.listCategories();
		assertNotNull("Problem in Listing Categories",listCategories);
		
		for(Category category:listCategories)
		{
			System.out.print(category.getCategoryids()+":::");
			System.out.print(category.getCategorynames()+":::");
			System.out.println(category.getCategorydescs());
		}
	}
		
}