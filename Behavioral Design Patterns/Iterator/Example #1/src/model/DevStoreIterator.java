package model;

import interfaces.Iterator;

public class DevStoreIterator implements Iterator {
	
	Product[] catalog;
	int position = 0;
	
	
	public DevStoreIterator(Product[] catalog) {
		this.catalog = catalog;
	}

	@Override
	public boolean hasNext() {
		if(position >= catalog.length || catalog[position] == null) {
			return false;
		}else
			return true;
	}

	@Override
	public Object next() {
		Product product = catalog[position];
		position += 1;
		return product;
	}

}
