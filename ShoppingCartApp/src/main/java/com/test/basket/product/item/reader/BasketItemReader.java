package com.test.basket.product.item.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.test.basket.pricer.Pricer;
import com.test.basket.pricer.ShoppingBasket;

public class BasketItemReader { 

    public static void main(String args[]) {

        boolean items = false;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        	System.out.print("Enter your input: ");
            
        	while(!items) {
                String inputLine = reader.readLine();
                if(inputLine.equalsIgnoreCase("end")) {
                	items = true;
                } else {
                
                ShoppingBasket basket = InputParser.praseInput(inputLine);
                Pricer pricer = new Pricer(basket);
                System.out.println("Subtotal: $ "+pricer.getSubTotal());
                pricer.applyDiscount();
                System.out.println("Total : $ "+pricer.getNetTotal());
                }
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();;
        }


    }
}
