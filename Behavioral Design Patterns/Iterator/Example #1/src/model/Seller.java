package model;

import interfaces.GeekyStoreIterator;
import interfaces.Iterator;

public class Seller  {
	GeekyStoreCatalog geekyStoreCatalog;
	DevStoreCatalog devStoreCatalog;

	public Seller(GeekyStoreCatalog geekyStoreCatalog, DevStoreCatalog devStoreCatalog) {
		this.geekyStoreCatalog = geekyStoreCatalog;
		this.devStoreCatalog = devStoreCatalog;
	}
	
	public void printCatalog() {
		GeekyStoreIterator geekyStoreIterator = geekyStoreCatalog.createIterator();
		System.out.println("Printing Geeky catalog: ");
		printCatalog(geekyStoreIterator);
		
		System.out.println("Printing Geeky catalog: ");
		DevStoreIterator devStoreIterator = devStoreCatalog.createIterator();
		printCatalog(devStoreIterator);
	}
	
	private void printCatalog(DevStoreIterator iterator) {
		while(iterator.hasNext()) {
			Product product = (Product)iterator.next();
			System.out.print(product.getName() + ", ");
			System.out.print(product.getDescription() + " ");
			System.out.println(product.getPrice());
		}
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
