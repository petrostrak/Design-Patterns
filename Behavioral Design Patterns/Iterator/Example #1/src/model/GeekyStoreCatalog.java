package model;

import java.util.ArrayList;

import interfaces.GeekyStoreIterator;

public class GeekyStoreCatalog {
	private ArrayList<Product> catalog;
	
	public GeekyStoreCatalog() {
		catalog = new ArrayList<>();
		addItem("SuperMan comic", "The best in town", 12.99);
		addItem("Batman comic", "Ok, but still good", 9.99);
		addItem("StarWars", "I could live without it", 24.99);
		addItem("Jedi T shirt", "Gotta have it", 19.99);
	}

	private void addItem(String name, String description, double price) {
		Product product = new Product(name, description, price);
		catalog.add(product);
	}
	
	public ArrayList<Product> getCatalog(){
		return catalog;
	}
	
	public GeekyStoreIterator createIterator() {
		return new GeekyStoreIterator(catalog);
	}
}
