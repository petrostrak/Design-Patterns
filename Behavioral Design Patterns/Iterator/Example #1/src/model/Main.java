package model;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
		//Product[] devCatalog = devStoreCatalog.getCatalog();
		
		GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
		//ArrayList<Product> geekyCatalog = geekyStoreCatalog.getCatalog();
		
		Seller seller = new Seller(geekyStoreCatalog);
		seller.printCatalog();
		
//		//loop through the Dev catalog array
//		for(int i = 0; i < devCatalog.length; i ++) {
//			Product product = devCatalog[i];
//			System.out.print(product.getName() + " ");
//			System.out.print(product.getDescription() + " ");
//			System.out.println(product.getPrice());
//		}
//		
//		//loop through the Geeky catalog list
//		for(int i = 0; i < geekyCatalog.size(); i ++) {
//			Product product = (Product) geekyCatalog.get(i);
//			System.out.print(product.getName() + " ");
//			System.out.print(product.getDescription() + " ");
//			System.out.println(product.getPrice());
//		}
		
	}

}