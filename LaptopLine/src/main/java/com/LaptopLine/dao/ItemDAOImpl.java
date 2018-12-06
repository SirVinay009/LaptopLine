package com.LaptopLine.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.LaptopLine.model.Item;

@Repository("itemDAO")
@Transactional
public class ItemDAOImpl {

	@Autowired
	SessionFactory sessionFactory;

	
	public boolean addItem(Item item) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(item);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}


	public boolean deleteItem(Item item) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(item);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	
	public boolean updateItem(Item item) 
	{
		try
		{
			sessionFactory.getCurrentSession().update(item);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public List<Item> listItems()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Item");
		List<Item> listItems=query.list();
		session.close();
		return listItems;
	}

	
	public Item getItem(int itemids) 
	{
		Session session=sessionFactory.openSession();
		Item item=session.get(Item.class,itemids);
		session.close();
		return item;
	}

	
}
