package com.LaptopLine.dao;

import java.util.List;

import com.LaptopLine.model.CartDetails;

public interface CartDAO {

	public boolean addCartDetails(CartDetails cartDetails);
	public boolean deleteCartDetails(CartDetails cartDetails);
	public boolean updateCartDetails(CartDetails cartDetails);
	public List<CartDetails> retrieveCartDetails(String username);
	public CartDetails getCartDetails(int cartitemids);
	
	
}
