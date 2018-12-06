package com.LaptopLine.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.LaptopLine.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl {

	@Autowired 
	SessionFactory sessionfactory;
	
	public boolean registerUser(User user) 
	{
		try
		{
			sessionfactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean modifyUser(User user) {
		try
		{
			sessionfactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public User getUser(String username)
	{
		Session session = sessionfactory.openSession();
		User user = session.get(User.class,username);
		session.close();
		return user;
	}

	
}
