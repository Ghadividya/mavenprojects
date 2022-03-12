package com.vidya.product.bo;

import com.vidya.product.pto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	
	Product findProduct(int id);

}
