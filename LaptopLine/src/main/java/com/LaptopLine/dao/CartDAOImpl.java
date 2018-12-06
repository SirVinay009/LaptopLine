package com.LaptopLine.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.LaptopLine.model.CartDetails;

@Repository("cartDAO")
@Transactional
public class CartDAOImpl {


	@Autowired
	SessionFactory sessionfactory;
	

	public boolean addCartDetails(CartDetails cartDetails)
	{
		try
		{
			sessionfactory.getCurrentSession().save(cartDetails);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}
	

	public boolean deleteCartDetails(CartDetails cartDetails)
	{
		try
		{
			sessionfactory.getCurrentSession().delete(cartDetails);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public boolean updateCartDetails(CartDetails cartDetails) 
	{
		try
		{
			sessionfactory.getCurrentSession().update(cartDetails);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public List<CartDetails> retrieveCartDetails(String username)
	{
	
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("from CartDetails where username := uname and pstatus = 'NP' ");
		query.setParameter("uname", username);
		List<CartDetails> listCartDetails = query.list();
		session.close();
		return listCartDetails;
	}
	
	public CartDetails getCartDetails(int cartitemids) 
	{
		Session session=sessionfactory.openSession();
		CartDetails cartDetails = session.get(CartDetails.class, cartitemids);
		session.close();
		return cartDetails;
	}


	
}
