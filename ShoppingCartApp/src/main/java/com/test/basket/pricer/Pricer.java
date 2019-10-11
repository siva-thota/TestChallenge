package com.test.basket.pricer;

import java.util.HashMap;
import java.util.Map;

public class Pricer {

	public Map<String, Double> price = new HashMap<String, Double>();
	private double subTotal = 0;
	private double discount = 0;
	private double netTotal = 0;

	{
		price.put("Jacket", 49.40);
		price.put("Trousers", 35.50);
		price.put("Shirt", 12.50);
		price.put("Tie", 9.50);
	}
	private ShoppingBasket basket;
	public Pricer(ShoppingBasket basket) {
		this.basket = basket;
	}

	public double getSubTotal() {
		subTotal = basket.getJacketCount() * price.get("Jacket") + 
				   basket.getTrouserCount() * price.get("Trousers")	+ 
				   basket.getShirtCount() * price.get("Shirt") + 
				   basket.getTieCount() * price.get("Tie");
		return subTotal;
	}

	public double applyDiscount() {
        double trouserDiscount = 0;
        double tieDiscount = 0;
        if (basket.getTrouserCount() != 0) {
            trouserDiscount = (price.get("Trousers") / (double) 10) * basket.getTrouserCount();
            System.out.println("Trouser 10% off: -" + trouserDiscount);
        }

        if (basket.getTieCount() != 0) {
            if (basket.getTieCount() <= basket.getShirtCount() / 2) {
                tieDiscount = (price.get("Tie") / (double) 2) * basket.getTieCount();
            } else {
                tieDiscount = (price.get("Tie") / (double) 2) * (basket.getShirtCount() / 2);
            }
            System.out.println("Tie 50% off: -" + tieDiscount);
        }
        discount = trouserDiscount + tieDiscount;
        if (discount == 0)    {
            System.out.println("(No offers available)");
        }
        return discount;
    }
	

	public double getNetTotal() {
		 netTotal = subTotal - discount;
		 return netTotal;
	}
}