package model;

import controller.CreditCartAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Product pants = new Product("233", 23);
		Product shirt = new Product("234", 14);
		
		cart.addProduct(pants);
		cart.addProduct(shirt);
		
		// payment decisions
		cart.pay(new PaypalAlgorithm("pit.trak@gmail.com", "root123"));
		
		cart.pay(new CreditCartAlgorithm("Petros", "0000223344537768"));
	}

}
