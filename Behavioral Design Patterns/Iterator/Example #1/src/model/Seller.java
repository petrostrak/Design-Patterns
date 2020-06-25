package model;

import interfaces.GeekyStoreIterator;
import interfaces.Iterator;

public class Seller  {
	GeekyStoreCatalog geekyStoreCatalog;

	public Seller(GeekyStoreCatalog geekyStoreCatalog) {
		this.geekyStoreCatalog = geekyStoreCatalog;
	}
	
	public void printCatalog() {
		GeekyStoreIterator geekyStoreIterator = geekyStoreCatalog.createIterator();
		System.out.println("Printing catalog: ");
		printCatalog(geekyStoreIterator);
	}
	
	private void printCatalog(GeekyStoreIterator geekyStoreIterator) {
		while(geekyStoreIterator.hasNext()) {
			Product product = (Product)geekyStoreIterator.next();
			System.out.print(product.getName() + ", ");
			System.out.print(product.getDescription() + " ");
			System.out.println(product.getPrice());
		}
	}
}
