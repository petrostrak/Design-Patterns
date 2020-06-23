package interfaces;

import java.util.ArrayList;

import model.Product;

public class GeekyStoreIterator implements Iterator {
	ArrayList<Product> catalog;
	int position = 0;
	
	public GeekyStoreIterator(ArrayList<Product> catalog) {
		this.catalog = catalog;
	}

	@Override
	public boolean hasNext() {
		if(position >= catalog.size() || catalog.get(position) == null) {
			return false;
		}else 
			return true;
	}

	@Override
	public Object next() {
		Product product = catalog.get(position);
		position += 1;
		return product;
	}

}
