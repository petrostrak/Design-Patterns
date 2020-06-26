package model;

public class DevStoreCatalog {
	
	private static final int MAX_ITEMS = 4;
	private int numberOfProducts;
	Product[] catalog;
	
	public DevStoreCatalog() {
		catalog = new Product[MAX_ITEMS];
		
		addItem("C++ is not dead", "T-shirt", 39.99);
		addItem("Java rocks, yes", "Silky mouse pad", 19.99);
		addItem("Web development cookboot", "Best WebDev book", 24.99);
		addItem("Java Design Patterns", "Resuable code for ObjectOriented concepts", 44.99);
	}

	private void addItem(String name, String description, double price) {
		Product product = new Product(name, description, price);
		if(numberOfProducts >= MAX_ITEMS) {
			System.out.println("Catalog is full, cannot add products..");
		}else {
			catalog[numberOfProducts] = product;
			numberOfProducts += 1;
		}
	}
	
//	public Product[] getCatalog() {
//		return catalog;
//	}
	
	public DevStoreIterator createIterator() {
		return new DevStoreIterator(catalog);
	}
}
