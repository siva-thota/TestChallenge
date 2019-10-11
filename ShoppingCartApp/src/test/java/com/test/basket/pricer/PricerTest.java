package com.test.basket.pricer;

import org.junit.Assert;
import org.junit.Test;

public class PricerTest {


	@Test
	public void testForEmptyBasket() {		
		ShoppingBasket basket = new ShoppingBasket();
		Pricer pricer = new Pricer(basket);		 
		Assert.assertEquals(0.00d, pricer.getNetTotal(),0.001);				
	}
	
	@Test
	public void testTrouserDiscount() {
		ShoppingBasket basket = new ShoppingBasket();
		basket.setTrouserCount(4);
		Pricer pricer = new Pricer(basket);		
		pricer.getSubTotal();
		pricer.applyDiscount();
		
		Assert.assertEquals((35.50*4)-(35.50*4)/10,pricer.getNetTotal(),0.0001 );
				
	}
	
}
