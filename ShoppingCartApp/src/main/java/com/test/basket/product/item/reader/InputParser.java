package com.test.basket.product.item.reader;

import java.util.StringTokenizer;

import com.test.basket.pricer.ShoppingBasket;

public class InputParser {

	private InputParser() {

	}

	public static ShoppingBasket praseInput(String inputLine) {

		ShoppingBasket basket = new ShoppingBasket();
		StringTokenizer tokenizer = new StringTokenizer(inputLine, " ");
		while (tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			token = token.trim();
			if ("".equals(token)) {
				continue;
			}
			setCount(token, basket);
		}
		return basket;
	}

	private static void setCount(String token, ShoppingBasket basket) {
		if ("Trousers".equalsIgnoreCase(token)) {
			basket.setTrouserCount(basket.getTrouserCount() + 1);
		} else if ("Jacket".equalsIgnoreCase(token)) {
			basket.setJacketCount(basket.getJacketCount() + 1);
		} else if ("Tie".equalsIgnoreCase(token)) {
			basket.setTieCount(basket.getTieCount() + 1);
		} else if ("Shirt".equalsIgnoreCase(token)) {
			basket.setShirtCount(basket.getShirtCount() + 1);
		} else if ("Basket".equalsIgnoreCase(token)) {
		} else
			throw new RuntimeException("Invalid token " + token);
	}
}
