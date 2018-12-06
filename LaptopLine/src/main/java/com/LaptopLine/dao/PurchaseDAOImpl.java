package com.LaptopLine.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.LaptopLine.model.PurchaseDetails;

@Repository("purchaseDAO")
@Transactional
public class PurchaseDAOImpl {

	@Autowired
	SessionFactory sessionFactory;

	
	public boolean insertPurchaseDetails(PurchaseDetails purchaseDetails) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(purchaseDetails);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	

	
}
